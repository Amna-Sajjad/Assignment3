
import java.util.Scanner;

public class TestShape {
	public static void main(String args[]) {
		int choice,option;
		char check;
		Shape sh[]=new Shape[10];
		int index=0;
		double rad,len,wid,side;
		String color;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.print("1. Enter new Shape\n"
					+ "2. Display Shape\n"
					+ "3. Exit\n"
					+ "Enter your choice:");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				do
				{
					System.out.print("1. New Circle\n"
							+ "2. New Rectangle\n"
							+ "3. New Square\n"
							+ "4. Back to main menu\n"
							+ "Enter Choice:");
					option=s.nextInt();
					switch(option)
					{
					case 1:
						System.out.print("Enter Radius: ");
						rad=s.nextDouble();
						System.out.print("Do you want to Enter color (Y/N)?");
						check=s.next().charAt(0);
						if(check=='y'||check=='Y')
						{
							System.out.print("Enter Color: ");
							s.nextLine();
							color=s.nextLine();
							sh[index]=new Circle(rad,color,true);
						}
						else
							sh[index]=new Circle(rad);
						index++;
						break;
					case 2:
						System.out.print("Enter Length: ");
						len=s.nextDouble();
						System.out.print("Enter Width: ");
						wid=s.nextDouble();
						System.out.print("Do you want to Enter color (Y/N)?");
						check=s.next().charAt(0);
						if(check=='y'||check=='Y')
						{
							System.out.print("Enter Color: ");
							s.nextLine();
							color=s.nextLine();
							sh[index]=new Rectangle(len,wid,color,true);
						}
						else
							sh[index]=new Rectangle(len,wid);
						index++;
						break;
					case 3:
						System.out.print("Enter Side: ");
						side=s.nextDouble();
						System.out.print("Do you want to Enter color (Y/N)?");
						check=s.next().charAt(0);
						if(check=='y'||check=='Y')
						{
							System.out.print("Enter Color: ");
							s.nextLine();
							color=s.nextLine();
							sh[index]=new Square(side,color,true);
						}
						else
							sh[index]=new Square(side);
						index++;
						break;
					case 4:
						break;
						default:
							System.out.println("Wrong Choice");
					}
				}while(option!=4);
				break;
			case 2:
				do
				{
					System.out.println("1. Circle\n"
							+ "2. Rectangle\n"
							+ "3. Square\n"
							+ "4. Back to main menu\n"
							+ "Enter Choice:");
					option=s.nextInt();
					for(int i=0;i<index;i++)
					{
						switch(option)
						{
						case 1:
							if(sh[i] instanceof Circle)
							{
								System.out.println(sh[i]);
								System.out.println("Area : "+sh[i].getArea());
								System.out.println("Perimeter : "+sh[i].getPerimeter());
							}
							break;
						case 2:
							if(sh[i] instanceof Rectangle && !(sh[i] instanceof Square))
							{
								System.out.println(sh[i]);
								System.out.println("Area : "+sh[i].getArea());
								System.out.println("Perimeter : "+sh[i].getPerimeter());
							}
							break;
						case 3:
							if(sh[i] instanceof Square)
							{
								System.out.println(sh[i].toString());
								System.out.println("Area : "+sh[i].getArea());
								System.out.println("Perimeter : "+sh[i].getPerimeter());
							}
							break;
						case 4:
							break;
							default:
								System.out.println("Wrong Choice");
						}
					}
				
				}while(option!=4);
				break;
			case 3:
				System.exit(0);
				break;
				default:
					System.out.println("Wrong Choice");
			}
		}while(choice!=3);
		s.close();	
	}
	
}
