/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.xml.security.keys.content;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.w3c.dom.Element;

/**
 * @author $Author: coheigea $
 * $todo$ Implement
 */
public class PGPData extends SignatureElementProxy implements KeyInfoContent {

    /**
     * Constructor PGPData
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
    public PGPData(Element element, String baseURI) throws XMLSecurityException {
        super(element, baseURI);
    }

    /** @inheritDoc */
    public String getBaseLocalName() {
        return Constants._TAG_PGPDATA;
    }
}
