package EulerPrograms.Project100;

import EulerPrograms.Library;

public class arrangedProbability {

    public static void main(String[] args) {
        long totalDiscs = (long) Math.pow(10, 12);
        long blueDiscs = Library.findBlueDiscs(totalDiscs);
        System.out.println("The number of blue discs in the first arrangement exceeding " + totalDiscs + " total discs is: " + blueDiscs);
    }

}
