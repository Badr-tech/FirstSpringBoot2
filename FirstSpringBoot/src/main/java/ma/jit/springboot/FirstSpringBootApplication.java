package ma.jit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ma.jit.springboot.beans.Personne;
import ma.jit.springboot.beans.Societe;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(FirstSpringBootApplication.class, args);
//		Personne p = ctx.getBean(Personne.class);
//		Personne p2 = ctx.getBean(Personne.class);
		Societe s=ctx.getBean(Societe.class);
		s.modifierInfoDirigeant("Mehdi","lmanjra");
		s.setStatus("Directeur d'activité");
		s.info();
	}

}
