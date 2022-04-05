package com.fges.fges_plage;

public interface DonneeStationObservable {
    public void enregistrerObservateur(DonneeStationObserver observer);
    public void supprimerObservateur(DonneeStationObserver observer);
    public void notifierObservateurs(DonneeStation donne);
}
