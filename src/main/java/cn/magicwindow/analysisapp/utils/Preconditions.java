package cn.magicwindow.analysisapp.utils;


import java.util.List;
import java.util.Map;

/**
 * Created by Tony Shen on 15/11/12.
 */
public class Preconditions {

    /**
     *  可以判断任何一个对象是否为空,包括List Map String 复杂对象等等,
     *  只能判断对象,而不能判断基本数据类型
     * @param t
     * @param <T>
     * @return
     */
    public static <T> boolean isBlank(T t) {

        boolean result = false;

        if (t==null) {
            return true;
        }


        if (t instanceof List) {
            if (((List) t).size()==0) {
                return true;
            }
        } else if (t instanceof Map) {
            if (((Map) t).size()==0) {
                return true;
            }
        } else if (t instanceof Object []) {
            if (((Object[]) t).length==0) {
                return true;
            }
        } else if (t instanceof String) {
            String str = (String)t;
            if (str.length()==0) return true;

            str = str.trim();
            if (str.length()==0) return true;
        }

        return result;
    }

    public static <T> boolean isNotBlank(T t) {
        return !isBlank(t);
    }
}
