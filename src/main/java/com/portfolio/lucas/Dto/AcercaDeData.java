/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author lucas
 */
public class AcercaDeData {
    @NotBlank
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public AcercaDeData(String descripcion) {
        this.descripcion = descripcion;
    }
}
