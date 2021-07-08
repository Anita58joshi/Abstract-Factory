package com.anita.daily.facade;

import org.jsoup.nodes.Document;

import java.io.FileNotFoundException;

public interface Scraper {

    Object scrap(Document document) throws FileNotFoundException;
}
