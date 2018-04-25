package com.webgestus.publishnotes.resource;

/*

 * Online Notes Publishing Application using Java Spring Framework, MongoDb,  and Angular Js on Frontend
 * Author : Wembo Otepa Mulumba
 * Company : Webgestus Systems LLC

 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@Controller
public class ViewController {

    @Autowired
    public ViewController(){
    }

    @RequestMapping("/")
    public String index(Model model){


        return "index";
    }
}
