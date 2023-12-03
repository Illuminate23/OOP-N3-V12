public class Main 
{
    public static void main(String[] args) 
    {
        double[] elements = new double[args.length];

        for (int i = 0; i < args.length; i++) 
        {
            try 
            {
                elements[i] = Double.parseDouble(args[i]);
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Введенный аргумент не является числом: " + args[i]);
                return;
            }
        }

        DoubleVector vector = new DoubleVector(elements);
        vector.printVector();
    }
}
