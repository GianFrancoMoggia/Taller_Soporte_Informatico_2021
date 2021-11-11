package app.web;

public class Beneficiario {
    private String genero;
    private String nivel_educativo;
    private String edad;
    private String ingreso_conjunto;
    private String smvm;
    private String alquila;
    private String condicion_laboral_primaria;
    private String condicion_laboral_secundaria;
    private String localidad;
    private String comuna;
    private String barrio;
    private String partido;

    public Beneficiario(String genero, String nivel_educativo, String edad, String ingreso_conjunto, String smvm, String alquila, String condicion_laboral_primaria, String condicion_laboral_secundaria, String localidad, String comuna, String barrio, String partido) {
        this.genero = genero;
        this.nivel_educativo = nivel_educativo;
        this.edad = edad;
        this.ingreso_conjunto = ingreso_conjunto;
        this.smvm = smvm;
        this.alquila = alquila;
        this.condicion_laboral_primaria = condicion_laboral_primaria;
        this.condicion_laboral_secundaria = condicion_laboral_secundaria;
        this.localidad = localidad;
        this.comuna = comuna;
        this.barrio = barrio;
        this.partido = partido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNivel_educativo() {
        return nivel_educativo;
    }

    public void setNivel_educativo(String nivel_educativo) {
        this.nivel_educativo = nivel_educativo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIngreso_conjunto() {
        return ingreso_conjunto;
    }

    public void setIngreso_conjunto(String ingreso_conjunto) {
        this.ingreso_conjunto = ingreso_conjunto;
    }

    public String getSmvm() {
        return smvm;
    }

    public void setSmvm(String smvm) {
        this.smvm = smvm;
    }

    public String getAlquila() {
        return alquila;
    }

    public void setAlquila(String alquila) {
        this.alquila = alquila;
    }

    public String getCondicion_laboral_primaria() {
        return condicion_laboral_primaria;
    }

    public void setCondicion_laboral_primaria(String condicion_laboral_primaria) {
        this.condicion_laboral_primaria = condicion_laboral_primaria;
    }

    public String getCondicion_laboral_secundaria() {
        return condicion_laboral_secundaria;
    }

    public void setCondicion_laboral_secundaria(String condicion_laboral_secundaria) {
        this.condicion_laboral_secundaria = condicion_laboral_secundaria;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}
