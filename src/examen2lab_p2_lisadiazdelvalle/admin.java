/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2lab_p2_lisadiazdelvalle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HTS
 */
public class admin implements Serializable{
    ArrayList<Deporte> deportes = new ArrayList();
 
    private File archivo = null;
    
    public admin(String path) {
        archivo = new File(path);
    }

    public ArrayList<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(ArrayList<Deporte> deportes) {
        this.deportes = deportes;
    }

   

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void escribirUsuarios() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Deporte d : deportes) {
                bw.writeObject(d);
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
    public void CargarUsuarios(){
        try {
            deportes = new ArrayList();
            Object temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream object = new ObjectInputStream(entrada);
                try {
                    while(((temp =object.readObject())!= null)){

                        deportes.add((Deporte)temp);
                    }
                } catch (IOException | ClassNotFoundException ex) {
                }
                
            }
            
        } catch (FileNotFoundException ex) {
        } catch (IOException ex){
            
        }
    }
    
}

