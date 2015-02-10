package it.bogliaccino.loginactivity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {

    EditText un, pw;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        un = (EditText) findViewById(R.id.et_username);
        pw = (EditText) findViewById(R.id.et_password);
        btn = (Button) findViewById(R.id.btnLogin);

    }


    public void faiLogin(View v){
        String name = un.getText().toString();
        String password = pw.getText().toString();

        if (name.equals("mauro") || pw.equals("12345")){

            //Toast.makeText(LoginActivity.this, "Hai inserito correttamente le credenziali", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(LoginActivity.this, AreaRiservata.class);

            i.putExtra("NOME",name);

            startActivity(i);

        }
        else
        {

            Toast.makeText(LoginActivity.this, "Non hai inserito correttamente le credenziali", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
