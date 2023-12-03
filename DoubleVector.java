import java.util.Vector;

class DoubleVector 
{
    private Vector<Double> elements;

    public DoubleVector(double[] elements) 
    {
        this.elements = new Vector<>();
        for (double element : elements) 
        {
            this.elements.add(element);
        }
    }

    public void printVector() 
    {
        System.out.print("Вектор: ");
        for (double element : elements) 
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
