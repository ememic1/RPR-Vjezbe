package com.example.lv7;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class HelloController {
    public TextField imeID;
    public TextField prezimeID;
    public TextField emailID;
    public TextField korisnickoImeID;
    public PasswordField lozinkaID;
    public Button dodajBtn;
    public Button krajBtn;
    public ListView listaKorisnika;

    private ObservableList<Korisnik> korisniciList = FXCollections.observableArrayList();


    @FXML
    public void ZavrsiProgram(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void DodajKorisnika(ActionEvent actionEvent) {
        Korisnik korisnik = new Korisnik(imeID.getText(), prezimeID.getText(), emailID.getText(), korisnickoImeID.getText(), lozinkaID.getText());

        korisniciList.add(korisnik);

        listaKorisnika.setItems(korisniciList);

        imeID.clear();
        prezimeID.clear();
        emailID.clear();
        korisnickoImeID.clear();
        lozinkaID.clear();
    }
    @FXML
    public void popuniPodatkeKorisnika(MouseEvent mouseEvent) {
        listaKorisnika.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Korisnik selectedKorisnik = (Korisnik) listaKorisnika.getSelectionModel().getSelectedItem();
                if (selectedKorisnik != null) {
                    imeID.setText(selectedKorisnik.imeProperty().getValue());
                    prezimeID.setText(selectedKorisnik.prezimeProperty().getValue());
                    emailID.setText(selectedKorisnik.emailProperty().getValue());
                    korisnickoImeID.setText(selectedKorisnik.usernameProperty().getValue());
                    lozinkaID.setText(selectedKorisnik.passwordProperty().getValue());
                }
            }
        });
    }

    /*@FXML
    public void initialize() {
        imeID.textProperty().bindBidirectional(KorisniciModel.getTrenutniKorisnik().imeProperty());
        listaKorisnika.setItems(KorisniciModel.getKorisniciList());

        listaKorisnika.getSelectionModel().selectedItemProperty().addListener((obs, oldKorisnik, newKorisnik) -> {
            KorisniciModel.setTrenutniKorisnik((Korisnik) newKorisnik);
            listaKorisnika.refresh();
        });
    }*/
}