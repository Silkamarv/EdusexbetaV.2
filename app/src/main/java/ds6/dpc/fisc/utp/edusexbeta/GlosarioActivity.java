package ds6.dpc.fisc.utp.edusexbeta;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class GlosarioActivity extends AppCompatActivity {
    ArrayList<GlosarioVo>  listaGlosario;
    RecyclerView recyclerGlosario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glosario);
        listaGlosario=new ArrayList<>();
        recyclerGlosario=(RecyclerView) findViewById(R.id.RecyclerId);
        recyclerGlosario.setLayoutManager(new LinearLayoutManager(this));



        llenarGlosario();
        AdaptadorGlosario adapter=new AdaptadorGlosario(listaGlosario);
        recyclerGlosario.setAdapter(adapter);
    }

    private void llenarGlosario() {
        listaGlosario.add(new GlosarioVo("ABSTINENCIA","Decidir no tener ningún tipo de relación sexual"));
        listaGlosario.add(new GlosarioVo("CONDÓN","Un forro plástico o una goma que cubre el pene del hombre durante el acto sexual."));
        listaGlosario.add(new GlosarioVo("EDAD DE CONSENTIMIENTO SEXUAL","Edad en la que la ley estatal considera que una persona es lo suficientemente grande como para decidir si desea tener relaciones sexuales con alguien"));
        listaGlosario.add(new GlosarioVo("ENFERMEDAD DE TRANSMISIÓN SEXUAL (ETS)"," son infecciones que transmiten de una persona a otra a través del contacto sexual."));
        listaGlosario.add(new GlosarioVo("HERPES","Enfermedad de transmisión sexual (ETS) causada por dos virus diferentes "));
        listaGlosario.add(new GlosarioVo("HORMONAS","Productos químicos que provocan cambios en el cuerpo y en el cerebro"));
        listaGlosario.add(new GlosarioVo("PUBERTAD","Periodo entre la niñez y la adultez en el que las personas maduran física y sexualmente."));
        listaGlosario.add(new GlosarioVo("SEXO","El rótulo “femenino”, “masculino” o, que se asigna al nacer. "));
        listaGlosario.add(new GlosarioVo("SIDA","(síndrome de inmunodeficiencia adquirida) Etapa más avanzada de la infección por VIH."));
        listaGlosario.add(new GlosarioVo("TABÚ","Comportamiento que no está dentro de las normas culturales. Algo que la sociedad o la cultura dicen que no debes hacer ni mencionar."));
        listaGlosario.add(new GlosarioVo("VIH","(virus de inmunodeficiencia humana) VIH es una infección que descompone tu sistema inmune y puede llevar al SIDA. No existe cura para la misma, pero el tratamiento puede ayudar a que te mantengas saludable."));


    }
}
