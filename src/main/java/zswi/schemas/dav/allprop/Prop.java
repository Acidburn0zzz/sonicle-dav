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
package zswi.schemas.dav.allprop;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{DAV}acl"/>
 *           &lt;element ref="{DAV}acl-restrictions"/>
 *         &lt;/sequence>
 *         &lt;element ref="{DAV}add-member" minOccurs="0"/>
 *         &lt;element ref="{DAV}creationdate" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{DAV}current-user-principal"/>
 *           &lt;element ref="{DAV}current-user-privilege-set"/>
 *         &lt;/sequence>
 *         &lt;element ref="{DAV}displayname" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{DAV}getcontentlength"/>
 *           &lt;element ref="{DAV}getcontenttype"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{DAV}getetag"/>
 *           &lt;element ref="{DAV}getlastmodified"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{DAV}inherited-acl-set"/>
 *           &lt;element ref="{DAV}owner"/>
 *           &lt;element ref="{DAV}principal-collection-set"/>
 *           &lt;element ref="{DAV}quota-available-bytes"/>
 *           &lt;element ref="{DAV}quota-used-bytes"/>
 *         &lt;/sequence>
 *         &lt;element ref="{DAV}resource-id" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{DAV}resourcetype"/>
 *           &lt;element ref="{DAV}supported-privilege-set"/>
 *           &lt;element ref="{DAV}supported-report-set"/>
 *           &lt;element ref="{DAV}supportedlock"/>
 *         &lt;/sequence>
 *         &lt;element ref="{DAV}sync-token" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://apple.com/ns/ical/}calendar-color"/>
 *           &lt;element ref="{http://apple.com/ns/ical/}calendar-order"/>
 *           &lt;element ref="{http://calendarserver.org/ns/}allowed-sharing-modes"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://calendarserver.org/ns/}getctag" minOccurs="0"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}invite" minOccurs="0"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}max-resources" minOccurs="0"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}pushkey" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://calendarserver.org/ns/}shared-url"/>
 *           &lt;element ref="{http://twistedmatrix.com/xml_namespace/dav/}resource-class"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar-timezone" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}max-attendees-per-instance"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}max-instances"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}max-resource-size"/>
 *         &lt;/sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}schedule-calendar-transp" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}supported-calendar-component-set" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}supported-calendar-component-sets" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}supported-calendar-data" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}default-alarm-vevent-date"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}default-alarm-vevent-datetime"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acl",
    "aclRestrictions",
    "addMember",
    "creationdate",
    "currentUserPrincipal",
    "currentUserPrivilegeSet",
    "displayname",
    "getcontentlength",
    "getcontenttype",
    "getetag",
    "getlastmodified",
    "inheritedAclSet",
    "owner",
    "principalCollectionSet",
    "quotaAvailableBytes",
    "quotaUsedBytes",
    "resourceId",
    "resourcetype",
    "supportedPrivilegeSet",
    "supportedReportSet",
    "supportedlock",
    "syncToken",
    "calendarColor",
    "calendarOrder",
    "allowedSharingModes",
    "getctag",
    "invite",
    "maxResources",
    "pushkey",
    "sharedUrl",
    "resourceClass",
    "calendarTimezone",
    "maxAttendeesPerInstance",
    "maxInstances",
    "maxResourceSize",
    "scheduleCalendarTransp",
    "supportedCalendarComponentSet",
    "supportedCalendarComponentSets",
    "supportedCalendarData",
    "defaultAlarmVeventDate",
    "defaultAlarmVeventDatetime",
    "calendarDescription"
})
@XmlRootElement(name = "prop")
public class Prop {

