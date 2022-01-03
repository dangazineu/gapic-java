load("//:gax_java.bzl", "google_java_format", "google_java_format_verification", "java_tests")
load("//:PROPERTIES.bzl", "GAPIC_JAVA_VERSION")
load("@rules_jvm_external//:defs.bzl", "java_export")

_JAVA_COPTS = [
    "-source",
    "1.8",
    "-target",
    "1.8",
]

java_export(
    name = "gax-httpjson",
    srcs = glob(["src/main/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    plugins = ["//:autovalue_plugin"],
    resources = ["//:dependencies.properties"],
    visibility = ["//visibility:public"],
    deps = [
        "//gax",
        "//api-common",
        "@maven//:com_google_code_gson_gson",
        "@maven//:com_google_auto_value_auto_value_annotations",
        "@maven//:com_google_auth_google_auth_library_credentials",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_http_client_google_http_client_gson",
        "@maven//:com_google_protobuf_protobuf_java",
        "@maven//:com_google_protobuf_protobuf_java_util",
        #        TODO replace this with an internal module reference
        "@maven//:com_google_api_grpc_proto_google_common_protos",
        "@maven//:org_threeten_threetenbp",
    ],
    maven_coordinates = "com.google.api:gax-httpjson:%s" % GAPIC_JAVA_VERSION,
)

java_export(
    name = "gax-httpjson-tests",
    srcs = glob(["src/test/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    plugins = ["//:autovalue_plugin"],
    visibility = ["//visibility:public"],
    deps = [
        ":gax-httpjson",
        "//api-common",
        "//gax",
        "//gax:gax-tests",
        "@maven//:com_google_code_gson_gson",
        "@maven//:com_google_auth_google_auth_library_credentials",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_http_client_google_http_client_gson",
        "@maven//:com_google_protobuf_protobuf_java",
        #        TODO replace this with an internal module reference
        "@maven//:com_google_api_grpc_proto_google_common_protos",
        "@maven//:org_threeten_threetenbp",
        "@maven//:junit_junit",
        "@maven//:com_google_truth_truth",
        "@maven//:org_mockito_mockito_core",
    ],
    maven_coordinates = "com.google.api:gax-httpjson-tests:%s" % GAPIC_JAVA_VERSION,
)

java_tests(
    name = "tests",
    size = "small",
    srcs = glob(
        include = ["src/test/java/**/*Test.java"],
        exclude = [
            "src/test/java/**/Abstract*Test.java",
        ],
    ),
    runtime_deps = [":gax-httpjson-tests"],
)
