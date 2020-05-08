package s.moro.shop.categories.Infrastructure;

import s.moro.shared.domain.Service;
import s.moro.shop.categories.application.create.CategoryCreator;
import s.moro.shop.categories.domain.Category;
import s.moro.shop.categories.domain.CategoryRepository;

import java.util.HashMap;
import java.util.Optional;

@Service
public final class InMemoryCategoryRepository implements CategoryRepository {
    private HashMap<String, Category> categories = new HashMap<>();

    @Override
    public void save(Category category){
        categories.put(category.id(),category);
    }
    @Override
    public Optional<Category> search(String id){
        return Optional.ofNullable(categories.get(id));
    }

}
