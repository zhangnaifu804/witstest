/**
 * WMLS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface WMLS extends javax.xml.rpc.Service {
    public String getStoreSoapPortAddress();

    public StoreSoapPort_PortType getStoreSoapPort() throws javax.xml.rpc.ServiceException;

    public StoreSoapPort_PortType getStoreSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
