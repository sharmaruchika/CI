
package errorhandler.services.xmlns.faultschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImplementationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterfaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "transactionID",
    "implementationCode",
    "processInstanceID",
    "interfaceName"
})
@XmlRootElement(name = "FaultService")
public class FaultService {

    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "ImplementationCode")
    protected String implementationCode;
    @XmlElement(name = "ProcessInstanceID")
    protected String processInstanceID;
    @XmlElement(name = "InterfaceName")
    protected String interfaceName;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the implementationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementationCode() {
        return implementationCode;
    }

    /**
     * Sets the value of the implementationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementationCode(String value) {
        this.implementationCode = value;
    }

    /**
     * Gets the value of the processInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInstanceID() {
        return processInstanceID;
    }

    /**
     * Sets the value of the processInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInstanceID(String value) {
        this.processInstanceID = value;
    }

    /**
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceName(String value) {
        this.interfaceName = value;
    }

}
