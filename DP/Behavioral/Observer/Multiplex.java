import java.beans.PropertyChangeSupport;

public class Multiplex {

    private String releasing;
    private String closing;
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void setReleasing(String value) {
        support.firePropertyChange("releasing", this.releasing, value);
        this.releasing = value;
    }

    public void setClosing(String value) {
        support.firePropertyChange("closing", this.closing, value);
        this.closing = value;
    }

    public void subscribe(MovieGoer movieGoer) {
        support.addPropertyChangeListener(movieGoer);

    }
}
