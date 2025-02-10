class Hello 
{
    public static void main (String args[])
    {
        // type conversion
        // byte b = 258 error as out of range
       // byte b = 127 ;
        int a = 257; //works
        byte k = (byte)(a); // will store a%range in k
        System.out.println(k); 
        
    }
}