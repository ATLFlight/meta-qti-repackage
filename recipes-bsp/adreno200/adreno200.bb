inherit qti-pkg

DESCRIPTION = "Adreno libraries, firmware and headers"
SECTION = "base"

PACKAGES = "${PN} ${PN}-dev ${PN}-firmware"

PV = "1.0"
PR = "r0"

RDEPENDS_${PN} = "zlib glib-2.0"
