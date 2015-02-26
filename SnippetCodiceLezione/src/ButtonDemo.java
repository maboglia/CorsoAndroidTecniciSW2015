package it.bogliaccino.buttondemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;



public class ButtonDemo extends Activity implements View.OnClickListener{


    Button btnRosso, btnVerde, btnBlu;
    TextView tvMessaggio;
    LinearLayout layoutColorato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_demo);

        btnBlu = (Button) findViewById(R.id.btnBlu);
        btnRosso = (Button) findViewById(R.id.btnRed);
        btnVerde = (Button) findViewById(R.id.btnGreen);

        tvMessaggio = (TextView) findViewById(R.id.tvSpazioTesto);

        layoutColorato = (LinearLayout) findViewById(R.id.llBottom);

        btnBlu.setOnClickListener(this);
        btnVerde.setOnClickListener(this);
        btnRosso.setOnClickListener(this);
        layoutColorato.setOnClickListener(this);


/*
        btnBlu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessaggio.setText("Hai premuto il bottone blu");
            }
        });
*/


    }

/*
    public void coloraRosso(View v){



        if (v.getId() == R.id.btnRed) {
            tvMessaggio.setText("Hai premuto il bottone rosso");
        }


        if (v.getId() == R.id.btnGreen) {
            tvMessaggio.setText("Hai premuto il bottone verde");
        }
    }
*/



    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnGreen:
                tvMessaggio.setText("Hai premuto il bottone verde");
                break;
            case R.id.btnRed:
                tvMessaggio.setText("Hai premuto il bottone rosso");
                break;
            case R.id.btnBlu:
                Intent i = new Intent(getApplicationContext(), ActivitySecondaria.class);
                startActivity(i);
                break;
            case R.id.llBottom:
                tvMessaggio.setText("Hai premuto sulk layout bottom");
                break;
            default:

                break;

        }
    }

}
