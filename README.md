Nothing super fancy here. This just sets `config_minNumVisibleRecentTasks` to 5000 and `config_activeTaskDurationHours` to 5000 (over half a year). This should effectively stop android from automatically closing apps.

Xposed/EdExposed/LSPosed required.

Just install the apk, and if you're using LSPosed, enable it for System Framework. Restart and it should work.

Thanks to @JingMatrix for keeping LSPosed alive and to all the previous LSPosed/EdExposed/Xposed devs!
