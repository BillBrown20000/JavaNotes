package JavaArrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {


        String[][] artists = {
                {"Lil Uzi", "Future"},
                {"Drake", "Childish Gambino", "Travis $cott", "J cole", "Wale"},
                {"Don Toliver", "Gunna", "Jack Harlow", "Zotiyac"},
        };

        for (int x = 0; x < artists.length; x++){
            for (int y = 0; y < artists[x].length; y++){
                System.out.println(artists[x][y]);
            }
        }
    }
}

/*
public static void main(String[] args) {

        // create a 2d array
        int[][] a = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7},
        };

        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }
    }


 */
