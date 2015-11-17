package JAX_Test.src.mule.com.ErrorHandler;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.BindingType;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPBinding;

import com.bea.staxb.runtime.ObjectFactory;

import JAX_Test.src.mule.com.ErrorHandler.types.FaultSchemaType;

@WebService(name = "ErrorHandlerPortType", targetNamespace = "xmlns.services.errorhandler/FaultSchema.xsd", serviceName = "EHS_SOAP_Service", portName = "ErrorHandlerPort", wsdlLocation = "/WEB-INF/wsdl/SOAP_CXF_WSDL.wsdl")
@XmlSeeAlso( { ObjectFactory.class })
@javax.jws.soap.SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class ErrorHandlerPortTypeImpl {
    public ErrorHandlerPortTypeImpl() {
    }

    @javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
    @Action(input = "xmlns.services.errorhandler/FaultSchema.xsd/consumeMsg", output = "xmlns.services.errorhandler/FaultSchema.xsd/ErrorHandlerPortType/consumeMsgResponse")
    @WebMethod(action = "xmlns.services.errorhandler/FaultSchema.xsd/consumeMsg")
    public void consumeMsg(@WebParam(name = "FaultSchema", partName = "payload", targetNamespace = "xmlns.services.errorhandler/FaultSchema.xsd", mode = WebParam.Mode.INOUT)
        Holder<FaultSchemaType> payload) {
    }
}
