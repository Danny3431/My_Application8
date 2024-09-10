package cl.bootcamp.myapplication8;

import android.os.Bundle;

public class BulbasaurFragment extends PokemonFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getPokemonImage() {
        return R.drawable.bulbasaur; // Asegúrate de tener esta imagen en res/drawable
    }
}