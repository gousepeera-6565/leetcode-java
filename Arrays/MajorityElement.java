 class Solution {
    public int majorityElement(int[] a) {
        
        int m= a[0];
        int c=1;
        for(int i = 0; i < a.length; i++){
            if(m == a[i]){

                c++;
            } 
            else{
                c--;
            }
            if (c==0){
                m=a[i];
                c=1;
            }

        }
        return m;
    }
}
