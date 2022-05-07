import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox; 
import javafx.scene.paint.Color;  
import javafx.scene.shape.Polygon;  
import javafx.scene.text.Font; 
import javafx.scene.text.Text; 
import javafx.stage.Stage;
import javafx.util.Pair;
import javafx.geometry.Pos;

import java.util.ArrayList;


public class Shapes extends Application {
	NumOfSides sides = new NumOfSides();
	Group group = new Group();
	double yRandCoordinate;
	double xRandCoordinate;
	Polygon polygon = new Polygon();
	ArrayList<Pair<Integer, Integer>> xBound=new ArrayList<Pair<Integer, Integer>>();
	ArrayList<Pair<Integer, Integer>>  yBound=new ArrayList<Pair<Integer, Integer>>();
	ArrayList <Integer> xyBoundHold= new ArrayList<Integer>();
	int xMin=0;
	int xMax=0;
	int yMin=0;
	int yMax=0;
	int xLowerPoint=0;
	int xUpperPoint=0;
	int yLowerPoint=0;
	int yUpperPoint=0;
	int RandHold=0;
	int yRandHold=0;
  
    
	@Override
	public void start(Stage stage)
	{	
		//Creating the shapes
		
		//A field called sides to take in numbers 4 to 8
		TextField sidesField = new TextField();         
		sidesField.setMaxWidth(50);
		sidesField.setMaxHeight(50);
		
		//Field to display the shape
		TextArea display = new TextArea();        
		display.setEditable(false);         
		display.setMinSize(300,100);         
		display.setMaxSize(300,100);
		
		
		//label asking use to enter a number between 4 & 8  
		Text instructionTyped = new Text("Typed entry creates shapes with sides from 4 to 8");
		Text instructionButton = new Text("Buttons add or remove sides of shapes upuntil 4 or 8");
		instructionTyped.setFill(Color.BLACK);
		instructionTyped.setFont(Font.font("Arial", 15));
		instructionButton.setFill(Color.BLACK);
		instructionButton.setFont(Font.font("Arial", 15));
		
		// ----Number of Sides label for num of sides display
		Text  sidesIndicatorLable = new Text("Enter number of sides: ");
		sidesIndicatorLable.setFill(Color.GREEN);
		sidesIndicatorLable.setFont(Font.font("Arial", 15));
		
		//----Information box label-------------------
		Text  infoLabel = new Text("Information Box: ");
		infoLabel.setFill(Color.BLUE);
		infoLabel.setFont(Font.font("Arial", 15));
		
		//----Information box container -------------------
		HBox containerInfoBox = new HBox(10);
		containerInfoBox.setAlignment(Pos.TOP_CENTER);
		containerInfoBox.getChildren().addAll(infoLabel,display);
	

		//container for label of display sides box
		HBox numOfSidesDisBox = new HBox(10);
		numOfSidesDisBox.setAlignment(Pos.TOP_CENTER);
		numOfSidesDisBox.getChildren().addAll(sidesIndicatorLable,sidesField);
		
		//code for buttons
		Button numOfSidesButton = new Button("Create Polygon");
		Button plusOne = new Button("+1 number of sides");
		Button minusOne = new Button("-1 number of sides");
		
		//container for buttons
		HBox buttonBox = new HBox(10);
		buttonBox.setAlignment(Pos.TOP_CENTER);
		buttonBox.getChildren().addAll(numOfSidesButton,plusOne,minusOne);
		
		
		//Event handling---------text input-------------------------------------------------------------------------------------------
		numOfSidesButton.setOnAction(e-> 
						{group.getChildren().clear();
						sides.resetOverflow();
						try
						{  
							polygon.getPoints().clear();
							sides.setnumSides(sidesField.getText());
							group.getChildren().clear();
	
							display.clear();
							if(sides.getnumSides()>=4 && sides.getnumSides()<=8 )
							{ 	
//Standard double for loop for 2D iteration
								
								for(int i=1;i<=6;i++)
								{
									for (int j=1; j<=6;j++)
									{
										xMax = i*100;
										xMin = xMax-100+1;
										
										//Add pair into arrayList
										xBound.add(new Pair<Integer, Integer>(xMin,xMax));
										
										yMax = j*100;
										yMin = yMax-100+1;
										
										//Add a pair into arraylist
										yBound.add(new Pair<Integer, Integer>(yMin,yMax));
										
									}
								}
										
								
								for(int n=1;n<=(sides.getnumSides());n++)
								{ 				
									
									
									do {
										
									RandHold=(int) Math.floor(Math.random()*(36-0)-0);
									
									}while(xyBoundHold.contains(RandHold));
									
									xyBoundHold.add(RandHold);
									
									xLowerPoint=(int) ((Pair<?, ?>)xBound.get(RandHold)).getKey();
									xUpperPoint=(int) ((Pair<?, ?>)xBound.get(RandHold)).getValue();
									
									
									yLowerPoint=(int)  ((Pair<?, ?>)yBound.get(RandHold)).getKey();
									yUpperPoint=(int)  ((Pair<?, ?>)yBound.get(RandHold)).getValue();
									
									xRandCoordinate =Math.floor(Math.random()*((xUpperPoint-xLowerPoint)+1)+xLowerPoint);
									polygon.getPoints().add((double) xRandCoordinate);
									
								
									yRandCoordinate = java.lang.Math.abs(Math.floor(Math.random()*((yUpperPoint-yLowerPoint)+1)+yLowerPoint));
									polygon.getPoints().add((double) yRandCoordinate);
							
									xyBoundHold.clear();
									
									System.out.println("xlower - xUpperPoint \t ylower-yupper \t Xmath \t Ymath");
									System.out.println(xLowerPoint+"\t=\t"+xUpperPoint+"     "+yLowerPoint +" =  "+ yUpperPoint +"\t"+ xRandCoordinate+"\t"+yRandCoordinate);
									
									
								}
								if(sides.getnumSides()%2==0)
								{
									polygon.setStroke(Color.BLACK);
									polygon.setFill(Color.YELLOW);
								}
								else if (sides.getnumSides()%2!=0)
								{
									polygon.setStroke(Color.BLACK);
									polygon.setFill(Color.GREEN);
								}
								group.getChildren().add(polygon);
								display.setText("Number of Sides of the Shape is " + sides.getnumSides()+".\nPlease be aware, due to the nature of the algorithm angles may be extremely acute or obtuse. If so please rerun");	
								display.setWrapText(true);
							}
							else
								display.setText("Please enter an integer from 4 to 8");	
						}
						
		//-----Section of error handling typed input--------------------------------------------------------------------------------------
						catch (Exception e1)
						{   
							
							try 
							{	
							      if(Double.valueOf(sidesField.getText()) != null)
							          {
							       display.setText("Decimal: "+ Double.valueOf(sidesField.getText())+ " "
							       		+ "entered. only whole numbers from 4 to 8 accepted");
							          }
							}
							catch (Exception e2)
							{
								if(sidesField.getText().isBlank())
									display.setText("Nothing entered. Please enter whole numbers from 4 to 8");
								else
									display.setText("Entered: "+sidesField.getText()+". "
											+ "Please enter whole numbers from 4 to 8");
								
							}
							
						}
						
				
		
		});
		//Event handling--------- Increase the number of sides --- button input--------------------------------------------------------
		plusOne.setOnAction(e-> 
							    { try {
							    	sides.setnumSides(sidesField.getText());
							    
							    	
							    	if (sides.getnumSides()>= 4 && sides.getnumSides()<8 && group.getChildren().isEmpty()==false) //Will take in up-to 7 sides and reject 8 and above. at the boundary 7 will be accepted and 8 returned 
							    
							      {
								    	  
							    	sides.resetUnderflow();
								    group.getChildren().clear();
								
								    display.clear();
											
										
										
										do {
											
										RandHold=(int) Math.floor(Math.random()*(36-0)-0);
										
										
										}while(xyBoundHold.contains(RandHold));
										
										xyBoundHold.add(RandHold);
										
										xLowerPoint=(int) ((Pair<?, ?>)xBound.get(RandHold)).getKey();
										xUpperPoint=(int) ((Pair<?, ?>)xBound.get(RandHold)).getValue();
										
										
										yLowerPoint=(int)  ((Pair<?, ?>)yBound.get(RandHold)).getKey();
										yUpperPoint=(int)  ((Pair<?, ?>)yBound.get(RandHold)).getValue();
										
										xRandCoordinate =Math.floor(Math.random()*((xUpperPoint-xLowerPoint)+1)+xLowerPoint);
										polygon.getPoints().add((double) xRandCoordinate);
										
									
										yRandCoordinate = java.lang.Math.abs(Math.floor(Math.random()*((yUpperPoint-yLowerPoint)+1)+yLowerPoint));
										polygon.getPoints().add((double) yRandCoordinate);
										
									
										
										System.out.println("xlower - xUpperPoint \t ylower-yupper \t Xmath \t Ymath");
										System.out.println(xLowerPoint+"\t=\t"+xUpperPoint+"     "+yLowerPoint +" =  "+ yUpperPoint +"\t"+ xRandCoordinate+"\t"+yRandCoordinate);
										
										xyBoundHold.clear();
									
								    
								    
								    
								    sides.plusNumberofsides();
									if(sides.getnumSides()%2==0)
									{
										polygon.setStroke(Color.BLACK);
										polygon.setFill(Color.YELLOW);
									}
									else if (sides.getnumSides()%2!=0)
									{
										polygon.setStroke(Color.BLACK);
										polygon.setFill(Color.GREEN);
									}
									
									sidesField.setText(Integer.toString(sides.getnumSides()));
									group.getChildren().add(polygon);
									System.out.println("plusone: "+sides.getnumSides());
									display.setText("Number of Sides of the Shape is " + sides.getnumSides()+".\nPlease be aware, due to the nature of the algorithm angles may be extremely acute or obtuse. If so please rerun");	
									display.setWrapText(true);
								
							     }
								 else if (sides.getnumSides()==8)
									{//sidesField.setText(Integer.toString(sides.getnumSides()));
									 
									 display.setText("Shapes with sides 4 to 8 are accepeted. Yor tried to create a shape with "+sides.getOverflow() +" sides");
									 display.setWrapText(true);
									}
								 else 
								 	{//sidesField.setText(Integer.toString(sides.getnumSides()));
									 
									 display.setText("Cannot create a shape. First type in a acceptable number and then click 'Create Ploygon button'");
									 display.setWrapText(true);
									}
									 
							    }
							   catch (Exception e3)
								    {
								    polygon.getPoints().clear();
							    	group.getChildren().clear();
							    	sides.resetnumSides();
								    display.setText("Please enter an acceptable whole number in the entry box and click on 'Create Ploygon'");
							    	display.setWrapText(true);
							    	}
								 
									 
									
							    });
		//Event handling--------- decrease the number of sides----button input--------------------------------------------------------
		minusOne.setOnAction(e-> 
							{
							  try{
							    	sides.setnumSides(sidesField.getText());
								
								if(sides.getnumSides()>4 && group.getChildren().isEmpty()==false) //Will take in up-to 5 sides and reject 4 and below. At the boundary 5 will be accepted and 4 returned
								
								{
								sides.resetOverflow();
								group.getChildren().clear();
								display.clear();
									for(int i=0;i<=1;i++)
									  {
										polygon.getPoints().remove(1);
										
								      }
									sides.minusNumberofsides();
									if(sides.getnumSides()%2==0)
									 {
										polygon.setStroke(Color.BLACK);
										polygon.setFill(Color.YELLOW);
									 }
									else if (sides.getnumSides()%2!=0)
									{
										polygon.setStroke(Color.BLACK);
										polygon.setFill(Color.GREEN);
									}
								
								sidesField.setText(Integer.toString(sides.getnumSides()));
								group.getChildren().add(polygon); 
								System.out.println("minusOne: "+sides.getnumSides());
								display.setText("Number of Sides of the Shape is " + sides.getnumSides()+".\nPlease be aware, due to the nature of the algorithm angles may be extremely acute or obtuse. If so please rerun");
								display.setWrapText(true);
								}
								else if (sides.getnumSides()==4)
								{
									display.setText("Shapes with sides 4 to 8 are accepeted. Yor tried to create a shape with "+ sides.getUnderflow() +" sides");
								}
								else 
							 	{
								 
								 display.setText("Cannot create a shape. First type in a acceptable number and then click 'Create Ploygon button'");
								 display.setWrapText(true);
								}
								}
								catch (Exception e4)
									{
									
									display.setText("Please enter an acceptable whole number in the entry box and click on 'Create Ploygon'");
							    	display.setWrapText(true);
							    	
									}
								 
									
							});
		
		//VBox to bring components together
		VBox root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(instructionTyped,instructionButton,numOfSidesDisBox,buttonBox,group,containerInfoBox);
	
		
		// creating a scene
		Scene scene = new Scene(root,800,800);

		
		//setting the stage
		stage.setScene(scene);
		stage.setTitle("PloygonGUI");
		stage.sizeToScene();
		
		///----showing the stage----------
		stage.show();
		
	}
		
	
	public static void main(String[] args)
	{
		launch(args);
		
	
	}

}
