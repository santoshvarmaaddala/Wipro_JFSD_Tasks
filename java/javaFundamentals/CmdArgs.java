class CmdArgs {
    public static void main(String[] args) {
        int l = args.length;
        if (l == 0){
            System.out.println("No Values");
        }else{
            for(int i=0; i<l;i++){
                System.out.println(args[i]);
		System.out.println("\t");
                
            }
        }
        
    }
}