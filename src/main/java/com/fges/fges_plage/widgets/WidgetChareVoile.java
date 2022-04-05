package com.fges.fges_plage.widgets;
import com.fges.fges_plage.DonneeStation;
import java.io.PrintStream;

public class WidgetChareVoile extends Widget{

    public WidgetChareVoile(DonneeStation donneeInit) {
        super(donneeInit);
    }

    public void afficher(PrintStream stream){
        stream.println("Char à voile");
        stream.println("========");
        if(super.derniereDonnee.getVent()>=3){
            stream.println("Char à voile possible.");
        }else {
            stream.println("Char à voile impossible.");
        }
    }
}
