/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_2.users;

/**
 *
 * @author hamme
 */
public class usersInfo {

    private static String[] name = new String[6];
    private static int[] wonGames = new int[6];
    private static int lostGames;
    private static int ID;
    private static int option;

    public static int getOption() {
        return option;
    }

    public static void setOption(int option) {
        usersInfo.option = option;
    }

    public static String getName(int position) {
        return name[position];
    }

    public static void setName(String name, int position) {
        usersInfo.name[position] = name;
    }
    
}
