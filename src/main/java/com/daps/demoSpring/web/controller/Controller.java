package com.daps.demoSpring.web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/copyFile")
    public String copyFile(){
        return "File copied!";
    }

    @GetMapping("/miPrimeraPagina")
    public String miPagina(){
        String cadena = "";
        cadena += "<!DOCTYPE html>";
        cadena += "<html>";
        cadena +=   "<header>";
        cadena +=       "<tittle>El sitio de Diana</tittle>";
        cadena +=   "</header>";
        cadena +=   "<body>";
        cadena +=       "<h1>Hola hola hola</h1>";
        cadena +=       "<h2>Esta página fue desarrollada con Java y Spring boot</h2>";
        cadena +=   "</body>";
        cadena += "</html>";

        System.out.println(cadena);
        return cadena;
    }

    @GetMapping("/pagina2/{userName}/{sMsg}")
    public String miPagina2(@PathVariable String userName, @PathVariable String sMsg){
        String cadena = "";
        cadena += "<!DOCTYPE html>";
        cadena += "<html>";
        cadena +=   "<header>";
        cadena +=       "<tittle>El sitio de "+userName+"</tittle>";
        cadena +=   "</header>";
        cadena +=   "<body>";
        cadena +=       "<h1>" +sMsg+ "</h1>";
        cadena +=       "<h2>Esta página fue desarrollada con Java y Spring boot</h2>";
        cadena +=   "</body>";
        cadena += "</html>";

        System.out.println(cadena);
        return cadena;
    }

    @GetMapping("/pagina3")
    public String miPagina3(@RequestParam String userName, @RequestParam String sMsg){
        String cadena = "";
        cadena += "<!DOCTYPE html>";
        cadena += "<html>";
        cadena +=  "<header>";
        cadena +=       "<tittle>El sitio de "+userName+"</tittle>";
        cadena +=  "</header>";
        cadena +=  "<body>";
        cadena +=      "<h1>"+sMsg+"</h1>";
        cadena +=      "<h2>Esta página fue desarrollada con Java y Spring boot</h2>";
        cadena +=  "</body>";
        cadena += "</html>";

        System.out.println(cadena);
        return cadena;
    }

}
