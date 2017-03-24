# meta-qti-repackage

This layer works with Yocto Morty release and is use to repackage the proprietary middleware released
for Snapdragon Flight.

## Layer dependencies

This layer depends on:

[meta-repackage](https://github.com/ATLFlight/meta-repackage)

## Prebuilt proprietary packages

Certain parts of the Snapdragon Flight BSP are proprietary.

The file prebuilt_sdflight-0.0.1.zip must be downloaded and unpacked in the ${COREBASE} directory.

Other than the LICENSE file, there are 2 types of files in the zip file:

- ipk files (installable packages)
- spkg files (build metadata needed for repackaging the ipk files)

## NOTE: prebuilt_sdflight-0.0.1.zip is not yet available
