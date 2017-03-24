inherit qti-pkg

DESCRIPTION = "mm-camera-lib prebuilt libraries"
SECTION = "base"

DEBIAN_NOAUTONAME_${PN} = "1" 

# FIXME - links to build filesystem
INSANE_SKIP_${PN} = "symlink-to-sysroot arch"

INSANE_SKIP_${PN} += " arch"
