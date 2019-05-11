/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


/**
 *
 * @author pedro.quila
 */
public class Alumno {

    private String rut;
    private String nom;
    private String ap;
    private int ed;
    private double n1, n2, n3, n4, prom;

    public Alumno(String rut, String nom, String ap, int ed, double n1, double n2, double n3, double n4, double prom) {
        this.rut = rut;
        this.nom = nom;
        this.ap = ap;
        this.ed = ed;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.prom = prom;
    }

    public Alumno() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public int getEd() {
        return ed;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    
}
