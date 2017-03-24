SUMMARY = "The list of QTI proprietary packages"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = "${PN}"

RDEPENDS_${PN} = " \
    adreno200 \
    adsprpc \
    ath6kl-utils \
    ath6kl-firmware \
    configdb \
    diag \
    dsutils \
    fastmmi \
    ftmdaemon \
    math-cl \
    mm-camera \
    mm-camera-core \
    mm-camera-lib \
    mm-mux-noship \
    mm-still \
    mm-video \
    mm-video-firmware \
    mp-decision \
    perf-tools \
    qcom-common \
    qmi \
    qmi-framework \
    remote-debug-agent \
    reboot2fastboot \
    ss-restart \
    thermal-engine \
    xmllib \
    "
