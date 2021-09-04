package com.ataev.file;

import com.ataev.Array.MyArray;
import com.ataev.person.Person;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Ataev Ismayyl
 * */

public class PersonDataWriteFile {

    /**
     * метод main
     * создаем объект ObjectOutputStream, передаем в конструктор FileOutputStream
     * FileOutputStream в конструктор передаем путь к файлу
     * затем добовляем в коллекцию новые данные
     * серелезуем объект затем закрываем поток
     */

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personArr.txt"))) {
            MyArray array = new MyArray();
            array.add(new Person(23, "Kamar"));
            array.add(new Person(33, "Ivan"));
            array.add(new Person(20, "Ali"));
            array.add(new Person(21, "Arslan"));
            array.add(new Person(35, "Kemal"));
            array.add(new Person(22, "Aman"));
            oos.writeObject(array);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
