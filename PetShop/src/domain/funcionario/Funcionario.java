package domain.funcionario;

import java.util.LinkedList;
import java.util.List;

public class Funcionario implements Tosador, Lavador {
    private String nome;
    private int especialidade;
    private int qtdAnimaisAtendidos;
    boolean podeBanhar;
    boolean podeTosar;
    boolean disponivel;
    private LinkedList<Funcionario> funcionarios = new LinkedList<>();


    public Funcionario() {
    }

    public Funcionario(String nome, int especialidade, int qtdAnimaisAtendidos, boolean podeBanhar, boolean podeTosar, boolean disponivel) {
        this.nome = nome;
        this.qtdAnimaisAtendidos = qtdAnimaisAtendidos;
        this.especialidade = especialidade;
        this.podeBanhar = podeBanhar;
        this.podeTosar = podeTosar;
        this.disponivel = disponivel;
    }

    public int getEspecialidade() {
        return especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionarios(){
        Funcionario maria = new Funcionario(
                "Maria",
                3,
                100,
                true,
                true,
                true);


        Funcionario jones = new Funcionario(
                "Jones",
                3,
                0,
                true,
                true,
                true);


        Funcionario elizeu = new Funcionario(
                "Elizeu",
                1,
                2,
                true,
                false,
                true);

        Funcionario camila = new Funcionario(
                "Camila",
                2,
                5,
                false,
                true,
                true);

        funcionarios.add(maria);
        funcionarios.add(elizeu);
        funcionarios.add(jones);
        funcionarios.add(camila);
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean verificarDisponibilidade(int servico) {
        if (servico == 1) {
            // Só banho
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getEspecialidade() == 1 || funcionario.getEspecialidade() == 3 && funcionario.isDisponivel()) {
                    System.out.println("Funcionário disponível");
                    return true;
                }
            }
        } else if (servico == 2) {
            // Banho e tosa
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getEspecialidade() == 2 || funcionario.getEspecialidade() == 3 && funcionario.isDisponivel()) {
                    System.out.println("Funcionário disponível");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void darBanho() {
        System.out.println("Dando banho no animal...");
    }

    @Override
    public void tosar() {
        System.out.println("Tosando o animal...");
    }
}
