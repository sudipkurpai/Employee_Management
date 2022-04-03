/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management;

/**
 *
 * @author ganesh_pradhan
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Splash sp = new Splash();
        try {
        int i;
        for(i=0; i<=100;i++){
                          Thread.sleep(40);
                          
                          sp.setVisible(true);
                         
         sp.pb.setValue(i);
         sp.per.setText(Integer.toString(i)+" %");
        
        if(i==100){
            sp.setVisible(false);
            
            Login h = new Login();
            h.setVisible(true);
            sp.setVisible(false);
        }
        }
    
    }catch(Exception e){
System.out.println(e);
}
    }  
}
