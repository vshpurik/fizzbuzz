package controllers;

import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

public class FizzBuzzControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testRequestValid() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/fizzbuzz/15");

        Result result = route(app, request);
        assertEquals(Http.Status.OK, result.status());
    }

    @Test
    public void testRequestBadUrl() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/fizzbuzz");

        Result result = route(app, request);
        assertEquals(Http.Status.NOT_FOUND, result.status());
    }

    @Test
    public void testRequestBadParameter() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/fizzbuzz/ABC");

        Result result = route(app, request);
        assertEquals(Http.Status.BAD_REQUEST, result.status());
    }

}
