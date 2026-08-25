public class SOAPErrorHandler {

    public static String processRequest(
            String operation,
            int id) {

        try {

            if (operation == null ||
                operation.isEmpty()) {

                throw new Exception(
                    "Operation cannot be empty"
                );
            }

            if (id <= 0) {

                throw new Exception(
                    "Invalid ID"
                );
            }

            return "Request processed successfully";

        } catch (Exception e) {

            return createSOAPFault(
                "CLIENT001",
                e.getMessage()
            );
        }
    }


    private static String createSOAPFault(
            String errorCode,
            String message) {

        return
            "<soap:Fault>" +

            "<faultcode>soap:Client</faultcode>" +

            "<faultstring>"
            + message +
            "</faultstring>" +

            "<detail>" +

            "<ErrorCode>"
            + errorCode +
            "</ErrorCode>" +

            "</detail>" +

            "</soap:Fault>";
    }


    public static void main(String[] args) {

        System.out.println(
            processRequest("GetData", -1)
        );
    }
}
