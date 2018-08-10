import jdk.nashorn.internal.runtime.logging.Logger;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghao
 * @create 2018-07-30 上午10:32
 **/
public class Demo02 {

    @Test
    public void before() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        int leng =list.size();
        for (int i = 1; i < leng; i++)
        {
            System.out.println(list.size());
            list.remove(2);
        }

    }
}
