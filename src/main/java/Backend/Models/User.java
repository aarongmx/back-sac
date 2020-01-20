package Backend.Models;

import javax.persistence.Column;
import javax.persistence.Id;

public class User {

    @Id
    @Column(name = "correo")
    private String correo;

    @Column(name = "passwd")
    private String passwd;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}
