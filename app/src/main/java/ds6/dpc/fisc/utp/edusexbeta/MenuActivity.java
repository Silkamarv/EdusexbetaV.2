package ds6.dpc.fisc.utp.edusexbeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Onclick(View view) {
        Intent miIntent=null;
        switch (view.getId())

        {
            case R.id.btntemas:
                miIntent = new Intent (MenuActivity.this,TemasActivity.class);
                startActivity(miIntent);
                break;

            case R.id.btnglosario:
                miIntent = new Intent (MenuActivity.this,GlosarioActivity.class);
                startActivity(miIntent);
                break;

            case R.id.btnjugar:
                miIntent = new Intent (MenuActivity.this,JugarActivity.class);
                startActivity(miIntent);
                break;

            case R.id.btnperfil:
                miIntent = new Intent (MenuActivity.this,PerfilActivity.class);
                startActivity(miIntent);
                break;
        }
    }


}
