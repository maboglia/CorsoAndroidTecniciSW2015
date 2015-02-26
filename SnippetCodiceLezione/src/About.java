package it.bogliaccino.bogliaccinomyapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class About extends ActionBarActivity {

    ListView listaAbout;
    String[] about;
    protected MyAdapter adapter, adapterTitoli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //array in xml
        about = getResources().getStringArray(R.array.about);

        //ArrayAdapter<String> adapterStatico = new ArrayAdapter<String>(this, R.layout.activity_about, R.id.lvMiaLista);

        //prendo la lista
        listaAbout = (ListView) findViewById(R.id.lvMiaLista);


        //uso adapter in java
        adapter = new MyAdapter(this);
        adapter.addTitle("Curriculum");
        adapter.addTitle("Contatti");
        adapter.addTitle("Galleria");
        adapter.addTitle("Link");

        //uso adapter in XML
        ListAdapter adapterXMl = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, about);
        listaAbout.setAdapter(adapterXMl);
        listaAbout.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(About.this, "Hai cliccato su " + position, Toast.LENGTH_SHORT).show();
            }
        });




        //collego listview e adapter
        //listaAbout.setAdapter(adapter);

        /*
        listaAbout.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //prendo il titolo della pagina da mostrare
                String title = ((TextView) view.findViewById(R.id.titolo_row)).getText().toString();
                //mostro un toast col titolo
                Toast t = Toast.makeText(About.this, "Hai cliccato su " + title, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP,0,150);
                t.show();

            }
        });
        */
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
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
