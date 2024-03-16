module com.flori.gradeapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires lombok;

    opens com.flori.gradeapp to javafx.fxml;
    exports com.flori.gradeapp;
}