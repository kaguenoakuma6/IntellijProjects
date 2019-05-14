package com.xmlTransfom.xsdTransform;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class xdsTransform
{
    public static void main( String[] args)
    {
        try
        {
            // PagarDispCredito.xsd
            DocumentBuilderFactory docBfact = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuild = docBfact.newDocumentBuilder();
            Document doc = docBuild.parse(new File("/home/kuro/Documentos/JavaProyect/PagarDispCredito.xsd") );

            doc.getDocumentElement().normalize();

            NodeList elemPadres = doc.getElementsByTagName("xsd:complexType");

            int totnodos = elemPadres.getLength();

            System.out.println(totnodos);
        }
        catch (ParserConfigurationException pce)
        {
            pce.printStackTrace();
        }
        catch (IOException io)
        {
            io.printStackTrace();
        }
        catch (SAXException se)
        {
            se.printStackTrace();
        }
    }
}
