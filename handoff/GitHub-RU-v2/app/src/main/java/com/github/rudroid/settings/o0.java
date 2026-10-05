package com.github.rudroid.settings;

import com.github.rudroid.copilot.i5;
import com.github.rudroid.settings.SettingsNotificationsFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xn.g4;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class o0 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ o0(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object k(Object obj) {
        int i = this.r;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                List list = (List) obj2;
                pm.c cVar = (pm.c) obj;
                k71.k.g(cVar, "$this$copy");
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new pm.b((com.github.rudroid.common.f) it.next(), "", cVar.b, cVar.c));
                }
                return pm.c.a(cVar, arrayList, null, null, false, 14);
            case 1:
                Calendar calendar = (Calendar) obj2;
                com.github.rudroid.common.f fVar = (com.github.rudroid.common.f) obj;
                SettingsNotificationsFragment.a aVar = SettingsNotificationsFragment.Companion;
                k71.k.g(fVar, "it");
                calendar.set(7, com.github.rudroid.common.g.a(fVar));
                String displayName = calendar.getDisplayName(7, 1, Locale.getDefault());
                return displayName == null ? "" : displayName;
            default:
                t2 t2Var = (t2) obj2;
                g4 g4Var = (g4) obj;
                k71.k.g(g4Var, "viewerCopilotPermissions");
                com.github.rudroid.settings.copilot.m0 m0Var = t2Var.w;
                oa.j d = t2Var.z.d();
                m0Var.getClass();
                boolean z = d.f(com.github.rudroid.common.a.L) && (i5.f(g4Var) || i5.b(g4Var, d) || i5.c(g4Var));
                boolean b = i5.b(g4Var, d);
                boolean c = i5.c(g4Var);
                return new eg.d(z, !b || c, b && !c, g4Var.a, g4Var.f);
        }
    }
}
