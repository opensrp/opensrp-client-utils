package org.smartregister.client.utils.domain;

import java.io.Serializable;
import java.util.Set;

public class Form implements Serializable {

    private String name;

    private int homeAsUpIndicator;

    private int actionBarBackground;
    private int navigationBackground;

    private int backIcon;

    private String nextLabel;
    private String previousLabel;
    private String saveLabel;

    private boolean wizard = true;
    private boolean hideSaveLabel = false;

    private boolean hideNextButton = false;
    private boolean hidePreviousButton = false;

    private Set<String> hiddenFields;

    private Set<String> disabledFields;

    private boolean hideNextIcon = false;
    private boolean hidePreviousIcon = false;
    private boolean showNextInToolbarWhenWizard = false;

    private boolean greyOutSaveWhenFormInvalid = false;

    private static String datePickerDisplayFormat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHomeAsUpIndicator() {
        return homeAsUpIndicator;
    }

    public void setHomeAsUpIndicator(int homeAsUpIndicator) {
        this.homeAsUpIndicator = homeAsUpIndicator;
    }

    public int getActionBarBackground() {
        return actionBarBackground;
    }

    public void setActionBarBackground(int actionBarBackground) {
        this.actionBarBackground = actionBarBackground;
    }

    public int getNavigationBackground() {
        return navigationBackground;
    }

    public void setNavigationBackground(int navigationBackground) {
        this.navigationBackground = navigationBackground;
    }

    public boolean isWizard() {
        return wizard;
    }

    public void setWizard(boolean wizard) {
        this.wizard = wizard;
    }

    public String getNextLabel() {
        return nextLabel;
    }

    public void setNextLabel(String nextLabel) {
        this.nextLabel = nextLabel;
    }

    public String getPreviousLabel() {
        return previousLabel;
    }

    public void setPreviousLabel(String previousLabel) {
        this.previousLabel = previousLabel;
    }

    public String getSaveLabel() {
        return saveLabel;
    }

    public void setSaveLabel(String saveLabel) {
        this.saveLabel = saveLabel;
    }

    public boolean isHideSaveLabel() {
        return hideSaveLabel;
    }

    public void setHideSaveLabel(boolean hideSaveLabel) {
        this.hideSaveLabel = hideSaveLabel;
    }

    public int getBackIcon() {
        return backIcon;
    }

    public void setBackIcon(int backIcon) {
        this.backIcon = backIcon;
    }

    public void setHideNextButton(Boolean b){
        hideNextButton = b;
    }

    public void setHidePreviousButton(Boolean b){
        hidePreviousButton = b;
    }

    public boolean isHideNextButton(){
        return hideNextButton;
    }

    public boolean isHidePreviousButton() {
        return hidePreviousButton;
    }

    public Set<String> getHiddenFields() {
        return hiddenFields;
    }

    public void setHiddenFields(Set<String> hiddenFields) {
        this.hiddenFields = hiddenFields;
    }

    public Set<String> getDisabledFields() {
        return disabledFields;
    }

    public void setDisabledFields(Set<String> disabledFields) {
        this.disabledFields = disabledFields;
    }

    public static String getDatePickerDisplayFormat() {
        return datePickerDisplayFormat;
    }

    public void setDatePickerDisplayFormat(String datePickerDisplayFormat) {
        Form.datePickerDisplayFormat = datePickerDisplayFormat;
    }

    public boolean isHideNextIcon() {
        return hideNextIcon;
    }

    public void setHideNextIcon(boolean hideNextIcon) {
        this.hideNextIcon = hideNextIcon;
    }

    public boolean isHidePreviousIcon() {
        return hidePreviousIcon;
    }

    public void setHidePreviousIcon(boolean hidePreviousIcon) {
        this.hidePreviousIcon = hidePreviousIcon;
    }

    public boolean isShowNextInToolbarWhenWizard() {
        return showNextInToolbarWhenWizard;
    }

    public void setShowNextInToolbarWhenWizard(boolean showNextInToolbarWhenWizard) {
        this.showNextInToolbarWhenWizard = showNextInToolbarWhenWizard;
    }

    public boolean isGreyOutSaveWhenFormInvalid() {
        return greyOutSaveWhenFormInvalid;
    }

    public void setGreyOutSaveWhenFormInvalid(boolean greyOutSaveWhenFormInvalid) {
        this.greyOutSaveWhenFormInvalid = greyOutSaveWhenFormInvalid;
    }
}
