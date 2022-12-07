package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noe macedo
 */
public class ProveedorDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Proveedor validar(String RUC) {
        Proveedor pro = new Proveedor();
        String sql = "select * from proveedor where RUC=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, RUC);
            rs = ps.executeQuery();
            while (rs.next()) {
                pro.setIdp(rs.getInt("IdProvee"));
                pro.setRUC(rs.getString("RUC"));
                pro.setNomp(rs.getString("Nombres"));
                pro.setDirp(rs.getString("Direccion"));
                pro.setEmail(rs.getString("Email"));
                pro.setTelp(rs.getString("Telefono"));
                pro.setEstp(rs.getString("Estado"));
            }

        } catch (Exception e) {
        }
        return pro;
    }

    // Operaciones CRUD
    public List listar() {
        String sql = "select * from proveedor";
        List<Proveedor> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor pro = new Proveedor();
                pro.setIdp(rs.getInt(1));
                pro.setRUC(rs.getString(2));
                pro.setNomp(rs.getString(3));
                pro.setDirp(rs.getString(4));
                pro.setEmail(rs.getString(5));
                pro.setTelp(rs.getString(6));
                pro.setEstp(rs.getString(7));
                lista.add(pro);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Proveedor pro) {
        String sql = "insert into proveedor (RUC,Nombres,Direccion,Email,Telefono,Estado) values (?,?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getRUC());
            ps.setString(2, pro.getNomp());
            ps.setString(3, pro.getDirp());
            ps.setString(4, pro.getEmail());
            ps.setString(5, pro.getTelp());
            ps.setString(6, pro.getEstp());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }
    
    public Proveedor listarId(int idp){
        Proveedor prov = new Proveedor();
        String sql="select * from proveedor where IdProvee="+idp;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                prov.setRUC(rs.getString(2));
                prov.setNomp(rs.getString(3));
                prov.setDirp(rs.getString(4));
                prov.setEmail(rs.getString(5));
                prov.setTelp(rs.getString(6));
                prov.setEstp(rs.getString(7));
            }
        } catch (Exception e) {
        }
        return prov;
    }

    public int actualizar(Proveedor pro) {
        String sql = "update proveedor set RUC=?, Nombres=?, Direccion=?, Email=?, Telefono=?, Estado=? where IdProvee=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getRUC());
            ps.setString(2, pro.getNomp());
            ps.setString(3, pro.getDirp());
            ps.setString(4, pro.getEmail());
            ps.setString(5, pro.getTelp());
            ps.setString(6, pro.getEstp());
            ps.setInt(7, pro.getIdp());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public void delete(int idp) {
        String sql = "delete from proveedor where IdProvee=" + idp;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
