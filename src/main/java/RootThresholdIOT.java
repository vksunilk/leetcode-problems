import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


import java.net.*;
import com.google.gson.*;

class Asset {
    int id;
    String alias;
}
class OperatingParam {
    int rotorSpeed;
    float slack;
    float rootThreshold;
}
class Device {
    int id;
    long timestamp;
    String status;
    OperatingParam operatingParams;
    Asset asset;
    Asset parent;
}
class Response {
    int page;
    int perPage;
    int total;
    int totalPages;
    List<Device> data;
}
class Result {

    /*
     * Complete the 'numDevices' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING statusQuery
     *  2. INTEGER threshold
     *  3. STRING dateStr
     */

    public static int numDevices(String statusQuery, int threshold, String dateStr) {
        try {
            URL url = new URL("https://jsonmock.hackerrank.com/api/iot_devices/search?status="+statusQuery);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode =connection.getResponseCode();
            if(responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String inputString;
                while((inputString=in.readLine())!=null) {
                    sb.append(inputString);
                }
                in.close();
                Date date = new SimpleDateFormat("dd-MM-YYYY").parse("01-"+ dateStr);
                Gson gson = new Gson();
                System.out.println(sb);
                Response res = gson.fromJson(sb.toString(), Response.class);
                int count=0;
                for (Device device : res.data) {
                    Date currentDate=new Date(device.timestamp*1000);
                    if(device.operatingParams.rootThreshold>threshold
                            && currentDate.getMonth()==date.getMonth()
                            && currentDate.getYear()==date.getYear()){
                        count++;
                    }
                }
                return count;
            }
        }catch(Exception e) {
            return 0;
        }
        return 0;
    }

}

public class RootThresholdIOT {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String statusQuery = bufferedReader.readLine();

        int threshold = Integer.parseInt(bufferedReader.readLine().trim());

        String dateStr = bufferedReader.readLine();

        int result = Result.numDevices(statusQuery, threshold, dateStr);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}

