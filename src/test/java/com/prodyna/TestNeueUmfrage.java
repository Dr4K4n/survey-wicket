package com.prodyna;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.prodyna.ted.WicketApplication;
import com.prodyna.ted.neueumfrage.NeueUmfrage;

/**
 * Simple test using the WicketTester
 */
public class TestNeueUmfrage {
    private WicketTester tester;

    @Before
    public void setUp() {
        tester = new WicketTester(new WicketApplication());
    }

    @Test
    public void homepageRendersSuccessfully() {
        // start and render the test page
        tester.startPage(NeueUmfrage.class);

        // assert rendered page class
        tester.assertRenderedPage(NeueUmfrage.class);
    }
}
