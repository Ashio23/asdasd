package inacaptemuco.com.inacapone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import operaciones.Salud;

public class ResultadosActivity extends AppCompatActivity {
    //1 - creamos un objeto de la clase textview

    TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        //2 - asociar al objeto el componente del layaout

        txvResultado = (TextView) findViewById(R.id.txv_resultado);

        //3 - capturamos el objeto de la clase intent que se envía desde el mainActivity

        Intent intento = getIntent();

        //4 - obtenemos los datos enviados por el activity

        Bundle datosRecibidos = intento.getExtras();

        // 5- capturamos uno de los datos enviados desde el activity madiante el intento

        int edadRecibida = datosRecibidos.getInt("p_edad");
        String nombreRecibido = datosRecibidos.getString("p_nombre");
        int pesoRecibido = datosRecibidos.getInt("p_peso_actual");

        // 5.1 - Creamos objeto de la clase Salud

        Salud salud = new Salud();

        //5.2 - Mediante los setter, asignamos las propiedades al objeto

        salud.setNombre(nombreRecibido);
        salud.setEdad(edadRecibida);
        salud.setPesoActual(pesoRecibido);


        txvResultado.setText("Peso ideal de " + salud.getNombre() + " es " + salud.calcularPesoIdeal() + " Por lo que usted está " + salud.compararPeso());

    }
}

