module com.gdscuba.guessinggame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.gdscuba.guessinggame to javafx.fxml;
    exports com.gdscuba.guessinggame;
}