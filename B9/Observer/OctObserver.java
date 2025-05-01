package B9.Observer;

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.println(" " + Integer.toOctalString(subject.getState()));
    }
}
