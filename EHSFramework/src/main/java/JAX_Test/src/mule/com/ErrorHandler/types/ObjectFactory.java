
package JAX_Test.src.mule.com.ErrorHandler.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mule.com.ErrorHandler.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FaultSchema_QNAME = new QName("xmlns.services.errorhandler/FaultSchema.xsd", "FaultSchema");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mule.com.ErrorHandler.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultNotification }
     * 
     */
    public FaultNotification createFaultNotification() {
        return new FaultNotification();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link FaultService }
     * 
     */
    public FaultService createFaultService() {
        return new FaultService();
    }

    /**
     * Create an instance of {@link FaultMessage }
     * 
     */
    public FaultMessage createFaultMessage() {
        return new FaultMessage();
    }

    /**
     * Create an instance of {@link FaultSchemaType }
     * 
     */
    public FaultSchemaType createFaultSchemaType() {
        return new FaultSchemaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultSchemaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "xmlns.services.errorhandler/FaultSchema.xsd", name = "FaultSchema")
    public JAXBElement<FaultSchemaType> createFaultSchema(FaultSchemaType value) {
        return new JAXBElement<FaultSchemaType>(_FaultSchema_QNAME, FaultSchemaType.class, null, value);
    }

}
