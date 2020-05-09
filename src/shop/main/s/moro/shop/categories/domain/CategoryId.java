package s.moro.shop.categories.domain;

import s.moro.shared.domain.Identifier;

import java.util.UUID;

public class CategoryId extends Identifier {
//value object
    public CategoryId(String value) {
        super(value);
    }
}
