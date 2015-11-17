
package JAX_Test.src.mule.com.ErrorHandler.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultSchemaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultSchemaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{xmlns.services.errorhandler/FaultSchema.xsd}Header" minOccurs="0"/>
 *         &lt;element ref="{xmlns.services.errorhandler/FaultSchema.xsd}FaultService" minOccurs="0"/>
 *         &lt;element ref="{xmlns.services.errorhandler/FaultSchema.xsd}FaultMessage" minOccurs="0"/>
 *         &lt;element ref="{xmlns.services.errorhandler/FaultSchema.xsd}FaultNotification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultSchemaType", propOrder = {
    "header",
    "faultService",
    "faultMessage",
    "faultNotification"
})
public class FaultSchemaType {

    @XmlElement(name = "Header")
    protected Header header;
    @XmlElement(name = "FaultService")
    protected FaultService faultService;
    @XmlElement(name = "FaultMessage")
    protected FaultMessage faultMessage;
    @XmlElement(name = "FaultNotification")
    protected FaultNotification faultNotification;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the faultService property.
     * 
     * @return
     *     possible object is
     *     {@link FaultService }
     *     
     */
    public FaultService getFaultService() {
        return faultService;
    }

    /**
     * Sets the value of the faultService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultService }
     *     
     */
    public void setFaultService(FaultService value) {
        this.faultService = value;
    }

    /**
     * Gets the value of the faultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link FaultMessage }
     *     
     */
    public FaultMessage getFaultMessage() {
        return faultMessage;
    }

    /**
     * Sets the value of the faultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultMessage }
     *     
     */
    public void setFaultMessage(FaultMessage value) {
        this.faultMessage = value;
    }

    /**
     * Gets the value of the faultNotification property.
     * 
     * @return
     *     possible object is
     *     {@link FaultNotification }
     *     
     */
    public FaultNotification getFaultNotification() {
        return faultNotification;
    }

    /**
     * Sets the value of the faultNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultNotification }
     *     
     */
    public void setFaultNotification(FaultNotification value) {
        this.faultNotification = value;
    }

}
