inherit qti-pkg

# FIXME - useradd breaks the build
#inherit useradd

PV = "1.0"
PR = "r1"

RDEPENDS_${PN} = "glib-2.0"

# Must add new users and groups
# Create user and group named diag. And give id 53 same as in the executable diag_mdlog
#USERADD_PACKAGES = "${PN}"
#GROUPADD_PARAM_${PN} = "-g 53 diag" 
#USERADD_PARAM_${PN} = "-u 53 -g diag diag; -G diag linaro"

#do_install_append() {
#    chown -R diag:diag ${D}/var/log/diag_logs
#}
