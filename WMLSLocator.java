/**
 * WMLSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class WMLSLocator extends org.apache.axis.client.Service implements WMLS {

    public WMLSLocator() {
    }


    public WMLSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WMLSLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StoreSoapPort
    private String StoreSoapPort_address = "http://znf.com/witsmlstore";

    public String getStoreSoapPortAddress() {
        return StoreSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String StoreSoapPortWSDDServiceName = "StoreSoapPort";

    public String getStoreSoapPortWSDDServiceName() {
        return StoreSoapPortWSDDServiceName;
    }

    public void setStoreSoapPortWSDDServiceName(String name) {
        StoreSoapPortWSDDServiceName = name;
    }

    public StoreSoapPort_PortType getStoreSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StoreSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStoreSoapPort(endpoint);
    }

    public StoreSoapPort_PortType getStoreSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            StoreSoapBindingStub _stub = new StoreSoapBindingStub(portAddress, this);
            _stub.setPortName(getStoreSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStoreSoapPortEndpointAddress(String address) {
        StoreSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (StoreSoapPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                StoreSoapBindingStub _stub = new StoreSoapBindingStub(new java.net.URL(StoreSoapPort_address), this);
                _stub.setPortName(getStoreSoapPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("StoreSoapPort".equals(inputPortName)) {
            return getStoreSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.witsml.org/wsdl/120", "WMLS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.witsml.org/wsdl/120", "StoreSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("StoreSoapPort".equals(portName)) {
            setStoreSoapPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
