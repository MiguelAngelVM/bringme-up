package mx.edu.utem.hackcolima2;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Vector;

public class Chofer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chofer);
        ArrayAdapter <CharSequence> adapter =
                new ArrayAdapter<CharSequence>(this, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adapter.add("Ruta 1");
        adapter.add("Ruta 2");
        adapter.add("Ruta 3");
        adapter.add("Ruta 4");
        adapter.add("Ruta 5");


        Spinner s = (Spinner) findViewById(R.id.spinner);
        s.getSolidColor();
        s.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chofer, menu);
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
   /* public void buscarRuta()
    {
        String

        String urlBase = "http://192.168.116.1/";
        // en el array agregaremos las variables
        String[][] params = { { "/apk/busquedaControl.php", "" }, { "ruta", ruta } };
        // guardaremos esto en la variable wr, aqui mandaremos la peticion al
        // php
        Peticion wr = new Peticion(urlBase, params, this.handler);
        wr.start();

    }*/
    public void bscarRuta(View view)
    {
        ImageView iv = (ImageView)this.findViewById(R.id.imageView);
        iv.setVisibility(View.VISIBLE);
    }
}
