package com.swastik.QuotationsGen.Service;


import com.swastik.QuotationsGen.Dao.QuotesDAO;
import com.swastik.QuotationsGen.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotesService {

    @Autowired
    QuotesDAO quotesDao;
    public List<Quotes> getAllQuotes() {
        return  quotesDao.findAll();
    }

    public String addQuote(Quotes quotes) {
        quotesDao.save(quotes);
        return ("Success...");
    }
}
