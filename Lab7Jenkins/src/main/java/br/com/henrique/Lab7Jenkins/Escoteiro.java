package br.com.henrique.Lab7Jenkins;

public class Escoteiro {
    
    public int getSubsidioSocio(int tempo) {
        if (tempo == 1) {
            return 25;
        } else if (tempo == 2) {
            return 35;
        } else {
            return 50;
        }
    }
    
    public int getSubsidioPosto(String posto) {
        if (posto == "LOBO") {
            return 10;
        } else if (posto == "URSO") {
            return 15;
        } else if (posto == "LEÃO") {
            return 20;
        } else {
            return 0;
        } 
    }
    
}
