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
        "com.google.guava:guava-testlib:31.0.1-jre",
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
        "com.google.protobuf:protobuf-java:3.19.1",

#       TODO replace the following com.google.api* libraries with internal references
        "com.google.api.grpc:grpc-google-common-protos:2.7.0",
        "com.google.api.grpc:proto-google-iam-v1:1.2.0",
        "com.google.api-client:google-api-client:1.32.2",
        # FIXME it doesn't seem correct for the core library to have dependency on appengine
        "com.google.http-client:google-http-client-appengine:1.40.1",

        "io.opencensus:opencensus-api:0.28.0",
        "io.opencensus:opencensus-contrib-http-util:0.28.0",
        "org.mockito:mockito-core:2.28.2",
        "org.easymock:easymock:3.6",
        "io.grpc:grpc-context:1.42.1",
        "io.grpc:grpc-api:1.42.1",
        "io.grpc:grpc-alts:1.42.1",
        "io.grpc:grpc-auth:1.42.1",
        "io.grpc:grpc-core:1.42.1",
        "io.grpc:grpc-stub:1.42.1",
        "io.grpc:grpc-protobuf:1.42.1",
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

http_archive(
    name = "com_google_googleapis",
     strip_prefix = "googleapis-4079d6539fa85b1d5829cfe2369f1ff054f4db77",
     urls = [
         # FIXME Referencing a branch from my own fork of googleapis without any language-specific rules.
         #  Ideally the central googleapis repository would only concern itself with exposing proto files
         "https://github.com/danielgazineu/googleapis/archive/4079d6539fa85b1d5829cfe2369f1ff054f4db77.zip",
     ],
)
# This is not needed if we don't rely on googleapis language-specific rules.
#load("@com_google_googleapis//:repository_rules.bzl", "switched_rules_by_language")
#switched_rules_by_language(
#    name = "com_google_googleapis_imports",
#    gapic = True,
#    grpc = True,
#    java = True,
#)

# This is to satisfy com_google_googleapis usage of protobuf
http_archive(
    name = "com_google_protobuf",
    sha256 = "9111bf0b542b631165fadbd80aa60e7fb25b25311c532139ed2089d76ddf6dd7",
    strip_prefix = "protobuf-3.18.1",
    urls = ["https://github.com/protocolbuffers/protobuf/archive/v3.18.1.tar.gz"],
)
load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")
protobuf_deps()