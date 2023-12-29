public class ex31 {
    public static void main(String[] args) {
        //2중 반복문 - 별찍기
        //*****
        //*****
        //*****
        //*****
       /* for ( int i=0; i<5; i++){
            for (int j=0;j<3;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //*
        //**
        //***
        //****
        //*****

        //     *
        //    **
        //   ***
        //  ****
        // *****



        for ( int i=0; i<5; i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        for ( int i=0; i<5; i++){
            for (int j=4;j>i;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //*****
        //****
        //***
        //**
        //*

        for ( int i=0; i<5; i++){
            for (int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println();

        }

        //    *
        //   ***
        //  *****
        // *******
        //*********


        for ( int i=0; i<5; i++){
            for (int j=4;j>i;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }

            for (int j=0;j<i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
        */


        //*****
        //*   *
        //*   *
        //*   *
        //*****

        int n = 5;
        for ( int i=0; i<n; i++){
            if ( i==0 || i==n-1){
                for (int j = 0;j<n;j++){
                    System.out.print("*");
                }
            }else {
                for (int j=0;j<n;j++){
                    if (j==0||j==n-1) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }
            }


            System.out.println();
        }



            //*****
            //**  *
            //* * *
            //*  **
            //*****


        for ( int i=0; i<n; i++){
            if ( i==0|| i==n-1){
                for (int j = 0;j<n;j++){
                    System.out.print("*");
                }
            }else {
                for (int j=0;j<n;j++){
                    if (j==0||j==n-1){
                        System.out.print("*");
                    } else if (j==i) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }
            }


            System.out.println();
        }





        }
    }

