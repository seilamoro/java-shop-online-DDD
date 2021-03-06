package s.moro.shop.categories.domain;

import java.util.Objects;

public final class Category {
    private final CategoryId id;
    private final CategoryName name;
    private final CategoryDescription description;

    /*private String id;

    private String name;

    private String description;*/

    public Category(CategoryId id, CategoryName name, CategoryDescription description) {
        /*this.id = id;
        this.name = name;
        this.description = description;*/
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public CategoryId id() {
        return id;
    }

    public CategoryName name() {
        return name;
    }

    public CategoryDescription description() {
        return description;
    }
    /*public String id() {
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
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
            Objects.equals(name, category.name) &&
            Objects.equals(description, category.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }*///refactor modelando dominio 1 1-value-objects-immutabilidad-y-tips-para-agilizar-desarrollo
}
