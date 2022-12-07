
package Modelo;

import java.sql.Date;

/**
 *
 * @author nelynoe
 */
public class Comprobante {
    int Idc;
    String NroComp;
    Date Fecemi;
    String NroOrden;
    String Estc;

    public Comprobante() {
    }

    public Comprobante(int Idc, String NroComp, Date Fecemi, String NroOrden, String Estc) {
        this.Idc = Idc;
        this.NroComp = NroComp;
        this.Fecemi = Fecemi;
        this.NroOrden = NroOrden;
        this.Estc = Estc;
    }

    public int getIdc() {
        return Idc;
    }

    public void setIdc(int Idc) {
        this.Idc = Idc;
    }

    public String getNroComp() {
        return NroComp;
    }

    public void setNroComp(String NroComp) {
        this.NroComp = NroComp;
    }

    public Date getFecemi() {
        return Fecemi;
    }

    public void setFecemi(Date Fecemi) {
        this.Fecemi = Fecemi;
    }

    public String getNroOrden() {
        return NroOrden;
    }

    public void setNroOrden(String NroOrden) {
        this.NroOrden = NroOrden;
    }

    public String getEstc() {
        return Estc;
    }

    public void setEstc(String Estc) {
        this.Estc = Estc;
    }

    void setFecEmi(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
