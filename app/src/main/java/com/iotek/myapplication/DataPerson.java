package com.iotek.myapplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataPerson {

    private List<Person> initData(){
        List<Person> personList = new ArrayList<Person>() {{
            add(new Person("ES01", "ES00001", "", "延长服务包", "华为无忧",true));
            add(new Person("ES01", "ES000012", "", "延长服务包", "华为无忧",true));
            add(new Person("ES01", "", "", "延长服务包", "华为无忧",false));

            add(new Person("ES02", "ES00002", "ITEM00002", "延长服务包2", "华为无忧2",true));
            add(new Person("ES02", "", "", "延长服务包2", "华为无忧2",true));
            add(new Person("ES02", "ES000023", "", "延长服务包2", "华为无忧2",false));

            add(new Person("ES03", "ES000031", "", "延长服务包3", "华为无忧3",false));
            add(new Person("ES03", "ES000032", "", "延长服务包3", "华为无忧3",true));
            add(new Person("ES03", "ES000033", "", "延长服务包3", "华为无忧3",true));

            add(new Person("ES04", "ES00004", "ITEM00004", "延长服务包4", "华为无忧4",false));
            add(new Person("ES04", "ES000041", "ITEM000041", "延长服务包41", "华为无忧41",false));
            add(new Person("ES04", "ES000042", "ITEM000042", "延长服务包42", "华为无忧42",false));

            add(new Person("ES05", "", "", "延长服务包5", "华为无忧5",false));

            add(new Person("ES06", "ES00006", "", "延长服务包6", "华为无忧6",true));

            add(new Person("ES07", "ES00007", "ITEM00007", "延长服务包7", "华为无忧7",true));
            add(new Person("ES07", "ES000071", "ITEM000071", "延长服务包7", "华为无忧7",true));
            add(new Person("ES07", "ES000072", "ITEM000072", "延长服务包7", "华为无忧7",true));

            add(new Person("ES08", "ES00008", "", "延长服务包8", "华为无忧8",true));

            add(new Person("ES09", "", "", "延长服务包9", "华为无忧9",false));

            add(new Person("ES010", "ES000010", "", "延长服务包10", "华为无忧10",false));
        }};

        return personList;
    }


    private List<Person> getData(){
        List<Person> personList = new ArrayList<Person>() {{

            add(new Person("ES01", "ES00001", "", "延长服务包", "华为无忧",false));
            add(new Person("ES01", "ES00001", "", "延长服务包", "华为无忧",false));
            add(new Person("ES01", "ES00001", "", "延长服务包", "华为无忧",true));

            add(new Person("ES01", "ES000012", "", "延长服务包", "华为无忧",true));
            add(new Person("ES01", "ES000012", "", "延长服务包", "华为无忧",false));
            add(new Person("ES01", "ES000012", "", "延长服务包", "华为无忧",true));

            add(new Person("ES01", "", "", "延长服务包", "华为无忧",false));
            add(new Person("ES01", "", "", "延长服务包", "华为无忧",true));
            add(new Person("ES01", "", "", "延长服务包", "华为无忧",false));

            add(new Person("ES02", "ES00002", "ITEM00002", "延长服务包2", "华为无忧2",false));
            add(new Person("ES02", "ES00002", "ITEM00002", "延长服务包2", "华为无忧2",true));

            add(new Person("ES02", "", "", "延长服务包2", "华为无忧2",true));

            add(new Person("ES02", "ES000023", "", "延长服务包2", "华为无忧2",false));
            add(new Person("ES02", "ES000023", "", "延长服务包2", "华为无忧2",true));
            add(new Person("ES02", "ES000023", "", "延长服务包2", "华为无忧2",false));

            add(new Person("ES03", "ES000031", "", "延长服务包3", "华为无忧3",false));

            add(new Person("ES03", "ES000032", "", "延长服务包3", "华为无忧3",true));
            add(new Person("ES03", "ES000032", "", "延长服务包3", "华为无忧3",false));
            add(new Person("ES03", "ES000032", "", "延长服务包3", "华为无忧3",true));

            add(new Person("ES03", "ES000033", "", "延长服务包3", "华为无忧3",true));

            add(new Person("ES04", "ES00004", "ITEM00004", "延长服务包4", "华为无忧4",true));
            add(new Person("ES04", "ES00004", "ITEM00004", "延长服务包4", "华为无忧4",false));

            add(new Person("ES04", "ES000041", "ITEM000041", "延长服务包41", "华为无忧41",true));
            add(new Person("ES04", "ES000041", "ITEM000041", "延长服务包41", "华为无忧41",false));

            add(new Person("ES04", "ES000042", "ITEM000042", "延长服务包42", "华为无忧42",false));
            add(new Person("ES04", "ES000042", "ITEM000042", "延长服务包42", "华为无忧42",false));

            add(new Person("ES05", "", "", "延长服务包5", "华为无忧5",false));

            add(new Person("ES06", "ES00006", "", "延长服务包6", "华为无忧6",true));

            add(new Person("ES07", "ES00007", "ITEM00007", "延长服务包7", "华为无忧7",true));
            add(new Person("ES07", "ES000071", "ITEM000071", "延长服务包7", "华为无忧7",true));
            add(new Person("ES07", "ES000072", "ITEM000072", "延长服务包7", "华为无忧7",true));

            add(new Person("ES08", "ES00008", "", "延长服务包8", "华为无忧8",true));

            add(new Person("ES09", "", "", "延长服务包9", "华为无忧9",false));

            add(new Person("ES010", "ES000010", "", "延长服务包10", "华为无忧10",false));

        }};

        return personList;
    }

//    [
//    Person{derviceCode='ES01', offerCode='ES00001', itemCode='', deviceName='延长服务包', subDeviceName='华为无忧', isEnable=false},
//
//    Person{derviceCode='ES01', offerCode='ES000012', itemCode='', deviceName='延长服务包', subDeviceName='华为无忧', isEnable=true},
//
//    Person{derviceCode='ES01', offerCode='', itemCode='', deviceName='延长服务包', subDeviceName='华为无忧', isEnable=false},
//
//    Person{derviceCode='ES02', offerCode='ES00002', itemCode='ITEM00002', deviceName='延长服务包2', subDeviceName='华为无忧2', isEnable=false},
//
//    Person{derviceCode='ES02', offerCode='', itemCode='', deviceName='延长服务包2', subDeviceName='华为无忧2', isEnable=true},
//
//    Person{derviceCode='ES02', offerCode='ES000023', itemCode='', deviceName='延长服务包2', subDeviceName='华为无忧2', isEnable=false},
//
//    Person{derviceCode='ES03', offerCode='ES000031', itemCode='', deviceName='延长服务包3', subDeviceName='华为无忧3', isEnable=false},
//    Person{derviceCode='ES03', offerCode='ES000032', itemCode='', deviceName='延长服务包3', subDeviceName='华为无忧3', isEnable=true},
//    Person{derviceCode='ES03', offerCode='ES000033', itemCode='', deviceName='延长服务包3', subDeviceName='华为无忧3', isEnable=true},
//
//    Person{derviceCode='ES04', offerCode='ES00004', itemCode='ITEM00004', deviceName='延长服务包4', subDeviceName='华为无忧4', isEnable=true},
//    Person{derviceCode='ES04', offerCode='ES000041', itemCode='ITEM000041', deviceName='延长服务包41', subDeviceName='华为无忧41', isEnable=true},
//    Person{derviceCode='ES04', offerCode='ES000042', itemCode='ITEM000042', deviceName='延长服务包42', subDeviceName='华为无忧42', isEnable=false},
//
//    Person{derviceCode='ES05', offerCode='', itemCode='', deviceName='延长服务包5', subDeviceName='华为无忧5', isEnable=false},
//
//    Person{derviceCode='ES06', offerCode='ES00006', itemCode='', deviceName='延长服务包6', subDeviceName='华为无忧6', isEnable=true},
//
//    Person{derviceCode='ES07', offerCode='ES00007', itemCode='ITEM00007', deviceName='延长服务包7', subDeviceName='华为无忧7', isEnable=true},
//    Person{derviceCode='ES07', offerCode='ES000071', itemCode='ITEM000071', deviceName='延长服务包7', subDeviceName='华为无忧7', isEnable=true},
//    Person{derviceCode='ES07', offerCode='ES000072', itemCode='ITEM000072', deviceName='延长服务包7', subDeviceName='华为无忧7', isEnable=true},
//
//    Person{derviceCode='ES08', offerCode='ES00008', itemCode='', deviceName='延长服务包8', subDeviceName='华为无忧8', isEnable=true},
//
//    Person{derviceCode='ES09', offerCode='', itemCode='', deviceName='延长服务包9', subDeviceName='华为无忧9', isEnable=false},
//
//    Person{derviceCode='ES010', offerCode='ES000010', itemCode='', deviceName='延长服务包10', subDeviceName='华为无忧10', isEnable=false}]


public List<Person> data(){

        List<Person> temList = new ArrayList<>();
        List<Person> personList = getData();
        for (Person person : personList){
            Person p = p(temList, person);
            if (p!=null){
                temList.add(p);
            }
        }




//    Map<Boolean, List<Person>> listMap = personList.stream().collect(Collectors.groupingBy(Person::isEnable));
//
//    List<Person> personList1 = listMap.get(true);
//    List<Person> personList2 = listMap.get(false);
//
//    List<Person> persons = persons(personList1);
//    List<Person> persons1 = persons(personList2);
//
//    List<Person> distinctClass = new ArrayList<>();
//    distinctClass.addAll(persons);
//    distinctClass.addAll(persons1);
//    List<Person> pe = persons(distinctClass);


    return temList;

}

private Person p( List<Person> temList,Person person){
    if (temList != null && temList.size() > 0 ){
        for (Person person1 : temList){
            String derviceCode = person1.getDerviceCode() == null ? "" :  person1.getDerviceCode();
            String offerCode = person1.getOfferCode() == null ? "" : person1.getOfferCode();
            String itemCode = person1.getItemCode() == null ? "" : person1.getItemCode();
            if (derviceCode.equals(person.getDerviceCode()) &&
                    offerCode.equals(person.getOfferCode()) &&
                    itemCode.equals(person.getItemCode())){
                return null;
            }
        }
    }
        return person;
}

private List<Person> persons(List<Person> personList){
    List<Person> distinctClass = personList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> {
        return new TreeSet<>(Comparator.comparing(new Function<Person, String>() {
            @Override
            public String apply(Person o) {
                return o.getDerviceCode() + ";" + o.getOfferCode() + ";" + o.getItemCode();
            }
        }));
    }), ArrayList::new));

    return distinctClass;
}










}
