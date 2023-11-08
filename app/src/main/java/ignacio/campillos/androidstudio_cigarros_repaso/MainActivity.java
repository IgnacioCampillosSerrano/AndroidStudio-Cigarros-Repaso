package ignacio.campillos.androidstudio_cigarros_repaso;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;



import ignacio.campillos.androidstudio_cigarros_repaso.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private int cont;
    private int cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        cont = 20;
        cost = 5;

        binding.lbLeftActivityMain.setText(String.valueOf(cont));
        binding.lbCostActivityMain.setText(String.valueOf(cost) + "€");

        binding.imgPackActivityMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont--;
                if (cont <= 0){
                    cont = 20;
                    cost += 5;
                }

                binding.lbLeftActivityMain.setText(String.valueOf(cont));
                binding.lbCostActivityMain.setText(String.valueOf(cost) + "€");
            }
        });

    }
    //A LA HORA DE INCLINAR EL MOVIL SE GUARDA LA INFORMACION (Lista) EN UN BUNDLE
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    //AL VOLVER SE CARGA LA INFORMACION DE DICHO BUNDLE EN LA LISTA y SE ACTUALIZA EL ADAPTER CON TODA LA LISTA (Desde index 0 al tamaño de la lista)
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }
}