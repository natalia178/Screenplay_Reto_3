package screenplay.automationtesting.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComponentofHospitalPageElements {
    public enum TypeComponentofHospital {
        ADDDOCTOR(1, "Agregar Doctor"),
        ADDPATIENT(2, "Agregar Paciente"),
        ADDROOM(3, "Agregar Habitación"),
        ADDHOSPITAL(4, "Agregar Hospital"),
        HOSPITALLIST(5, "Ver Hospitales"),
        APPOINTMENTSCHEDULING(6, "Agendar Cita");
        private final int id;
        private final String name;

        TypeComponentofHospital(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public static TypeComponentofHospital fromValue(int value) throws IllegalArgumentException {
            try {
                for (TypeComponentofHospital e : TypeComponentofHospital.values()) {
                    if (e.id == value) {
                        return e;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Unknown enum value :" + value);
            }
            return null;
        }
    }

    public static Target getElemetsn(TypeComponentofHospital ty) {
        return Target.the(" field ").located(By.xpath(String.format("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[%s]", ty.id)));
    }
}
