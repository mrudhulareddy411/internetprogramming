import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class SOAPValidator {

    public static boolean validateSOAPMessage(String xml) {

        try {

            DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();

            factory.setNamespaceAware(true);

            DocumentBuilder builder =
                    factory.newDocumentBuilder();

            Document document =
                    builder.parse(
                        new ByteArrayInputStream(
                            xml.getBytes(StandardCharsets.UTF_8)
                        )
                    );

            String root =
                    document.getDocumentElement()
                            .getLocalName();

            if (!"Envelope".equals(root)) {

                System.out.println(
                    "Error: SOAP Envelope not found"
                );

                return false;
            }

            System.out.println(
                "SOAP message is valid"
            );

            return true;

        } catch (Exception e) {

            System.out.println(
                "SOAP Validation Error: "
                + e.getMessage()
            );

            return false;
        }
    }


    public static void main(String[] args) {

        String soapMessage =
            "<soap:Envelope " +
            "xmlns:soap=" +
            "\"http://schemas.xmlsoap.org/soap/envelope/\">" +

            "<soap:Body>" +

            "<GetData " +
            "xmlns=\"http://example.com/enterprise\">" +

            "<id>1001</id>" +

            "</GetData>" +

            "</soap:Body>" +

            "</soap:Envelope>";

        validateSOAPMessage(soapMessage);
    }
}
