load("//:gax_java.bzl", "google_java_format", "google_java_format_verification", "java_tests")
load("//:PROPERTIES.bzl", "GAPIC_JAVA_VERSION")
load("@rules_jvm_external//:defs.bzl", "java_export")

java_export(
    name = "api-common",
    srcs = glob(["src/main/java/**/*.java"]),
    maven_coordinates = "com.google.api:api-common:%s" % GAPIC_JAVA_VERSION,
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
)

java_export(
    name = "api-common-tests",
    srcs = glob(["src/test/java/**/*.java"]),
    maven_coordinates = "com.google.api:api-common-tests:%s" % GAPIC_JAVA_VERSION,
    deps = [
        "api-common",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_truth_truth",
        "@maven//:junit_junit",
    ],
)

java_tests(
    name = "tests",
    size = "small",
    srcs = glob(
        include = ["src/test/java/**/*Test.java"],
    ),
    runtime_deps = ["api-common-tests"],
)
