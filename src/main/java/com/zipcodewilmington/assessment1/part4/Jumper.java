package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int count = 0;
        int num = 0;
        int remaining = 0;
        if(j<=k){
        for (int x = 0; x <= k; x = x + j) {
            if (x != k) {
                count++;
            }}} else if (j>= k) {
                for (int y=0; y<=k; y++) {
                    num++;
                }return num;
            }
        return count;
    }




    }

        /*
        while(j<=k){
            j+=j;
            jumpheight++;
        }


        return jumpheight;


        /*
        if(k == j)
            return (1);


        return -1;
    */


   // }




