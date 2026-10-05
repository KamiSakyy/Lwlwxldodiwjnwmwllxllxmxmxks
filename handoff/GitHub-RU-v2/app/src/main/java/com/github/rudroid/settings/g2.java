package com.github.rudroid.settings;

import com.github.rudroid.settings.SettingsNotificationsFragment;
import com.github.rudroid.settings.preferences.BadgeSwitchPreference;
import java.util.Map;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationsFragment$onViewCreated$1", f = "SettingsNotificationsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g2 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ SettingsNotificationsFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(SettingsNotificationsFragment settingsNotificationsFragment, a71.c cVar) {
        super(2, cVar);
        this.w = settingsNotificationsFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        g2 g2Var = new g2(this.w, cVar);
        g2Var.v = obj;
        return g2Var;
    }

    public final Object s(Object obj, Object obj2) {
        g2 r = r((a71.c) obj2, (Map) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        Map map = (Map) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        SettingsNotificationsFragment.a aVar2 = SettingsNotificationsFragment.Companion;
        ak.a aVar3 = ak.a.t;
        Boolean bool = (Boolean) map.get(aVar3);
        SettingsNotificationsFragment settingsNotificationsFragment = this.w;
        if (bool != null) {
            settingsNotificationsFragment.H4(bool.booleanValue(), aVar3, false);
        }
        ak.a aVar4 = ak.a.u;
        Boolean bool2 = (Boolean) map.get(aVar4);
        if (bool2 != null) {
            settingsNotificationsFragment.H4(bool2.booleanValue(), aVar4, false);
        }
        ak.a aVar5 = ak.a.v;
        Boolean bool3 = (Boolean) map.get(aVar5);
        if (bool3 != null) {
            settingsNotificationsFragment.H4(bool3.booleanValue(), aVar5, false);
        }
        ak.a aVar6 = ak.a.w;
        Boolean bool4 = (Boolean) map.get(aVar6);
        if (bool4 != null) {
            settingsNotificationsFragment.H4(bool4.booleanValue(), aVar6, false);
        }
        ak.a aVar7 = ak.a.x;
        Boolean bool5 = (Boolean) map.get(aVar7);
        if (bool5 != null) {
            settingsNotificationsFragment.H4(bool5.booleanValue(), aVar7, false);
        }
        ak.a aVar8 = ak.a.y;
        Boolean bool6 = (Boolean) map.get(aVar8);
        if (bool6 != null) {
            settingsNotificationsFragment.H4(bool6.booleanValue(), aVar8, false);
        }
        ak.a aVar9 = ak.a.z;
        Boolean bool7 = (Boolean) map.get(aVar9);
        if (bool7 != null) {
            boolean booleanValue = bool7.booleanValue();
            settingsNotificationsFragment.H4(booleanValue, aVar9, false);
            BadgeSwitchPreference t4 = settingsNotificationsFragment.t4("switch_enable_ci_activity_failed_only");
            if (t4 != null) {
                t4.D(booleanValue);
            }
        }
        ak.a aVar10 = ak.a.A;
        Boolean bool8 = (Boolean) map.get(aVar10);
        if (bool8 != null) {
            settingsNotificationsFragment.H4(bool8.booleanValue(), aVar10, false);
        }
        ak.a aVar11 = ak.a.B;
        Boolean bool9 = (Boolean) map.get(aVar11);
        if (bool9 != null) {
            settingsNotificationsFragment.H4(bool9.booleanValue(), aVar11, settingsNotificationsFragment.D4().N);
        }
        ak.a aVar12 = ak.a.C;
        Boolean bool10 = (Boolean) map.get(aVar12);
        if (bool10 != null) {
            settingsNotificationsFragment.H4(bool10.booleanValue(), aVar12, false);
        }
        return w61.a0.a;
    }
}
