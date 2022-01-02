load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "4.2"

RULES_JVM_EXTERNAL_SHA = "cd1a77b7b02e8e008439ca76fd34f5b07aecb8c752961f9640dea15e9e5ba1ca"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "junit:junit:4.12",
        "com.google.guava:guava:31.0.1-jre",
        "com.google.auto.value:auto-value:1.8.2",
        "com.google.auto.value:auto-value-annotations:1.8.2",
        "com.google.code.findbugs:jsr305:3.0.2",
        "com.google.truth:truth:1.1.3",
        "com.google.auth:google-auth-library-credentials:1.2.1",
        "com.google.auth:google-auth-library-oauth2-http:1.2.1",
        "org.threeten:threetenbp:1.5.0",
        "com.google.code.gson:gson:2.8.6",
        "com.google.http-client:google-http-client-gson:1.40.1",
        "com.google.http-client:google-http-client:1.40.1",
        "io.opencensus:opencensus-api:0.28.0",
        "org.mockito:mockito-core:2.28.2",
        "io.grpc:grpc-context:1.42.1"
    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")
rules_jvm_external_deps()
load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")
rules_jvm_external_setup()