    protected Acl acl;
    @XmlElement(name = "acl-restrictions")
    protected AclRestrictions aclRestrictions;
    @XmlElement(name = "add-member")
    protected AddMember addMember;
    protected String creationdate;
    @XmlElement(name = "current-user-principal")
    protected CurrentUserPrincipal currentUserPrincipal;
    @XmlElement(name = "current-user-privilege-set")
    protected CurrentUserPrivilegeSet currentUserPrivilegeSet;
    protected String displayname;
    protected Getcontentlength getcontentlength;
    protected String getcontenttype;
    protected String getetag;
    protected String getlastmodified;
    @XmlElement(name = "inherited-acl-set")
    protected InheritedAclSet inheritedAclSet;
    protected Owner owner;
    @XmlElement(name = "principal-collection-set")
    protected PrincipalCollectionSet principalCollectionSet;
    @XmlElement(name = "quota-available-bytes")
    protected BigInteger quotaAvailableBytes;
    @XmlElement(name = "quota-used-bytes")
    protected BigInteger quotaUsedBytes;
    @XmlElement(name = "resource-id")
    protected ResourceId resourceId;
    protected Resourcetype resourcetype;
    @XmlElement(name = "supported-privilege-set")
    protected SupportedPrivilegeSet supportedPrivilegeSet;
    @XmlElement(name = "supported-report-set")
    protected SupportedReportSet supportedReportSet;
    protected Supportedlock supportedlock;
    @XmlElement(name = "sync-token")
    @XmlSchemaType(name = "anyURI")
    protected String syncToken;
    @XmlElement(name = "calendar-color", namespace = "http://apple.com/ns/ical/")
    protected String calendarColor;
    @XmlElement(name = "calendar-order", namespace = "http://apple.com/ns/ical/")
    protected String calendarOrder;
    @XmlElement(name = "allowed-sharing-modes", namespace = "http://calendarserver.org/ns/")
    protected AllowedSharingModes allowedSharingModes;
    @XmlElement(namespace = "http://calendarserver.org/ns/")
    protected String getctag;
    @XmlElement(namespace = "http://calendarserver.org/ns/")
    protected Invite invite;
    @XmlElement(name = "max-resources", namespace = "http://calendarserver.org/ns/")
    protected String maxResources;
    @XmlElement(namespace = "http://calendarserver.org/ns/")
    protected String pushkey;
    @XmlElement(name = "shared-url", namespace = "http://calendarserver.org/ns/")
    protected SharedUrl sharedUrl;
    @XmlElement(name = "resource-class", namespace = "http://twistedmatrix.com/xml_namespace/dav/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String resourceClass;
    @XmlElement(name = "calendar-timezone", namespace = "urn:ietf:params:xml:ns:caldav")
    protected String calendarTimezone;
    @XmlElement(name = "max-attendees-per-instance", namespace = "urn:ietf:params:xml:ns:caldav")
    protected String maxAttendeesPerInstance;
    @XmlElement(name = "max-instances", namespace = "urn:ietf:params:xml:ns:caldav")
    protected String maxInstances;
    @XmlElement(name = "max-resource-size", namespace = "urn:ietf:params:xml:ns:caldav")
    protected String maxResourceSize;
    @XmlElement(name = "schedule-calendar-transp", namespace = "urn:ietf:params:xml:ns:caldav")
    protected ScheduleCalendarTransp scheduleCalendarTransp;
    @XmlElement(name = "supported-calendar-component-set", namespace = "urn:ietf:params:xml:ns:caldav")
    protected SupportedCalendarComponentSet supportedCalendarComponentSet;
    @XmlElement(name = "supported-calendar-component-sets", namespace = "urn:ietf:params:xml:ns:caldav")
    protected SupportedCalendarComponentSets supportedCalendarComponentSets;
    @XmlElement(name = "supported-calendar-data", namespace = "urn:ietf:params:xml:ns:caldav")
    protected SupportedCalendarData supportedCalendarData;
    @XmlElement(name = "default-alarm-vevent-date", namespace = "urn:ietf:params:xml:ns:caldav")
    protected String defaultAlarmVeventDate;
    @XmlElement(name = "default-alarm-vevent-datetime", namespace = "urn:ietf:params:xml:ns:caldav")
    protected String defaultAlarmVeventDatetime;
    @XmlElement(name = "calendar-description", namespace = "urn:ietf:params:xml:ns:caldav")
    protected String calendarDescription;

    /**
     * Gets the value of the acl property.
     * 
     * @return
     *     possible object is
     *     {@link Acl }
     *     
     */
    public Acl getAcl() {
        return acl;
    }

    /**
     * Sets the value of the acl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acl }
     *     
     */
    public void setAcl(Acl value) {
        this.acl = value;
    }

    /**
     * Gets the value of the aclRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link AclRestrictions }
     *     
     */
    public AclRestrictions getAclRestrictions() {
        return aclRestrictions;
    }

    /**
     * Sets the value of the aclRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclRestrictions }
     *     
     */
    public void setAclRestrictions(AclRestrictions value) {
        this.aclRestrictions = value;
    }

    /**
     * Gets the value of the addMember property.
     * 
     * @return
     *     possible object is
     *     {@link AddMember }
     *     
     */
    public AddMember getAddMember() {
        return addMember;
    }

    /**
     * Sets the value of the addMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddMember }
     *     
     */
    public void setAddMember(AddMember value) {
        this.addMember = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationdate() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationdate(String value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the currentUserPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentUserPrincipal }
     *     
     */
    public CurrentUserPrincipal getCurrentUserPrincipal() {
        return currentUserPrincipal;
    }

    /**
     * Sets the value of the currentUserPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentUserPrincipal }
     *     
     */
    public void setCurrentUserPrincipal(CurrentUserPrincipal value) {
        this.currentUserPrincipal = value;
    }

    /**
     * Gets the value of the currentUserPrivilegeSet property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentUserPrivilegeSet }
     *     
     */
    public CurrentUserPrivilegeSet getCurrentUserPrivilegeSet() {
        return currentUserPrivilegeSet;
    }

    /**
     * Sets the value of the currentUserPrivilegeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentUserPrivilegeSet }
     *     
     */
    public void setCurrentUserPrivilegeSet(CurrentUserPrivilegeSet value) {
        this.currentUserPrivilegeSet = value;
    }

    /**
     * Gets the value of the displayname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * Sets the value of the displayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayname(String value) {
        this.displayname = value;
    }

    /**
     * Gets the value of the getcontentlength property.
     * 
     * @return
     *     possible object is
     *     {@link Getcontentlength }
     *     
     */
    public Getcontentlength getGetcontentlength() {
        return getcontentlength;
    }

    /**
     * Sets the value of the getcontentlength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Getcontentlength }
     *     
     */
    public void setGetcontentlength(Getcontentlength value) {
        this.getcontentlength = value;
    }

    /**
     * Gets the value of the getcontenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetcontenttype() {
        return getcontenttype;
    }

    /**
     * Sets the value of the getcontenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetcontenttype(String value) {
        this.getcontenttype = value;
    }

    /**
     * Gets the value of the getetag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetetag() {
        return getetag;
    }

    /**
     * Sets the value of the getetag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetetag(String value) {
        this.getetag = value;
    }

    /**
     * Gets the value of the getlastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetlastmodified() {
        return getlastmodified;
    }

    /**
     * Sets the value of the getlastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetlastmodified(String value) {
        this.getlastmodified = value;
    }

    /**
     * Gets the value of the inheritedAclSet property.
     * 
     * @return
     *     possible object is
     *     {@link InheritedAclSet }
     *     
     */
    public InheritedAclSet getInheritedAclSet() {
        return inheritedAclSet;
    }

    /**
     * Sets the value of the inheritedAclSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link InheritedAclSet }
     *     
     */
    public void setInheritedAclSet(InheritedAclSet value) {
        this.inheritedAclSet = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Owner }
     *     
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Owner }
     *     
     */
    public void setOwner(Owner value) {
        this.owner = value;
    }

    /**
     * Gets the value of the principalCollectionSet property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalCollectionSet }
     *     
     */
    public PrincipalCollectionSet getPrincipalCollectionSet() {
        return principalCollectionSet;
    }

    /**
     * Sets the value of the principalCollectionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalCollectionSet }
     *     
     */
    public void setPrincipalCollectionSet(PrincipalCollectionSet value) {
        this.principalCollectionSet = value;
    }

    /**
     * Gets the value of the quotaAvailableBytes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuotaAvailableBytes() {
        return quotaAvailableBytes;
    }

    /**
     * Sets the value of the quotaAvailableBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuotaAvailableBytes(BigInteger value) {
        this.quotaAvailableBytes = value;
    }

    /**
     * Gets the value of the quotaUsedBytes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuotaUsedBytes() {
        return quotaUsedBytes;
    }

    /**
     * Sets the value of the quotaUsedBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuotaUsedBytes(BigInteger value) {
        this.quotaUsedBytes = value;
    }

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceId }
     *     
     */
    public ResourceId getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceId }
     *     
     */
    public void setResourceId(ResourceId value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the resourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link Resourcetype }
     *     
     */
    public Resourcetype getResourcetype() {
        return resourcetype;
    }

