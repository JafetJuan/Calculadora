package com.pccomponentes.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcMainActivity extends AppCompatActivity {

    private EditText operador1;
    private EditText operador2;
    private Button suma;
    private Button resta;
    private Button multiplicacion;
    private Button division;
    private Button clear;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        operador1 = (EditText) findViewById(R.id.operador1);
        operador2 = (EditText) findViewById(R.id.operador2);
        suma = (Button) findViewById(R.id.buttonSuma);
        resta = (Button) findViewById(R.id.buttonResta);
        multiplicacion = (Button) findViewById(R.id.buttonMultiplicacion);
        division = (Button) findViewById(R.id.buttonDivision);
        clear = (Button) findViewById(R.id.clear);
        resultado = (TextView) findViewById(R.id.resultado);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operador1.getText().length() > 0) && (operador2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operador1.getText().toString());
                    double oper2 = Double.parseDouble(operador2.getText().toString());

                    double tempResult = (oper1 + oper2);

                    resultado.setText(Double.toString(tempResult));
                } else {
                    Toast.makeText(
                                CalcMainActivity.this,
                                "Introduce numeros en los dos campos",
                                Toast.LENGTH_LONG
                            ).show();
                }
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operador1.getText().length() > 0) && (operador2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operador1.getText().toString());
                    double oper2 = Double.parseDouble(operador2.getText().toString());

                    double tempResult = (oper1 - oper2);

                    resultado.setText(Double.toString(tempResult));
                } else {
                    Toast.makeText(
                            CalcMainActivity.this,
                            "Introduce numeros en los dos campos",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operador1.getText().length() > 0) && (operador2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operador1.getText().toString());
                    double oper2 = Double.parseDouble(operador2.getText().toString());

                    double tempResult = (oper1 * oper2);

                    resultado.setText(Double.toString(tempResult));
                } else {
                    Toast.makeText(
                            CalcMainActivity.this,
                            "Introduce numeros en los dos campos",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operador1.getText().length() > 0) && (operador2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operador1.getText().toString());
                    double oper2 = Double.parseDouble(operador2.getText().toString());

                    double tempResult = (oper1 / oper2);

                    resultado.setText(Double.toString(tempResult));
                } else {
                    Toast.makeText(
                            CalcMainActivity.this,
                            "Introduce numeros en los dos campos",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador1.setText("");
                operador2.setText("");
                resultado.setText("0.00");
                operador1.requestFocus();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calc_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
