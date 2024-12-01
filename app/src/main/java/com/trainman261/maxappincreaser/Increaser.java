package com.trainman261.maxappincreaser;
import android.content.res.XResources;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
public class Increaser implements IXposedHookZygoteInit{
    @Override
    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) throws Throwable{
        XposedBridge.log("setting replacement values...");
        XResources.setSystemWideReplacement("android", "integer", "config_minNumVisibleRecentTasks", 5000);
        XResources.setSystemWideReplacement("android", "integer", "config_activeTaskDurationHours", 5000);
        XposedBridge.log("replacement values set");
    }
}
