package pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "db")
public class Db {

    private String username;

    private String driverclassname;

    private String password;

    private String url;

    public String getUsername ()
    {
        return username;
    }

    @XmlElement
    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getDriverclassname ()
    {
        return driverclassname;
    }

    @XmlElement
    public void setDriverclassname (String driverclassname)
    {
        this.driverclassname = driverclassname;
    }

    public String getPassword ()
    {
        return password;
    }

    @XmlElement
    public void setPassword (String password)
    {
        this.password = password;
    }

    public String getUrl ()
    {
        return url;
    }

    @XmlElement
    public void setUrl (String url)
    {
        this.url = url;
    }
}
