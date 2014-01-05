package com.prodyna.ted.neueumfrage;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.prodyna.ted.border.HeaderBorder;

public class NeueUmfrage extends WebPage {
    private static final long serialVersionUID = 1L;

    public NeueUmfrage(final PageParameters parameters) {
        super(parameters);

        add(new HeaderBorder("headerBorder"));

        // TODO Add your page's components here

    }
}
