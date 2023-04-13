import javax.swing.*;  
public class Example {  
    Example(){  
        JFrame f = new JFrame();  
        
        JLabel firstName = new JLabel("Enter Number");  
        firstName.setBounds(20, 50, 80, 20);  
        
        JTextField firstNameTF = new JTextField();  
        firstNameTF.setBounds(120, 50, 100, 20);  
        
        JButton sbmt = new JButton("Submit");  
        sbmt.setBounds(20, 160, 100, 30);  
        
        JButton reset = new JButton("Reset");  
        reset.setBounds(120,160,100,30);  
        
        f.add(firstName);    
        f.add(firstNameTF);  
        f.add(sbmt);  
        f.add(reset);  
         
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  

    public static void main(String[] args) { 
        Example s = new Example();  
    }  
}  