
package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class mPaquete extends Paquete {
    public static Conexion con = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    

    public List<Paquete> listar(int codigo) {
        List<Paquete> paquetes = new ArrayList<>();
        try {
            if ("".equals(codigo)) {
                sql = "SELECT codigo, descripcion, peso, precio, cedula_rem, cedula_des, codigo_can, direccion,codigo_env FROM paquete";
            } else {
                sql = "SELECT codigo, descripcion, peso, precio, cedula_rem, cedula_des, codigo_can, direccion,codigo_env FROM paquete WHERE codigo=" + codigo + "";
            }
            rs = con.consulta(sql);
            if (rs != null) {
                while (rs.next()) {
                    Paquete paquete = new Paquete(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4),
                            rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9));
                    paquetes.add(paquete);
                }
            }
            con.close();
            return paquetes;
        } catch (SQLException ex) {
            return null;
        }
    }
       public boolean crear() {
        sql = "INSERT INTO persona(descripcion, peso, precio, cedula_rem, cedula_des, codigo_can, direccion,codigo_env)"
                + " VALUES ('" + getDescripcion()
                + "'," + getPeso()
                + "," + getPrecio()
                + ",'" + getCedula_rem()
                + "','" + getCedula_dest()
                + "'," + getCodigo_can()
                + ",'" + getDireccion()
                + "," + getCodigo_envio()+")";
        return con.accion(sql);
    }
    public boolean eliminar(int codigo) {
        sql = "DELETE FROM paquete WHERE codigo=" + codigo + "";
        return con.accion(sql);
    }
 
    
}
