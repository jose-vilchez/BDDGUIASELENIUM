package com.bdd.steps;

import com.bdd.page.SwagLabsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwagLabsSteps {

    WebDriver driver;


    private SwagLabsPage LabsPage() {
        return new SwagLabsPage(driver);
    }

    public void openPage(String url) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


    }

    // INGRESO DE USUARIO Y CONTRASEÑA

    public void seleccionarcasillanombre() {
        LabsPage().getIngresocasillanombre().click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        //INGREESO DE NOMBRE
        LabsPage().getInputName().sendKeys("ADMIN");


    }

    public void getIngresoCasillaContrasena() {
        LabsPage().getIngresoCasillaContrasena().click();

        try {
            TimeUnit.SECONDS.sleep(2);

        } catch (InterruptedException e) {

            System.out.println(e.getMessage());
        }
        //INGRESO DE CONTRASEÑA
        LabsPage().getInputContrasena().sendKeys("SIMP");


    }


    // CLICK EN BOTON LOGIN


    public void BotonLogin() {
        LabsPage().getBotonEntrar().click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


    // SELECCIONO ITEM MANTENIMIENTO
    //seleccionomantenimientos
    public void seleccionoConsulta() {
        LabsPage().obteneritemConsulta().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


    //movimientos

    public void seleccionoMovimientos() {
        LabsPage().obtenerMovimientos().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

    public void seleccionoAC() {
        LabsPage().obtenerAC().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

    public void seleccionoD() {
        LabsPage().obtenerD().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }

    public void seleccionoF() {
        LabsPage().obtenerF().click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }



        public void seleccionoultimo() {
            LabsPage().obtenerU().click();

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }


        }
    }




















