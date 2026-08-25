package hospital;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HospitalService {

    @WebMethod
    public String addPatient(
            String patientId,
            String name,
            int age,
            String gender,
            String phone) {

        return "Patient Registered Successfully. Patient ID: "
                + patientId;
    }

    @WebMethod
    public String getPatient(String patientId) {

        if (patientId.equals("P1001")) {
            return "Patient ID: P1001, Name: Ravi Kumar, Age: 45, Gender: Male";
        }

        return "Patient not found";
    }

    @WebMethod
    public String scheduleAppointment(
            String patientId,
            String doctor,
            String date) {

        return "Appointment Scheduled Successfully for Patient "
                + patientId
                + " with Dr. "
                + doctor
                + " on "
                + date;
    }

    @WebMethod
    public String getMedicalRecords(String patientId) {

        if (patientId.equals("P1001")) {
            return "Patient ID: P1001, Diagnosis: Diabetes, "
                    + "Blood Group: O+, Last Visit: 20-08-2026";
        }

        return "Medical records not found";
    }
}package hospital;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HospitalService {

    @WebMethod
    public String addPatient(
            String patientId,
            String name,
            int age,
            String gender,
            String phone) {

        return "Patient Registered Successfully. Patient ID: "
                + patientId;
    }

    @WebMethod
    public String getPatient(String patientId) {

        if (patientId.equals("P1001")) {
            return "Patient ID: P1001, Name: Ravi Kumar, Age: 45, Gender: Male";
        }

        return "Patient not found";
    }

    @WebMethod
    public String scheduleAppointment(
            String patientId,
            String doctor,
            String date) {

        return "Appointment Scheduled Successfully for Patient "
                + patientId
                + " with Dr. "
                + doctor
                + " on "
                + date;
    }

    @WebMethod
    public String getMedicalRecords(String patientId) {

        if (patientId.equals("P1001")) {
            return "Patient ID: P1001, Diagnosis: Diabetes, "
                    + "Blood Group: O+, Last Visit: 20-08-2026";
        }

        return "Medical records not found";
    }
}
