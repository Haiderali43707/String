class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        BigInteger b1=new BigInteger(s1);
           BigInteger b2=new BigInteger(s2);
           b1=b1.multiply(b2);
           return b1.toString();
        
    }
}
