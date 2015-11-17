
package JAX_Test.src.mule.com.ErrorHandler.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CorrectiveAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportingDateTime",
    "correctiveAction"
})
@XmlRootElement(name = "FaultNotification")
public class FaultNotification {

    @XmlElement(name = "ReportingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportingDateTime;
    @XmlElement(name = "CorrectiveAction")
    protected String correctiveAction;

    /**
     * Gets the value of the reportingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingDateTime() {
        return reportingDateTime;
    }

    /**
     * Sets the value of the reportingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingDateTime(XMLGregorianCalendar value) {
        this.reportingDateTime = value;
    }

    /**
     * Gets the value of the correctiveAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectiveAction() {
        return correctiveAction;
    }

    /**
     * Sets the value of the correctiveAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectiveAction(String value) {
        this.correctiveAction = value;
    }

}
