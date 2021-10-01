package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    //You need to have an h1 with the title “Skills Tracker”,
    // an h2, and an ol containing three programming languages
    // of your choosing.
    @GetMapping
    @ResponseBody
    public String header() {
        String html =
                        "<html>" +
                            "<body>" +
                                "<h1>Skills Tracker</h1>" +
                                    "<h2>We have a few skills we would like to learn. Here's the list!" +
                                        "<ol>" +
                                            "<li>JavaScript</li>" +
                                            "<li>Java</li>" +
                                            "<li>TypeScript</li>" +
                                        "</ol>" +
                                "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        String form =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                        "<label>First Name: </label>" +
                        "<input type = 'text' name = 'name' /><br>" +
                        "<label>My Favorite Language:</label><br>" +
                        "<select name = 'firstChoice'>\n" +
                        "  <option value=\"JS\">JavaScript</option>\n" +
                        "  <option value=\"Java\">Java</option>\n" +
                        "  <option value=\"TS\">TypeScript</option>\n" +
                        "</select><br>" +
                        "<label>My Favorite Second Language : </label><br>" +
                        "<select name = 'secondChoice'>\n" +
                        "  <option value=\"JS\">JavaScript</option>\n" +
                        "  <option value=\"Java\">Java</option>\n" +
                        "  <option value=\"TS\">TypeScript</option>\n" +
                        "</select><br>" +
                        "<label>My Favorite Third Language: </label><br>" +
                        "<select name = 'thirdChoice'>\n" +
                        "  <option value=\"JS\">JavaScript</option>\n" +
                        "  <option value=\"Java\">Java</option>\n" +
                        "  <option value=\"TS\">TypeScript</option>\n" +
                        "</select><br>" +
                        "<input type='submit'>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return form;
    }

    @PostMapping("form")
    @ResponseBody
    public String userInput(@RequestParam String name, String firstChoice, String secondChoice, String thirdChoice){
        String input =
                "<html>" +
                        "<body>" +
                        "<h2>" + name + "</h2>" +
                        "<ol>" +
                        "<li>" + firstChoice +"</li>" +
                        "<li>" + secondChoice +"</li>" +
                        "<li>" + thirdChoice +"</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return input;
    }

}
