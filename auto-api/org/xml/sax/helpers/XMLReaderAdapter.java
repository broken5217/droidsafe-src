package org.xml.sax.helpers;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import java.util.Locale;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

public class XMLReaderAdapter implements Parser, ContentHandler {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.070 -0400", hash_original_field = "DF703C2D84F1FAD52D3A9BD1A6B25FFE", hash_generated_field = "44EF69C8F1F45C928EC7CB20788E9F99")

    XMLReader xmlReader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.070 -0400", hash_original_field = "F52BDEE8DD5CF0F9EEB75FE7D6BE559F", hash_generated_field = "C1D38A44C2BDD7CFC6D4A25FFD145E34")

    DocumentHandler documentHandler;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.070 -0400", hash_original_field = "5B2902A6669F7164A98A2AABBBA7007B", hash_generated_field = "73705B24ED28379A26291F89BCC792AC")

    AttributesAdapter qAtts;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.071 -0400", hash_original_method = "76BB97F012769A161CBA88EA8A2E4EBA", hash_generated_method = "ACE6CAC3BCC79737302ED6D2560D7BCC")
    public  XMLReaderAdapter() throws SAXException {
        setup(XMLReaderFactory.createXMLReader());
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.072 -0400", hash_original_method = "8B041FBF651D4DFB0C8BE59922C68E87", hash_generated_method = "2DEAA27821E1C0FEEE712F1DAA65C464")
    public  XMLReaderAdapter(XMLReader xmlReader) {
        setup(xmlReader);
        addTaint(xmlReader.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.072 -0400", hash_original_method = "E177ACAABE14FBF113725220BFCC127D", hash_generated_method = "40F0D8773C481ED0C47763E1BB8BF031")
    private void setup(XMLReader xmlReader) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("XMLReader must not be null");
        } 
        this.xmlReader = xmlReader;
        qAtts = new AttributesAdapter();
        
        
        
    
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.072 -0400", hash_original_method = "6F3F2251FC8DF5A2BC76DADBD382AD55", hash_generated_method = "FEA7A33F88CA95D91372FB30AF543CD3")
    public void setLocale(Locale locale) throws SAXException {
        if (DroidSafeAndroidRuntime.control) throw new SAXNotSupportedException("setLocale not supported");
        addTaint(locale.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.073 -0400", hash_original_method = "4AE4FF8425B7CD5477DB299D2E768007", hash_generated_method = "034BD0DCBC36B2029E10EE8D7F511320")
    public void setEntityResolver(EntityResolver resolver) {
        xmlReader.setEntityResolver(resolver);
        addTaint(resolver.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.073 -0400", hash_original_method = "88C10864FC45C96400C579FA2D97330E", hash_generated_method = "6C9EB0A96A870C2EFE77627BDF4F6CF3")
    public void setDTDHandler(DTDHandler handler) {
        xmlReader.setDTDHandler(handler);
        addTaint(handler.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.073 -0400", hash_original_method = "066AA0855CEAF16F5A4DD1498A9898AE", hash_generated_method = "0F2ADD0F92A8C507A348EECB68D8069E")
    public void setDocumentHandler(DocumentHandler handler) {
        documentHandler = handler;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.074 -0400", hash_original_method = "72DE679535A20097297B12B846F37162", hash_generated_method = "9305503C711AB2ED8A78F79EA0BE1654")
    public void setErrorHandler(ErrorHandler handler) {
        xmlReader.setErrorHandler(handler);
        addTaint(handler.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.074 -0400", hash_original_method = "8AE6DA2951569D3F1B1B45FDE2C61B3C", hash_generated_method = "7C46E33FDC82E8D9EBC2B1667B1FD4B6")
    public void parse(String systemId) throws IOException, SAXException {
        parse(new InputSource(systemId));
        addTaint(systemId.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.074 -0400", hash_original_method = "16241BDA797C9EF94AA818BE003DDED6", hash_generated_method = "6E7B2E0870B6B34C0DB0D3A47130EDC3")
    public void parse(InputSource input) throws IOException, SAXException {
        setupXMLReader();
        xmlReader.parse(input);
        addTaint(input.getTaint());
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.074 -0400", hash_original_method = "996AF21F9D794D58D80CF95A8864356D", hash_generated_method = "A2F8E5F005787526BC176FB4055623AD")
    private void setupXMLReader() throws SAXException {
        xmlReader.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
        try 
        {
            xmlReader.setFeature("http://xml.org/sax/features/namespaces",
                             false);
        } 
        catch (SAXException e)
        { }
        xmlReader.setContentHandler(this);
        
        
        
        
                             
    
    
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.075 -0400", hash_original_method = "3CAE4C302EA4B3C24003E67187B52764", hash_generated_method = "C5AEFC4CCFED521059AF287DAE2B5509")
    public void setDocumentLocator(Locator locator) {
        documentHandler.setDocumentLocator(locator);
        addTaint(locator.getTaint());
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.075 -0400", hash_original_method = "32BB697A91610539031004A9D01C7415", hash_generated_method = "ED446B5B582E1BC279478690090A2322")
    public void startDocument() throws SAXException {
        documentHandler.startDocument();
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.075 -0400", hash_original_method = "1ABAE35BE3091AD40FC1FECAC80B863E", hash_generated_method = "D8E687042119E42B31043336D38AC1B0")
    public void endDocument() throws SAXException {
        documentHandler.endDocument();
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.075 -0400", hash_original_method = "A4FE8368A0813DB39B9B2D62745BDC50", hash_generated_method = "26B34CEF29F83A3ACCC2EBCD25AB979E")
    public void startPrefixMapping(String prefix, String uri) {
        addTaint(prefix.getTaint());
        addTaint(uri.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.075 -0400", hash_original_method = "6288457D9104DBA73FF5F77796A5069B", hash_generated_method = "398A8D091F972C52779202B902D2C498")
    public void endPrefixMapping(String prefix) {
        addTaint(prefix.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.076 -0400", hash_original_method = "19EEF6F7A6D3ECB16FB052F6607F9998", hash_generated_method = "ABB67AEF61690ED43BDCEA432A62CD0F")
    public void startElement(String uri, String localName,
                  String qName, Attributes atts) throws SAXException {
        {
            qAtts.setAttributes(atts);
            documentHandler.startElement(qName, qAtts);
        } 
        addTaint(uri.getTaint());
        addTaint(localName.getTaint());
        addTaint(qName.getTaint());
        addTaint(atts.getTaint());
        
        
        
        
    
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.076 -0400", hash_original_method = "931F7A2FD2648B2A1C28EDF8D67E709D", hash_generated_method = "4B4E5F1E0EFF4F11C8DBAEE4C8CA5E01")
    public void endElement(String uri, String localName,
                String qName) throws SAXException {
        documentHandler.endElement(qName);
        addTaint(uri.getTaint());
        addTaint(localName.getTaint());
        addTaint(qName.getTaint());
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.076 -0400", hash_original_method = "1F709B7946BD47BE5374DFAB95B97284", hash_generated_method = "E41CE5910AD78B35638009034A3AB15F")
    public void characters(char ch[], int start, int length) throws SAXException {
        documentHandler.characters(ch, start, length);
        addTaint(ch[0]);
        addTaint(start);
        addTaint(length);
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.076 -0400", hash_original_method = "8F77A2CC8A8F4FEA0C562F269098A504", hash_generated_method = "556F0E94B1A94CA788615094CAFBD278")
    public void ignorableWhitespace(char ch[], int start, int length) throws SAXException {
        documentHandler.ignorableWhitespace(ch, start, length);
        addTaint(ch[0]);
        addTaint(start);
        addTaint(length);
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.077 -0400", hash_original_method = "01B4469A7119F79BBDA4CF4D6616EEC2", hash_generated_method = "71402E224289E2E880F1C96D5298D17D")
    public void processingInstruction(String target, String data) throws SAXException {
        documentHandler.processingInstruction(target, data);
        addTaint(target.getTaint());
        addTaint(data.getTaint());
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.077 -0400", hash_original_method = "1616136BE44E483876717F8A446FD8E6", hash_generated_method = "78177C3306D49108B776A6C694C380AB")
    public void skippedEntity(String name) throws SAXException {
        addTaint(name.getTaint());
        
    }

    
    static final class AttributesAdapter implements AttributeList {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.077 -0400", hash_original_field = "736B91750E516139ACC13C5EB6564F92", hash_generated_field = "B58329F5904269DD97B6B42BAA3B838E")

        private Attributes attributes;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.077 -0400", hash_original_method = "E50C9A4E371E1BB1DB8AD3C2D41905DA", hash_generated_method = "6DD45A539CB2C54185009851E7F4E171")
          AttributesAdapter() {
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.077 -0400", hash_original_method = "53FC4E3BB2217D6659CB21AA159A3250", hash_generated_method = "7A0F98D55CE81AA31A2B8414CFC871B3")
         void setAttributes(Attributes attributes) {
            this.attributes = attributes;
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.078 -0400", hash_original_method = "91D9ED6BC44066DC74ACDFE2397CD717", hash_generated_method = "1ECAC1618D2038D5FE026EE61D7F9608")
        public int getLength() {
            int var485C66E96A1B82A23D066178A5F1AABE_1088055026 = (attributes.getLength());
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1990667029 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1990667029;
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.078 -0400", hash_original_method = "ED147CDF790A0CCB36C14BED3C6421FF", hash_generated_method = "0670278B5BFCFD0C4592DCC11BF968AE")
        public String getName(int i) {
            String varB4EAC82CA7396A68D541C85D26508E83_1037639151 = null; 
            varB4EAC82CA7396A68D541C85D26508E83_1037639151 = attributes.getQName(i);
            addTaint(i);
            varB4EAC82CA7396A68D541C85D26508E83_1037639151.addTaint(getTaint()); 
            return varB4EAC82CA7396A68D541C85D26508E83_1037639151;
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.078 -0400", hash_original_method = "CD7B0B2A6AEED3EE82C9A05E49CD2219", hash_generated_method = "F599E90C9B17054BF1AB14E400386245")
        public String getType(int i) {
            String varB4EAC82CA7396A68D541C85D26508E83_1846842111 = null; 
            varB4EAC82CA7396A68D541C85D26508E83_1846842111 = attributes.getType(i);
            addTaint(i);
            varB4EAC82CA7396A68D541C85D26508E83_1846842111.addTaint(getTaint()); 
            return varB4EAC82CA7396A68D541C85D26508E83_1846842111;
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.079 -0400", hash_original_method = "985A31734C2AABCE7CE9E7B351282D4B", hash_generated_method = "F2FB9BFA4B0B9ED564F3910A0D180B37")
        public String getValue(int i) {
            String varB4EAC82CA7396A68D541C85D26508E83_1897111976 = null; 
            varB4EAC82CA7396A68D541C85D26508E83_1897111976 = attributes.getValue(i);
            addTaint(i);
            varB4EAC82CA7396A68D541C85D26508E83_1897111976.addTaint(getTaint()); 
            return varB4EAC82CA7396A68D541C85D26508E83_1897111976;
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.079 -0400", hash_original_method = "8A6442FB647EA21090E4FC03D1B47FA4", hash_generated_method = "3E4C75670205DFA268E6E6ED5E1FA5C2")
        public String getType(String qName) {
            String varB4EAC82CA7396A68D541C85D26508E83_1236708345 = null; 
            varB4EAC82CA7396A68D541C85D26508E83_1236708345 = attributes.getType(qName);
            addTaint(qName.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_1236708345.addTaint(getTaint()); 
            return varB4EAC82CA7396A68D541C85D26508E83_1236708345;
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:49.080 -0400", hash_original_method = "4A5F2D731504040B76231CFBA75E49A7", hash_generated_method = "B7B8BCD8C6C8FB8F397F3EB2C3D5110A")
        public String getValue(String qName) {
            String varB4EAC82CA7396A68D541C85D26508E83_1383054770 = null; 
            varB4EAC82CA7396A68D541C85D26508E83_1383054770 = attributes.getValue(qName);
            addTaint(qName.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_1383054770.addTaint(getTaint()); 
            return varB4EAC82CA7396A68D541C85D26508E83_1383054770;
            
            
        }

        
    }


    
}

