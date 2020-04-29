SUMMARY = "A curses client for the Music Player Daemon"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
HOMEPAGE = "https://www.musicpd.org/clients/ncmpc/"

inherit meson

DEPENDS += " \
    boost \
    ncurses \
    libmpdclient \
"

PACKAGECONFIG ??= "colors locale mouse nls regex help_screen artist_screen search_screen song_screen key_screen lyrics_screen outputs_screen"

PACKAGECONFIG[colors] = "-Dcolors=true,-Dcolors=false"
PACKAGECONFIG[lirc] = "-Dlirc=enabled,-Dlirc=disabled,lirc"
PACKAGECONFIG[locale] = "-Dlocale=enabled,-Dlocale=disabled"
PACKAGECONFIG[mini] = "-Dmini=true,-Dmini=false"
PACKAGECONFIG[mouse] = "-Dmouse=enabled,-Dmouse=disabled"
PACKAGECONFIG[nls] = "-Dnls=enabled,-Dnls=disabled,gettext-native"
PACKAGECONFIG[regex] = "-Dregex=enabled,-Dregex=disabled,pcre"

PACKAGECONFIG[help_screen] = "-Dhelp_screen=true,-Dhelp_screen=false"
PACKAGECONFIG[artist_screen] = "-Dartist_screen=true,-Dartist_screen=false"
PACKAGECONFIG[search_screen] = "-Dsearch_screen=true,-Dsearch_screen=false"
PACKAGECONFIG[song_screen] = "-Dsong_screen=true,-Dsong_screen=false"
PACKAGECONFIG[key_screen] = "-Dkey_screen=true,-Dkey_screen=false"
PACKAGECONFIG[lyrics_screen] = "-Dlyrics_screen=true,-Dlyrics_screen=false"
PACKAGECONFIG[outputs_screen] = "-Doutputs_screen=true,-Doutputs_screen=false"
PACKAGECONFIG[chat_screen] = "-Dchat_screen=true,-Dchat_screen=false"

SRC_URI = " \
    git://github.com/MusicPlayerDaemon/ncmpc \
"
SRCREV = "8e98f89ff07b140e6357dab2a9a9f6432ae0e521"
S = "${WORKDIR}/git"
