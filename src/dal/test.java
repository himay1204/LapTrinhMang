

package dal;

import java.util.ArrayList;
import java.util.List;
import model.Floor;

public class test {
    public static void main(String[] args) {
       FloorDAO fdb = new FloorDAO();
        System.out.println(fdb.getAllFloors());
    }
}
