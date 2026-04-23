package dio.ExercicioPetShop;

public class PetMachine {

    private boolean clean;

    private int agua;
    private int shampoo;
    private Pet pet;

    public void darBanho(){
        if(this.pet == null){
            System.out.println("Coloque o pet na baheira");
            return;
        }if (!clean) {
            System.out.println("Limpe a máquina antes de usar");
            return;
        }if (agua < 10 || shampoo < 2) {
            System.out.println("Recursos insuficientes para dar banho");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "está limpo");
    }

    public void addAgua(){
        if (agua >= 30){
            System.out.println("A capacidade de água esta no máximo");
            return;
        }
        agua+=10;
    }

    public void addShampoo(){
        if (shampoo >= 10){
            System.out.println("A capacidade de Shampoo está no máximo");
            return;
        }
        shampoo+=5;
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
        if(temPet()){
            System.out.println("O pet " + this.pet.getName() + "está na baheira");
            return;
        }if (!this.clean){
            System.out.println("A máquina esta suja, precisar ser limpa");
            return;
        }

        this.pet = pet;
        this.clean = false;
    }

    public void removerPet(){
        this.pet =   null;
        this.clean = this.pet.isClean();

    }

    public void limparMaquina(){
        this.clean = true;
        System.out.println("Máquina limpa");
    }

    public void status(){
        System.out.println("===== STATUS DA MÁQUINA =====");
        if (pet == null){
            System.out.println("Nenhum pet encontrado");
        }else {
            System.out.println("Nome: " + pet.getName());
        }
        System.out.println("Água: " + agua);
        System.out.println("Shampoo: " + shampoo);
        if (clean){
            System.out.println("Máquina limpa");
        }else  {
            System.out.println("Máquina suja");
        }
        System.out.println("=============================");

    }

}
