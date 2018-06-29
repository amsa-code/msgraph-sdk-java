// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AssignedPlan;
import com.microsoft.graph.models.extensions.PasswordProfile;
import com.microsoft.graph.models.extensions.ProvisionedPlan;
import com.microsoft.graph.models.extensions.MailboxSettings;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.LicenseDetails;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.CalendarGroup;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Person;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.models.extensions.ContactFolder;
import com.microsoft.graph.models.extensions.InferenceClassification;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.PlannerUser;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.generated.BaseLicenseDetailsCollectionResponse;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionPage;
import com.microsoft.graph.requests.generated.BaseExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.generated.BaseMessageCollectionResponse;
import com.microsoft.graph.requests.extensions.MessageCollectionPage;
import com.microsoft.graph.requests.generated.BaseMailFolderCollectionResponse;
import com.microsoft.graph.requests.extensions.MailFolderCollectionPage;
import com.microsoft.graph.requests.generated.BaseCalendarCollectionResponse;
import com.microsoft.graph.requests.extensions.CalendarCollectionPage;
import com.microsoft.graph.requests.generated.BaseCalendarGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionPage;
import com.microsoft.graph.requests.generated.BaseEventCollectionResponse;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.generated.BaseEventCollectionResponse;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.generated.BasePersonCollectionResponse;
import com.microsoft.graph.requests.extensions.PersonCollectionPage;
import com.microsoft.graph.requests.generated.BaseContactCollectionResponse;
import com.microsoft.graph.requests.extensions.ContactCollectionPage;
import com.microsoft.graph.requests.generated.BaseContactFolderCollectionResponse;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionPage;
import com.microsoft.graph.requests.generated.BaseProfilePhotoCollectionResponse;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionPage;
import com.microsoft.graph.requests.generated.BaseDriveCollectionResponse;
import com.microsoft.graph.requests.extensions.DriveCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedDeviceCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedAppRegistrationCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceManagementTroubleshootingEventCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User.
 */
