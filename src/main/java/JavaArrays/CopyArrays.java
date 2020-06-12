package JavaArrays;

public class CopyArrays {
    public static void main(String[] args) {

        String[] characters = {"Mario", "Sonic", "Pikachu", "Kirby"};
        String[] nintendo = characters;

        characters[0] = "Luigi";

        for (String character : nintendo){
            System.out.println(character + ", ");

        }

    }

    /*
    int[][] source = {
              {1, 2, 3, 4},
              {5, 6},
              {0, 2, 42, -4, 5}
              };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < destination.length; ++i) {

            // allocating space for each row of destination array
            destination[i] = new int[source[i].length];

            for (int j = 0; j < destination[i].length; ++j) {
                destination[i][j] = source[i][j];
            }
        }

        // displaying destination array
        System.out.println(Arrays.deepToString(destination));

    }
     */
}
