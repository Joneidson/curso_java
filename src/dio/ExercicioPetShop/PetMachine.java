package dio.ExercicioPetShop;

public class PetMachine {

    private boolean clean = true;
    private int agua;
    private int shampoo;
    private Pet pet;


    public void darBanho() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na banheira");
            return;
        }
        if (!clean) {
            System.out.println("Limpe a máquina antes de usar");
            return;
        }
        if (agua < 10 || shampoo < 2) {
            System.out.println("Recursos insuficientes para dar banho");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setPetClean(true);
        this.clean = false;
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addAgua() {
        if (agua == 30) {
            System.out.println("A capacidade de água esta no máximo");
            return;
        } else {
            agua += 2;
            System.out.println("Abastecido");
            System.out.println("Quantidade de Água: " + agua);
        }

        System.out.println();
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de Shampoo está no máximo");
            return;
        } else {
            shampoo += 2;
            System.out.println("Abastecido");
            System.out.println("Quantidade de Shampoo: " + shampoo);
        }

    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean temPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (temPet()) {
            System.out.println("O pet " + this.pet.getName() + "está na banheira");
            return;
        }
        if (!this.clean) {
            System.out.println("A máquina esta suja, precisar ser limpa");
            return;
        }

        this.pet = pet;
    }


    public void limparMaquina() { // metodo limpar maquina
        if (agua < 3 || shampoo < 1) {
            System.out.println("Recursos insuficientes para limpar a máquina");
        }else{
            this.agua -= 3;
            this.shampoo -= 1;
            this.clean = true;
            System.out.println("Máquina limpa");
        }

    }


    public void removerPet() {
        if (pet.isPetClean()) {
            this.pet = null;
            System.out.println("Pet removido");
        }

    }


    public void status() {
        System.out.println("===== STATUS DA MÁQUINA =====");
        if (pet == null) {
            System.out.println("Nenhum pet encontrado");
        } else {
            System.out.println("Nome: " + pet.getName());
        }
        System.out.println("Água: " + agua);
        System.out.println("Shampoo: " + shampoo);
        if (clean) {
            System.out.println("Máquina limpa");
        } else {
            System.out.println("Máquina suja");
        }
        System.out.println("=============================");

    }

}
