package s.moro.shop.categories.application.create;

import s.moro.shop.categories.domain.Category;

import java.util.Objects;

public class CreateCategoryRequest {
    private String id;

    private String name;

    private String description;

    public CreateCategoryRequest(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCategoryRequest category = (CreateCategoryRequest) o;
        return  Objects.equals(id, category.id) &&
            Objects.equals(name, category.name) &&
            Objects.equals(description, category.description);
    }


}
