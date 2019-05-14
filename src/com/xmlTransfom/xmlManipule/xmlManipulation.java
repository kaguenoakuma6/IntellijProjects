package com.xmlTransfom.xmlManipule;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class xmlManipulation
{
    public static void main( String[] args)
    {
        try
        {
            // PagarDispCredito.xsd
            DocumentBuilderFactory docBfact = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuild = docBfact.newDocumentBuilder();
            Document doc ;
            File xsdSelected = null;
            String path = "", fileName = "";

            JFileChooser fChoose = new JFileChooser();
            fChoose.setAcceptAllFileFilterUsed(false);
           // FileNameExtensionFilter xsdFilter = new FileNameExtensionFilter("XSD File Filter", "xsd");
            FileNameExtensionFilter xsdFilter = new FileNameExtensionFilter("XML File Filter", "xml" );
            fChoose.addChoosableFileFilter(xsdFilter);
            int aprove = fChoose.showOpenDialog(null);

            if (aprove == JFileChooser.APPROVE_OPTION)
            {
                xsdSelected = fChoose.getSelectedFile();
                path = xsdSelected.getParent() + "/";
                fileName = xsdSelected.getName();
            }

            System.out.println("Iniciado el procesamiento del archivo --> " + fileName);

             doc = docBuild.parse(xsdSelected);

            doc.getDocumentElement().normalize();

            System.out.println("Nombre del Documento: " + doc.getDocumentElement().getNodeName());
            System.out.println();

            if (doc.hasChildNodes())
            {
                NodeList elemPadres = doc.getElementsByTagName("book");


                int totnodos = elemPadres.getLength();

                System.out.println("Elementos Encontrados: " + totnodos);
                System.out.println();

                for (int a = 0; a < elemPadres.getLength(); a++)
                {
                    Node elemen = elemPadres.item(a);
                    // System.out.println("Elemento a procesar: " + elemen.getNodeName());
                    //System.out.println("Tipo elemento a procesar: " + elemen.getNodeType());

                    if (elemen.getNodeType() == Node.ELEMENT_NODE)
                    {
                        //System.out.println(elemen.getNodeName() + " : " + elemen.getNodeValue());
                        String temp = "";

                        if (elemen.hasAttributes())
                        {
                            temp = getAttributes(elemen);
                        }

                        System.out.println(elemen.getNodeName() + " " + temp.trim());

                        if (elemen.hasChildNodes())
                        {
                            NodeList hijos = elemen.getChildNodes();

                            System.out.println("Se encontraron: " + hijos.getLength() + " hijos del nodo " + elemen.getNodeName());

                            for (int b = 0; b < hijos.getLength(); b++)
                            {
                                Node hijo = hijos.item(b);

                                if (hijo.getNodeType() == Node.ELEMENT_NODE)
                                {
                                    String temp1 = "";

                                    if (hijo.hasAttributes())
                                    {
                                        temp1 = getAttributes(hijo);
                                    }

                                    System.out.println(hijo.getNodeName() + " : " + hijo.getTextContent() + " " + temp1.trim());
                                }
                            }
                        }


                    }

                    System.out.println();
                }
            }
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

    public static String getAttributes(Node element)
    {
        NamedNodeMap atribs = element.getAttributes();
        String temp = "";

        for ( int a = 0; a < atribs.getLength(); a++)
        {
            Node atrib = atribs.item(a);

            temp += atrib.getNodeName() + " --> " + atrib.getNodeValue() + " ";
        }

        return temp.trim();
    }
}











