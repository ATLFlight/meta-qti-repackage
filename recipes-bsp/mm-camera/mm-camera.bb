inherit qti-pkg

PACKAGES += " ${PN}-firmware"

#RPROVIDES_${PN} = "mm-camera"
#RPROVIDES_${PN}-firmware = "mm-camera-firmware"

#INITSCRIPT_NAME = "mm-qcamera"

# sdk-add-on provides libsensor_imu.so
#RDEPENDS_${PN} = "mm-camera-core sdk-add-on"

# The mm-camera package contains symlinks that trip up insane
INSANE_SKIP_${PN} = "ldflags"

#pkg_prerm_mmcamera() {
#   stop mm-qcamera
#   echo "Stopped mm-qcamera if necessary"
#}
