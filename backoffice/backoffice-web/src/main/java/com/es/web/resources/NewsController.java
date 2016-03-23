package com.es.web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.es.bo.biz.domain.News;
import com.es.bo.biz.service.NewsService;

/**
 * Created by myachb on 3/18/2016.
 */

@Controller
@RequestMapping("/news")
public class NewsController {

    /**
     * Health check operation
     * @return
     */
	
	@Autowired
	private NewsService newsService;

    @RequestMapping(value={"/up"}, method= RequestMethod.GET)
    public @ResponseBody String up(){
        return "Back Office API is UP!!";
    }
    
    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody List<News> getAllNews(News news){
    	return newsService.getNews();
    }    
    
    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody String addNews(@RequestBody News news){
    	newsService.createNews(news);
    	return "success";
    }

}