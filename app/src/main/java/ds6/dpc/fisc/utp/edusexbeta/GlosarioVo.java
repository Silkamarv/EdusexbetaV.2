package ds6.dpc.fisc.utp.edusexbeta;

public class GlosarioVo {
    private String nombre;
    private String info;

    public GlosarioVo(){

    }

    public GlosarioVo(String nombre, String info) {
        this.nombre = nombre;
        this.info = info;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
