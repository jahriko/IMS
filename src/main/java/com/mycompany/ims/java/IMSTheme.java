package com.mycompany.ims.java;

import com.formdev.flatlaf.FlatIntelliJLaf;

public class IMSTheme
	extends FlatIntelliJLaf
{
	public static final String NAME = "IMSTheme";

	public static boolean setup() {
		return setup( new IMSTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, IMSTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
