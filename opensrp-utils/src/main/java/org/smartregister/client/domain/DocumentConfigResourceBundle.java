package org.smartregister.client.domain;

import java.util.ListResourceBundle;

public class DocumentConfigResourceBundle extends ListResourceBundle {

    private Object[][] properties;

    public DocumentConfigResourceBundle(Object[][] properties) {
        this.properties = properties;
    }

    @Override
    protected Object[][] getContents() {
        return properties;
    }
}
