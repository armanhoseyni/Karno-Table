module org.example.demo22 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.demo22 to javafx.fxml;
    exports org.example.demo22;
}