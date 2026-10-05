package com.github.rudroid.settings;

import com.github.rudroid.settings.SettingsNotificationsFragment;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g0 implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ ToolBarPreferenceFragmentCompat s;

    public /* synthetic */ g0(ToolBarPreferenceFragmentCompat toolBarPreferenceFragmentCompat, int i) {
        this.r = i;
        this.s = toolBarPreferenceFragmentCompat;
    }

    public final Object a() {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        ToolBarPreferenceFragmentCompat toolBarPreferenceFragmentCompat = this.s;
        switch (i) {
            case 0:
                ((h) ((SettingsNotificationSchedulesFragment) toolBarPreferenceFragmentCompat).I0.getValue()).P();
                break;
            default:
                SettingsNotificationsFragment.a aVar = SettingsNotificationsFragment.Companion;
                ((h) ((SettingsNotificationsFragment) toolBarPreferenceFragmentCompat).I0.getValue()).P();
                break;
        }
        return a0Var;
    }
}
