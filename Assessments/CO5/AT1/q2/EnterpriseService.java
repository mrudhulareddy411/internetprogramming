package enterprise;

public class EnterpriseService {

    public String getData(int id) {

        if (id == 1001) {
            return "ID: 1001, Data: Employee Information";
        }

        return "Data not found";
    }

    public String updateData(int id, String data) {

        if (id == 1001) {

            return "Data updated successfully for ID: "
                    + id
                    + ". New Data: "
                    + data;
        }

        return "Update failed. ID not found";
    }
}
