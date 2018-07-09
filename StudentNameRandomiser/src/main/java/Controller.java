import models.Randomiser;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public"); //to include style.css file.


        get("/one", (req, res) -> {

            Randomiser randomiser = new Randomiser();
            String result = randomiser.giveARandomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomname", result);
            model.put("template", "single.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {

            Randomiser randomiser = new Randomiser();
            ArrayList<String> results = randomiser.giveAListOfRandomNames(2);
            HashMap<String, Object> model = new HashMap<>();
            model.put("group", results);
            model.put("template", "group.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/three", (req, res) -> {

            Randomiser randomiser = new Randomiser();
            ArrayList<String> results = randomiser.giveAListOfRandomNames(3);
            HashMap<String, Object> model = new HashMap<>();
            model.put("group", results);
            model.put("template", "group.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/four", (req, res) -> {

            Randomiser randomiser = new Randomiser();
            ArrayList<String> results = randomiser.giveAListOfRandomNames(4);
            HashMap<String, Object> model = new HashMap<>();
            model.put("group", results);
            model.put("template", "group.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

    }
}
