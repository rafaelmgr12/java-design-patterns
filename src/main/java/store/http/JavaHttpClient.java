package store.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL apiURL = new URL(url);
            URLConnection connection = apiURL.openConnection();
            connection.connect();
        }
        catch (Exception e) {
            throw new RuntimeException("Error in request URL", e);
        }
    }
}
