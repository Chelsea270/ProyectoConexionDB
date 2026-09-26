module org.test.proyectoconexiondb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens org.test.proyectoconexiondb.controller to javafx.fxml;
    exports org.test.proyectoconexiondb.controller to javafx.fxml;
    opens org.test.proyectoconexiondb to javafx.fxml;
    exports org.test.proyectoconexiondb;
}