package org.example.lesson6.homework.services;

import org.example.lesson6.homework.data.Staffs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaffData implements CreateService, ReaderService, RecordService {
    List<Staffs> staffBaseList = new ArrayList<>();

    @Override
    public void create(Staffs staff) {
        staffBaseList.add(staff);
    }

    @Override
    public List<Staffs> read() {
        return staffBaseList;
    }

    @Override
    public void recBaseFile() {
        try (FileWriter writer = new FileWriter("BaseStaff.txt", true)) {
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
        try (FileReader reader = new FileReader("BaseStaff.txt")) {
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
