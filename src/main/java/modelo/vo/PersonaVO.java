package modelo.vo;

public class PersonaVO {
    private int cod;
    private String nombre;
    private Double sueldo;

    public PersonaVO() {

    }

    public PersonaVO(int cod, String nombre, Double sueldo) {
        this.cod = cod;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return cod;
    }

    public void setCodigo(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getsueldo() {return sueldo;}

    public void setsueldo(Double sueldo) {this.sueldo = sueldo;}

    @Override
    public String toString() {
        return "PersonaVO{" + "cod=" + cod + ", nombre=" + nombre + ", sueldo= " + sueldo + '}';
    }

}
