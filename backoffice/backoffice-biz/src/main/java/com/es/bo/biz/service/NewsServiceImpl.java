package com.es.bo.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Component;

import com.es.bo.biz.domain.News;
import com.es.bo.biz.repository.NewsRepository;

/**
 * Created by myachb on 3/17/2016.
 */
@Component
public class NewsServiceImpl implements NewsService {

	@Autowired
    private NewsRepository newsRepository;

    public void createNews(News news) {
    	newsRepository.save(news);
    }
    
    public List<News> getNews(){
    	return newsRepository.findAll();
    }

    public void updateNews(News news) {
    	newsRepository.save(news);
    }

    public void deleteNews(String id) {
        newsRepository.delete(id);
    }
}