    /**
     * Sets the value of the resourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resourcetype }
     *     
     */
    public void setResourcetype(Resourcetype value) {
        this.resourcetype = value;
    }

    /**
     * Gets the value of the supportedPrivilegeSet property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedPrivilegeSet }
     *     
     */
    public SupportedPrivilegeSet getSupportedPrivilegeSet() {
        return supportedPrivilegeSet;
    }

    /**
     * Sets the value of the supportedPrivilegeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedPrivilegeSet }
     *     
     */
    public void setSupportedPrivilegeSet(SupportedPrivilegeSet value) {
        this.supportedPrivilegeSet = value;
    }

    /**
     * Gets the value of the supportedReportSet property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedReportSet }
     *     
     */
    public SupportedReportSet getSupportedReportSet() {
        return supportedReportSet;
    }

    /**
     * Sets the value of the supportedReportSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedReportSet }
     *     
     */
    public void setSupportedReportSet(SupportedReportSet value) {
        this.supportedReportSet = value;
    }

    /**
     * Gets the value of the supportedlock property.
     * 
     * @return
     *     possible object is
     *     {@link Supportedlock }
     *     
     */
    public Supportedlock getSupportedlock() {
        return supportedlock;
    }

    /**
     * Sets the value of the supportedlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supportedlock }
     *     
     */
    public void setSupportedlock(Supportedlock value) {
        this.supportedlock = value;
    }

