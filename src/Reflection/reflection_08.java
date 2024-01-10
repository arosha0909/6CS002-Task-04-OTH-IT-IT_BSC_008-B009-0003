package Reflection;

import java.text.DateFormat.Field;

public class reflection_08 {
	public static void main(String[] args) throws Exception {
        Simple s = new Simple();
        java.lang.reflect.Field[] fields = s.getClass().getDeclaredFields();
        System.out.printf("There are %d fields\n", fields.length);
        for(java.lang.reflect.Field f : fields) {
            f.setAccessible(true);
            int x = f.getInt(s);
            x++;
            f.setInt(s, x);
            System.out.printf("field name=%s type=%s value=%d\n",
                f.getName(), f.getType(), f.getInt(s));
        }
    }

}
