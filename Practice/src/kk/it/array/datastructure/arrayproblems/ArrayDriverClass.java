package kk.it.array.datastructure.arrayproblems;

public class ArrayDriverClass {
    public static void main(String[] args) {
        // creating an array
        DVD[] dvdCollections = new DVD[15];
        DVD avengersDVD = new DVD("The Avengers" , 2012, "Joss Whedon");
        dvdCollections[7] =avengersDVD;
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        dvdCollections[3] = incrediblesDVD;
        dvdCollections[9] = findingDoryDVD;
        dvdCollections[2] = lionKingDVD;
       // System.out.println(dvdCollections[3]);
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvdCollections[3] = starWarsDVD;
        System.out.println(dvdCollections[7]);
        System.out.println(dvdCollections[3]);

        System.out.println(dvdCollections[7]);
        System.out.println(dvdCollections[10]);
        System.out.println(dvdCollections[3]);



        //writing Items into the Array
        int[] squareNumbers = new int[10];
        for (int i=0; i<squareNumbers.length; i++){
            int square = (i) * (i);
            squareNumbers[i] = square;
        }
        System.out.println("===========================Square of 10 Numbers=========================================");
        for (int i=0; i<squareNumbers.length; i++){
            System.out.println(squareNumbers[i]);
        }
    }
}
