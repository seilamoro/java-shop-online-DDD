package s.moro.apps.shop.controller.categories;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import s.moro.shop.categories.application.create.CategoryCreator;
import s.moro.shop.categories.application.create.CreateCategoryRequest;


@RestController
public final class CategoriesPutController {
    //inyectamos el service y hacemos un repositorio en memoria repository
    private  CategoryCreator creator;
public CategoriesPutController(){}
    public CategoriesPutController(CategoryCreator creator) {

        this.creator = creator;
    }

    @PutMapping(value = "/categories/{id}")
    //public ResponseEntity create(@PathVariable String id, @RequestBody Request request){
    public ResponseEntity<String> index(@PathVariable String id, @RequestBody Request request){
        //creator.create(id, request.name(), request.description());// refactor modelando 1
        creator.create(new CreateCategoryRequest(id, request.name(), request.description()));

        return new ResponseEntity(HttpStatus.CREATED);
    }
}
final class Request{
    private String name;
    private String description;

    String name(){
        return name;
    }

    String description(){
        return description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }


}
