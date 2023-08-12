package com.bdd.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SwagLabsPage {

    WebDriver driver;

    By botoncasillanombre = By.xpath("//input[@type='text' and @name='login']");
    By botonIngresoContrasena = By.xpath("//input[@type='password' and @name='clave']");

    By inputName = By.xpath("//input[@type='text' and @name='login']");
    By inputcontrasena = By.xpath("//input[@type='password' and @name='clave']");

    By botonentrar = By.xpath("//button[@type='submit' and @name='go']");

    By itemconsulta = By.xpath("//span[@class='xn-text' and text()='Consultas']");

    By itemmovimiento = By.xpath("//a[contains(., 'Movimientos')]/span[@class='fa fa-search']");

    By itemac = By.xpath("//a[@href='/SIMP_war_exploded/asientosContables' and normalize-space()='Asientos Contables']\n");
    By itemaf = By.xpath("//input[@id='fechaTransaccion']");

    By itemaU = By.xpath("//li[@data-range-key='Último mes']");
    By itemaD = By.xpath("//button[@id='exportar']");


















    public SwagLabsPage(WebDriver driver) {this.driver = driver;}
//ENTRAR LOGIN

    public WebElement getBotonEntrar() {
        return driver.findElement(botonentrar);

    }

    public WebElement getInputName() {
        return driver.findElement(inputName);
    }

    public WebElement getInputContrasena() {
        return driver.findElement(inputcontrasena);
    }


    public WebElement getIngresocasillanombre() {
        return driver.findElement(botoncasillanombre);
    }

    public WebElement getIngresoCasillaContrasena() {
        return driver.findElement(botonIngresoContrasena);

    }



    // SELECCIONO ITEM MANTENIMIENTO
    public WebElement obteneritemConsulta(){
        return driver.findElement(itemconsulta);
    }

    public WebElement obtenerMovimientos(){
        return driver.findElement(itemmovimiento);
    }

    public WebElement obtenerAC(){
        return driver.findElement(itemac);
    }

    public WebElement obtenerD(){
        return driver.findElement(itemaD);
    }

    public WebElement obtenerF(){
        return driver.findElement(itemaf);
    }
    public WebElement obtenerU(){
        return driver.findElement(itemaU);
    }




}