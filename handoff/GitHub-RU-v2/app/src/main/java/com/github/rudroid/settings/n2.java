package com.github.rudroid.settings;

import androidx.preference.Preference;
import com.github.rudroid.settings.SettingsSwipeFragment;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class n2 implements e7.k, u11.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ n2(int i, Object obj, Object obj2) {
        this.s = obj;
        this.t = obj2;
        this.r = i;
    }

    public Object j() {
        d51.d dVar = (d51.d) this.s;
        ((l51.h) dVar.d).H((m11.j) this.t, this.r + 1, false);
        return null;
    }

    public void t(Preference preference) {
        SettingsSwipeFragment settingsSwipeFragment = (SettingsSwipeFragment) this.s;
        String str = (String) this.t;
        SettingsSwipeFragment.a aVar = SettingsSwipeFragment.Companion;
        settingsSwipeFragment.E4(preference, str, this.r);
    }

}
