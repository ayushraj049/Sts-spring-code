package in.scalive.conf;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages ={"in.scalive.demobeans","in.scalive.samplebeans"} ) //jo xml me krte the wo yha kar diye
public class AppConfig {

}
