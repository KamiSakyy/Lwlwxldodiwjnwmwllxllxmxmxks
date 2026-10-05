package com.github.rudroid.settings;

import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class h0 implements e7.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ h0(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final void h(Preference preference, Object obj) {
        switch (this.r) {
            case 0:
                SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment = (SettingsNotificationSchedulesFragment) this.s;
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    r0 A4 = settingsNotificationSchedulesFragment.A4();
                    v71.b0.z(androidx.lifecycle.d1.k(A4), (a71.h) null, (v71.a0) null, new s0(A4, booleanValue, new c0(settingsNotificationSchedulesFragment, 3), null), 3);
                    break;
                }
                break;
            default:
                PreferenceCategory preferenceCategory = (PreferenceCategory) this.s;
                Boolean bool2 = obj instanceof Boolean ? (Boolean) obj : null;
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    if (preferenceCategory != null) {
                        preferenceCategory.D(booleanValue2);
                        break;
                    }
                }
                break;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Preference<T1,T2,T3,T4> {
        public Preference() {
        }
    }
}
