package ui.screenplay.automationtesting;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import screenplay.automationtesting.questions.CurrentUrl;
import screenplay.automationtesting.tasks.AppointmentScheduling;
import screenplay.automationtesting.tasks.ComponentofHospital;
import screenplay.automationtesting.tasks.RegisterDoctor;
import screenplay.automationtesting.tasks.RegisterPatient;
import screenplay.automationtesting.user_interface.ComponentofHospitalPageElements;


import java.util.Date;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;
@RunWith(SerenityRunner.class)
public class SelectComponentofHospital {
    private Actor nataly = Actor.named("Nataly");
    @Managed(uniqueSession = true)
    private WebDriver hisBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        nataly.can(BrowseTheWeb.with(hisBrowser));
    }

    //@Test
    public void select_doctor_load_data() {
        givenThat(nataly).wasAbleTo(ComponentofHospital.selectComponet(ComponentofHospitalPageElements.TypeComponentofHospital.ADDDOCTOR));
        when(nataly).attemptsTo(RegisterDoctor.loadData("henry","salinas","0998655723","Pasaportes", "1223"));
        then(nataly).should(seeThat(CurrentUrl.information(), containsString("Datos guardados correctamente.")));
    }
    //@Test
    public void select_patient_load_data() {
        givenThat(nataly).wasAbleTo(ComponentofHospital.selectComponet(ComponentofHospitalPageElements.TypeComponentofHospital.ADDPATIENT));
        when(nataly).attemptsTo(RegisterPatient.loadDataPatient("henry","salinas","0998655723","Pasaportes", "1223", true));
        then(nataly).should(seeThat(CurrentUrl.information(), containsString("Datos guardados correctamente.")));
    }

    @Test
    public void select_appointment_scheduling() {
        givenThat(nataly).wasAbleTo(ComponentofHospital.selectComponet(ComponentofHospitalPageElements.TypeComponentofHospital.APPOINTMENTSCHEDULING));
        when(nataly).attemptsTo(AppointmentScheduling.selectAppointmentScheduling (new Date(),"17219222","12232","prueba de carga"));
        then(nataly).should(seeThat(CurrentUrl.information(), containsString("Datos guardados correctamente.")));
    }


}
