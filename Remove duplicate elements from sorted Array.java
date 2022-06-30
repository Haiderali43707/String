class Solution {
    int remove_duplicate(int A[],int N){
        int n=A.length;
        Set<Integer>set=new  TreeSet<>();
        for(int i=0;i<n;i++) {
            set.add(A[i]);
        }
        int k = 0; 
        for (Integer i: set) {
            A[k] = i;
            k=k+1;
        }
        return set.size();
    }

}
