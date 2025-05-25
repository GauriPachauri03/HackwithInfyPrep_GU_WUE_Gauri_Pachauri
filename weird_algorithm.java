class weird_algorithm{
    public static void main(String[] args){
        int n=5;
        weird(n);
    }
    public static void weird(int n){
        System.out.print(n+" ");
        while(n!=1){
            if(n%2==0) n=n/2;
             else n= n*3+1;
         System.out.print(n+" ");
        }
    }
}