package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> headMaster = new HashMap<>();
        School assassinsSchool = new School("Assassins School");
        School necromancySchool = new School("Necromancy School");
        School witchcraftSchool = new School("Witchcraft School");

        Principal altairIbnLaahad = new Principal("Altair Ibn-La'Ahad");
        Principal xardasMage = new Principal("Xardas");
        Principal trissMerigold = new Principal("Triss Merigold");

        School assassinsStudents = new School(43, 3, 23);
        School necromancyStudents = new School(23, 2,45);
        School witchcrafStudents = new School( 24, 2, 13);

       headMaster.put(assassinsSchool, altairIbnLaahad);
       headMaster.put(necromancySchool, xardasMage);
       headMaster.put(witchcraftSchool, trissMerigold);
       headMaster.put(assassinsStudents, altairIbnLaahad);
       headMaster.put(necromancyStudents, xardasMage);
       headMaster.put(witchcrafStudents, trissMerigold);



        for (Map.Entry<School, Principal> headMasterEntry : headMaster.entrySet())
            System.out.println(headMasterEntry.getKey().getSchoolName()  + ", the principal is " +
                    headMasterEntry.getValue().getPrincipalName() + ", number of students is " + headMasterEntry.getKey().sumOfStudents());

    }
}