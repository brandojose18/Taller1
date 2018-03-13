package com.holamundo.taller1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView res;
    private EditText nombres, apellidos, cantidad;
    private Resources resources;
    private Spinner sexo;
    private Spinner tipoDeZapato;
    private Spinner marca;
    private String sex[];
    private String tipzap[];
    private String mar[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = (TextView)findViewById(R.id.txtResultado);
        nombres = (EditText)findViewById(R.id.txtNombres);
        apellidos = (EditText)findViewById(R.id.txtApellidos);
        cantidad = (EditText)findViewById(R.id.txtCantidad);

        sexo = (Spinner)findViewById(R.id.cmbSexo);
        tipoDeZapato = (Spinner)findViewById(R.id.cmbTipoDeZapato);
        marca = (Spinner)findViewById(R.id.cmbMarca);

        resources = this.getResources();

        sex = resources.getStringArray(R.array.sexo);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,sex);
        sexo.setAdapter(adapter);

        tipzap = resources.getStringArray(R.array.tipoDeZapato);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,tipzap);
        tipoDeZapato.setAdapter(adapter2);

        mar = resources.getStringArray(R.array.marca);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,mar);
        marca.setAdapter(adapter3);

    }


    public boolean validar (){
        //int posicion = operaciones.getSelectedItemPosition();
        if (nombres.getText().toString().isEmpty()) {
            nombres.setError(resources.getString(R.string.mensaje_error_uno));
            return false;
        }
        if (apellidos.getText().toString().isEmpty()) {
            apellidos.setError(resources.getString(R.string.mensaje_error_dos));
            return false;
        }
        if (cantidad.getText().toString().isEmpty()) {
            cantidad.setError(resources.getString(R.string.mensaje_error_tres));
            return false;
        }

        if ((Integer.parseInt(cantidad.getText().toString())==0)){
            Toast.makeText(this, resources.getString(R.string.valor_mayor_a_cero),Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    //Estructura para llamar a un botón
    public void comprar (View v){

        int combo1,combo2,combo3,cantidad1,valoraPagar=0;
        double num1, num2, resultado=0;
        String nombres1,apellidos1,sexoEscogido="",tipoDeZapatoEscogido="",MarcaDeZapatoEscogida="";
        res.setText("");

        if (validar()){


            combo1=sexo.getSelectedItemPosition();
            combo2=tipoDeZapato.getSelectedItemPosition();
            combo3=marca.getSelectedItemPosition();
            nombres1 = nombres.getText().toString();
            apellidos1 = apellidos.getText().toString() ;
            cantidad1 = Integer.parseInt(cantidad.getText().toString());

            switch (combo2){
                case 0:
                    tipoDeZapatoEscogido = "Zapatilla";
                    break;
                case 1:
                    tipoDeZapatoEscogido = "Clasico";
                    break;
            }

            switch (combo3){
                case 0:
                    MarcaDeZapatoEscogida = "Nike";
                    break;
                case 1:
                    MarcaDeZapatoEscogida = "Adidas";
                    break;
                case 2:
                    MarcaDeZapatoEscogida = "Puma";
                    break;
            }

            switch (combo1){
                case 0:
                    sexoEscogido = "Masculino";
                    if (tipoDeZapatoEscogido == "Zapatilla"){
                        if (MarcaDeZapatoEscogida == "Nike"){
                            valoraPagar = 120000 * cantidad1;
                        }else if(MarcaDeZapatoEscogida == "Adidas"){
                            valoraPagar = 140000 * cantidad1;
                        }else if(MarcaDeZapatoEscogida == "Puma"){
                            valoraPagar = 130000 * cantidad1;
                        }
                    }else {
                        if (MarcaDeZapatoEscogida == "Nike"){
                            valoraPagar = 50000 * cantidad1;
                        }else if(MarcaDeZapatoEscogida == "Adidas"){
                            valoraPagar = 80000 * cantidad1;
                        }else if(MarcaDeZapatoEscogida == "Puma"){
                            valoraPagar = 100000 * cantidad1;
                        }
                    }

                    break;
                case 1:
                    sexoEscogido = "Femenino";
                    if (tipoDeZapatoEscogido == "Zapatilla"){
                        if (MarcaDeZapatoEscogida == "Nike"){
                            valoraPagar = 100000 * cantidad1;
                        }else if(MarcaDeZapatoEscogida == "Adidas"){
                            valoraPagar = 130000 * cantidad1;
                        }else if(MarcaDeZapatoEscogida == "Puma"){
                            valoraPagar = 110000 * cantidad1;
                        }
                    }else {
                        if (MarcaDeZapatoEscogida == "Nike"){
                            valoraPagar = 60000 * cantidad1;
                        }else if(MarcaDeZapatoEscogida == "Adidas"){
                            valoraPagar = 70000 * cantidad1;
                        }else if(MarcaDeZapatoEscogida == "Puma"){
                            valoraPagar = 120000 * cantidad1;
                        }
                    }
                    break;
            }

            res.setText(nombres1 + " " + apellidos1 + " \n" + resources.getString(R.string.valor_a_pagar) + " $" + valoraPagar);
        }

    }

    //Estructura para llamar a un botón
    public void borrar (View v){

        res.setText("");
        nombres.setText("");
        apellidos.setText("");
        cantidad.setText(""+1);
        nombres.requestFocus();
        sexo.setSelection(0);
        tipoDeZapato.setSelection(0);
        marca.setSelection(0);

    }
}
