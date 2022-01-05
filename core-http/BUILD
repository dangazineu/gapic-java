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
    name = "core-http",
    srcs = glob(["src/main/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    maven_coordinates = "com.google.cloud:google-cloud-core-http:%s" % GAPIC_JAVA_VERSION,
    visibility = ["//visibility:public"],
    deps = [
        "//api-common",
        "//core",
        "//gax",
        "//gax-httpjson",
        "@maven//:com_google_api_client_google_api_client",
        "@maven//:com_google_auth_google_auth_library_credentials",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_http_client_google_http_client_appengine",
        "@maven//:io_opencensus_opencensus_api",
        "@maven//:io_opencensus_opencensus_contrib_http_util",
    ],
)

java_export(
    name = "core-http-tests",
    srcs = glob(["src/test/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    maven_coordinates = "com.google.cloud:google-cloud-core-http-tests:%s" % GAPIC_JAVA_VERSION,
    visibility = ["//visibility:public"],
    deps = [
        "core-http",
        "//core",
        "//gax",
        "@maven//:com_google_api_client_google_api_client",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_truth_truth",
        "@maven//:io_opencensus_opencensus_api",
        "@maven//:junit_junit",
        "@maven//:org_easymock_easymock",
    ],
)

java_tests(
    name = "tests",
    size = "small",
    srcs = glob(
        include = ["src/test/java/**/*Test.java"],
    ),
    runtime_deps = [":core-http-tests"],
)
