/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Deogracias
 */
public class Clientes {
    
       /*
      `id` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(100) NOT NULL,
  `direccion` VARCHAR(100) NOT NULL,
  `cp` VARCHAR(5) NOT NULL,
  `localidad` VARCHAR(45) NOT NULL,
  `provincia` VARCHAR(45) NOT NULL,
  `mail` VARCHAR(45) NOT NULL,
  `tarjeta` VARCHAR(45) NOT NULL,
  `cuenta` VARCHAR(45) NOT NULL,
  `fecha_alta` DATETIME NOT NULL,
  `pagado` VARCHAR(45) NOT NULL,
 */ 
    
   
    private String id;
    private String nombre;
    private String afiliado;
    private String ip;
    private String fecha_registro;
    private String horario;
    private String seguro;
    private String transaction_id;
    private String navegador;
    private String email;
    private String observaciones;

    
//pruebas
   public Clientes() {
      this.nombre = null;

   }
   public Clientes(String id,String nombre,String afiliado,String ip,String fecha_registro,String horario,
           String transaction_id,String navegador,String seguro,String email,String observaciones) {
      
       this.id = id;
       this.nombre = nombre;
       this.afiliado = afiliado;
       this.ip = ip;
       this.fecha_registro = fecha_registro;
       this.horario = horario;
       this.seguro = seguro;
       this.transaction_id = transaction_id;
       this.navegador = navegador;
       this.email = email;
       this.observaciones = observaciones;

   }
   
   public Clientes(String afiliado,String ip,String fecha_registro,
           String transaction_id,String navegador,String observaciones) {
      
       this.id = id;
       this.nombre = nombre;
       this.afiliado = afiliado;
       this.ip = ip;
       this.fecha_registro = fecha_registro;
       this.horario = horario;
       this.seguro = seguro;
       this.transaction_id = transaction_id;
       this.navegador = navegador;
       this.email = email;
       this.observaciones = observaciones;

   }
   
   public String getId() {
      return id;
   }
   
   public String getNombre() {
      return nombre;
   }
   
   public String getAfiliado() {
      return afiliado;
   }
  
   public String getIp() {
      return ip;
   }
  
   public String getFechaRegistro() {
      return fecha_registro;
   }
  
   public String getHorario() {
      return horario;
   }
  
   public String getTransactionID() {
      return transaction_id;
   }
  
   public String getNavegador() {
      return navegador;
   }
  
   public String getEmail() {
      return email;
   }
  
   public String getObservaciones() {
      return observaciones;
   }
  
  
   public String getSeguro() {
      return seguro;
   }
   
   
 
   public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   public void setAfiliado(String apellidos) {
        this.afiliado = apellidos;
    }
   
   public void setIp(String direccion) {
        this.ip = direccion;
    }
   
   public void setFechaRegistro(String cp) {
        this.fecha_registro = cp;
    }
   
   public void setHorario(String localidad) {
        this.horario = localidad;
    }
   
   public void setSeguro(String provincia) {
        this.seguro = provincia;
    }
 
   public void setTransaction(String mail) {
        this.transaction_id = mail;
    }
   
   public void setNavegador(String tarjeta) {
        this.navegador = tarjeta;
    }
   
   public void setEmail(String cuenta) {
        this.email = cuenta;
    }
   
   public void setObservaciones(String fecha_alta) {
        this.observaciones = fecha_alta;
    }
   
   
   
   @Override
   public String toString() {
     // return "Tarea{" + "id_tarea=" + id_tarea + ", titulo=" + titulo + ", descripcion=" + descripcion + ", nivel_de_prioridad=" + nivel_de_prioridad + '}';
     
     return nombre;
   } 
    
    
}