    /**
     * Gets the value of the syncToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncToken() {
        return syncToken;
    }

    /**
     * Sets the value of the syncToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncToken(String value) {
        this.syncToken = value;
    }

    /**
     * Gets the value of the calendarColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarColor() {
        return calendarColor;
    }

    /**
     * Sets the value of the calendarColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarColor(String value) {
        this.calendarColor = value;
    }

    /**
     * Gets the value of the calendarOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarOrder() {
        return calendarOrder;
    }

    /**
     * Sets the value of the calendarOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarOrder(String value) {
        this.calendarOrder = value;
    }

    /**
     * Gets the value of the allowedSharingModes property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedSharingModes }
     *     
     */
    public AllowedSharingModes getAllowedSharingModes() {
        return allowedSharingModes;
    }

    /**
     * Sets the value of the allowedSharingModes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedSharingModes }
     *     
     */
    public void setAllowedSharingModes(AllowedSharingModes value) {
        this.allowedSharingModes = value;
    }

    /**
     * Gets the value of the getctag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetctag() {
        return getctag;
    }

    /**
     * Sets the value of the getctag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetctag(String value) {
        this.getctag = value;
    }

    /**
     * Gets the value of the invite property.
     * 
     * @return
     *     possible object is
     *     {@link Invite }
     *     
     */
    public Invite getInvite() {
        return invite;
    }

    /**
     * Sets the value of the invite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invite }
     *     
     */
    public void setInvite(Invite value) {
        this.invite = value;
    }

