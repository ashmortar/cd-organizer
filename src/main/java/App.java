
import models.CD;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");


        //get: show index page and all cds
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<CD> cds = CD.getAll();
            Collections.sort(cds);
            model.put("cds", cds);
            return  new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //get show new cd form
        get("/cds/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "new-cd-form.hbs");
        }, new HandlebarsTemplateEngine());

        //post: process new cd form
        post("/cds/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String artist = request.queryParams("artist");
            String title = request.queryParams("title");
            String year = request.queryParams("year");
            String genre = request.queryParams("genre");
            CD newCD = new CD(artist, title, year, genre);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
