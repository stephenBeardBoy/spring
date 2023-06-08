import org.example.service.ServiceClassImpl;
import org.example.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        //StudentService service = new ServiceClassImpl();

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service = appContext.getBean("studentService", StudentService.class);

        System.out.println(service.findAll().get(0).getName());
    }
}
