package s.moro.shop.categories.application.create;


import s.moro.shop.categories.domain.*;

public class CreateCategoryRequestMother {
    public static CreateCategoryRequest create(CategoryId id, CategoryName name, CategoryDescription description){
        return new CreateCategoryRequest(id.value(), name.value(), description.value());
    }

    public static CreateCategoryRequest random(){
        return create(CategoryIdMother.random(), CategoryNameMother.random(), CategoryDescriptionMother.random());
    }
}
