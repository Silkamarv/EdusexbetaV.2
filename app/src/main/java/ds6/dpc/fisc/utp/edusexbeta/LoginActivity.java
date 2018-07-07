package ds6.dpc.fisc.utp.edusexbeta;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText edtUsuario, edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsuario = (EditText) findViewById(R.id.campoNombre);
        edtPass = (EditText) findViewById(R.id.Campopassword);
    }

    ConexionSQLiteHelper db = new ConexionSQLiteHelper(this, "bd_usuarios,", null, 1);


    public void Registrarse(View view) {
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    public void Iniciar(View view) {

        String[] isbn = {edtUsuario.getText().toString()};
        db.open();
        Cursor cursor = db.getUser(isbn);
        cursor.moveToFirst();
        String nombre = cursor.getString(0);
        String contrasena = cursor.getString(1);
        String temp = edtUsuario.getText().toString();
        String temp1 = edtPass.getText().toString();
        if (edtUsuario.getText().toString().equals(nombre) && edtPass.getText().toString().equals(contrasena)) {
            Intent intent = new Intent(this, MenuActivity.class);
            startActivityForResult(intent,0);
        } else {
            Toast.makeText(this, "Usuario o Contrasena incorrectos ", Toast.LENGTH_SHORT).show();
            db.close();

        }


    }
}

