package Servlet;

import Controlador.ControladorAsignatura;
import Modelo.ModeloAsignatura;
import include.Asignatura;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;

@WebServlet(name = "NuevaAsignaturaServlet", urlPatterns = {"/crearAsignatura"})
public class NuevaAsignaturaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Materia</h1>");
        int clave_asignatura = 0;
        int creditos = 0;
        int claveCarrera = 0;
        String NombreAsignatura = request.getParameter("nombre_asignatura");
        String Asignaturacol = request.getParameter("asignatura");

        try {
            clave_asignatura = Integer.parseInt(request.getParameter("clave_asignatura"));
            creditos = Integer.parseInt(request.getParameter("creditos"));
            claveCarrera = Integer.parseInt(request.getParameter("clave_carrera"));
        } catch (NumberFormatException e){

        }
        Asignatura a = new Asignatura(clave_asignatura,NombreAsignatura,creditos,claveCarrera,Asignaturacol);
        ControladorAsignatura ca = new ControladorAsignatura();
        if(ca.crearAsignatura(a)) {
            out.println("<p>Materia agregada</p>");
        } else {
            out.println("<p>Materia agregada</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Materia</h1>");

        FileItemFactory file_factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(file_factory);

        ArrayList<String> campos = new ArrayList<>();

        try {
            List items = sfu.parseRequest(request);
            for (int i = 0; i < items.size(); i++) {
                FileItem item = (FileItem) items.get(i);
                if(!item.isFormField()){

                } else {
                    campos.add(item.getString());
                    response.getWriter().println(item.getString());
                }
            }
        } catch(Exception ex){

        }

    }
}
