/* 
 * Copyright (C) 2017 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle[at]sonicle[dot]com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2017 Sonicle S.r.l.".
 */
package zswi.schemas.caldav.proppatch.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar-description"/>
 *           &lt;element ref="{http://apple.com/ns/ical/}calendar-color"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}schedule-calendar-transp"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar-timezone"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calendarDescription",
    "calendarColor",
    "scheduleCalendarTransp",
    "calendarTimezone"
})
@XmlRootElement(name = "prop")
public class Prop {

    @XmlElement(name = "calendar-description", namespace = "urn:ietf:params:xml:ns:caldav")
    protected CalendarDescription calendarDescription;
    @XmlElement(name = "calendar-color", namespace = "http://apple.com/ns/ical/")
    protected CalendarColor calendarColor;
    @XmlElement(name = "schedule-calendar-transp", namespace = "urn:ietf:params:xml:ns:caldav")
    protected ScheduleCalendarTransp scheduleCalendarTransp;
    @XmlElement(name = "calendar-timezone", namespace = "urn:ietf:params:xml:ns:caldav")
    protected CalendarTimezone calendarTimezone;

    /**
     * Gets the value of the calendarDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDescription }
     *     
     */
    public CalendarDescription getCalendarDescription() {
        return calendarDescription;
    }

    /**
     * Sets the value of the calendarDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDescription }
     *     
     */
    public void setCalendarDescription(CalendarDescription value) {
        this.calendarDescription = value;
    }

    /**
     * Gets the value of the calendarColor property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarColor }
     *     
     */
    public CalendarColor getCalendarColor() {
        return calendarColor;
    }

    /**
     * Sets the value of the calendarColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarColor }
     *     
     */
    public void setCalendarColor(CalendarColor value) {
        this.calendarColor = value;
    }

    /**
     * Gets the value of the scheduleCalendarTransp property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleCalendarTransp }
     *     
     */
    public ScheduleCalendarTransp getScheduleCalendarTransp() {
        return scheduleCalendarTransp;
    }

    /**
     * Sets the value of the scheduleCalendarTransp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleCalendarTransp }
     *     
     */
    public void setScheduleCalendarTransp(ScheduleCalendarTransp value) {
        this.scheduleCalendarTransp = value;
    }

    /**
     * Gets the value of the calendarTimezone property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarTimezone }
     *     
     */
    public CalendarTimezone getCalendarTimezone() {
        return calendarTimezone;
    }

    /**
     * Sets the value of the calendarTimezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarTimezone }
     *     
     */
    public void setCalendarTimezone(CalendarTimezone value) {
        this.calendarTimezone = value;
    }

}
