package com.anita.facade;



import java.io.IOException;
import java.util.List;

public class FacadeDemo {

    public static void main(String[] args) throws IOException {
        ScraperJobFacade scraperJobFacade = new ScraperJobFacade();


        List<JobDetail> jobs = scraperJobFacade.scrap("merojob","java");
        System.out.println(jobs);


    }
}
