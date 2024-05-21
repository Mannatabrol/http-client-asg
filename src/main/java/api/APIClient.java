package api;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class APIClient {

    public static HttpResponse sendGetRequest() throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(Endpoints.BASE_URL + Endpoints.GET_ENDPOINT);
        return client.execute(request);
    }

    public static HttpResponse sendPostRequest() throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpPost request = new HttpPost(Endpoints.BASE_URL + Endpoints.POST_ENDPOINT);
        StringEntity entity = new StringEntity(TestData.JSON_DATA);
        request.setEntity(entity);
        request.setHeader("Content-type", "application/json");
        return client.execute(request);
    }

    public static HttpResponse sendPutRequest() throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpPut request = new HttpPut(Endpoints.BASE_URL + Endpoints.PUT_ENDPOINT);
        StringEntity entity = new StringEntity(TestData.JSON_DATA);
        request.setEntity(entity);
        request.setHeader("Content-type", "application/json");
        return client.execute(request);
    }

    public static HttpResponse sendPatchRequest() throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpPatch request = new HttpPatch(Endpoints.BASE_URL + Endpoints.PATCH_ENDPOINT);
        StringEntity entity = new StringEntity(TestData.JSON_DATA);
        request.setEntity(entity);
        request.setHeader("Content-type", "application/json");
        return client.execute(request);
    }

    public static HttpResponse sendDeleteRequest() throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpDelete request = new HttpDelete(Endpoints.BASE_URL + Endpoints.DELETE_ENDPOINT);
        return client.execute(request);
    }
}