package com.github.rudroid.settings;

import com.github.rudroid.settings.SettingsSwipeFragment;
import com.github.rudroid.settings.preferences.SwipeActionPreference;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class p2 implements androidx.lifecycle.q0, k71.g {
    public final /* synthetic */ SettingsSwipeFragment r;

    public p2(SettingsSwipeFragment settingsSwipeFragment) {
        this.r = settingsSwipeFragment;
    }

    public final void a(Object obj) {
        h3 h3Var = (h3) obj;
        k71.k.g(h3Var, "p0");
        SettingsSwipeFragment.a aVar = SettingsSwipeFragment.Companion;
        SettingsSwipeFragment settingsSwipeFragment = this.r;
        SwipeActionPreference swipeActionPreference = (SwipeActionPreference) settingsSwipeFragment.t4("right_swipe");
        if (swipeActionPreference != null) {
            settingsSwipeFragment.D4(h3Var.a, swipeActionPreference);
        }
        SwipeActionPreference swipeActionPreference2 = (SwipeActionPreference) settingsSwipeFragment.t4("left_swipe");
        if (swipeActionPreference2 != null) {
            settingsSwipeFragment.D4(h3Var.b, swipeActionPreference2);
        }
    }

    public final w61.e b() {
        return new k71.i(1, this.r, SettingsSwipeFragment.class, "onSwipeSettingChanges", "onSwipeSettingChanges(Lcom/github/rudroid/settings/SwipeActionsData;)V", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof androidx.lifecycle.q0) && (obj instanceof k71.g)) {
            return b().equals(((k71.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
