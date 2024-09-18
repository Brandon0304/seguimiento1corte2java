package estructurasdecontrol;

public class Switch {
    public static void main(String[] args) {
        String equipo = "Barcelona";
        switch (equipo){
            case "Barcelona":
                System.out.println("El equipo juega en Barcelona, Cataluña");
            break;
            case "Real Madrid":
                System.out.println("El equipo juega en Madrid, capital de España");
            default:
                System.out.println("Equipo no válido");
        }
    }
}
