package Controlador;

import Modelo.ModeloAsignatura;
import include.Asignatura;

public class ControladorAsignatura {
    public boolean crearAsignatura(Asignatura a) {
        ModeloAsignatura modeloAsignatura = new ModeloAsignatura();
        return modeloAsignatura.crear_asignatura(a);
    }

    public String getViewAsignaturas() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Clave Asignatura</th>\n" +
                "\t\t\t\t            <th>Nombre Asignatura</th>\n" +
                "\t\t\t\t            <th>Creditos</th>\n" +
                "\t\t\t\t            <th>Clave de la carrera</th>\n" +
                "\t\t\t\t            <th>Nombre Asignatura</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloAsignatura modeloAsignatura = new ModeloAsignatura();
        int i =0;

        for (Asignatura a : modeloAsignatura.getAllProductos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getClaveAsig() + "</td>" +
                    "<td>" + a.getNombreAsignatura() + "</td>" +
                    "<td>" + a.getCreditos() + "</td>" +
                    "<td>" + a.getClaveCarrera() + "</td>" +
                    "<td>" + a.getAsignaturacol() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }
}
