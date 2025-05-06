package EndChapter;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DictionaryManager {
    private List<Word> words;
    private String filePath;

    public DictionaryManager(String filePath) {
        this.filePath = filePath;
        this.words = new ArrayList<>();
        loadFromFile();
    }

    public void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("=")) {
                    String[] parts = line.split("=", 2);
                    if (parts.length == 2) {
                        words.add(new Word(parts[0].trim(), parts[1].trim()));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("No existing dictionary found. Starting with empty dictionary.");
        }
    }

    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Word w : words) {
                bw.write(w.getEnglish() + "=" + w.getVietnamese());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving dictionary: " + e.getMessage());
        }
    }

    public void addWord(String english, String vietnamese) {
        for (Word w : words) {
            if (w.getEnglish().equalsIgnoreCase(english)) {
                System.out.println("Word already exists. Use another word.");
                return;
            }
        }

        words.add(new Word(english,vietnamese));
        saveToFile();
    }

    public String findWord(String english) {
        for (Word w : words) {
            if (w.getEnglish().equalsIgnoreCase(english)) {
                return w.getVietnamese();
            }
        }
        return null;
    }

    public void displayAllWords() {
        if (words.isEmpty()) {
            System.out.println("Dictionary is empty.");
            return;
        }

        for (Word w : words) {
            System.out.println(w);
        }
    }

    public boolean deleteWord(String english) {
        Iterator<Word> iterator = words.iterator();
        while (iterator.hasNext()) {
            Word w = iterator.next();
            if (w.getEnglish().equalsIgnoreCase(english)) {
                iterator.remove();
                saveToFile();
                return true;
            }
        }
        return false;
    }
}

