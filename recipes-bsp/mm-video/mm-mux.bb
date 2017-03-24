inherit qti-pkg

DESCRIPTION = "mm-mux muxer application and libs"
SECTION = "base"

RDEPENDS_${PN} += "mm-mux-noship glib-2.0 libnl"
