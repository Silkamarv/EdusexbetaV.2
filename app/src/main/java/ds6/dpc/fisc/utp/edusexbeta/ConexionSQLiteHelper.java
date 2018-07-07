package ds6.dpc.fisc.utp.edusexbeta;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import ds6.dpc.fisc.utp.edusexbeta.utilidades.Utilidades;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    SQLiteDatabase db;

    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_USUARIOS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS usuario");
        onCreate(db);
    }


    public ConexionSQLiteHelper open() throws SQLException {
        db=this.getWritableDatabase();
        return this;}

    public void close() throws SQLException{
        db.close();
    }

    public long insertUser (String nombre,String pass)
    {

        ContentValues initialValues = new ContentValues();
        initialValues.put(Utilidades.CAMPO_NOMBRE,nombre);
        initialValues.put(Utilidades.CAMPO_PASSWORD, pass);
        System.out.println(nombre+" "+pass+"-------------------------------");
        return db.insert(Utilidades.TABLA_USUARIOS,Utilidades.CAMPO_NOMBRE, initialValues);
    }

    public Cursor getUser(String[] titulo) throws SQLException
    {
        String[] campos ={Utilidades.CAMPO_NOMBRE,Utilidades.CAMPO_PASSWORD};
        Cursor cursor = db.query(Utilidades.TABLA_USUARIOS,campos,Utilidades.CAMPO_NOMBRE+"=?",titulo,
                null,null,null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return cursor;
    }


}

