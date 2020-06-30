package org.smartregister.client.utils.contract;

import java.util.Date;
import java.util.List;

/**
 * Created by Ephraim Kigamba - nek.eam@gmail.com on 26-06-2020.
 */
public interface ClientFormDao {

    /*
    TODO:
     1. Add this from the methods in clientFormRepository on core
     2. Move all the activity implementations to native-form
     3. Use the ClientFormDao inteface in native-form
     4. Create a ClientFormModel here that provides access to some properties
     5. Implement the data interfaces in core
     6. Finish fixing the other work on native-form
     */


    void addOrUpdate(ClientFormModel clientForm);

    void setIsNew(boolean isNew, int formId);

    /**
     * Get a list of ClientForms for the passed identifier
     *
     * @param identifier of a the client form
     * @return a list of ClientForms for the passed identifier
     */
    List<ClientFormModel> getClientFormByIdentifier(String identifier);

    /**
     * Get the active ClientForms for the passed identifier
     *
     * @param identifier of a the client form
     * @return active ClientForm for the passed identifier
     */
    ClientFormModel getActiveClientFormByIdentifier(String identifier);


    /**
     * Get the latest ClientForms for the passed identifier. The latest ClientForm might not be
     * active if unstable
     *
     * @param identifier of a the client form
     * @return active ClientForm for the passed identifier
     */
    ClientFormModel getLatestFormByIdentifier(String identifier);


    /**
     * Delete client form by id
     *
     * @param clientFormId
     */
    void delete(int clientFormId);

    ClientFormModel createNewClientFormModel();


    interface ClientFormModel {

        int getId();

        String getVersion();

        void setVersion(String version);

        String getIdentifier();

        void setIdentifier(String identifier);

        String getModule();

        void setModule(String module);

        String getJson();

        void setJson(String json);

        String getJurisdiction();

        void setJurisdiction(String jurisdiction);

        String getLabel();

        void setLabel(String label);

        boolean isActive();

        void setActive(boolean active);

        boolean isNew();

        void setNew(boolean aNew);

        Date getCreatedAt();

        void setCreatedAt(Date createdAt);

    }


}
