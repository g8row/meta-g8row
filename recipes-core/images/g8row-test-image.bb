
IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_INSTALL:append = " dropbear"
IMAGE_FEATURES:append = " package-management" 
IMAGE_LINGUAS = " "
inherit core-g8row-image
IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", "+ 4096","",d)}"

#GPU_MEM = "16"
#DISTRO_FEATURES:append = " systemd"
#VIRTUAL-RUNTIME_init_manager = "systemd"
#DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
#VIRTUAL-RUNTIME_initscripts = ""
#ENABLE_UART = "1"
#RPI_USE_U_BOOT = "1"


