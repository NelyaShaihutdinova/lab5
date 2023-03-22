package org.example;


import org.example.command.Invoker;
import org.example.entities.CollectionController;
import org.example.entities.HumanBeing;
import org.example.entities.HumanBeings;
import org.example.xmlParser.Reader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Неля\\IdeaProjects\\lab5-maven\\src\\main\\java\\org\\example\\lab5");
        Reader reader = new Reader(file);
        HumanBeings humanBeings = reader.getPersons();
        CollectionController cc = new CollectionController();
        cc.addAll(humanBeings);
//        System.out.println(reader.getPersons());
        HumanBeing humanBeing = new HumanBeing();
        HumanBeing humanBeing1 = new HumanBeing();
        HumanBeing humanBeing2 = new HumanBeing();
        HumanBeing humanBeing3 = new HumanBeing();

        humanBeing.setName("a");
        humanBeing1.setName("fjdjs");
        humanBeing2.setName("fsd");
        humanBeing3.setName("ZZZZZZZZZZZZZ");


        ArrayList<HumanBeing> a = new ArrayList<>();
        a.add(humanBeing);
        a.add(humanBeing1);
        a.add(humanBeing2);
        a.add(humanBeing3);

        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Invoker invoker = new Invoker();
        invoker.readCommands();




        // String a = System.getenv("lab5");
        //System.out.println(a);
        //FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Неля\\IdeaProjects\\Lab5\\src\\lab5");
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        //int i;

        //while((i = bufferedInputStream.read())!= -1){
        //    System.out.print(i);
    }
    //public void whenJavaGotFromXmlStr_thenCorrect() throws IOException {
    //    XmlMapper xmlMapper = new XmlMapper();
    //    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Неля\\IdeaProjects\\Lab5\\src\\lab5");
    //    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
    //    xmlMapper.readValue();
    //}
}
