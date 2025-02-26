package com.swastik.QuotationsGen.Controller;

import com.swastik.QuotationsGen.Quotes;
import com.swastik.QuotationsGen.Service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class QuotesController {

    @Autowired
    QuotesService quotesService;

    @GetMapping("/all")
    public ResponseEntity<List<Quotes>>  getAllQuotes(){
        List<Quotes>quotes =  quotesService.getAllQuotes();
        if(quotes!=null && !quotes.isEmpty()){
            return new ResponseEntity<>(quotes,HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuote(@RequestBody Quotes quotes){
        String response= quotesService.addQuote(quotes);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
