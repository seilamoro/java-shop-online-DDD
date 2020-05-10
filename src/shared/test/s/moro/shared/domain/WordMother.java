package s.moro.shared.domain;

import com.github.javafaker.Faker;

public class WordMother {


    public static String random(){
        //return "random";
        return Faker.instance().lorem().word();
    }
}
