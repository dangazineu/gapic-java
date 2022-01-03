java_plugin(
    name = "autovalue_plugin",
    generates_api = 1,
    processor_class = "com.google.auto.value.processor.AutoValueProcessor",
    visibility = [
        "//visibility:public",
    ],
    deps = ["@maven//:com_google_auto_value_auto_value"],
)

# This file is not needed for dependency management anymore
# TODO remove runtime dependency on this file, and delete this target.
exports_files(["dependencies.properties"])
