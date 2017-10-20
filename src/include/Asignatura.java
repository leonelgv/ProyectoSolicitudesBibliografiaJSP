package include;

public class Asignatura {
    private int ClaveAsig;
    private String NombreAsignatura;
    private int Creditos;
    private int ClaveCarrera;
    private String Asignaturacol;

    public Asignatura() {
    }

    public Asignatura(int claveAsig,
                      String nombreAsignatura,
                      int creditos,
                      int claveCarrera,
                      String asignaturacol) {
        ClaveAsig = claveAsig;
        NombreAsignatura = nombreAsignatura;
        Creditos = creditos;
        ClaveCarrera = claveCarrera;
        Asignaturacol = asignaturacol;
    }

    public int getClaveAsig() {
        return ClaveAsig;
    }

    public void setClaveAsig(int claveAsig) {
        ClaveAsig = claveAsig;
    }

    public String getNombreAsignatura() {
        return NombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        NombreAsignatura = nombreAsignatura;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int creditos) {
        Creditos = creditos;
    }

    public int getClaveCarrera() {
        return ClaveCarrera;
    }

    public void setClaveCarrera(int claveCarrera) {
        ClaveCarrera = claveCarrera;
    }

    public String getAsignaturacol() {
        return Asignaturacol;
    }

    public void setAsignaturacol(String asignaturacol) {
        Asignaturacol = asignaturacol;
    }
}
