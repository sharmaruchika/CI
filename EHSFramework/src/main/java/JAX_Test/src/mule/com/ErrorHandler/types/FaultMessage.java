
package JAX_Test.src.mule.com.ErrorHandler.types;

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
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payload" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtraInfo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtraInfo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtraInfo3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtraInfo4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "errorCode",
    "errorMsg",
    "severity",
    "stackTrace",
    "payload",
    "extraInfo1",
    "extraInfo2",
    "extraInfo3",
    "extraInfo4"
})
@XmlRootElement(name = "FaultMessage")
public class FaultMessage {

    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorMsg")
    protected String errorMsg;
    @XmlElement(name = "Severity")
    protected String severity;
    @XmlElement(name = "StackTrace")
    protected String stackTrace;
    @XmlElement(name = "Payload")
    protected String payload;
    @XmlElement(name = "ExtraInfo1")
    protected String extraInfo1;
    @XmlElement(name = "ExtraInfo2")
    protected String extraInfo2;
    @XmlElement(name = "ExtraInfo3")
    protected String extraInfo3;
    @XmlElement(name = "ExtraInfo4")
    protected String extraInfo4;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the stackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayload(String value) {
        this.payload = value;
    }

    /**
     * Gets the value of the extraInfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo1() {
        return extraInfo1;
    }

    /**
     * Sets the value of the extraInfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo1(String value) {
        this.extraInfo1 = value;
    }

    /**
     * Gets the value of the extraInfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo2() {
        return extraInfo2;
    }

    /**
     * Sets the value of the extraInfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo2(String value) {
        this.extraInfo2 = value;
    }

    /**
     * Gets the value of the extraInfo3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo3() {
        return extraInfo3;
    }

    /**
     * Sets the value of the extraInfo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo3(String value) {
        this.extraInfo3 = value;
    }

    /**
     * Gets the value of the extraInfo4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo4() {
        return extraInfo4;
    }

    /**
     * Sets the value of the extraInfo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo4(String value) {
        this.extraInfo4 = value;
    }

}
