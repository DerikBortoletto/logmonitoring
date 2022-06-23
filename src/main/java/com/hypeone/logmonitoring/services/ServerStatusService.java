package com.hypeone.logmonitoring.services;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class ServerStatusService {


    public Object getStatusServer(Object uri) throws IOException {
        String endpoint = uri.toString();
        CloseableHttpClient client = HttpClients.createDefault();

        File file = new File("src/main/resources/image/thumbnail.jpg");
        HttpPost post = new HttpPost(endpoint);
        FileBody fileBody = new FileBody(file, ContentType.DEFAULT_BINARY);
//
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.addPart("image", fileBody);
        HttpEntity entity = builder.build();
//
        post.setEntity(entity);
        HttpResponse response = client.execute(post);

        HttpEntity responseEntity = response.getEntity();
        if(responseEntity!=null) {
            String responseString = EntityUtils.toString(responseEntity);
            System.out.printf(responseString);
        }
        return response;
    }


}
