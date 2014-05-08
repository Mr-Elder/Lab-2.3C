public class Lab2_3C {
    
  	public static void main(String[] args)
  	{
  		int feet = GetInfo.getSlider("Enter feet:", 5, 8);
  		int inches = GetInfo.getSlider("Enter inches:",0, 11);
  		
  		int totalInches= ((feet-5)*12) + inches;
  		
  		int maleWeight = 106 + totalInches*6;
  		int womenWeight = 100 + totalInches*5;
  		
  		int womenOkDown = (int)(womenWeight-womenWeight*.15);
  		int womenOkUp = (int)(womenWeight+womenWeight*.15);
  		
  		int maleOkDown = (int)(maleWeight-maleWeight*.15);
  		int maleOkUp = (int)(maleWeight+maleWeight*.15);
  		
  		GetInfo.showMessage("Ideal female weight:" + womenWeight + "\nIdeal male weight:" + maleWeight + "\nRange for women weight:" + womenOkDown + "-" + womenOkUp + "\nRange for male weight:" + maleOkDown + "-" + maleOkUp );
  		
  		//GetInfo.showMessage("Women pounds:" + womenWeight + "\nMale pounds:" + maleWeight);
  		
  	}
    
}