package ds6.dpc.fisc.utp.edusexbeta;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class TemasActivity extends AppCompatActivity {

    ArrayList<ModuloVo> listaModulos;
    RecyclerView recyclerModulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);

        listaModulos=new ArrayList<>();
        recyclerModulo= (RecyclerView) findViewById(R.id.RecyclerId);

        recyclerModulo.setLayoutManager(new LinearLayoutManager(this));
        llenarModulos();
        AdaptadorModulo adapter=new AdaptadorModulo(listaModulos);
        recyclerModulo.setAdapter(adapter);
    }


    private void llenarModulos()
    {
        listaModulos.add(new ModuloVo("Sexualidad y Desarrollo Sexual","La sexualidad es un componente de nuestra personalidad, que forma un todo con nosotros mismos. Nos acompaña permanentemente. Sin embargo, ha pasado a ser en la sociedad tradicional, un aspecto velado, dejado a la comprensión de los mayores, y ubicado en aquel lugar que corresponde a nuestros recónditos secretos. Como consecuencia, ha caído un negro telón sobre ella. En ella surge un desarrollo por etapas y cambios en:*Aspecto físico: estos cambios en las mujeres son muy evidentes por el crecimeinto de senos, ensachamiento de caderas, aparicion de la primera mestruación o menarquía.Mientras que en los hombres se evidencia el desarrollo de los genitales, aumento de masa muscular, aparición de vello facial y las primeras expulsiones de líquido seminal.*Aspecto psicológico: estos se producen internamente y se manifiestan en la forma de ser, pensar y actual en el entorno.*Aspecto Social: hay cambios en la forma de relacionarse con sus semejantes.",R.drawable.m1));

        listaModulos.add(new ModuloVo("Control de Natalidad","El control de la natalidad está diseñado para prevenir el embarazo. Los métodos anticonceptivos pueden trabajar en varias formas:*Impedir que los espermatozoides lleguen a los óvulos. Estos tipos incluyen condones, diafragmas, capuchones o cubiertas cervicales y esponjas anticonceptivas*Evitar que los ovarios de la mujer liberen óvulos que puedan ser fertilizados. Estos tipos incluyen píldoras anticonceptivas, parches, inyecciones, anillos vaginales y píldoras anticonceptivas de emergencia. Los dispositivos intrauterinos, que se implantan en el útero, pueden mantenerse en su lugar durante varios años*Esterilización, que impide en forma permanente que una mujer quede embarazada o que un hombre sea capaz de embarazar a una mujer Su opción de control de la natalidad depende de varios factores. Estos incluyen su salud, la frecuencia de su actividad sexual y otros.",R.drawable.m2));


        listaModulos.add(new ModuloVo("Enfermedades de Transmisión Sexual","Las enfermedades de transmisión sexual (ETS) son infecciones que transmiten de una persona a otra a través del contacto sexual. Las causas de las ETS son las bacterias, parásitos, hongos y virus. Existen más de 20 tipos de ETS, que incluyen: Clamidia, Herpes genital, Gonorrea, VIH/SIDA, VPH, Sífilis, Tricomoniasis.La mayoría de las ETS afectan tanto a hombres como a mujeres, pero en muchos casos los problemas de salud que provocan pueden ser más graves en las mujeres. Si una mujer embarazada padece de ETS, puede causarle graves problemas de salud al bebé.Los antibióticos pueden tratar las ETS causadas por bacterias, hongos o parásitos. No hay cura para ETS causada por un virus, pero los medicamentos pueden ayudar con los síntomas y mantener la enfermedad bajo control.El uso correcto de preservativos de látex reduce enormemente, aunque no elimina, el riesgo de adquirir y contagiarse con ETS. La forma más confiable de evitar la infección es no tener sexo anal, vaginal u oral.",R.drawable.m3));

        listaModulos.add(new ModuloVo("Salud Sexual","La sexualidad es una parte importante del ser humano. El amor, el afecto y la intimidad sexual representan un papel importante en las relaciones saludables. También contribuyen con su sentido del bienestar. Pero algunos trastornos pueden afectar la capacidad de los hombres y de las mujeres de tener relaciones sexuales o disfrutarlas. Los factores que puede afectar la salud sexual incluyen: Temor a un embarazo no deseado, Preocupaciones sobre la infertilidad, Enfermedades de transmisión sexual, Enfermedades crónicas como cáncer o enfermedades delcorazón, Medicamentos que afectan el deseo sexual o el rendimiento.",R.drawable.m4));
    }

}
