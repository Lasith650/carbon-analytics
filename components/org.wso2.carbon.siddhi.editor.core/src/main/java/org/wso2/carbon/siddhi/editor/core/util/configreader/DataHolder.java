package org.wso2.carbon.siddhi.editor.core.util.configreader;

import org.wso2.carbon.config.provider.ConfigProvider;

public class DataHolder {
    private static DataHolder instance = new DataHolder();
    private ConfigProvider configProvider;

    private DataHolder(){
    }

    /**
     * Provide instance of DataHolder class.
     *
     * @return Instance of DataHolder
     */
    public static DataHolder getInstance() { return instance; }

    /**
     * Returns config provider.
     *
     * @return Instance of config provider
     */
    public ConfigProvider getConfigProvider() { return this.configProvider; }

    /**
     * Sets instance of config provider.
     *
     * @param configProvider Instance of config provider
     */
    public void setConfigProvider(ConfigProvider configProvider) { this.configProvider = configProvider; }
}