    /**
     * Gets the value of the maxResources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxResources() {
        return maxResources;
    }

    /**
     * Sets the value of the maxResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxResources(String value) {
        this.maxResources = value;
    }

    /**
     * Gets the value of the pushkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPushkey() {
        return pushkey;
    }

    /**
     * Sets the value of the pushkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPushkey(String value) {
        this.pushkey = value;
    }

    /**
     * Gets the value of the sharedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link SharedUrl }
     *     
     */
    public SharedUrl getSharedUrl() {
        return sharedUrl;
    }

    /**
     * Sets the value of the sharedUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedUrl }
     *     
     */
    public void setSharedUrl(SharedUrl value) {
        this.sharedUrl = value;
    }

    /**
     * Gets the value of the resourceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceClass() {
        return resourceClass;
    }

    /**
     * Sets the value of the resourceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceClass(String value) {
        this.resourceClass = value;
    }

    /**
     * Gets the value of the calendarTimezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarTimezone() {
        return calendarTimezone;
    }

    /**
     * Sets the value of the calendarTimezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarTimezone(String value) {
        this.calendarTimezone = value;
    }

    /**
     * Gets the value of the maxAttendeesPerInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAttendeesPerInstance() {
        return maxAttendeesPerInstance;
    }

    /**
     * Sets the value of the maxAttendeesPerInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAttendeesPerInstance(String value) {
        this.maxAttendeesPerInstance = value;
    }

    /**
     * Gets the value of the maxInstances property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxInstances() {
        return maxInstances;
    }

    /**
     * Sets the value of the maxInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxInstances(String value) {
        this.maxInstances = value;
    }

    /**
     * Gets the value of the maxResourceSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxResourceSize() {
        return maxResourceSize;
    }

    /**
     * Sets the value of the maxResourceSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxResourceSize(String value) {
        this.maxResourceSize = value;
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
     * Gets the value of the supportedCalendarComponentSet property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedCalendarComponentSet }
     *     
     */
    public SupportedCalendarComponentSet getSupportedCalendarComponentSet() {
        return supportedCalendarComponentSet;
    }

    /**
     * Sets the value of the supportedCalendarComponentSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedCalendarComponentSet }
     *     
     */
    public void setSupportedCalendarComponentSet(SupportedCalendarComponentSet value) {
        this.supportedCalendarComponentSet = value;
    }

    /**
     * Gets the value of the supportedCalendarComponentSets property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedCalendarComponentSets }
     *     
     */
    public SupportedCalendarComponentSets getSupportedCalendarComponentSets() {
        return supportedCalendarComponentSets;
    }

    /**
     * Sets the value of the supportedCalendarComponentSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedCalendarComponentSets }
     *     
     */
    public void setSupportedCalendarComponentSets(SupportedCalendarComponentSets value) {
        this.supportedCalendarComponentSets = value;
    }

    /**
     * Gets the value of the supportedCalendarData property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedCalendarData }
     *     
     */
    public SupportedCalendarData getSupportedCalendarData() {
        return supportedCalendarData;
    }

    /**
     * Sets the value of the supportedCalendarData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedCalendarData }
     *     
     */
    public void setSupportedCalendarData(SupportedCalendarData value) {
        this.supportedCalendarData = value;
    }

    /**
     * Gets the value of the defaultAlarmVeventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAlarmVeventDate() {
        return defaultAlarmVeventDate;
    }

    /**
     * Sets the value of the defaultAlarmVeventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAlarmVeventDate(String value) {
        this.defaultAlarmVeventDate = value;
    }

    /**
     * Gets the value of the defaultAlarmVeventDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAlarmVeventDatetime() {
        return defaultAlarmVeventDatetime;
    }

    /**
     * Sets the value of the defaultAlarmVeventDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAlarmVeventDatetime(String value) {
        this.defaultAlarmVeventDatetime = value;
    }
    
    /**
     * Gets the value of the calendarOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarDescription() {
        return calendarDescription;
    }

    /**
     * Sets the value of the calendarOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarDescription(String value) {
        this.calendarDescription = value;
    }

}
