/**
 * StoreSoapPort_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface StoreSoapPort_PortType extends java.rmi.Remote {
    public short WMLS_AddToStore(String WMLtypeIn, String XMLin, String optionsIn, String capabilitiesIn, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException;
    public short WMLS_DeleteFromStore(String WMLtypeIn, String queryIn, String optionsIn, String capabilitiesIn, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException;
    public String WMLS_GetBaseMsg(short returnValueIn) throws java.rmi.RemoteException;
    public short WMLS_GetCap(String optionsIn, javax.xml.rpc.holders.StringHolder capabilitiesOut, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException;
    public short WMLS_GetFromStore(String WMLtypeIn, String queryIn, String optionsIn, String capabilitiesIn, javax.xml.rpc.holders.StringHolder XMLout, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException;
    public String WMLS_GetVersion() throws java.rmi.RemoteException;
    public short WMLS_UpdateInStore(String WMLtypeIn, String XMLin, String optionsIn, String capabilitiesIn, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException;
}
