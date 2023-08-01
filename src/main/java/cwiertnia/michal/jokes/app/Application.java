package cwiertnia.michal.jokes.app;

import cwiertnia.michal.jokes.app.services.ChuckNorrisJokesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		ChuckNorrisJokesService jokesService = (ChuckNorrisJokesService) ctx.getBean("chuckNorrisJokesService");
		System.out.println(jokesService.getJoke());


	}

}
