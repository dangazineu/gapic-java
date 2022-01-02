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
    name = "gax",
    srcs = glob(["src/main/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    plugins = ["//:autovalue_plugin"],
    visibility = ["//visibility:public"],
    deps = [
        "//api-common:api-common",
        "@maven//:com_google_auto_value_auto_value_annotations",
        "@maven//:com_google_auth_google_auth_library_credentials",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
        "@maven//:org_threeten_threetenbp",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_http_client_google_http_client_gson",
        "@maven//:io_opencensus_opencensus_api"
    ],
    maven_coordinates = "com.google.api:gax:%s" % GAPIC_JAVA_VERSION,
)

java_export(
    name = "gax-tests",
    srcs = glob(["src/test/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    plugins = ["//:autovalue_plugin"],
    resources = glob([
        "src/test/resources/com/google/api/gax/rpc/mtls/mtls_context_aware_metadata.json",
        "src/test/resources/com/google/api/gax/rpc/mtls/mtlsCertAndKey.pem",
    ]),
    visibility = ["//visibility:public"],
    deps = [
        ":gax",
        "//api-common:api-common",
        "@maven//:com_google_auto_value_auto_value_annotations",
        "@maven//:junit_junit",
        "@maven//:com_google_truth_truth",
        "@maven//:org_mockito_mockito_core",
        "@maven//:io_grpc_grpc_context",
        "@maven//:io_opencensus_opencensus_api",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        "@maven//:org_threeten_threetenbp",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_auth_google_auth_library_credentials",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
    ],
    maven_coordinates = "com.google.api:gax-tests:%s" % GAPIC_JAVA_VERSION,
)
#
java_tests(
    name = "tests",
    size = "small",
    srcs = glob(
        include = ["src/test/java/**/*Test.java"],
        exclude = ["src/test/java/**/Abstract*Test.java"],
    ),
    runtime_deps = [":gax-tests"],
)

google_java_format(
    name = "google_java_format",
    srcs = glob(["src/**/*.java"]),
    formatter = "//:google_java_format_binary",
)