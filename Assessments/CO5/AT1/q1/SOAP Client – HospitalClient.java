package hospital;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HospitalClient {

    public static void main(String[] args) throws Exception {

        URL url = new URL(
            "http://localhost:8080/HospitalService?wsdl"
        );

        QName qname = new QName(
            "http://hospital/",
            "HospitalServiceService"
        );

        Service service = Service.create(url, qname);

        HospitalService hospital =
                service.getPort(HospitalService.class);

        System.out.println(
            hospital.addPatient(
                "P1001",
                "Ravi Kumar",
                45,
                "Male",
                "9876543210"
            )
        );

        System.out.println(
            hospital.getPatient("P1001")
        );

        System.out.println(
            hospital.scheduleAppointment(
                "P1001",
                "Arun",
                "25-08-2026"
            )
        );

        System.out.println(
            hospital.getMedicalRecords("P1001")
        );
    }
}
