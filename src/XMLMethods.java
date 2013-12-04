// XmlRPC methods available to other hosts in network
public class XMLMethods {

    // return list of IP addresses of the hosts in network
    public String[] getAddressList(String address) {
        String[] list = Main.form.getAddressList(address);        
        return list;
    }
    // add the address of the client to the list of hosts in network
    public int signInClient(String address) {
        int ret = Main.form.signInClient(address);        
        return ret;
    }
    // remove the address of the client from the list of hosts in network
    public int signOutClient(String address) {
        int ret = Main.form.signOutClient(address);        
        return ret;
    }       
    // add a row of data received from a host to the table
    public int addRowClient(int id,String date,String time,
                    String duration,String header,String comment){
        
        Main.form.addRowClient(id, date, time, duration, header, comment);
        Main.form.updateTable(); // update the display
        return 0;
    }    
    // returns all data from table, client calls this method when signing to the network
    // data is sent in an one dimensionl array, two dimension array didn't work with xmlrpc
    public String[] getTableData(String address){
        String[] ret = null;
        ret = Main.form.getTableData();
        return ret;
    }
    // edit a row in the table by id, only nonempty fields are updated
    public int editRowClient(int id,String date,String time,String duration,String header,String comment){
        Main.form.editMyTable(id,date,time,duration,header,comment);
        Main.form.updateTable(); 
        return 0;
    }
    // delete a row from the table
    public int delRowClient(int id){
        Main.form.delRowLocal(id);
        Main.form.updateTable();
        return 0;
    }    
}
