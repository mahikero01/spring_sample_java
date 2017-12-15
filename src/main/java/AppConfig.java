import org.mahikero01.service.CustomerService;
import org.mahikero01.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		return new CustomerServiceImpl();
	}
	                         
}
