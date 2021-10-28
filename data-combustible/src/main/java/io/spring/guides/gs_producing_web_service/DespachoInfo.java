//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.07.26 a las 11:56:57 AM COT 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para despachoInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="despachoInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sistema" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idTransacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sociedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaContabilizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horaContabilizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estacionServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="equipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorCombustible" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorHorometro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorOdometro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "despachoInfo", propOrder = {
    "sistema",
    "idTransacion",
    "sociedad",
    "fechaContabilizacion",
    "horaContabilizacion",
    "estacionServicio",
    "equipo",
    "valorCombustible",
    "valorHorometro",
    "valorOdometro",
    "texto"
})
public class DespachoInfo {

    @XmlElement(required = true)
    protected String sistema;
    @XmlElement(required = true)
    protected String idTransacion;
    @XmlElement(required = true)
    protected String sociedad;
    @XmlElement(required = true)
    protected String fechaContabilizacion;
    @XmlElement(required = true)
    protected String horaContabilizacion;
    @XmlElement(required = true)
    protected String estacionServicio;
    @XmlElement(required = true)
    protected String equipo;
    @XmlElement(required = true)
    protected String valorCombustible;
    @XmlElement(required = true)
    protected String valorHorometro;
    @XmlElement(required = true)
    protected String valorOdometro;
    @XmlElement(required = true)
    protected String texto;

    /**
     * Obtiene el valor de la propiedad sistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Define el valor de la propiedad sistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransacion() {
        return idTransacion;
    }

    /**
     * Define el valor de la propiedad idTransacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransacion(String value) {
        this.idTransacion = value;
    }

    /**
     * Obtiene el valor de la propiedad sociedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSociedad() {
        return sociedad;
    }

    /**
     * Define el valor de la propiedad sociedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSociedad(String value) {
        this.sociedad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaContabilizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaContabilizacion() {
        return fechaContabilizacion;
    }

    /**
     * Define el valor de la propiedad fechaContabilizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaContabilizacion(String value) {
        this.fechaContabilizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad horaContabilizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraContabilizacion() {
        return horaContabilizacion;
    }

    /**
     * Define el valor de la propiedad horaContabilizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraContabilizacion(String value) {
        this.horaContabilizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estacionServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstacionServicio() {
        return estacionServicio;
    }

    /**
     * Define el valor de la propiedad estacionServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstacionServicio(String value) {
        this.estacionServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad equipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * Define el valor de la propiedad equipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipo(String value) {
        this.equipo = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCombustible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorCombustible() {
        return valorCombustible;
    }

    /**
     * Define el valor de la propiedad valorCombustible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorCombustible(String value) {
        this.valorCombustible = value;
    }

    /**
     * Obtiene el valor de la propiedad valorHorometro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorHorometro() {
        return valorHorometro;
    }

    /**
     * Define el valor de la propiedad valorHorometro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorHorometro(String value) {
        this.valorHorometro = value;
    }

    /**
     * Obtiene el valor de la propiedad valorOdometro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorOdometro() {
        return valorOdometro;
    }

    /**
     * Define el valor de la propiedad valorOdometro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorOdometro(String value) {
        this.valorOdometro = value;
    }

    /**
     * Obtiene el valor de la propiedad texto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Define el valor de la propiedad texto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

}
