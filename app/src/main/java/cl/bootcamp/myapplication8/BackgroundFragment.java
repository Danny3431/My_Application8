package cl.bootcamp.myapplication8;

import android.os.Bundle;

public class BackgroundFragment extends PokemonFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    protected int getPokemonImage() {
        return R.drawable.pokebola;
    }
}
