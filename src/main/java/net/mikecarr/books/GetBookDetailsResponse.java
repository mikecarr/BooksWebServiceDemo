//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.23 at 08:37:12 AM PDT 
//


package net.mikecarr.books;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentDetails" type="{http://mikecarr.net/books}BookDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentDetails"
})
@XmlRootElement(name = "GetBookDetailsResponse")
public class GetBookDetailsResponse {

    @XmlElement(name = "StudentDetails", required = true)
    protected BookDetails studentDetails;

    /**
     * Gets the value of the studentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BookDetails }
     *     
     */
    public BookDetails getStudentDetails() {
        return studentDetails;
    }

    /**
     * Sets the value of the studentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookDetails }
     *     
     */
    public void setStudentDetails(BookDetails value) {
        this.studentDetails = value;
    }

}