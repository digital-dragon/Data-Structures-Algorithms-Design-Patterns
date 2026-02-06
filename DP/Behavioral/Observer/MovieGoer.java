import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MovieGoer implements PropertyChangeListener {

    private String name;

    public MovieGoer(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        var propertyName = evt.getPropertyName();
        var propertyValue = evt.getNewValue();

        String message = switch (propertyName) {
            case "releasing" -> "Hey " + name + "! New movie releasing: " + propertyValue;
            case "closing" -> "Hey " + name + "! closing: " + propertyValue;
            default -> "Hey " + name + "! New movie releasing: " + propertyValue;

        };

        System.out.println(message);
    }

}
