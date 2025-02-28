package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefao", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Minions", 2024);
        outroFilme.avalia(5);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(3);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(1);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

            ArrayList<String> buscaPorArtista = new ArrayList<>();
            buscaPorArtista.add("Adam Sandler");
            buscaPorArtista.add("Paulo");
            buscaPorArtista.add("Jacqueline");
            System.out.println(buscaPorArtista);

            Collections.sort(buscaPorArtista);
            System.out.println("Depois da ordenação:");
            System.out.println(buscaPorArtista);


            System.out.println("Lista de titulos ordenados: ");
            Collections.sort(lista);
            System.out.println(lista);
        }
    }
}
