package school.sptech.MyWebApplication.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    Long countById(Integer id);
}
