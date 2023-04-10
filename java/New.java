public class New {
    public static void main(String args[]){
        // for(int i=0;i<args.length;i++){
        //     System.out.println(args[i]+"\t"+args[i].length()+"\t"+args[i].charAt(0)+"\t"+args[i].indexOf("a"));
        // }
        for(String v : args){
            System.out.println(v+"\t"+v.length()+"\t"+v.charAt(0)+"\t"+v.indexOf("a"));
        }
    }
    
}
