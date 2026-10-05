package com.github.rudroid.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.github.rudroid.settings.copilot.CopilotChatSettingsActivity;

@c71.e(c = "com.github.rudroid.settings.SettingsFragment$onViewCreated$4", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class w extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ SettingsFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SettingsFragment settingsFragment, a71.c cVar) {
        super(2, cVar);
        this.w = settingsFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        w wVar = new w(this.w, cVar);
        wVar.v = obj;
        return wVar;
    }

    public final Object s(Object obj, Object obj2) {
        w r = r((a71.c) obj2, (eg.d) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        eg.d dVar = (eg.d) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        final SettingsFragment settingsFragment = this.w;
        PreferenceCategory I = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment).u0.g).I("key_category_subscriptions");
        if (I != null) {
            I.D(dVar.a);
            if (((Preference) I).O) {
                final boolean z = dVar.c;
                final boolean z2 = dVar.b;
                xn.e1 e1Var = dVar.d;
                Preference I2 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment).u0.g).I("key_settings_copilot");
                if (I2 != null) {
                    I2.B(fg.h.a(e1Var, settingsFragment.i4()));
                    I2.w = new e7.k() { // from class: com.github.rudroid.settings.t
                        public final void t(Preference preference) {
                            boolean z3 = z2;
                            SettingsFragment settingsFragment2 = settingsFragment;
                            if (z3) {
                                CopilotChatSettingsActivity.a aVar2 = CopilotChatSettingsActivity.Companion;
                                Context i4 = settingsFragment2.i4();
                                aVar2.getClass();
                                settingsFragment2.E(new Intent(i4, (Class<?>) CopilotChatSettingsActivity.class), (Bundle) null);
                                return;
                            }
                            if (z) {
                                androidx.fragment.app.t tVar = settingsFragment2.P0;
                                if (tVar != null) {
                                    tVar.a(new com.github.rudroid.settings.copilot.paywall.m(xn.e1.u));
                                } else {
                                    k71.k.m("copilotChatFreeVsProPaywallLauncher");
                                    throw null;
                                }
                            }
                        }
                    };
                }
            }
        }
        PreferenceCategory I3 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment).u0.g).I("key_divider_subscriptions");
        if (I3 != null) {
            I3.D(dVar.a);
        }
        return w61.a0.a;
    }
}
