package org.iesfm.entity;

import java.util.Objects;

public class FileEntity {

    private String articulo;
    private String tipo;
    private String fechaVenta;
    private float precioDeVenta;
    private float costeDerivados;
    private float costeProduccion;
    private float impuestos;
    private float coste;
    private float beneficio;

    public FileEntity(String articulo, String tipo, String fechaVenta, float precioDeVenta, float costeDerivados, float costeProduccion, float impuestos) {
        this.articulo = articulo;
        this.tipo = tipo;
        this.fechaVenta = fechaVenta;
        this.precioDeVenta = precioDeVenta;
        this.costeDerivados = costeDerivados;
        this.costeProduccion = costeProduccion;
        this.impuestos = impuestos;
    }

    public FileEntity() {
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(float precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public float getCosteDerivados() {
        return costeDerivados;
    }

    public void setCosteDerivados(float costeDerivados) {
        this.costeDerivados = costeDerivados;
    }

    public float getCosteProduccion() {
        return costeProduccion;
    }

    public void setCosteProduccion(float costeProduccion) {
        this.costeProduccion = costeProduccion;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public float getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(float beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileEntity that = (FileEntity) o;
        return Float.compare(that.precioDeVenta, precioDeVenta) == 0 && Float.compare(that.costeDerivados, costeDerivados) == 0 && Float.compare(that.costeProduccion, costeProduccion) == 0 && Float.compare(that.impuestos, impuestos) == 0 && Float.compare(that.coste, coste) == 0 && Float.compare(that.beneficio, beneficio) == 0 && Objects.equals(articulo, that.articulo) && Objects.equals(tipo, that.tipo) && Objects.equals(fechaVenta, that.fechaVenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articulo, tipo, fechaVenta, precioDeVenta, costeDerivados, costeProduccion, impuestos, coste, beneficio);
    }

    @Override
    public String toString() {
        return "FileEntity{" +
                "articulo='" + articulo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fechaVenta='" + fechaVenta + '\'' +
                ", precioDeVenta=" + precioDeVenta +
                ", costeDerivados=" + costeDerivados +
                ", costeProduccion=" + costeProduccion +
                ", impuestos=" + impuestos +
                ", coste=" + coste +
                ", beneficio=" + beneficio +
                '}';
    }
}
