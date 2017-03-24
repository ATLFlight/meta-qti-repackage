inherit qti-pkg

DESCRIPTION = "mm-mux-noship libs prebuilt"
SECTION = "base"

FILES_${PN} = "/usr/lib/mm-mux-noship/*.so.*"
FILES_${PN}-dev = "/usr/lib/mm-mux-noship/*.so \
                   /usr/include/"
