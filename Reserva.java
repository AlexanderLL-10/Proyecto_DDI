/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_DD1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin-Alex
 */
public class Reserva {
    private String nombre;
    private String apellidos;
    private Date fechaRegistro;
    private String oficina;
    private String mesa;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Reserva(String nombre, String apellidos, Date fechaRegistro, String oficina, String mesa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaRegistro = fechaRegistro;
        this.oficina = oficina;
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }
    
    public String[] toArrayString(){
        String[] s = new String[5];
        s[0] = nombre;
        s[1] = apellidos;
        s[2] = sdf.format(fechaRegistro);
        s[3] = oficina;
        s[4] = mesa;
        return s;
    }
    
}
