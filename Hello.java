class Hello 
{
    public static void main (String args[])
    {
        // type conversion
        // byte b = 258 error as out of range
       // byte b = 127 ;
        int a = 257; //works
       // byte k = (byte)(a); // will store a%range in k
        //System.out.println(k); 

        //promotion 
        byte k = 124;
        int va = k*k; // here k*k will be promoted to int
        System.out.println(va); 
    }
}