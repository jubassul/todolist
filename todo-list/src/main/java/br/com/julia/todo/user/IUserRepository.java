package br.com.julia.todo.user;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

//interface: definição de metodos que vamos ter dentro dela
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username); // buscar a propriedade username
}
