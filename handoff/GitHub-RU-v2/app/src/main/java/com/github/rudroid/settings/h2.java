package com.github.rudroid.settings;

import androidx.preference.Preference;
import com.github.rudroid.settings.SettingsNotificationsFragment;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationsFragment$onViewCreated$2", f = "SettingsNotificationsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class h2 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ SettingsNotificationsFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(SettingsNotificationsFragment settingsNotificationsFragment, a71.c cVar) {
        super(2, cVar);
        this.w = settingsNotificationsFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        h2 h2Var = new h2(this.w, cVar);
        h2Var.v = obj;
        return h2Var;
    }

    public final Object s(Object obj, Object obj2) {
        h2 r = r((a71.c) obj2, (pm.c) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        String C3;
        pm.c cVar = (pm.c) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        SettingsNotificationsFragment.a aVar2 = SettingsNotificationsFragment.Companion;
        SettingsNotificationsFragment settingsNotificationsFragment = this.w;
        Preference t4 = settingsNotificationsFragment.t4("preference_set_schedules");
        if (t4 != null) {
            if (cVar.a.isEmpty() || !cVar.d) {
                C3 = settingsNotificationsFragment.C3(2131954491);
            } else {
                LocalTime localTime = cVar.b;
                LocalTime localTime2 = cVar.c;
                List list = cVar.a;
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pm.b) it.next()).b);
                }
                com.github.rudroid.common.f.Companion.getClass();
                if (x61.m.K0(com.github.rudroid.common.f.s).equals(x61.m.K0(arrayList))) {
                    C3 = settingsNotificationsFragment.D3(2131954490, new Object[]{com.github.rudroid.utilities.t.e(localTime.getHour(), localTime.getMinute(), settingsNotificationsFragment.i4()), com.github.rudroid.utilities.t.e(localTime2.getHour(), localTime2.getMinute(), settingsNotificationsFragment.i4())});
                    k71.k.f(C3, "getString(...)");
                } else {
                    Calendar calendar = Calendar.getInstance();
                    k71.k.d(calendar);
                    C3 = settingsNotificationsFragment.D3(2131954489, new Object[]{x61.m.c0(s71.j.l0(new s71.l(new s71.g(x61.m.K(com.github.rudroid.utilities.t.a(calendar)), true, new com.github.rudroid.actions.checklog.d0(x61.m.K0(arrayList), 1)), new com.github.rudroid.starredreposandlists.u0(24), 1)), ", ", (String) null, (String) null, 0, new o0(1, calendar), 30), com.github.rudroid.utilities.t.e(localTime.getHour(), localTime.getMinute(), settingsNotificationsFragment.i4()), com.github.rudroid.utilities.t.e(localTime2.getHour(), localTime2.getMinute(), settingsNotificationsFragment.i4())});
                    k71.k.f(C3, "getString(...)");
                }
            }
            t4.B(C3);
        }
        return w61.a0.a;
    }
}
