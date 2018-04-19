package pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "application")
public class Application {

    private String id;

    private Db db;

    public String getId ()
    {
        return id;
    }

    @XmlElement
    public void setId (String id)
    {
        this.id = id;
    }

    public Db getDb ()
    {
        return db;
    }

    @XmlElement
    public void setDb (Db db)
    {
        this.db = db;
    }
}
