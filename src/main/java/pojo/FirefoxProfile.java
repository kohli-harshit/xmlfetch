package pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "firefox-profile")
public class FirefoxProfile {
    private String enabled;

    private String profileName;

    public String getEnabled ()
    {
        return enabled;
    }

    @XmlElement
    public void setEnabled (String enabled)
    {
        this.enabled = enabled;
    }

    public String getProfileName ()
    {
        return profileName;
    }

    @XmlElement
    public void setProfileName (String profileName)
    {
        this.profileName = profileName;
    }
}
