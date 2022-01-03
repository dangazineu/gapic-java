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
    maven_coordinates = "com.google.api:gax:%s" % GAPIC_JAVA_VERSION,
    plugins = ["//:autovalue_plugin"],
    resources = ["//:dependencies.properties"],
    visibility = ["//visibility:public"],
    deps = [
        "//api-common",
        "@maven//:com_google_auth_google_auth_library_credentials",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
        "@maven//:com_google_auto_value_auto_value_annotations",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_http_client_google_http_client_gson",
        "@maven//:io_opencensus_opencensus_api",
        "@maven//:org_threeten_threetenbp",
    ],
)

java_export(
    name = "gax-tests",
    srcs = glob(["src/test/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    maven_coordinates = "com.google.api:gax-tests:%s" % GAPIC_JAVA_VERSION,
    plugins = ["//:autovalue_plugin"],
    resources = glob([
        "src/test/resources/com/google/api/gax/rpc/mtls/mtls_context_aware_metadata.json",
        "src/test/resources/com/google/api/gax/rpc/mtls/mtlsCertAndKey.pem",
    ]),
    visibility = ["//visibility:public"],
    deps = [
        ":gax",
        "//api-common",
        "@maven//:com_google_auth_google_auth_library_credentials",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
        "@maven//:com_google_auto_value_auto_value_annotations",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_truth_truth",
        "@maven//:io_grpc_grpc_context",
        "@maven//:io_opencensus_opencensus_api",
        "@maven//:junit_junit",
        "@maven//:org_mockito_mockito_core",
        "@maven//:org_threeten_threetenbp",
    ],
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
