package com.itvision.jira.plugin.customfield.combobox;

import com.atlassian.jira.issue.customfields.impl.GenericTextCFType;
import com.atlassian.jira.issue.customfields.manager.GenericConfigManager;
import com.atlassian.jira.issue.customfields.persistence.CustomFieldValuePersister;

public class JiraCustomCombobox extends GenericTextCFType {

	public JiraCustomCombobox(
			CustomFieldValuePersister customFieldValuePersister,
			GenericConfigManager genericConfigManager) {
		super(customFieldValuePersister, genericConfigManager);
		// TODO Auto-generated constructor stub
	}

}
