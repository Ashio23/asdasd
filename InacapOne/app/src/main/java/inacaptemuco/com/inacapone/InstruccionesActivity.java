package inacaptemuco.com.inacapone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InstruccionesActivity extends AppCompatActivity {

           TextView txvInstrucciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones);


        txvInstrucciones = (TextView) findViewById(R.id.txv_instrucciones);


    }
}
