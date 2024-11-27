package com.example.apptcc;

public class Vacina {
    private int id;
    private String nomeVacina;
    private String dataAplicacao;
    private String crmv;

    public Vacina(int id, String nomeVacina) {
        this.id = id;
        this.nomeVacina = nomeVacina;
    }

    public Vacina(int id, String nomeVacina, String dataAplicacao, String crmv) {
        this.id = id;
        this.nomeVacina = nomeVacina;
        this.dataAplicacao = dataAplicacao;
        this.crmv = crmv;
    }

    public Vacina(int id, String nomeVacina, String dataAplicacao) {
        this.id = id;
        this.nomeVacina = nomeVacina;
        this.dataAplicacao = dataAplicacao;
    }

    public Vacina(String nomeVacina, String dataAplicacao, String crmv) {
        this.nomeVacina = nomeVacina;
        this.dataAplicacao = dataAplicacao;
        this.crmv = crmv;
    }

    public Vacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNome(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
}