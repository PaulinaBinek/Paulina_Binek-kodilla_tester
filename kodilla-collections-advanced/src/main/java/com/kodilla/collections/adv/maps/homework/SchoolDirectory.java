package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> headMaster = new HashMap<>();

        Principal altairIbnLaahad = new Principal("Altair Ibn-La'Ahad");
        Principal xardasMage = new Principal("Xardas");
        Principal trissMerigold = new Principal("Triss Merigold");


        School assassinsStudents = new School("Assasin's School", 23, 23, 53);
        School necromancyStudents = new School("Necromancy School", 28, 45, 45);
        School witchcrafStudents = new School( "Witchcraft School", 13, 34, 45);

       headMaster.put(altairIbnLaahad, assassinsStudents);
       headMaster.put(xardasMage, necromancyStudents);
       headMaster.put(trissMerigold, witchcrafStudents);




        for (Map.Entry<Principal, School> headMasterEntry : headMaster.entrySet())
            System.out.println("The principal is " + headMasterEntry.getKey().getPrincipalName()  + ", the school is " +
                    headMasterEntry.getValue().getSchoolName() + ", number of students is " + headMasterEntry.getValue().sumOfStudents());

    }
}