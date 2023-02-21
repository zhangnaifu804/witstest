/**
 * StoreSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

import example.TEST1;

import org.witsml.schemas.mapper.Wellmapper;


public class StoreSoapBindingImpl implements StoreSoapPort_PortType{





    public short WMLS_AddToStore(String WMLtypeIn, String XMLin, String optionsIn, String capabilitiesIn, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException {
        suppMsgOut.value = new String();
        TEST1 test1 = new TEST1();
        try {
            test1.ADDTEST(WMLtypeIn,XMLin,optionsIn,capabilitiesIn);

        }catch (Exception e){
            System.out.println(e);
        }

        return (short)-3;
    }

    public short WMLS_DeleteFromStore(String WMLtypeIn, String queryIn, String optionsIn, String capabilitiesIn, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException {
        suppMsgOut.value = new String();
        return (short)-3;
    }

    public String WMLS_GetBaseMsg(short returnValueIn) throws java.rmi.RemoteException {
        return null;
    }

    public short WMLS_GetCap(String optionsIn, javax.xml.rpc.holders.StringHolder capabilitiesOut, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException {
        capabilitiesOut.value = new String();
        suppMsgOut.value = new String();
        return (short)-3;
    }

    public short WMLS_GetFromStore(String WMLtypeIn, String queryIn, String optionsIn, String capabilitiesIn, javax.xml.rpc.holders.StringHolder XMLout, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException {
        TEST1 test1 = new TEST1();
        try {
            String s = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><objWell xmlns=\"http://www.witsml.org/schemas/1series\" xmlns:ns2=\"http://www.w3.org/1999/xlink\" xmlns:ns3=\"http://www.opengis.net/gml/3.2\" xmlns:ns4=\"http://www.isotc211.org/2005/gco\" xmlns:ns5=\"http://www.isotc211.org/2005/gmd\" uid=\"znf123\"><name>znf-test22</name><nameLegal>Company Legal Name</nameLegal><numLicense>Company License Number</numLicense><numGovt>Govt-Number</numGovt><dTimLicense>2022-02-22T13:20:00.0000000Z</dTimLicense><field>Big Field</field><country>US</country><state>TX</state><county>Montgomery</county><region>Region Name</region><district>District Name</district><block>Block Name</block><timeZone>-06:00</timeZone><operator>Operating Company</operator><operatorDiv>Division Name</operatorDiv><pcInterest uom=\"%\">65.0</pcInterest><numAPI>123-543-987AZ</numAPI><statusWell>drilling</statusWell><purposeWell>exploration</purposeWell><dTimSpud>2001-05-31T08:15:00.0000000Z</dTimSpud><dTimPa>2001-07-15T15:30:00.0000000Z</dTimPa><wellheadElevation uom=\"ft\">500.0</wellheadElevation><wellDatum uid=\"KB\"><name>Kelly Bushing</name><code>KB</code><elevation uom=\"ft\" datum=\"SL\">78.5</elevation></wellDatum><wellDatum uid=\"SL\"><name>Sea Level</name><code>SL</code><datumName namingSystem=\"EPSG\" code=\"5106\">Caspian Sea</datumName></wellDatum><groundElevation uom=\"ft\">250.0</groundElevation><waterDepth uom=\"ft\">520.0</waterDepth><wellLocation uid=\"loc-1\"><wellCRS uidRef=\"proj1\">ED50 / UTM Zone 31N</wellCRS><easting uom=\"m\">425353.84</easting><northing uom=\"m\">6623785.69</northing><description>Location of well surface point in projected system.</description></wellLocation><referencePoint uid=\"SRP1\"><name>Slot Bay Centre</name><type>Site Reference Point</type><location uid=\"loc-1\"><wellCRS uidRef=\"proj1\">ED50 / UTM Zone 31N</wellCRS><easting uom=\"m\">425366.47</easting><northing uom=\"m\">6623781.95</northing></location><location uid=\"loc-2\"><wellCRS uidRef=\"localWell1\">WellOneWSP</wellCRS><localX uom=\"m\">12.63</localX><localY uom=\"m\">-3.74</localY><description>Location of the Site Reference Point with respect to the well surface point</description></location></referencePoint><referencePoint uid=\"WRP2\"><name>Sea Bed</name><type>Well Reference Point</type><elevation uom=\"ft\" datum=\"SL\">-118.4</elevation><measuredDepth uom=\"ft\" datum=\"KB\">173.09</measuredDepth><location uid=\"loc-1\"><wellCRS uidRef=\"proj1\">ED50 / UTM Zone 31N</wellCRS><easting uom=\"m\">425353.84</easting><northing uom=\"m\">6623785.69</northing></location><location uid=\"loc-2\"><wellCRS uidRef=\"geog1\">ED50</wellCRS><latitude uom=\"dega\">59.743844</latitude><longitude uom=\"dega\">1.67198083</longitude></location></referencePoint><wellCRS uid=\"geog1\"><name>ED50</name><geodeticCRS uidRef=\"4230\">4230</geodeticCRS><description>ED50 system with EPSG code 4230.</description></wellCRS><wellCRS uid=\"proj1\"><name>ED50 / UTM Zone 31N</name><mapProjectionCRS uidRef=\"23031\">ED50 / UTM Zone 31N</mapProjectionCRS></wellCRS><wellCRS uid=\"localWell1\"><name>WellOneWSP</name><localCRS><usesWellAsOrigin>true</usesWellAsOrigin><yAxisAzimuth uom=\"dega\" northDirection=\"grid north\">0.0</yAxisAzimuth><xRotationCounterClockwise>false</xRotationCounterClockwise></localCRS></wellCRS><commonData><dTimCreation>2022-02-22T06:35:13.3727257Z</dTimCreation><dTimLastChange>2023-02-16T03:12:30.6602058Z</dTimLastChange><itemState>plan</itemState><comments>These are the comments associated with the Well data object.</comments><defaultDatum uidRef=\"KB\">Kelly Bushing</defaultDatum></commonData></objWell>\n";
            XMLout.value = s;
        }catch (Exception e){
            System.out.println(e);
        }

        suppMsgOut.value = new String();
        return (short)-3;
    }

    public String WMLS_GetVersion() throws java.rmi.RemoteException {
        return "1.4.1.1";
    }

    public short WMLS_UpdateInStore(String WMLtypeIn, String XMLin, String optionsIn, String capabilitiesIn, javax.xml.rpc.holders.StringHolder suppMsgOut) throws java.rmi.RemoteException {
        suppMsgOut.value = new String();
        return (short)-3;
    }

}
