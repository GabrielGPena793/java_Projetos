package Aula19_Padrões.factoryPraticando;

public class TesteCriacao {

    public static void main(String[] args) {

        Device device = IphoneFactory.novoDispositivo("X", "novo", "Brazil");

        System.out.println(device.getNome());
        System.out.println(((IPhoneX) device).getPais());

        Device device2 = IphoneFactory.novoDispositivo("Y");

        System.out.println(device2.getNome());

        device.descricaoDevice();
        device2.descricaoDevice();

    }
}
