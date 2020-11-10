package prova2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class FirstFX1 extends Application {
    Label labell1;
    Label labell2;
    Label labell3;
    Label labell4;
    int a=0;
    int b;
    double c;
    double f;
    double g=0;
    int h=0;
    String d="0";
    String m="0";
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6; 
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13; 
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    	public static void main(String[] args) {
    	launch(args);
    	}
    @Override
    public void start (Stage stage) throws Exception {
	Pane ancor = new Pane();
	stage.setTitle("Calcolatrice");
    	labell1 = new Label("");
    	labell2 = new Label("");
    	labell3 = new Label("");
    	labell4 = new Label("");
	    labell4.setFont(Font.font ("Verdana", 20));
    	button1 = new Button(" +");
        button1.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
    			a=90;
    			labell2.setText("+");
    		}
    	});
    	button2 = new Button(" - ");
    	 button2.setOnAction(new EventHandler<ActionEvent>(){
     		public void handle(ActionEvent event) {
     			a=91;
    			labell2.setText("-");
     		}
     	}); 	
    	button3 = new Button(" * ");
    	 button3.setOnAction(new EventHandler<ActionEvent>(){
      		public void handle(ActionEvent event) {
      			a=92;
    			labell2.setText("*");
      		}
    	 });
    	button4 = new Button(" / ");
    	 button4.setOnAction(new EventHandler<ActionEvent>(){
      		public void handle(ActionEvent event) {
      			a=93;
    			labell2.setText("/");
      		}
    	 });
    	button5 = new Button("Clear");
    	 button5.setOnAction(new EventHandler<ActionEvent>(){
      		public void handle(ActionEvent event) {
      			a=0;
      			b=0;
      			g=0;
      			f=0;
      			c=0;
      			m="0";
      			d="0";
      			h=0;
      			labell1.setText("");
      			labell2.setText("");
      			labell3.setText("");
      			labell4.setText("");
      		}
      	});
    	button6 = new Button("       =      ");
	    button6.setFont(Font.font ("Verdana", FontWeight.BOLD, 13));

    	button6.setOnAction(new EventHandler<ActionEvent>(){
      		public void handle(ActionEvent event) {
      			if(a==90 && h==0) {
      				g=f+c;
      				a=0;
      				d="0";
      				m="0";
      				h=1;  
          			f=0;
  	      			m="0";
  	      			labell4.setText(""+g);
      			}
      			else if(a==91 && h==0) {     				
      				g=f-(c);
      				a=0;
      				d="0";
      				m="0";
      				h=1; 
          			f=0;
  	      			m="0";
  	      			labell4.setText(""+g);
      			}
      			else if(a==92 && h==0) {
      				g=f*c;
      				a=0;
      				d="0";
      				m="0";
      				h=1;
          			f=0;
  	      			m="0";
  	      			labell4.setText(""+g);
      			}
      			else if(a==93 && h==0) {
      				g=c / f;
      				a=0;
      				d="0";
      				m="0";
      				h=1;
          			f=0;
  	      			m="0";
  	      			labell4.setText(""+g);
      			}      			
      		else {
      			if(g!=0) {
      				if(a==90) {         				
      					g=g+f;
      	      			a=0;
      	      			f=0;
      	      			m="0";
      	      			labell4.setText(""+g);
      				}
      				else if(a==91) {	
      					g=g-f;
      	      			a=0;
      	      			f=0;
      	      			m="0";
      	      			labell4.setText(""+g);
      				}
      				else if(a==92) {          				
      					g=g*f;
      	      			a=0;
      	      			f=0;
      	      			m="0";
      	      			labell4.setText(""+g);
      				}
      				else if(a==93) {         					
      					g=g/f;
      	      			a=0;
      	      			f=0;
      	      			m="0";
      	      			labell4.setText(""+g);
      				}      				
      				}    			
      		} 
      			labell1.setText("");
      			labell2.setText("");
      			labell3.setText("");     			
      		}
      	
      	});    	
    	button7 = new Button("1");
    	 button7.setOnAction(new EventHandler<ActionEvent>(){
     		public void handle(ActionEvent event) {
     			if(a!=0) {
     				m+="1";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+="1";
     			c=Double.parseDouble(d); 
 				labell1.setText(""+c);

     			}
     		}
     	});
    	button8 = new Button("2") ; 
    	button8.setOnAction(new EventHandler<ActionEvent>(){
     		public void handle(ActionEvent event) {
     			if(a!=0) {
     				m+="2";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+="2";
     			c=Double.parseDouble(d);  
 				labell1.setText(""+c);
     			}
     		}
     	});
    	button9 = new Button("3") ; 
    	button9.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
    		if(a!=0) {
 				m+="3";
 				f=Double.parseDouble(m);
 				labell3.setText(""+f);
 			}
 			else {
 			d+="3";
 			c=Double.parseDouble(d);
				labell1.setText(""+c);
 			}
 		}
 	});
    	button10 = new Button("4") ; 
    	button10.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
        		if(a!=0) {
     				m+="4";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+="4";
     			c=Double.parseDouble(d); 
 				labell1.setText(""+c);
     			}
     		}
     	});
    	button11 = new Button("5") ; 
    	button11.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
        		if(a!=0) {
     				m+="5";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+="5";
     			c=Double.parseDouble(d);
 				labell1.setText(""+c);
     			}
     		}
     	});
    	button12 = new Button("6") ; 
    	button12.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
        		if(a!=0) {
     				m+="6";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+="6";
     			c=Double.parseDouble(d);  
 				labell1.setText(""+c);
     			}
     		}
     	});
    	button13 = new Button("7") ; 
    	button13.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
        		if(a!=0) {
     				m+="7";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+="7";
     			c=Double.parseDouble(d); 
 				labell1.setText(""+c);
     			}
     		}
     	});
    	button14 = new Button("8") ;
    	button14.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
        		if(a!=0) {
     				m+="8";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+="8";
     			c=Double.parseDouble(d); 
 				labell1.setText(""+c);
     			}
     		}
     	});
    	button15 = new Button("9") ;
    	button15.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
        		if(a!=0) {
     				m+="9";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+="9";
     			c=Double.parseDouble(d);
 				labell1.setText(""+c);
     			}
     		}
     	});
    	button16 = new Button("0") ; 
    	button16.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
        		if(a!=0) {
     				m+="0";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+="0";
     			c=Double.parseDouble(d);  
 				labell1.setText(""+c);
     			}
     		}
     	});
    	button17 = new Button(" ,") ;
    	button17.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event) {
    			if(a!=0) {
     				m+=".";
     				f=Double.parseDouble(m);
     				labell3.setText(""+f);
     			}
     			else {
     			d+=".";
     			c=Double.parseDouble(d);  
 				labell1.setText(""+c);
     			}
    			
    		}
    	});
        button1.setLayoutX(200);
        button1.setLayoutY(20);
        button2.setLayoutX(200);
        button2.setLayoutY(50);
        button3.setLayoutX(200);
        button3.setLayoutY(80);
        button4.setLayoutX(200);
        button4.setLayoutY(110);
        button5.setLayoutX(145);
        button5.setLayoutY(110);
        button6.setLayoutX(140);
        button6.setLayoutY(140);
        button7.setLayoutX(110);
        button7.setLayoutY(20);
        button8.setLayoutX(140);
        button8.setLayoutY(20);
        button9.setLayoutX(170);
        button9.setLayoutY(20);
        button10.setLayoutX(110);
        button10.setLayoutY(50);
        button11.setLayoutX(140);
        button11.setLayoutY(50);
        button12.setLayoutX(170);
        button12.setLayoutY(50);
        button13.setLayoutX(110);
        button13.setLayoutY(80);
        button14.setLayoutX(140);
        button14.setLayoutY(80);
        button15.setLayoutX(170);
        button15.setLayoutY(80);
        button16.setLayoutX(110);
        button16.setLayoutY(110);
        button17.setLayoutX(110);
        button17.setLayoutY(140);
        labell1.setLayoutX(275);
        labell1.setLayoutY(40);
        labell2.setLayoutX(275);
        labell2.setLayoutY(70);
        labell3.setLayoutX(275);
        labell3.setLayoutY(100);
        labell4.setLayoutX(240);
        labell4.setLayoutY(140);
        ancor.getChildren().addAll(button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,labell1,labell2,labell3,labell4); 
        Scene scene = new Scene(ancor, 380,190);
    	stage.setScene(scene);
   	    stage.show();
      } 
}
    
    
  



    
    