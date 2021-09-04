package com.ataev.file;

import com.ataev.Array.MyArray;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Ataev Ismayyl
 * */

public class PersonDataReadFile {
    /**
     * @param newPerson
     * мы знаем откуда читать как читать и куда читать я так думаю
     * создаем объект ObjectInputStream в конструктор передаем новый объект FileInputStream
     * в конструктор передаем путь файла или объект File
     * проверяем пуст ли аргумент если нет то, обнуляем иначе десерелизуем объект
     * и, возвращаем
     * @return newPerson
     */

    public MyArray getMyArrayData(MyArray newPerson) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personArr.txt"))) {
            if (!newPerson.isEmpty()) {
                newPerson = null;
            }
            newPerson = ((MyArray) ois.readObject());
            ois.close();
        } catch (Exception ex) {
            // логерры не надо использовать в try catch,
            // выводить на консоль нету смысла т.к исп логерры
        }
        return newPerson;
    }
}