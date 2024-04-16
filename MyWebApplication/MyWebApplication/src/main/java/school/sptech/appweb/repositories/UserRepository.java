package school.sptech.appweb.repositories;

import org.springframework.data.repository.CrudRepository;
import school.sptech.appweb.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    Long countById(Integer id);
}
