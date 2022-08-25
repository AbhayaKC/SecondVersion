package com.infosys;

public class NumCheck {
    public static void main(String[] args) {



        String [] []value = {{"hair", "ram"},{"shyamn", "timi"}};

        for (String [] val : value){
            for (String name : val){
                System.out.print(name+ " ");
            }
            System.out.println("");
        }


    }
}
