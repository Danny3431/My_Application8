package cl.bootcamp.myapplication8;


import android.os.Bundle;

public class CharmanderFragment extends PokemonFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getPokemonImage() {
        return R.drawable.chamanderl;
    }
}