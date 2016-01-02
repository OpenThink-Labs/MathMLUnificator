/*
 * Copyright 2016 Michal Růžička.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz.muni.fi.mir.mathmlunificator.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Tools for building DOM from various string representations.
 *
 * @author Michal Růžička
 */
public class DOMBuilder {

    /**
     * Build W3C DOM representation of XML file specified by filesystem path.
     *
     * @param filepath Path of the file in filesystem to build DOM from.
     * @return W3C DOM representation of the XML document.
     * @throws ParserConfigurationException If a DocumentBuilder cannot be
     * created which satisfies the configuration requested.
     * @throws SAXException If any parse errors occur.
     * @throws IOException If any IO errors occur.
     */
    public static Document buildDocFromFilepath(String filepath) throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setNamespaceAware(true);
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        return docBuilder.parse(filepath);

    }

    /**
     * Build W3C DOM representation of XML from {@link java.io.File}.
     *
     * @param file XML {@link java.io.File} to build DOM from.
     * @return W3C DOM representation of the XML document.
     * @throws ParserConfigurationException If a DocumentBuilder cannot be
     * created which satisfies the configuration requested.
     * @throws SAXException If any parse errors occur.
     * @throws IOException If any IO errors occur.
     */
    public static Document buildDocFromFile(File file) throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setNamespaceAware(true);
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        return docBuilder.parse(file);

    }

    /**
     * Build W3C DOM representation of XML from
     * <code>{@link org.xml.sax.InputSource}</code>.
     *
     * @param is Input source to build DOM from.
     * @return W3C DOM representation of the XML document.
     * @throws ParserConfigurationException If a DocumentBuilder cannot be
     * created which satisfies the configuration requested.
     * @throws SAXException If any parse errors occur.
     * @throws IOException If any IO errors occur.
     */
    public static Document buildDocFromFile(InputSource is) throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setNamespaceAware(true);
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        return docBuilder.parse(is);

    }

    /**
     * Build W3C DOM representation of XML from
     * <code>{@link java.io.InputStream}</code>.
     *
     * @param is Input stream to build DOM from.
     * @return W3C DOM representation of the XML document.
     * @throws ParserConfigurationException If a DocumentBuilder cannot be
     * created which satisfies the configuration requested.
     * @throws SAXException If any parse errors occur.
     * @throws IOException If any IO errors occur.
     */
    public static Document buildDocFromFile(InputStream is) throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setNamespaceAware(true);
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        return docBuilder.parse(is);

    }

}
