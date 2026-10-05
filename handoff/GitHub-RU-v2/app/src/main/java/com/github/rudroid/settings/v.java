package com.github.rudroid.settings;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;

@c71.e(c = "com.github.rudroid.settings.SettingsFragment$onViewCreated$3", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ SettingsFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SettingsFragment settingsFragment, a71.c cVar) {
        super(2, cVar);
        this.w = settingsFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        v vVar = new v(this.w, cVar);
        vVar.v = obj;
        return vVar;
    }

    public final Object s(Object obj, Object obj2) {
        v r = r((a71.c) obj2, (com.github.rudroid.utilities.ui.g1) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        Preference I = ((PreferenceScreen) ((PreferenceFragmentCompat) this.w).u0.g).I("key_get_help");
        if (I != null) {
            com.github.rudroid.support.h hVar = (com.github.rudroid.support.h) g1Var.getData();
            boolean z = false;
            if (hVar != null && hVar.b) {
                z = true;
            }
            I.D(z);
        }
        return w61.a0.a;
    }
}
