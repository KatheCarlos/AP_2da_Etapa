package com.argentinaprograma.proyecto.java.intermedio.modelo;

import java.util.List;

public class Tecnico {
    private List<String> especialidades; //Quizas haces un Enum
    private boolean libre;
    private String id;
    
    public Tecnico() {
    }

    public void arreglar(Incidente i) {
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
}
