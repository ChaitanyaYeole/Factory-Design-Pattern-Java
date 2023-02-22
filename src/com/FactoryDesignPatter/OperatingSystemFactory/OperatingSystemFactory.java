package com.FactoryDesignPatter.OperatingSystemFactory;

public class OperatingSystemFactory {
	
	public OS getInstance(String os){
		if(os.equals("Open")) {
			return new Android();
		}
		else if(os.equals("Closed")) {
			return new IOS();
		}
		else {
			return new Windows();
		}
	}

}
