import java.util.Random;

public class Individual {
    int fitness = 0;
    int[] genes = new int[6];
    int [] arrayFitness = new int[]{15,10,10,10,5,8,17};
    int [] arrayPesos = new int[]{15,3,2,5,9,20};
    int geneLength = 6;

    public Individual() {
        Random rn = new Random();

        //Set genes randomly for each individual
        for (int i = 0; i < genes.length; i++) {
            genes[i] = Math.abs(rn.nextInt() % 2);
        }
    }

    //Calculate fitness
    public void calcFitness() {
        int peso = 0;
        fitness = 0;

        for (int i = 0; i < genes.length; i++) {
            if (genes[i] != 0) {
                peso = peso + arrayPesos[i];
                fitness = fitness + arrayFitness[i];
            }
        }
        if(peso > 30)
            fitness = 0;
    }

}
