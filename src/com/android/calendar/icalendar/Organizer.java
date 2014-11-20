/**
 * Copyright (C) 2014 Cyanogen, Inc.
 */

package com.android.calendar.icalendar;

/**
 * Event Organizer component
 * Fulfils the ORGANIZER property of an Event
 */
public class Organizer {

    public String mName;
    public String mEmail;

    public Organizer(String name, String email) {
        mName = name;
        mEmail = email;
    }

    /**
     *
     * @return
     */
    public String getICalFormattedString() {
        StringBuilder output = new StringBuilder();
        output.append("ORGANIZER;CN=" + mName + ":mailto:" + mEmail);
        output = ICalendarUtils.enforceICalLineLength(output);
        output.append("\n");
        return output.toString();
    }

}
