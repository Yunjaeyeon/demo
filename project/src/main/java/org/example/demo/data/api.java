package com.example.demo.data.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data")
@Slf4j
@CrossOrigin
public class DataController {
    String line;
    ArrayList<String> result = new ArrayList<String>();
    @GetMapping
    public ArrayList<String> getData() throws Exception {
        URL url = new URL("http://apis.data.go.kr/1532000/LIFE_SAVING_EQ_POSITION/list_view?serviceKey=QhSXKeRfEm%2Fta1A%2BlRgrKy31QfXPr%2FEaKwLqugrWFUFIaMDIgbQWkfwWkUO%2Fb9cwEhOVYBzv61ufkkt1SSgnwg%3D%3D&rowsCount=854&startPage=1");
        URLConnection connection = url.openConnection();

        // `HttpURLConnection` connection = (HttpURLConnection) url.openConnection();
        // connection.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream())))
        {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                result.add(line);
            }
        }
        return result;
    }
}