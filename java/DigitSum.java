class DigitSum {
    public static void main(String[] args) {
        String a="1234";
        int b=Integer.parseInt(a);
    //   int d[]=new int[b];
    //     // int c=0, temp=0;
    //     // for(int i=0;i<=d.length;i++)
    //     // int f=d.indexOf(i);
    //     // c=temp+f;
    //     // temp=c;
    //     // // e=c;
    //     // // int n=b%10;
    int c=0;
    while(b>0){
        int n=b%10;
        b=b/10;
    int f=c+n;
        c=f;
        System.out.println(f);
    }
        // System.out.println(f);
    }
}