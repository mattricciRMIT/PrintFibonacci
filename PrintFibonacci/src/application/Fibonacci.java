package application;

public class Fibonacci
{

    /**
     * Calculates and returns a Fibonacci sequence 
     * 
     * <p>
     * Returns a String consisting of a sequence of Fibonacci
     * numbers up to the nth item defined by the count parameter
     * </p>
     * 
     * @param count   The number of items in the sequence, input by the user
     * @return        The Fibonacci sequence up to the nth item defined by count
     */
    public String run(int count)
    {
        // Initialize sequence array and return string
        int[] fib = new int[count];
        String result = "\n";
        
        /*
         * Calculate sequence
         */
        for(int i = 0; i < count; i++)
        {
            if (i <= 1)
            {
                fib[i] = i;
            } else {
                fib[i] = fib[i-2] + fib[i-1];
            }
        }
        
        /*
         * Build string
         */
        for(int item: fib)
        {
            result += item + " ";
        }
        
        return result; // Return string sequence
    }
    
}
