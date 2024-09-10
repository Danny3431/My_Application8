package cl.bootcamp.myapplication8;

import static cl.bootcamp.myapplication8.R.id.pokemon_icon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button buttonValidate;
    private String currentPokemon = "pokeball"; // Para almacenar el Pokémon actual


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        buttonValidate = findViewById(R.id.button_validate);

        buttonValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId != -1) {
                    RadioButton selectedRadioButton = findViewById(selectedId);
                    String choice = selectedRadioButton.getText().toString();
                    showPokemonDialog(choice);
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, selecciona una opción", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void showPokemonDialog(String pokemonName) {
        // Crea el diálogo utilizando el diseño personalizado
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_pokemon, null);
        builder.setView(dialogView);

        // Configura los elementos del diálogo
        ImageView pokemonIcon = dialogView.findViewById(pokemon_icon);
        TextView pokemonNameTextView = dialogView.findViewById(R.id.pokemon_name);
        Button buttonAccept = dialogView.findViewById(R.id.button_accept);
        Button buttonCancel = dialogView.findViewById(R.id.button_cancel);

        // Asigna el nombre y la imagen del Pokémon
        pokemonNameTextView.setText(pokemonName);
        setPokemonIcon(pokemonName, pokemonIcon);

        // Crea el diálogo
        builder.setTitle("Pokémon Seleccionado es");
        AlertDialog dialog = builder.create();

        // Configura el botón de Aceptar
        buttonAccept.setOnClickListener(v -> {
            dialog.dismiss(); // Cierra el diálogo
            changePokemonFragment(pokemonName); // Cambia al fragmento correspondiente
            currentPokemon = pokemonName; // Actualiza el Pokémon actual
        });

        // Configura el botón de Cancelar
        buttonCancel.setOnClickListener(v -> {
            dialog.dismiss(); // Cierra el diálogo
            resetSelection(); // Reinicia la selección
        });

        dialog.show(); // Muestra el diálogo
    }

    private void setPokemonIcon(String pokemonName, ImageView imageView) {
        switch (pokemonName) {
            case "Charmander":
                imageView.setImageResource(R.drawable.charmander_icon);
                break;
            case "Bulbasaur":
                imageView.setImageResource(R.drawable.bulbasaur_icon);
                break;
            case "Squirtle":
                imageView.setImageResource(R.drawable.squirtle_icon);
                break;
            default:
                imageView.setImageResource(R.drawable.pokeball); // Icono por defecto
                break;
        }
    }

    private void changePokemonFragment(String pokemonName) {
        Fragment fragment;

        switch (pokemonName) {
            case "Charmander":
                fragment = new CharmanderFragment();
                break;
            case "Bulbasaur":
                fragment = new BulbasaurFragment();
                break;
            case "Squirtle":
                fragment = new SquirtleFragment();
                break;
            default:
                fragment = new PokemonFragment() {
                    @Override
                    protected int getPokemonImage() {
                        return R.drawable.pokeball; // Icono por defecto
                    }
                };
                break;
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    private void resetSelection() {
        radioGroup.clearCheck(); // Limpia la selección de RadioButtons
        // Establece el fondo del ConstraintLayout
        ConstraintLayout mainLayout = findViewById(R.id.main);
        mainLayout.setBackgroundResource(R.drawable.pokebola);
    }
}