package screenplay.automationtesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import screenplay.automationtesting.user_interface.AppointmentSchedulingElements;


import java.text.SimpleDateFormat;
import java.util.Date;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AppointmentScheduling implements Task {

    private final Date date;
    private final String id_patient_componet;
    private final String id_doctor_componet;
    private final String descriotion_componet;


    public AppointmentScheduling(Date date, String id_patient_componet, String id_doctor_componet, String descriotion_componet) {
        this.date = date;
        this.id_patient_componet = id_patient_componet;
        this.id_doctor_componet = id_doctor_componet;
        this.descriotion_componet = descriotion_componet;
    }


    @Step("{0} Select Appointment Scheduling::  date '#date'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AppointmentSchedulingElements.FIELD_DATE),
                SendKeys.of((new SimpleDateFormat("yyyy-MM-dd")).format(date)
                ).into(AppointmentSchedulingElements.FIELD_DATE),

                Click.on(AppointmentSchedulingElements.FIELD_ID_PATIENT),
                SendKeys.of(id_patient_componet).into(AppointmentSchedulingElements.FIELD_ID_PATIENT),

                Click.on(AppointmentSchedulingElements.FIELD_ID_DOCTOR),
                SendKeys.of(id_doctor_componet).into(AppointmentSchedulingElements.FIELD_ID_DOCTOR),

                Click.on(AppointmentSchedulingElements.FIELD_DESCRIPTION),
                SendKeys.of(descriotion_componet).into(AppointmentSchedulingElements.FIELD_DESCRIPTION),

                Click.on(AppointmentSchedulingElements.BTN_SAVE)
        );

    }

    public static AppointmentScheduling selectAppointmentScheduling(
            Date date,
            String id_patient_componet,
            String id_doctor_componet,
            String descriotion_componet) {
        System.out.println((new SimpleDateFormat("yyyy-MM-dd")).format(date));
        return instrumented(AppointmentScheduling.class, date, id_patient_componet, id_doctor_componet, descriotion_componet);
    }

}
