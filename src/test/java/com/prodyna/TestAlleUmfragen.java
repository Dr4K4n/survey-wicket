package com.prodyna;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.prodyna.ted.WicketApplication;
import com.prodyna.ted.alleumfragen.AlleUmfragen;

/**
 * Simple test using the WicketTester
 */
public class TestAlleUmfragen {
    private WicketTester tester;

    @Before
    public void setUp() {
        tester = new WicketTester(new WicketApplication());
    }

    @Test
    public void homepageRendersSuccessfully() {
        // start and render the test page
        tester.startPage(AlleUmfragen.class);

        // assert rendered page class
        tester.assertRenderedPage(AlleUmfragen.class);
    }
}
