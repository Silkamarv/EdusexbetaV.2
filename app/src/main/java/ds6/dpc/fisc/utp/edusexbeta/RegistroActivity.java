package ds6.dpc.fisc.utp.edusexbeta;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ds6.dpc.fisc.utp.edusexbeta.utilidades.Utilidades;

public class RegistroActivity extends AppCompatActivity {

    EditText campoNombre,campoPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


         campoNombre = ((EditText) findViewById(R.id.campoNombre));
         campoPassword = ((EditText) findViewById(R.id.campoPassword));
    }

    public void Registrar(View view) {
        registrarUsuarios();
    }

    private void registrarUsuarios() {

        ConexionSQLiteHelper db =new ConexionSQLiteHelper(this,"bd_usuarios,",null,1);
        db.open();
        Long id;
        id=db.insertUser(campoNombre.getText().toString(),campoPassword.getText().toString());
        //values.put(Utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
        //values.put(Utilidades.CAMPO_PASSWORD,campoPassword.getText().toString());

        //Long idResultante=db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_NOMBRE,values);
        Toast.makeText(this, "Usuario Registrado correctamente ", Toast.LENGTH_SHORT).show();

        db.close();
    }
}

   /* ConexionSQLiteHelper db = new ConexionSQLiteHelper(this, "bd_mosquitos", null, 1);
        db.open();
        Long id =db.insertContact("Mosquito Comun","mosquito_comun","LO QUE SEA");
        id=db.insertContact("Dengue","dengue","LEPRA");
        db.close();*/