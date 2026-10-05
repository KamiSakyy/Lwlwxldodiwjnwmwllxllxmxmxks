package com.github.rudroid.settings;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.preference.Preference;
import com.github.rudroid.settings.SettingsNotificationsFragment;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c2 implements androidx.fragment.app.f1, e7.k, h.b {
    public final /* synthetic */ int r;
    public final /* synthetic */ SettingsNotificationsFragment s;

    public /* synthetic */ c2(SettingsNotificationsFragment settingsNotificationsFragment, int i) {
        this.r = i;
        this.s = settingsNotificationsFragment;
    }

    public void d(Object obj) {
        Boolean bool = (Boolean) obj;
        SettingsNotificationsFragment.a aVar = SettingsNotificationsFragment.Companion;
        k71.k.g(bool, "isGranted");
        if (bool.booleanValue()) {
            this.s.K4();
        }
    }

    public void e(String str, Bundle bundle) {
        switch (this.r) {
            case 0:
                SettingsNotificationsFragment.B4(this.s, str, bundle);
                break;
            default:
                SettingsNotificationsFragment.A4(this.s, str, bundle);
                break;
        }
    }

    public void t(Preference preference) {
        SettingsNotificationsFragment settingsNotificationsFragment = this.s;
        SettingsNotificationsFragment.a aVar = SettingsNotificationsFragment.Companion;
        try {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", "com.github.rudroid");
            settingsNotificationsFragment.E(intent, (Bundle) null);
        } catch (ActivityNotFoundException unused) {
            settingsNotificationsFragment.E(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.github.rudroid")), (Bundle) null);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Preference<T1,T2,T3,T4> {
        public Preference() {
        }
    }
}
