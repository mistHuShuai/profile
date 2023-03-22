package com.dyja21.entity;

public class Ren {
    private String bha;
    private String xma;
    private String dha;
public Ren(){

}
    public Ren(String bha, String xma, String dha) {
        this.bha = bha;
        this.xma = xma;
        this.dha = dha;
    }

    public String getBha() {
        return bha;
    }

    public void setBha(String bha) {
        this.bha = bha;
    }

    public String getXma() {

        return xma;
    }

    public void setXma(String xma) {



        System.out.println("呵呵----");
        this.xma = xma;
    }

    public String getDha() {
        return dha;
    }

    public void setDha(String dha) {
        this.dha = dha;
    }
}
