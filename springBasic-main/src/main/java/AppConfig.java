import org.example.repository.RepositoryClassImpl;
import org.example.repository.StudentRepository;
import org.example.service.ServiceClassImpl;
import org.example.service.StudentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "studentService")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public StudentService getStudentService(){
//        ServiceClassImpl service = new ServiceClassImpl();
//        service.setRepository(getStudentRepository());
        //return new ServiceClassImpl();
        ServiceClassImpl service = new ServiceClassImpl(getStudentRepository());
        //service.setRepository(getStudentRepository());
        return service;
    }

    @Bean(name = "studentRepository")
    public StudentRepository getStudentRepository(){
        return new RepositoryClassImpl();
    }
}
