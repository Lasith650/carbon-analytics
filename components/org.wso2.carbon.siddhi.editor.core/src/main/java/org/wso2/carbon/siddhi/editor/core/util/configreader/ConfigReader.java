package org.wso2.carbon.siddhi.editor.core.util.configreader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ConfigReader {
    private static final String COMPONENT_NAMESPACE = "wso2.editor.siddhiapp.deployer";
    private static final Logger log = LoggerFactory.getLogger(ConfigReader.class);


    /**
     * Read all the configs under given namespace from deployment.yaml of related runtime
     */
    public static Map<String, Object[]> readConfigs() {
        try {
            return (Map<String, Object[]>) DataHolder.getInstance()
                    .getConfigProvider().getConfigurationObject(COMPONENT_NAMESPACE);
        } catch (Exception e) {
            log.error("Failed to read deployment.yaml file . ", e);
        }
        return new HashMap<>();
    }
}
