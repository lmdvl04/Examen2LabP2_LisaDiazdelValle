/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2lab_p2_lisadiazdelvalle;

import java.util.ArrayList;

/**
 *
 * @author HTS
 */
public class Deporte {
     private String nombre;
        private ArrayList <Torneo> torneos = new ArrayList();

    public Deporte() {
    }

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }
    


    @Override
    public String toString() {
        return nombre ;
    }
     
     
     
    
}
