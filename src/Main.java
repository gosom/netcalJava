public class Main {

    protected static Calendar form;

    private static String myAddress = "127.0.0.1:8000";
    private static String serverAddress = ""; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length > 0) Main.myAddress = args[0];        
        if(args.length > 1) Main.serverAddress = args[1];
        else serverAddress = "";
        form = new Calendar(myAddress,serverAddress);        
        form.setTitle("a2");
        form.setVisible(true);    
    }
}
