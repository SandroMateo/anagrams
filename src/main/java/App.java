import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/anagrams", (request,response) -> {
      Map<String,Object> model = new HashMap<String,Object>();
      String sentence = request.queryParams("anagrams");
      Anagrams anagramObj = new Anagrams(sentence);
      List<String> anagramsList = new ArrayList<String>();
      anagramsList = anagramObj.runAnagrams();
      String listElementsCombined = "";
      for (String element : anagramsList) {
        listElementsCombined = listElementsCombined + "<li>" + element + "</li>";        
      }
      model.put("anagrams", listElementsCombined);
      model.put("template", "templates/anagrams.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
