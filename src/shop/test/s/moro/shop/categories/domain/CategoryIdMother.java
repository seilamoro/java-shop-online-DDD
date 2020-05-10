package s.moro.shop.categories.domain;

import s.moro.shared.domain.UuidMother;

public final class CategoryIdMother {
    public static CategoryId create(String value) {
        return new CategoryId(value);
    }

    public static CategoryId random() {
        return create(UuidMother.random());
    }
}
