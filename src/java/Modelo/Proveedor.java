
package Modelo;

/**
 *
 * @author nelynoe
 */
public class Proveedor {
    int idp;
    String RUC;
    String nomp;
    String dirp;
    String email;
    String telp;
    String estp;

    public Proveedor() {
    }

    public Proveedor(int idp, String RUC, String nomp, String dirp, String email, String telp, String estp) {
        this.idp = idp;
        this.RUC = RUC;
        this.nomp = nomp;
        this.dirp = dirp;
        this.email = email;
        this.telp = telp;
        this.estp = estp;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public String getDirp() {
        return dirp;
    }

    public void setDirp(String dirp) {
        this.dirp = dirp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getEstp() {
        return estp;
    }

    public void setEstp(String estp) {
        this.estp = estp;
    }
    
    
}
    
