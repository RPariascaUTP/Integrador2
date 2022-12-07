/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nelynoe
 */
public class ComprobanteDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Comprobante validar(String NroComp) {
        Comprobante comp = new Comprobante();
        String sql = "select * from comprobante where NroComprob=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, NroComp);
            rs = ps.executeQuery();
            while (rs.next()) {
                comp.setIdc(rs.getInt("IdComprob"));
                comp.setNroComp(rs.getString("NroComp"));
                comp.setFecEmi(rs.getDate("FecEmi"));
                comp.setNroOrden(rs.getString("NroOrden"));
                comp.setEstc(rs.getString("Estado"));
            }

        } catch (Exception e) {
        }
        return comp;
    }

    // Operaciones CRUD
    public List listar() {
        String sql = "select * from comprobante";
        List<Comprobante> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Comprobante comp = new Comprobante();
                comp.setIdc(rs.getInt(1));
                comp.setNroComp(rs.getString(2));
                comp.setFecEmi(rs.getDate(3));
                comp.setNroOrden(rs.getString(4));
                comp.setEstc(rs.getString(5));
                lista.add(comp);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Comprobante comp) {
        String sql = "insert into comprobante (NroComp,FecEmi,NroOrden,Estado) values (?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, comp.getNroComp());
            ps.setDate(2, comp.getFecemi());
            ps.setString(3, comp.getNroOrden());
            ps.setString(4, comp.getEstc());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }
    
    public Comprobante listarId(int idc){
        Comprobante compr = new Comprobante();
        String sql="select * from comprobante where IdComprob="+idc;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                compr.setNroComp(rs.getString(2));
                compr.setFecEmi(rs.getDate(3));
                compr.setNroOrden(rs.getString(4));
                compr.setEstc(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return compr;
    }

    public int actualizar(Comprobante comp) {
        String sql = "update comprobante set NroComprob=?, FecEmi=?, NroOrden=?, Estado=? where IdComprob=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, comp.getNroComp());
            ps.setDate(2, comp.getFecemi());
            ps.setString(3, comp.getNroOrden());
            ps.setString(4, comp.getEstc());
            ps.setInt(5, comp.getIdc());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public void delete(int idc) {
        String sql = "delete from comprobante where IdComprob=" + idc;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }


}
