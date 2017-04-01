package com.yeild.common.Utils;
import java.util.List;

public class ConvertUtils {
	public static int parseInt(String numStr) {
		return parseInt(numStr, 0);
	}
	
	public static int parseInt(String numStr, int defaultValue) {
		try {
			return Integer.parseInt(numStr);
		} catch (Exception e) {
			return defaultValue;
		}
	}
	
	public static long parseLong(String numStr) {
		return parseLong(numStr, 0);
	}
	
	public static long parseLong(String numStr, long defaultValue) {
		try {
			return Long.parseLong(numStr);
		} catch (Exception e) {
			return defaultValue;
		}
	}
	
	public static boolean parseBoolean(String numStr) {
		return parseBoolean(numStr, false);
	}
	
	public static boolean parseBoolean(String numStr, boolean defaultValue) {
		try {
			return Boolean.parseBoolean(numStr);
		} catch (Exception e) {
			return defaultValue;
		}
	}
	
    //高位在前，低位在后
    public static long bytesToInt(byte[] bytes){
    	long result=0;
		for(int i=0;i<bytes.length;i++) {
			result |= (long)((bytes[i]&0xff))<<(8*(bytes.length-i-1));
		}
        return result;
    }
    public static long bytesToInt(List<Byte> bytes){
    	long result=0;
		for(int i=0;i<bytes.size();i++) {
			result |= (long)((bytes.get(i)&0xff))<<(8*(bytes.size()-i-1));
		}
        return result;
    }
	
	/**
	 * long 转换为4字节byte
	 * @param num
	 * @return
	 */
    public static byte[] int4ToBytes(long num){
        byte[] result = new byte[4];
        result[0] = (byte)((num >>> 24) & 0xff);
        result[1] = (byte)((num >>> 16)& 0xff );
        result[2] = (byte)((num >>> 8) & 0xff );
        result[3] = (byte)((num >>> 0) & 0xff );
        return result;
    }
	
	/**
	 * long 转换为2字节byte
	 * @param num
	 * @return
	 */
    public static byte[] int2ToBytes(long num){
        byte[] result = new byte[2];
        result[0] = (byte)((num >>> 8) & 0xff );
        result[1] = (byte)((num >>> 0) & 0xff );
        return result;
    }
	
	/**
	 * long 转换为1字节byte
	 * @param num
	 * @return
	 */
    public static byte intToBytes(long num){
        byte result = (byte)((num >>> 0) & 0xff );
        return result;
    }
    
    public static byte[] listToArray(List<Byte> datas) {
    	if(datas == null) {
    		return null;
    	}
    	byte[] result = new byte[datas.size()];
    	for(int i=0;i<datas.size();i++) {
    		result[i] = (byte)(datas.get(i)&0xff);
    	}
    	return result;
    }
	
	public static String BinaryToHexString(List<Byte> bytes) {
        StringBuffer result = new StringBuffer();
		for(byte b:bytes) {
			if(result.length() > 0) {
				result.append(" ");
			}
			String hex = Integer.toHexString(b&0xff);
			result.append((hex.length()<2?"0":"")+hex);
		}
        return result.toString();
    }
	
	public static String BinaryToHexString(byte[] bytes) {
        StringBuffer result = new StringBuffer();
		for(byte b:bytes) {
			if(result.length() > 0) {
				result.append(" ");
			}
			String hex = Integer.toHexString(b&0xff);
			result.append((hex.length()<2?"0":"")+hex);
		}
        return result.toString();
    }
}
