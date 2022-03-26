package com.hcl.hackaton.controller;

import com.hcl.hackaton.exception.ResourceNotFoundException;
import com.hcl.hackaton.models.Orders;
import com.hcl.hackaton.models.Portfolio;
import com.hcl.hackaton.payloads.SearchResponse;
import com.hcl.hackaton.repository.PortoRepository;
import com.hcl.hackaton.repository.SearchPortoOrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {
    @Autowired
    private SearchPortoOrdersRepo searchPortoOrdersRepo;
    @Autowired
    private PortoRepository portoRepository;

    @GetMapping("/{portoId}/search/")
    @ResponseBody
    public List<Orders> searchAction(@PathVariable("portoId") Long portoId,
                                     @RequestParam("from") LocalDate from, @RequestParam("to") LocalDate to,
                                     @RequestParam("transactionRefNo") String transactionRefNo,
                                     @RequestParam("securityId") Integer securityId) throws ResourceNotFoundException {

        if(portoId != null){
            Portfolio portfolio = portoRepository.findById(portoId).orElseThrow(() ->
                    new ResourceNotFoundException("Portfolio Not Found :: " + portoId));


        }

        return null;
    }
}
