package org.example.lesson5.homework.model;

import org.example.lesson5.homework.data.Staff;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserData implements DataService {

    List<Staff> staffBaseList = new ArrayList<>();

    @Override
    public void create(Staff staff) {
        staffBaseList.add(staff);
    }

    @Override
    public List<Staff> read() {
        return staffBaseList;
    }

    @Override
    public void recBaseFile() {
        try (FileWriter writer = new FileWriter("StaffBase.txt", true)) {
            // запись всей строки
            String text = staffBaseList.toString();
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void readerBaseFile() {
        try (FileReader reader = new FileReader("StaffBase.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {

                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}