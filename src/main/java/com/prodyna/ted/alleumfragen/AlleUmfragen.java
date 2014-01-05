package com.prodyna.ted.alleumfragen;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.prodyna.ted.border.HeaderBorder;

public class AlleUmfragen extends WebPage {
    private static final long serialVersionUID = 1L;

    public AlleUmfragen(final PageParameters parameters) {
        super(parameters);

        add(new HeaderBorder("headerBorder"));

        // TODO Add your page's components here

    }
}
