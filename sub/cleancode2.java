import java.util.*;

public class EpamCleancode {

	static Scanner scan=new Scanner(System.in);
	public static int area(String standardmaterial1,int areaofthesite1,String automatedornot1)
	{
		
		int r=-1;
		if(standardmaterial1.equals("standard materials"))
		{
			if(!automatedornot1.equals("fully automated"))
				r=1200;
			else
			{
				r=0;
			}
		}
		else if(standardmaterial1.equals("above standard"))
		{
			if(!automatedornot1.equals("fully automated"))
				r=1500;
			else
			{
				r=0;
			}
		}
		else if(standardmaterial1.equals("high standard"))
		{
			if(automatedornot1.equals("fully automated"))
				r=2500;
			else
				r=1800;
		}	
		int total=r*areaofthesite1;
		return (total);
	}
	public static void main(String[] args) {
		int ans=-1;
		String auto=scan.nextLine();
		String material=scan.nextLine();
		int area1=scan.nextInt();
		ans=area(material,area1,auto);
		if(ans==0)
			System.out.println("wrong input");
		else
			System.out.println(ans);
	}

}