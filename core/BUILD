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
    name = "core",
    srcs = glob(["src/main/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    maven_coordinates = "com.google.cloud:google-cloud-core:%s" % GAPIC_JAVA_VERSION,
    plugins = ["//:autovalue_plugin"],
    visibility = ["//visibility:public"],
    deps = [
        "//api-common",
        "//gax",
        "@maven//:com_google_auto_value_auto_value_annotations",
        "@maven//:com_google_auth_google_auth_library_credentials",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_http_client_google_http_client_gson",
        "@maven//:com_google_protobuf_protobuf_java",
        "@maven//:com_google_protobuf_protobuf_java_util",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        #        TODO replace this with an internal module reference
        "@maven//:com_google_api_grpc_proto_google_common_protos",
        "@maven//:com_google_api_grpc_proto_google_iam_v1",
        "@maven//:org_threeten_threetenbp",
    ],
)

java_export(
    name = "core-tests",
    srcs = glob(["src/test/java/**/*.java"]),
    javacopts = _JAVA_COPTS,
    maven_coordinates = "com.google.cloud:google-cloud-core-tests:%s" % GAPIC_JAVA_VERSION,
    plugins = ["//:autovalue_plugin"],
    visibility = ["//visibility:public"],
    deps = [
        "core",
        "//api-common",
        "//gax",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
        "@maven//:com_google_http_client_google_http_client",
        "@maven//:com_google_protobuf_protobuf_java",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_guava_guava_testlib",
        "@maven//:com_google_truth_truth",
        "@maven//:junit_junit",
        "@maven//:org_easymock_easymock",
        #        TODO replace this with an internal module reference
        "@maven//:com_google_api_grpc_proto_google_iam_v1",
        "@maven//:org_threeten_threetenbp",
    ],
)

java_tests(
    name = "tests",
    size = "small",
    srcs = glob(
        include = ["src/test/java/**/*Test.java"],
        exclude = ["src/test/java/**/Abstract*Test.java"],
    ),
    runtime_deps = [":core-tests"],
)
