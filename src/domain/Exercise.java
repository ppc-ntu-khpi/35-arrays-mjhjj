package arrjavaprac;
import java.util.ArrayList;




public  class Exercise {
   public  static int Calculate ()
   {
        int Value = 9999;
         ArrayList<Integer> searchingTickets = new ArrayList<>();
         
         functionOfCounting(Value,  searchingTickets);
      
         int quot  = searchingTickets.size();
   return quot;
   }
    
  
    
    
    
    /**
     * якщо сума цифр рівна - білет щасливий;
     * @param maxValue  - максимальне значення квитку 
     */
    
    public static void functionOfCounting(int Value, ArrayList<Integer> searchingTickets)
    {
         
        for(int i = 1; i<Value; i++)
        {
                if(i%10 + i%100  == i%100+i%1000)
                {
                
                    searchingTickets.add(i);
                
                }
        
        }     
    
    }


}