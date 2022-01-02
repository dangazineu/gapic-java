load("//:PROPERTIES.bzl", "GAPIC_JAVA_VERSION")
load("@rules_jvm_external//:defs.bzl", "java_export")

java_export(
    name = "api-common",
    srcs = glob(["src/main/java/**/*.java"]),
    plugins = [
        "autovalue_plugin",
    ],
    visibility = [
        "//visibility:public",
    ],
    deps = [
        "//:autovalue_plugin",
        "@maven//:com_google_auto_value_auto_value_annotations",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
    ],
    maven_coordinates = "com.google.api:api-common:%s" % GAPIC_JAVA_VERSION,
)

java_export(
    name = "api-common-tests",
    srcs = glob(["src/test/java/**/*.java"]),
    deps = [
        "api-common",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_truth_truth",
        "@maven//:junit_junit",
    ],
    maven_coordinates = "com.google.api:api-common-tests:%s" % GAPIC_JAVA_VERSION,
)

java_test(
    name = "tests",
    test_class = "com.google.api.TestSuite",
    runtime_deps = ["api-common-tests"]
)
