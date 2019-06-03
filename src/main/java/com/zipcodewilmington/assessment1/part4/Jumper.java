package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int count =0;
        int jumpheight =0;
        for (int x=0; x<=k; x++){
            if(x != k){
                count++;
            }

        }
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


    }



}
