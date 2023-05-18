module com.example.projet_6quiprend_humpday {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projet_6quiprend_humpday to javafx.fxml;
    exports com.example.projet_6quiprend_humpday;
}