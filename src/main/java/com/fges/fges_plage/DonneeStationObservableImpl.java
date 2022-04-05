package com.fges.fges_plage;

import java.util.List;
import java.util.LinkedList;

public class DonneeStationObservableImpl implements DonneeStationObservable {
    List<DonneeStationObserver> observateurs = new LinkedList<>();
    @Override
    public void enregistrerObservateur(DonneeStationObserver observateur) {
        observateurs.add(observateur);
    }
    
    @Override
    public void supprimerObservateur(DonneeStationObserver observateur) {
        observateurs.remove(observateur);
    }

    @Override
    public void notifierObservateurs(DonneeStation donnee) {
        for(DonneeStationObserver observer : observateurs){
            observer.actualiser(donnee);
        }
    }
}
