
package Client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="second" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="op" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cal", propOrder = {
    "first",
    "second",
    "op"
})
public class Cal {

    protected double first;
    protected double second;
    @XmlSchemaType(name = "unsignedShort")
    protected int op;

    /**
     * Gets the value of the first property.
     * 
     */
    public double getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     */
    public void setFirst(double value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     */
    public double getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     */
    public void setSecond(double value) {
        this.second = value;
    }

    /**
     * Gets the value of the op property.
     * 
     */
    public int getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     */
    public void setOp(int value) {
        this.op = value;
    }

}
