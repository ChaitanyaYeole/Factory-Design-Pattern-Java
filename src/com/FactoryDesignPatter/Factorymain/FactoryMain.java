package com.FactoryDesignPatter.Factorymain;

import com.FactoryDesignPatter.OperatingSystemFactory.OS;
import com.FactoryDesignPatter.OperatingSystemFactory.OperatingSystemFactory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperatingSystemFactory osf=new OperatingSystemFactory();
		
		OS os=osf.getInstance("windows");
		os.specs();

	}

}
