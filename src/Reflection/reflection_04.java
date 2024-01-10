package Reflection;

import java.lang.reflect.Field;

public class reflection_04 {
	public static void main(String [] args) throws Exception{
		Simple s =new Simple();
		Field [] fields = s.getClass().getFields();
		System.out.printf("There are %d field\n",fields.length);
		for(Field f : fields) {
			System.out.printf("field name =%s type=%s value=%d \n",f.getName(),f.getType(),f.getInt(s));
		}
	}

}
