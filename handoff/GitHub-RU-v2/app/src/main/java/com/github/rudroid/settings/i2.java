package com.github.rudroid.settings;

import androidx.preference.Preference;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationsFragment$onViewCreated$5", f = "SettingsNotificationsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i2 extends c71.j implements j71.e {
    public /* synthetic */ boolean v;
    public final /* synthetic */ SettingsNotificationsFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(SettingsNotificationsFragment settingsNotificationsFragment, a71.c cVar) {
        super(2, cVar);
        this.w = settingsNotificationsFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        i2 i2Var = new i2(this.w, cVar);
        i2Var.v = ((Boolean) obj).booleanValue();
        return i2Var;
    }

    public final Object s(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        i2 i2Var = (i2) r((a71.c) obj2, bool);
        w61.a0 a0Var = w61.a0.a;
        i2Var.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        boolean z = this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        Preference t4 = this.w.t4("notifications_ghes_disclaimer");
        if (t4 != null) {
            t4.D(z);
        }
        return w61.a0.a;
    }
}
