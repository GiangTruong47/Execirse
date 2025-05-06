package EndChapter;

public class Word {
    private String english;
    private String vietnamese;

    public Word(String english, String vietnamese) {
        this.english = english;
        this.vietnamese = vietnamese;
    }

    public String getEnglish() {
        return english;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    @Override
    public String toString() {
        return english + " : " + vietnamese;
    }
}
