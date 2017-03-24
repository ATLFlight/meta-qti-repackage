inherit qti-pkg

pkg_prerm_thermal() {
   stop thermald
   echo "Stopped thermald if necessary"
}
