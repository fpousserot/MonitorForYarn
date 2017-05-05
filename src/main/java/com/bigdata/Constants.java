package com.bigdata;

/**
 * Created by bianzexin on 17/3/30.
 */
public interface Constants {
    final static String PROPERTIES = "conf.properties";

    String YARN_APPLICATIONS_PATH = "yarn_applications_path";
    String RM_ADDRESS = "rm_address";
    String SCHEDULE_PERIOD = "schedule_period";

    String KAFKA_TOPIC = "kafka_topic";
    String KAFKA_BROKER_LIST = "kafka_broker_list";

    String HTTP_SERVER = "http_server";

    String PRODUCER = "producer";
    String KAFKA_PRODUCER = "kafka";
    String LOGGER_PRODUCER = "logger";
    String HTTP_PRODUCER = "http";

    String FORMAT = "format";
    String CSV = "csv";
    String JSON = "json";
    String CORE_POOL_SIZE = "scheduled_executor_corepoolsize";

    String YARN_METRIC_PATH = "cluset_metric_path";
}
