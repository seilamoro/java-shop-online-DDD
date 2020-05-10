package s.moro.shop.categories.domain;

import s.moro.shared.domain.WordMother;

public class CategoryNameMother {
    public static CategoryName create(String  value){
        return new CategoryName(value);
    }

    public static CategoryName random(){

        return create(WordMother.random());
    }
 

}