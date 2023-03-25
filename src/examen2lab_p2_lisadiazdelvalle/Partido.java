/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2lab_p2_lisadiazdelvalle;

import java.io.Serializable;

/**
 *
 * @author HTS
 */
public class Partido implements Serializable {
     private String nombreEquipo1, nombreEqipo2;
     private int punt1, punt2;
      private static final long SerialVersionUID  = 777L;

    public Partido() {
    }

    public Partido(String nombreEquipo1, String nombreEqipo2, int punt1, int punt2) {
        this.nombreEquipo1 = nombreEquipo1;
        this.nombreEqipo2 = nombreEqipo2;
        this.punt1 = punt1;
        this.punt2 = punt2;
    }

    

    public String getNombreEquipo1() {
        return nombreEquipo1;
    }

    public void setNombreEquipo1(String nombreEquipo1) {
        this.nombreEquipo1 = nombreEquipo1;
    }

    public String getNombreEqipo2() {
        return nombreEqipo2;
    }

    public void setNombreEqipo2(String nombreEqipo2) {
        this.nombreEqipo2 = nombreEqipo2;
    }

    public int getPunt1() {
        return punt1;
    }

    public void setPunt1(int punt1) {
        this.punt1 = punt1;
    }

    public int getPunt2() {
        return punt2;
    }

    public void setPunt2(int punt2) {
        this.punt2 = punt2;
    }

    
    @Override
    public String toString() {
        return  nombreEquipo1 + " vs. " + nombreEqipo2 ;
    }
     
     
    
}
