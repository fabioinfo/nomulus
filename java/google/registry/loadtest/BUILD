package(
    default_visibility = ["//visibility:public"],
)

licenses(["notice"])  # Apache 2.0


java_library(
    name = "loadtest",
    srcs = glob(["*.java"]),
    resources = glob(["templates/*.xml"]),
    deps = [
        "//java/com/google/common/base",
        "//java/com/google/common/collect",
        "//java/com/google/common/net",
        "//third_party/java/appengine:appengine-api",
        "//third_party/java/dagger",
        "//third_party/java/joda_time",
        "//third_party/java/jsr330_inject",
        "//third_party/java/objectify:objectify-v4_1",
        "//third_party/java/servlet/servlet_api",
        "//java/google/registry/config",
        "//java/google/registry/request",
        "//java/google/registry/security",
        "//java/google/registry/util",
    ],
)
