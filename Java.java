public class Java {
    static class Scala {

        int LargestNumber;
        int SmallestNumber;
    }

    static Scala CheckSCala(int Array[], int Number) {
        Scala ScalaObject = new Scala();
        int Iteration;

        if (Number == 1) {
            ScalaObject.SmallestNumber = Array[0];
            ScalaObject.LargestNumber = Array[0];
            return ScalaObject;
        }

        if (Array[0] > Array[1]) {
            ScalaObject.SmallestNumber = Array[0];
            ScalaObject.LargestNumber = Array[1];
        } else {
            ScalaObject.SmallestNumber = Array[1];
            ScalaObject.LargestNumber = Array[0];
        }

        for (Iteration = 2; Iteration < Number; Iteration++)
        {
            if (Array[Iteration] > ScalaObject.SmallestNumber)
            {
                ScalaObject.SmallestNumber = Array[Iteration];
            } else if (Array[Iteration] < ScalaObject.LargestNumber)
            {
                ScalaObject.LargestNumber = Array[Iteration];
            }
        }

        return ScalaObject;
    }

    public static void main(String args[]) {
        int Array[] = {1000, 11, 445, 1, 330, 3000};
        int SizeOfArray = 6;
        ScalaScalaObject = CheckSCala()Array, SizeOfArray);
        System.out.printf("\na is %d", ScalaObject.a);
        System.out.printf("\nb is %d", ScalaObject.b);
    }
}