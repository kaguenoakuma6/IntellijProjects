package com.xmlTransfom.xmlManipule;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class xmlManipulation2
{
    public static void main( String[] args)
    {
        try
        {
            // PagarDispCredito.xsd
            DocumentBuilderFactory docBfact = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuild = docBfact.newDocumentBuilder();
            Document doc = docBuild.parse(new File("/home/kuro/Documentos/JavaProyect/books.xml") );

            doc.getDocumentElement().normalize();

            NodeList elemPadres = doc.getElementsByTagName("book");

            int totnodos = elemPadres.getLength();

            System.out.println("Elementos Encontrados: " + totnodos);

            for (int a = 0; a < elemPadres.getLength(); a++)
            {
                Node elemen = elemPadres.item(a);
                System.out.println("Elemento a procesar: " + elemen.getNodeName());
                System.out.println("Tipo elemento a procesar: " + elemen.getNodeType());
                System.out.println();


                if (elemen.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element elemento = (Element) elemen;

                    System.out.println("Category: " + elemento.getAttribute("category"));
                    System.out.println("Title: " + elemento.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Author: " + elemento.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Year: " + elemento.getElementsByTagName("year").item(0).getTextContent());
                    System.out.println("Price: " + elemento.getElementsByTagName("price").item(0).getTextContent());

                }
                System.out.println();
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
}
