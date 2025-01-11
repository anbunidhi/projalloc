package in.anbu.altimetrikeval.projalloc;

import org.springframework.boot.SpringApplication;

public class TestProjallocApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProjallocApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