public class BaseUser extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Account Enabled.
     * 
     */
    @SerializedName("accountEnabled")
    @Expose
    public Boolean accountEnabled;

    /**
     * The Assigned Licenses.
     * 
     */
    @SerializedName("assignedLicenses")
    @Expose
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Assigned Plans.
     * 
     */
    @SerializedName("assignedPlans")
    @Expose
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * 
     */
    @SerializedName("businessPhones")
    @Expose
    public java.util.List<String> businessPhones;

    /**
     * The City.
     * 
     */
    @SerializedName("city")
    @Expose
    public String city;

    /**
     * The Company Name.
     * 
     */
    @SerializedName("companyName")
    @Expose
    public String companyName;

    /**
     * The Country.
     * 
     */
    @SerializedName("country")
    @Expose
    public String country;

    /**
     * The Department.
     * 
     */
    @SerializedName("department")
    @Expose
    public String department;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Given Name.
     * 
     */
    @SerializedName("givenName")
    @Expose
    public String givenName;

    /**
     * The Im Addresses.
     * 
     */
    @SerializedName("imAddresses")
    @Expose
    public java.util.List<String> imAddresses;

    /**
     * The Job Title.
     * 
     */
    @SerializedName("jobTitle")
    @Expose
    public String jobTitle;

    /**
     * The Mail.
     * 
     */
    @SerializedName("mail")
    @Expose
    public String mail;

    /**
     * The Mail Nickname.
     * 
     */
    @SerializedName("mailNickname")
    @Expose
    public String mailNickname;

    /**
     * The Mobile Phone.
     * 
     */
    @SerializedName("mobilePhone")
    @Expose
    public String mobilePhone;

    /**
     * The On Premises Immutable Id.
     * 
     */
    @SerializedName("onPremisesImmutableId")
    @Expose
    public String onPremisesImmutableId;

    /**
     * The On Premises Last Sync Date Time.
     * 
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Security Identifier.
     * 
     */
    @SerializedName("onPremisesSecurityIdentifier")
    @Expose
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
     * 
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Password Policies.
     * 
     */
    @SerializedName("passwordPolicies")
    @Expose
    public String passwordPolicies;

    /**
     * The Password Profile.
     * 
     */
    @SerializedName("passwordProfile")
    @Expose
    public PasswordProfile passwordProfile;

    /**
     * The Office Location.
     * 
     */
    @SerializedName("officeLocation")
    @Expose
    public String officeLocation;

    /**
     * The Postal Code.
     * 
     */
    @SerializedName("postalCode")
    @Expose
    public String postalCode;

    /**
     * The Preferred Language.
     * 
     */
    @SerializedName("preferredLanguage")
    @Expose
    public String preferredLanguage;

    /**
     * The Provisioned Plans.
     * 
     */
    @SerializedName("provisionedPlans")
    @Expose
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Proxy Addresses.
     * 
     */
    @SerializedName("proxyAddresses")
    @Expose
    public java.util.List<String> proxyAddresses;

    /**
     * The State.
     * 
     */
    @SerializedName("state")
    @Expose
    public String state;

    /**
     * The Street Address.
     * 
     */
    @SerializedName("streetAddress")
    @Expose
    public String streetAddress;

    /**
     * The Surname.
     * 
     */
    @SerializedName("surname")
    @Expose
    public String surname;

    /**
     * The Usage Location.
     * 
     */
    @SerializedName("usageLocation")
    @Expose
    public String usageLocation;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The User Type.
     * 
     */
    @SerializedName("userType")
    @Expose
    public String userType;

    /**
     * The Mailbox Settings.
     * 
     */
    @SerializedName("mailboxSettings")
    @Expose
    public MailboxSettings mailboxSettings;

    /**
     * The About Me.
     * 
     */
    @SerializedName("aboutMe")
    @Expose
    public String aboutMe;

    /**
     * The Birthday.
     * 
     */
    @SerializedName("birthday")
    @Expose
    public java.util.Calendar birthday;

    /**
     * The Hire Date.
     * 
     */
    @SerializedName("hireDate")
    @Expose
    public java.util.Calendar hireDate;

    /**
     * The Interests.
     * 
     */
    @SerializedName("interests")
    @Expose
    public java.util.List<String> interests;

    /**
     * The My Site.
     * 
     */
    @SerializedName("mySite")
    @Expose
    public String mySite;

    /**
     * The Past Projects.
     * 
     */
    @SerializedName("pastProjects")
    @Expose
    public java.util.List<String> pastProjects;

    /**
     * The Preferred Name.
     * 
     */
    @SerializedName("preferredName")
    @Expose
    public String preferredName;

    /**
     * The Responsibilities.
     * 
     */
    @SerializedName("responsibilities")
    @Expose
    public java.util.List<String> responsibilities;

    /**
     * The Schools.
     * 
     */
    @SerializedName("schools")
    @Expose
    public java.util.List<String> schools;

    /**
     * The Skills.
     * 
     */
    @SerializedName("skills")
    @Expose
    public java.util.List<String> skills;

    /**
     * The Device Enrollment Limit.
     * 
     */
    @SerializedName("deviceEnrollmentLimit")
    @Expose
    public Integer deviceEnrollmentLimit;

    /**
     * The Owned Devices.
     * 
     */
    public DirectoryObjectCollectionPage ownedDevices;

    /**
     * The Registered Devices.
     * 
     */
    public DirectoryObjectCollectionPage registeredDevices;

    /**
     * The Manager.
     * 
     */
    @SerializedName("manager")
    @Expose
    public DirectoryObject manager;

    /**
     * The Direct Reports.
     * 
     */
    public DirectoryObjectCollectionPage directReports;

    /**
     * The Member Of.
     * 
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Created Objects.
     * 
     */
    public DirectoryObjectCollectionPage createdObjects;

    /**
     * The Owned Objects.
     * 
     */
    public DirectoryObjectCollectionPage ownedObjects;

    /**
     * The License Details.
     * 
     */
    public LicenseDetailsCollectionPage licenseDetails;

    /**
     * The Extensions.
     * 
     */
    public ExtensionCollectionPage extensions;

    /**
     * The Messages.
     * 
     */
    public MessageCollectionPage messages;

    /**
     * The Mail Folders.
     * 
     */
    public MailFolderCollectionPage mailFolders;

    /**
     * The Calendar.
     * 
     */
    @SerializedName("calendar")
    @Expose
    public Calendar calendar;

    /**
     * The Calendars.
     * 
     */
    public CalendarCollectionPage calendars;

    /**
     * The Calendar Groups.
     * 
     */
    public CalendarGroupCollectionPage calendarGroups;

    /**
     * The Calendar View.
     * 
     */
    public EventCollectionPage calendarView;

    /**
     * The Events.
     * 
     */
    public EventCollectionPage events;

    /**
     * The People.
     * 
     */
    public PersonCollectionPage people;

    /**
     * The Contacts.
     * 
     */
    public ContactCollectionPage contacts;

    /**
     * The Contact Folders.
     * 
     */
    public ContactFolderCollectionPage contactFolders;

    /**
     * The Inference Classification.
     * 
     */
    @SerializedName("inferenceClassification")
    @Expose
    public InferenceClassification inferenceClassification;

    /**
     * The Photo.
     * 
     */
    @SerializedName("photo")
    @Expose
    public ProfilePhoto photo;

    /**
     * The Photos.
     * 
     */
    public ProfilePhotoCollectionPage photos;

    /**
     * The Drive.
     * 
     */
    @SerializedName("drive")
    @Expose
    public Drive drive;

    /**
     * The Drives.
     * 
     */
    public DriveCollectionPage drives;

    /**
     * The Planner.
     * 
     */
    @SerializedName("planner")
    @Expose
    public PlannerUser planner;

    /**
     * The Onenote.
     * 
     */
    @SerializedName("onenote")
    @Expose
    public Onenote onenote;

    /**
     * The Managed Devices.
     * 
     */
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Managed App Registrations.
     * 
     */
    public ManagedAppRegistrationCollectionPage managedAppRegistrations;

    /**
     * The Device Management Troubleshooting Events.
     * 
     */
    public DeviceManagementTroubleshootingEventCollectionPage deviceManagementTroubleshootingEvents;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("ownedDevices")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("ownedDevices@odata.nextLink")) {
                response.nextLink = json.get("ownedDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("ownedDevices").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            ownedDevices = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("registeredDevices")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("registeredDevices@odata.nextLink")) {
                response.nextLink = json.get("registeredDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("registeredDevices").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            registeredDevices = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("directReports")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("directReports@odata.nextLink")) {
                response.nextLink = json.get("directReports@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("directReports").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            directReports = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("memberOf")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("memberOf@odata.nextLink")) {
                response.nextLink = json.get("memberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("memberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            memberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("createdObjects")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("createdObjects@odata.nextLink")) {
                response.nextLink = json.get("createdObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("createdObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            createdObjects = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("ownedObjects")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("ownedObjects@odata.nextLink")) {
                response.nextLink = json.get("ownedObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("ownedObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            ownedObjects = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("licenseDetails")) {
            final BaseLicenseDetailsCollectionResponse response = new BaseLicenseDetailsCollectionResponse();
            if (json.has("licenseDetails@odata.nextLink")) {
                response.nextLink = json.get("licenseDetails@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("licenseDetails").toString(), JsonObject[].class);
            final LicenseDetails[] array = new LicenseDetails[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), LicenseDetails.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            licenseDetails = new LicenseDetailsCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("messages")) {
            final BaseMessageCollectionResponse response = new BaseMessageCollectionResponse();
            if (json.has("messages@odata.nextLink")) {
                response.nextLink = json.get("messages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("messages").toString(), JsonObject[].class);
            final Message[] array = new Message[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Message.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            messages = new MessageCollectionPage(response, null);
        }

        if (json.has("mailFolders")) {
            final BaseMailFolderCollectionResponse response = new BaseMailFolderCollectionResponse();
            if (json.has("mailFolders@odata.nextLink")) {
                response.nextLink = json.get("mailFolders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mailFolders").toString(), JsonObject[].class);
            final MailFolder[] array = new MailFolder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MailFolder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mailFolders = new MailFolderCollectionPage(response, null);
        }

        if (json.has("calendars")) {
            final BaseCalendarCollectionResponse response = new BaseCalendarCollectionResponse();
            if (json.has("calendars@odata.nextLink")) {
                response.nextLink = json.get("calendars@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendars").toString(), JsonObject[].class);
            final Calendar[] array = new Calendar[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Calendar.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendars = new CalendarCollectionPage(response, null);
        }

        if (json.has("calendarGroups")) {
            final BaseCalendarGroupCollectionResponse response = new BaseCalendarGroupCollectionResponse();
            if (json.has("calendarGroups@odata.nextLink")) {
                response.nextLink = json.get("calendarGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendarGroups").toString(), JsonObject[].class);
            final CalendarGroup[] array = new CalendarGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CalendarGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendarGroups = new CalendarGroupCollectionPage(response, null);
        }

        if (json.has("calendarView")) {
            final BaseEventCollectionResponse response = new BaseEventCollectionResponse();
            if (json.has("calendarView@odata.nextLink")) {
                response.nextLink = json.get("calendarView@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendarView").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendarView = new EventCollectionPage(response, null);
        }

        if (json.has("events")) {
            final BaseEventCollectionResponse response = new BaseEventCollectionResponse();
            if (json.has("events@odata.nextLink")) {
                response.nextLink = json.get("events@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("events").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            events = new EventCollectionPage(response, null);
        }

        if (json.has("people")) {
            final BasePersonCollectionResponse response = new BasePersonCollectionResponse();
            if (json.has("people@odata.nextLink")) {
                response.nextLink = json.get("people@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("people").toString(), JsonObject[].class);
            final Person[] array = new Person[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Person.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            people = new PersonCollectionPage(response, null);
        }

        if (json.has("contacts")) {
            final BaseContactCollectionResponse response = new BaseContactCollectionResponse();
            if (json.has("contacts@odata.nextLink")) {
                response.nextLink = json.get("contacts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("contacts").toString(), JsonObject[].class);
            final Contact[] array = new Contact[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Contact.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            contacts = new ContactCollectionPage(response, null);
        }

        if (json.has("contactFolders")) {
            final BaseContactFolderCollectionResponse response = new BaseContactFolderCollectionResponse();
            if (json.has("contactFolders@odata.nextLink")) {
                response.nextLink = json.get("contactFolders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("contactFolders").toString(), JsonObject[].class);
            final ContactFolder[] array = new ContactFolder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ContactFolder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            contactFolders = new ContactFolderCollectionPage(response, null);
        }

        if (json.has("photos")) {
            final BaseProfilePhotoCollectionResponse response = new BaseProfilePhotoCollectionResponse();
            if (json.has("photos@odata.nextLink")) {
                response.nextLink = json.get("photos@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("photos").toString(), JsonObject[].class);
            final ProfilePhoto[] array = new ProfilePhoto[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ProfilePhoto.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            photos = new ProfilePhotoCollectionPage(response, null);
        }

        if (json.has("drives")) {
            final BaseDriveCollectionResponse response = new BaseDriveCollectionResponse();
            if (json.has("drives@odata.nextLink")) {
                response.nextLink = json.get("drives@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("drives").toString(), JsonObject[].class);
            final Drive[] array = new Drive[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Drive.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            drives = new DriveCollectionPage(response, null);
        }

        if (json.has("managedDevices")) {
            final BaseManagedDeviceCollectionResponse response = new BaseManagedDeviceCollectionResponse();
            if (json.has("managedDevices@odata.nextLink")) {
                response.nextLink = json.get("managedDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedDevices").toString(), JsonObject[].class);
            final ManagedDevice[] array = new ManagedDevice[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDevice.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedDevices = new ManagedDeviceCollectionPage(response, null);
        }

        if (json.has("managedAppRegistrations")) {
            final BaseManagedAppRegistrationCollectionResponse response = new BaseManagedAppRegistrationCollectionResponse();
            if (json.has("managedAppRegistrations@odata.nextLink")) {
                response.nextLink = json.get("managedAppRegistrations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedAppRegistrations").toString(), JsonObject[].class);
            final ManagedAppRegistration[] array = new ManagedAppRegistration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedAppRegistration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedAppRegistrations = new ManagedAppRegistrationCollectionPage(response, null);
        }

        if (json.has("deviceManagementTroubleshootingEvents")) {
            final BaseDeviceManagementTroubleshootingEventCollectionResponse response = new BaseDeviceManagementTroubleshootingEventCollectionResponse();
            if (json.has("deviceManagementTroubleshootingEvents@odata.nextLink")) {
                response.nextLink = json.get("deviceManagementTroubleshootingEvents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceManagementTroubleshootingEvents").toString(), JsonObject[].class);
            final DeviceManagementTroubleshootingEvent[] array = new DeviceManagementTroubleshootingEvent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementTroubleshootingEvent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceManagementTroubleshootingEvents = new DeviceManagementTroubleshootingEventCollectionPage(response, null);
        }
    }
}
