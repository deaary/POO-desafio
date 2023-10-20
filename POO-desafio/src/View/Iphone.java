package View;

import Interfaces.AparelhoTelefonico;
import Interfaces.Navegador;
import Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Iphone Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvir Correio de Voz pelo Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibingo página pelo Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova página adicionada pelo Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página pelo Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Iphone está tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausa música pelo Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música no Iphone");
    }
}
