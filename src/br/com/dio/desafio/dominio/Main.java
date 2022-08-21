package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descricação curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		
		dev1.setNome("Matheus");
		dev1.inscresverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Dev1: " + dev1.getConteudosIncritos());
		dev1.progredir();
		dev1.progredir();
		
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Dev1: " + dev1.getConteudosIncritos());
		System.out.println("Conteúdos Conclu�dos Dev1: " + dev1.getConteudosConcluidos());
		System.out.println("XP Dev1: " + dev1.calcularTotalXP());
		
		System.out.println("----------------------");
		
		Dev dev2 = new Dev();
		
		dev2.setNome("João");
		dev2.inscresverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Dev2: " + dev2.getConteudosIncritos());
		dev2.progredir();
		
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Dev2: " + dev2.getConteudosIncritos());
		System.out.println("Conteúdos Conclu�dos Dev2: " + dev2.getConteudosConcluidos());
		System.out.println("XP Dev2: " + dev2.calcularTotalXP());
		
	}

}
