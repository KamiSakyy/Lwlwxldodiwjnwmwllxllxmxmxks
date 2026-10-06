package com.github.rudroid.widget.agenttasks;

import android.content.Context;
import com.github.domain.database.GitHubDatabase;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.s0;
import com.github.rudroid.utilities.ui.t1;
import com.github.rudroid.widget.WidgetUIState;
import com.github.rudroid.widget.agenttasks.model.c;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.z3;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ a(Object obj, Object obj2, Context context, int i) {
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.s = context;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                e eVar = (e) this.t;
                z5.k kVar = (z5.k) this.u;
                Context context = (Context) this.s;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    eVar.getClass();
                    k71.k.g(kVar, "glanceId");
                    oa.j jVar = (oa.j) androidx.compose.runtime.t.m(z3.G(eVar.a.getData(), new com.github.rudroid.repositories.repositoryownerrepositories.d(27, b91.g.Q(e.c(kVar)), eVar)), (Object) null, (a71.h) null, sVar, 48, 2).getValue();
                    if (jVar == null) {
                        sVar.c0(1184071712);
                        sy.q.a(null, b0.a, sVar, 48);
                        sVar.q(false);
                    } else {
                        sVar.c0(1184297268);
                        com.github.rudroid.widget.agenttasks.model.c.Companion.getClass();
                        k71.k.g(context, "context");
                        Object v = k41.b.v(c.a.class, context.getApplicationContext());
                        k71.k.f(v, "get(...)");
                        com.github.rudroid.widget.agenttasks.model.c d = ((c.a) v).d();
                        boolean h = sVar.h(d) | sVar.h(jVar);
                        Object N = sVar.N();
                        if (h || N == androidx.compose.runtime.n.a) {
                            N = new c(d, jVar, null);
                            sVar.n0(N);
                        }
                        androidx.compose.runtime.t.f(sVar, (j71.e) N, jVar);
                        d.getClass();
                        g1 g1Var = (g1) androidx.compose.runtime.t.m(jVar.b == null ? new com.github.rudroid.widget.agenttasks.model.l(new com.github.rudroid.widget.agenttasks.model.i(d5.B(((GitHubDatabase) d.d.a(jVar)).t().a, new String[]{"agent_tasks"}, new s5.a(17))), jVar) : new com.github.rudroid.widget.agenttasks.model.f(d.a.a(jVar, com.github.rudroid.widget.agenttasks.model.c.a(jVar), new com.github.rudroid.utilities.ui.emojipicker.e(10)), jVar), g1.a.c(g1.Companion), (a71.h) null, sVar, 0, 2).getValue();
                        sy.q.a(null, r1.i.d(-616870463, new a(g1Var, (com.github.rudroid.widget.agenttasks.model.b) g1Var.getData(), context, 1), sVar), sVar, 48);
                        sVar.q(false);
                    }
                } else {
                    sVar.V();
                }
                break;
            case 1:
                g1 g1Var2 = (g1) this.t;
                com.github.rudroid.widget.agenttasks.model.b bVar = (com.github.rudroid.widget.agenttasks.model.b) this.u;
                Context context2 = (Context) this.s;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    m6.e a = com.github.rudroid.widget.o.a(sVar2);
                    if (g1Var2 instanceof s0) {
                        sVar2.c0(977228475);
                        com.github.rudroid.widget.b.a(WidgetUIState.Loading.INSTANCE, a, sVar2, 0);
                        sVar2.q(false);
                    } else if (!(g1Var2 instanceof t1) || bVar == null) {
                        sVar2.c0(977653950);
                        String string = context2.getString(2131954949);
                        k71.k.f(string, "getString(...)");
                        boolean h2 = sVar2.h(context2);
                        Object N2 = sVar2.N();
                        if (h2 || N2 == androidx.compose.runtime.n.a) {
                            N2 = new com.github.rudroid.views.m(context2, 3);
                            sVar2.n0(N2);
                        }
                        com.github.rudroid.widget.l.a(0, sVar2, (j71.a) N2, string, a, null);
                        sVar2.q(false);
                    } else {
                        sVar2.c0(977515876);
                        r.b(null, bVar, sVar2, 0);
                        sVar2.q(false);
                    }
                } else {
                    sVar2.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                r.a((z5.n) this.t, (com.github.rudroid.widget.agenttasks.model.a) this.u, (oa.j) this.s, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ a(z5.n nVar, com.github.rudroid.widget.agenttasks.model.a aVar, oa.j jVar, int i) {
        this.r = 2;
        this.t = nVar;
        this.u = aVar;
        this.s = jVar;
    }
    public Object d(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; }
}
