package Activity1KelasB.Activity1KelasB;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rifqi Ichsan A
 */
@Controller
public class ProjectController {
    
    @RequestMapping("/dataktp")
    
    public String getTable (Model Data){
        
        ArrayList<List<String>> data = new ArrayList<>();
        
         data.add(Arrays.asList("ID","Nomor KTP","Nama","Alamat"));
         data.add(Arrays.asList("201001","12001","Rifqi","Jakarta"));
         data.add(Arrays.asList("201002","12002","Rafi","Surabaya"));
         data.add(Arrays.asList("201003","12003","Eki","Palu"));
         data.add(Arrays.asList("201004","12004","Barik","Riau"));
         data.add(Arrays.asList("201005","12005","Andre","Berau"));
         data.add(Arrays.asList("201006","12006","Vinca","Cilegon"));
         data.add(Arrays.asList("201007","12007","Aprilian","Serang"));
         data.add(Arrays.asList("201008","12008","Ichsan","Cilegon"));
         data.add(Arrays.asList("201009","12009","Fayad","Madrid"));
         data.add(Arrays.asList("201010","12010","Irsyad","Padang"));
         data.add(Arrays.asList("201011","12011","Dava","Padang"));
         data.add(Arrays.asList("201012","12012","Nadael","Cilegon"));
         data.add(Arrays.asList("201013","12013","Hatta","Serang"));
         data.add(Arrays.asList("201014","12014","Emon","Sleman"));
         data.add(Arrays.asList("201015","12015","Ammar","Bandung"));
         data.add(Arrays.asList("201016","12016","Asra","Jambi"));
         data.add(Arrays.asList("201017","12017","Zulfa","Bengkulu"));
         data.add(Arrays.asList("201018","12018","Asep","Garut"));
         data.add(Arrays.asList("201019","12019","Baron","Sleman"));
         data.add(Arrays.asList("201020","12020","Rico","Magelang"));
         
         Data.addAttribute("dataktp", data);
         
         return "tableviewer";
    }
}
