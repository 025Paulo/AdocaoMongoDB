package com.example.Trab;

import com.example.Trab.model.Adocao;
import com.example.Trab.model.Animal;
import com.example.Trab.model.Usuario;
import com.example.Trab.repository.AdocaoRepository;
import com.example.Trab.repository.AnimalRepository;
import com.example.Trab.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class TrabApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabApplication.class, args);
	}

	@Autowired
	AnimalRepository anima;

	@Autowired
	UsuarioRepository usua;

	@Autowired
	AdocaoRepository adoca;

	public void run(String... args) throws Exception {

		System.out.println("####### Started");

		Animal p = new Animal(1 ,"Thor","Cachorro",2,"Disponivel");
		Animal p2 = new Animal(3,"Costela","Gato",1,"Disponivel");
		Usuario cli = new Usuario(1,"Paulo",
				LocalDate.of(2000,10,25));

		List<Usuario> listaUsua = usua.procuraNome("Paulo");
		for (Usuario cc: listaUsua ) {
			System.out.println(" ==> "+cc.getNome());
		}

		List<Adocao> listaAdoca = adoca.getAdocaoStatus("Realizado");
		for (Usuario cc: listaUsua ) {
			System.out.println(" ==> "+cc.getNome());
		}


		List<Animal> lista = anima.getAnimalStatus("Sim");
		System.out.println("# Animal ja adotado");
		for (Animal pp: lista ) {
			System.out.println(" ==> "+pp.getNome());
		}


	}

}
