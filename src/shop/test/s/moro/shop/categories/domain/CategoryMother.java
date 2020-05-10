package s.moro.shop.categories.domain;

import s.moro.shop.categories.application.create.CreateCategoryRequest;
import s.moro.shop.categories.domain.*;

public final class CategoryMother {
    public static Category create(CategoryId id, CategoryName name, CategoryDescription description) {
        return new Category(id, name, description);
    }

    public static Category fromRequest(CreateCategoryRequest request) {
        return create(
                CategoryIdMother.create(request.id()),
                CategoryNameMother.create(request.name()),
                CategoryDescriptionMother.create(request.description())
        );
    }

    public static Category random() {
        return create(CategoryIdMother.random(), CategoryNameMother.random(), CategoryDescriptionMother.random());
    }
}
