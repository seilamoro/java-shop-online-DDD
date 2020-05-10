package s.moro.shop.categories.domain;

import s.moro.shared.domain.WordMother;
import s.moro.shop.categories.domain.CategoryDescription;

public final class CategoryDescriptionMother {
    public static CategoryDescription create(String value) {
        return new CategoryDescription(value);
    }

    public static CategoryDescription random() {
        return create(WordMother.random());
      /* return create(
           /* String.format(
                "%s %s",
                IntegerMother.random(),
                RandomElementPicker.from("months", "years", "days", "hours", "minutes", "seconds")
            )
        );*/
    }
}
