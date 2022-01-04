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
    name = "core-grpc",
    srcs = glob(["src/main/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    maven_coordinates = "com.google.cloud:google-cloud-core-grpc:%s" % GAPIC_JAVA_VERSION,
    visibility = ["//visibility:public"],
    deps = [
        "//api-common",
        "//core",
        "//gax",
        "//gax-grpc",
        "@maven//:com_google_auth_google_auth_library_credentials",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:io_grpc_grpc_core",
    ],
)

java_export(
    name = "core-grpc-tests",
    srcs = glob(["src/test/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    maven_coordinates = "com.google.cloud:google-cloud-core-grpc-tests:%s" % GAPIC_JAVA_VERSION,
    visibility = ["//visibility:public"],
    deps = [
        "core-grpc",
        "//core",
        "//gax",
        "//gax-grpc",
        "@maven//:io_grpc_grpc_api",
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
    runtime_deps = [":core-grpc-tests"],
)
