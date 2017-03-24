inherit qti-pkg

do_populate_sysroot() {
    install -d ${STAGING_LIBDIR}
    install -m 0644 ${D}/usr/lib/*.so ${STAGING_LIBDIR}
}
