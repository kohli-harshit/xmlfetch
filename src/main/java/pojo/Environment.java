package pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "environment")
public class Environment {

    private String WbEnvironment;

    private Application[] application;

    private String Wbpassword;

    private String Wbuser;

    private String Swaptionstle;

    private FirefoxProfile firefoxProfile;

    private String EnvironmentToExecute;

    public String getWbEnvironment ()
    {
        return WbEnvironment;
    }

    @XmlElement
    public void setWbEnvironment (String WbEnvironment)
    {
        this.WbEnvironment = WbEnvironment;
    }

    public Application[] getApplication ()
    {
        return application;
    }

    @XmlElement
    public void setApplication (Application[] application)
    {
        this.application = application;
    }

    public String getWbpassword ()
    {
        return Wbpassword;
    }

    @XmlElement
    public void setWbpassword (String Wbpassword)
    {
        this.Wbpassword = Wbpassword;
    }

    public String getWbuser ()
    {
        return Wbuser;
    }

    @XmlElement
    public void setWbuser (String Wbuser)
    {
        this.Wbuser = Wbuser;
    }

    public String getSwaptionstle ()
    {
        return Swaptionstle;
    }

    @XmlElement
    public void setSwaptionstle (String Swaptionstle)
    {
        this.Swaptionstle = Swaptionstle;
    }

    public FirefoxProfile getFirefoxProfile ()
    {
        return firefoxProfile;
    }

    @XmlElement
    public void setFirefoxProfile (FirefoxProfile firefoxProfile)
    {
        this.firefoxProfile = firefoxProfile;
    }

    public String getEnvironmentToExecute ()
    {
        return EnvironmentToExecute;
    }

    @XmlElement
    public void setEnvironmentToExecute (String EnvironmentToExecute)
    {
        this.EnvironmentToExecute = EnvironmentToExecute;
    }
}
