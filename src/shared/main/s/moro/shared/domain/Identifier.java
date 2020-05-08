package s.moro.shared.domain;

import java.util.Objects;
import java.util.UUID;

public abstract class Identifier {
    //private String value;
//si cambiamos el tipo de dato
    private UUID value;
    public Identifier(String value) {
        //ensureValidUuid(value);

        //this.value = value;
        this.value = UUID.fromString(value);
    }

    public String value(){
        //return value;
        return value.toString();
    }
    private void ensureValidUuid(String value){
        UUID.fromString(value);//metodo que comprueba si es uuid
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Identifier that = (Identifier) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
