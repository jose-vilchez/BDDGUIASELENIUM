package com.bdd.stepdefinitions;

import com.bdd.steps.SwagLabsSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;

import java.util.concurrent.TimeUnit;

public class SwagLabsStepdefs {

    SwagLabsSteps swagLabsSteps = new SwagLabsSteps();

    @Dado("que ingreso a la SIMPWEB de CajaArequipa")
    public void queIngresoSimpWebCajaArequipa() throws InterruptedException {
        swagLabsSteps.openPage("http://localhost:8080/SIMP_war_exploded/");
        TimeUnit.SECONDS.sleep(3);

    }

    @Cuando("agrego mi username")
    public void agregomiusername() {
        swagLabsSteps.seleccionarcasillanombre();

    }


    @Y("ingreso mi contrasena")
    public void ingresomicontrasena() {
        swagLabsSteps.getIngresoCasillaContrasena();


    }

    @Y("verifico ingreso exitoso")
    public void verificoingresoexitoso() {
        swagLabsSteps.BotonLogin();

    }

    //DAR CLICK EN MANTENIMIENTO
    @Y("quiero ir al apartado de Consultas")
    public void doyClickEnConsulta() {
        swagLabsSteps.seleccionoConsulta();

    }

    //CLICK CONSULTA
    @Y("quiero ir al apartado de Movimientos")
    public void doyClickMovimientos() {
        swagLabsSteps.seleccionoMovimientos();

    }

    @Y("quiero ir al apartado de Asientos Contables")
    public void doyClickAC() {
        swagLabsSteps.seleccionoAC();


    }

  @Y("Exporto o no se encuentra archivo vacio")
    public void exportoDoc() {
        swagLabsSteps.seleccionoD();

    }

    @Y("elijo la fecha de transaccion")
    public void elijoFecha() {
        swagLabsSteps.seleccionoF();

    }
    @Y("selecciono ultimo mes")
    public void seleccionoUlt() {
        swagLabsSteps.seleccionoultimo();

    }







}
