load("@rules_jvm_external//:defs.bzl", "artifact", "java_export")
load("//:PROPERTIES.bzl", "GAPIC_JAVA_VERSION")

java_proto_library(
    name = "api-java-protos",
    deps = [
        "@com_google_googleapis//google/api:annotations_proto",
        "@com_google_googleapis//google/api:auth_proto",
        "@com_google_googleapis//google/api:backend_proto",
        "@com_google_googleapis//google/api:billing_proto",
        "@com_google_googleapis//google/api:client_proto",
        "@com_google_googleapis//google/api:config_change_proto",
        "@com_google_googleapis//google/api:consumer_proto",
        "@com_google_googleapis//google/api:context_proto",
        "@com_google_googleapis//google/api:control_proto",
        "@com_google_googleapis//google/api:distribution_proto",
        "@com_google_googleapis//google/api:documentation_proto",
        "@com_google_googleapis//google/api:endpoint_proto",
        "@com_google_googleapis//google/api:error_reason_proto",
        "@com_google_googleapis//google/api:field_behavior_proto",
        "@com_google_googleapis//google/api:http_proto",
        "@com_google_googleapis//google/api:httpbody_proto",
        "@com_google_googleapis//google/api:label_proto",
        "@com_google_googleapis//google/api:launch_stage_proto",
        "@com_google_googleapis//google/api:log_proto",
        "@com_google_googleapis//google/api:logging_proto",
        "@com_google_googleapis//google/api:metric_proto",
        "@com_google_googleapis//google/api:monitored_resource_proto",
        "@com_google_googleapis//google/api:monitoring_proto",
        "@com_google_googleapis//google/api:quota_proto",
        "@com_google_googleapis//google/api:resource_proto",
        "@com_google_googleapis//google/api:routing_proto",
        "@com_google_googleapis//google/api:service_proto",
        "@com_google_googleapis//google/api:source_info_proto",
        "@com_google_googleapis//google/api:system_parameter_proto",
        "@com_google_googleapis//google/api:usage_proto",
        "@com_google_googleapis//google/api:visibility_proto",
        "@com_google_googleapis//google/longrunning:operations_proto",
    ],
)

java_proto_library(
    name = "longrunning-java-protos",
    deps = [
        "@com_google_googleapis//google/longrunning:operations_proto",
    ],
)

java_proto_library(
    name = "type-java-protos",
    deps = [
        "@com_google_googleapis//google/type:calendar_period_proto",
        "@com_google_googleapis//google/type:color_proto",
        "@com_google_googleapis//google/type:date_proto",
        "@com_google_googleapis//google/type:datetime_proto",
        "@com_google_googleapis//google/type:dayofweek_proto",
        "@com_google_googleapis//google/type:decimal_proto",
        "@com_google_googleapis//google/type:expr_proto",
        "@com_google_googleapis//google/type:fraction_proto",
        "@com_google_googleapis//google/type:interval_proto",
        "@com_google_googleapis//google/type:latlng_proto",
        "@com_google_googleapis//google/type:localized_text_proto",
        "@com_google_googleapis//google/type:money_proto",
        "@com_google_googleapis//google/type:month_proto",
        "@com_google_googleapis//google/type:phone_number_proto",
        "@com_google_googleapis//google/type:postal_address_proto",
        "@com_google_googleapis//google/type:quaternion_proto",
        "@com_google_googleapis//google/type:timeofday_proto",
    ],
)

java_proto_library(
    name = "rpc-java-protos",
    deps = [
        "@com_google_googleapis//google/rpc:code_proto",
        "@com_google_googleapis//google/rpc:error_details_proto",
        "@com_google_googleapis//google/rpc:status_proto",
    ],
)

java_export(
    name = "common-protos-proto",
    maven_coordinates = "com.google.api.grpc:proto-google-common-protos:%s" % GAPIC_JAVA_VERSION,
    visibility = ["//visibility:public"],
    exports = [
        "api-java-protos",
        "longrunning-java-protos",
        "rpc-java-protos",
        "type-java-protos",
    ],
    runtime_deps = [
        artifact("com.google.protobuf:protobuf-java"),
    ],
)
