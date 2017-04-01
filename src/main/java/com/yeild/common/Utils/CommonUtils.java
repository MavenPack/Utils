package com.yeild.common.Utils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CommonUtils {
	
	public static String getExceptionInfo(Throwable e){
		return getExceptionInfo(e, true);
	}
	
	public static String getExceptionInfo(Throwable e, boolean byDetail){
		String msg;
		if(byDetail) {
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			e.printStackTrace(new PrintStream(outputStream));
			msg = outputStream.toString();
		}
		else {
			msg = e.getMessage();
		}
		return msg;
	}
}
