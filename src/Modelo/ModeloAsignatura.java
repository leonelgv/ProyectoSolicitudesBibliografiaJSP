package Modelo;

import include.Asignatura;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloAsignatura extends Conexion {
    public boolean crear_asignatura(Asignatura a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO asignatura VALUES ( ?, ?, ?, ?, ? )";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, a.getClaveAsig());
            pst.setString(2, a.getNombreAsignatura());
            pst.setInt(3, a.getCreditos());
            pst.setInt(4, a.getClaveCarrera());
            pst.setString(5, a.getAsignaturacol());
            if(pst.executeUpdate() == 1){
                flag = true;
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if(getConecction() != null) getConecction().close();
                if(pst != null) pst.close();
            } catch (Exception e){

            }
        }
        return flag;
    }

    public ArrayList<Asignatura> getAllAsignaturas(){
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM asignatura";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                asignaturas.add(new Asignatura(rs.getInt("ClaveAsig"),
                        rs.getString("NombreAsignatura"),
                        rs.getInt("Creditos"),
                        rs.getInt("ClaveCarrera"),
                        rs.getString("Asiganturacol")));
            }
        } catch (Exception e) {

        }finally {
            try {
                if(getConecction() != null)getConecction().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {

            }
        }
        return asignaturas;
    }
    /*
    public static void main(String[] args) {
        ModeloAsignatura asign = new ModeloAsignatura();
        //System.out.println(asign.crear_asignatura(new Asignatura(1, "Mecanica", 5, 1234, "Mecanica")));

        for(Asignatura a : asign.getAllAsignaturas()) {
            System.out.println(a.getNombreAsignatura());
        }
    }
    */
}