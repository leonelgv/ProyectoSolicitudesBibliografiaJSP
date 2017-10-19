package Controlador;

import Modelo.ModeloAsignatura;
import include.Asignatura;

public class ControladorAsignatura {
    public boolean crearAsignatura(Asignatura a) {
        ModeloAsignatura modeloAsignatura = new ModeloAsignatura();
        return modeloAsignatura.crear_asignatura(a);
    }
}
