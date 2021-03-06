
package server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Login", targetNamespace = "http://Server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Login {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Server/", className = "server.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Server/", className = "server.HelloResponse")
    @Action(input = "http://Server/Login/helloRequest", output = "http://Server/Login/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
