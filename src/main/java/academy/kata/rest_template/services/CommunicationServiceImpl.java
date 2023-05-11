package academy.kata.rest_template.services;

import academy.kata.rest_template.models.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class CommunicationServiceImpl implements CommunicationService {

    private static final String URL = "http://94.198.50.185:7081/api/users";

    private final RestTemplate restTemplate;
    private final HttpHeaders httpHeaders;

    public CommunicationServiceImpl(RestTemplate restTemplate, HttpHeaders httpHeaders) {
        this.restTemplate = restTemplate;
        this.httpHeaders = httpHeaders;
    }

    @Override
    public void getAllUsers() {
        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(
                URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {});

        String setCookie = Objects.requireNonNull(responseEntity.getHeaders().get("Set-Cookie")).get(0);
        String sessionId = setCookie.substring(0, setCookie.indexOf(';'));

        httpHeaders.set("Cookie", sessionId);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    }

    @Override
    public String addUser(User user) {
        return restTemplate.exchange(
                URL, HttpMethod.POST, new HttpEntity<>(user, httpHeaders), String.class).getBody();
    }

    @Override
    public String updateUser(User user) {
        return restTemplate.exchange(
                URL, HttpMethod.PUT, new HttpEntity<>(user, httpHeaders), String.class).getBody();
    }

    @Override
    public String deleteUserById(Long id) {
        return restTemplate.exchange(
                URL + "/" + id, HttpMethod.DELETE, new HttpEntity<>(httpHeaders), String.class).getBody();
    }

}