/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_2.Hanoi;

/**
 *
 * @author hamme
 */
public class node {
    
    private String data;
    private node up;
    private node down;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public node getUp() {
        return up;
    }

    public void setUp(node up) {
        this.up = up;
    }

    public node getDown() {
        return down;
    }

    public void setDown(node down) {
        this.down = down;
    }
 
}
