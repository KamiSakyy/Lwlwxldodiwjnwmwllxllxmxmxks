package com.github.rudroid.settings.copilot.paywall.ui;

import androidx.compose.runtime.b1;
import androidx.compose.runtime.f1;
import f1.k2;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xn.e1;
import xn.r2;
import xn.x2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class q0 implements j71.c {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ j71.c s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ q0(h1.g0 g0Var, f1 f1Var, j71.c cVar, h1.z zVar, Locale locale, k2 k2Var, f1 f1Var2) {
        this.t = g0Var;
        this.u = f1Var;
        this.s = cVar;
        this.v = zVar;
        this.w = locale;
        this.x = k2Var;
        this.y = f1Var2;
    }

    public final Object k(Object obj) {
        Object obj2;
        switch (this.r) {
            case 0:
                e1 e1Var = (e1) this.t;
                r2 r2Var = (r2) this.v;
                List list = (List) this.w;
                e1 e1Var2 = (e1) this.u;
                j71.a aVar = (j71.a) this.x;
                j71.a aVar2 = (j71.a) this.y;
                m0.f fVar = (m0.f) obj;
                k71.k.g(fVar, "$this$LazyColumn");
                m0.f.q(fVar, (String) null, h.a, 3);
                e1 e1Var3 = e1.t;
                j71.c cVar = this.s;
                if (e1Var == e1Var3) {
                    Iterator it = r2Var.c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((x2) obj2).a == e1.t) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    x2 x2Var = (x2) obj2;
                    if (x2Var != null) {
                        m0.f.q(fVar, (String) null, new r1.d(new com.github.rudroid.actions.workflowruns.f(cVar, e1Var2, x2Var, 24), true, 758317447), 3);
                    }
                }
                fVar.r(list.size(), (j71.c) null, new u0(list), new r1.d(new v0(list, r2Var, cVar, e1Var2), true, 802480018));
                m0.f.q(fVar, (String) null, new r1.d(new b1(21, r2Var), true, -1478476122), 3);
                m0.f.q(fVar, (String) null, new r1.d(new com.github.rudroid.actions.workflowruns.f(r2Var, e1Var, list, 25), true, 1698310661), 3);
                m0.f.q(fVar, (String) null, new r1.d(new com.github.rudroid.achievements.ui.g0(aVar, aVar2, 2), true, 580130148), 3);
                break;
            default:
                h1.g0 g0Var = (h1.g0) this.t;
                f1 f1Var = (f1) this.u;
                h1.z zVar = (h1.z) this.v;
                Locale locale = (Locale) this.w;
                k2 k2Var = (k2) this.x;
                f1 f1Var2 = (f1) this.y;
                l3.v vVar = (l3.v) obj;
                String str = vVar.a.s;
                int length = str.length();
                String str2 = g0Var.c;
                if (length <= str2.length()) {
                    int i = 0;
                    while (true) {
                        if (i >= str.length()) {
                            f1Var2.setValue(vVar);
                            String obj3 = t71.p.t0(str).toString();
                            int length2 = obj3.length();
                            j71.c cVar2 = this.s;
                            Long l = null;
                            if (length2 != 0 && obj3.length() >= str2.length()) {
                                h1.y c = zVar.c(obj3, str2, locale);
                                f1Var.setValue(k2Var.a(c, locale));
                                if (((CharSequence) f1Var.getValue()).length() == 0 && c != null) {
                                    l = Long.valueOf(c.u);
                                }
                                cVar2.k(l);
                            } else {
                                f1Var.setValue("");
                                cVar2.k((Object) null);
                            }
                        } else if (Character.isDigit(str.charAt(i))) {
                            i++;
                        }
                    }
                }
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ q0(j71.a aVar, j71.a aVar2, j71.c cVar, List list, e1 e1Var, e1 e1Var2, r2 r2Var) {
        this.t = e1Var;
        this.v = r2Var;
        this.w = list;
        this.s = cVar;
        this.u = e1Var2;
        this.x = aVar;
        this.y = aVar2;
    }
}
