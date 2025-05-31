module launchcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens launchcalculator to javafx.fxml;
    exports launchcalculator;
}