import java.util.*;
class Map1
{
	public static void main(String args[])
	{
		Map<String,Integer> info=new HashMap<String,Integer>();
        Set<Map.Entry<String,Integer>> s = info.entrySet();
		info.put("a",100);
		info.put("b",200);
		info.put("c",300);
		info.put("d",400);
		System.out.println(info);
		System.out.println(s);
        System.out.println(info.get("c"));
        info.replace("d",1000);
        System.out.println(info.get("d"));
	}
}
