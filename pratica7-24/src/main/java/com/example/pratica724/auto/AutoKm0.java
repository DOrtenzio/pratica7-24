package com.example.pratica724.auto;

public class AutoKm0 extends AutoUsata{
    public AutoKm0(String marca, String modello, double prezzo, int annoImmatricolazione,String alimentazione, int chilometraggio) {
        super(marca, modello, prezzo, annoImmatricolazione,alimentazione, chilometraggio);
    }

    @Override
    public void setChilometraggio(int chilometraggio){
        if (chilometraggio<0 || chilometraggio>100)
            super.setChilometraggio(100);
        else
            super.setChilometraggio(chilometraggio);
    }

}
