package com.github.rudroid.settings;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class q implements DialogInterface.OnClickListener {
    public final /* synthetic */ int r;
    public final /* synthetic */ ToolBarPreferenceFragmentCompat s;

    public /* synthetic */ q(ToolBarPreferenceFragmentCompat toolBarPreferenceFragmentCompat, int i) {
        this.r = i;
        this.s = toolBarPreferenceFragmentCompat;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.r) {
            case 0:
                com.github.rudroid.activities.m0 w3 = ((SettingsFragment) this.s).w3();
                k71.k.e(w3, "null cannot be cast to non-null type com.github.rudroid.activities.GitHubActivity");
                com.github.rudroid.activities.m0.h0(w3, (oa.j) null, (a0.g) null, 7);
                break;
            default:
                SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment = (SettingsNotificationSchedulesFragment) this.s;
                try {
                    Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", "com.github.rudroid");
                    settingsNotificationSchedulesFragment.E(intent, (Bundle) null);
                    break;
                } catch (ActivityNotFoundException unused) {
                    settingsNotificationSchedulesFragment.E(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.github.rudroid")), (Bundle) null);
                }
        }
    }
    public Object Z(Object p1) { return null; }
    public Object a() { return null; }
    public Object s(Object, Object, Object) { return null; }
}
