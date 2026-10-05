package com.github.rudroid.widget.contribution;

import aa.u0;
import com.github.service.models.ApiFailure;
import d1.k1;
import f0.z1;
import f1.sa;
import f1.ta;
import f1.x3;
import f1.z8;
import h1.c0;
import java.util.List;
import ux0.l1;
import ux0.n1;
import ux0.o1;
import ux0.p1;
import w61.a0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.e {
    public final /* synthetic */ int r;

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        a0 a0Var = a0.a;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                }
                return a0Var;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    com.github.rudroid.widget.n.a(com.github.rudroid.widget.o.a(sVar2), sVar2, 0);
                } else {
                    sVar2.V();
                }
                return a0Var;
            case 2:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    com.github.rudroid.widget.n.a(com.github.rudroid.widget.o.a(sVar3), sVar3, 0);
                } else {
                    sVar3.V();
                }
                return a0Var;
            case 3:
                ApiFailure apiFailure = (ApiFailure) obj2;
                k71.k.g(apiFailure, "failure");
                return apiFailure;
            case 4:
                ApiFailure apiFailure2 = (ApiFailure) obj2;
                k71.k.g(apiFailure2, "failure");
                return apiFailure2;
            case 5:
                String str = (String) obj;
                String str2 = (String) obj2;
                k71.k.g(str, "pullRequestId");
                k71.k.g(str2, "after");
                return new ey.u(str, new u0(str2));
            case 6:
                ey.l lVar = (ey.l) obj;
                List list = (List) obj2;
                k71.k.g(lVar, "data");
                k71.k.g(list, "nodes");
                ey.n nVar = lVar.a;
                ey.n nVar2 = null;
                ey.r rVar = null;
                ey.q qVar = null;
                ey.o oVar = null;
                if (nVar != null) {
                    ey.o oVar2 = nVar.c;
                    if (oVar2 != null) {
                        ey.q qVar2 = oVar2.b;
                        if (qVar2 != null) {
                            ey.r rVar2 = qVar2.b;
                            if (rVar2 != null) {
                                ey.p pVar = rVar2.a;
                                k71.k.g(pVar, "pageInfo");
                                rVar = new ey.r(pVar, list);
                            }
                            ey.s sVar4 = qVar2.a;
                            k71.k.g(sVar4, "statusRollup");
                            qVar = new ey.q(sVar4, rVar);
                        }
                        String str3 = oVar2.a;
                        k71.k.g(str3, "id");
                        oVar = new ey.o(str3, qVar);
                    }
                    String str4 = nVar.a;
                    String str5 = nVar.b;
                    k71.k.g(str4, "__typename");
                    k71.k.g(str5, "id");
                    nVar2 = new ey.n(str4, str5, oVar);
                }
                String str6 = lVar.b;
                String str7 = lVar.c;
                k71.k.g(str6, "id");
                k71.k.g(str7, "__typename");
                return new ey.l(nVar2, str6, str7);
            case 7:
                return Long.valueOf(((k1) obj2).d.get());
            case 8:
                ((d6.a) obj).d = (z5.n) obj2;
                return a0Var;
            case 9:
                ((d6.a) obj).e = ((i6.a) obj2).a;
                return a0Var;
            case 10:
                ((d6.b) obj).f = ((Long) obj2).longValue();
                return a0Var;
            case 11:
                ((d6.b) obj).d = (i6.c) obj2;
                return a0Var;
            case 12:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (sVar5.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
                    float f = ih.a.k;
                    androidx.compose.foundation.layout.b.c((w1.r) null, androidx.compose.foundation.layout.l.g(f), androidx.compose.foundation.layout.l.g(f), (w1.i) null, 0, 0, df.d.a, sVar5, 1572864, 57);
                } else {
                    sVar5.V();
                }
                return a0Var;
            case 13:
                ((Long) obj2).getClass();
                return 2000L;
            case 14:
                ((Long) obj2).getClass();
                return 2000L;
            case 15:
                dy0.a aVar = (dy0.a) obj;
                String str8 = (String) obj2;
                k71.k.g(aVar, "userProjectsParameters");
                k71.k.g(str8, "after");
                return new p1(aVar.a, a.a.x(aVar.b), t1.N(aVar.c), new u0(str8));
            case 16:
                n1 n1Var = (n1) obj;
                List list2 = (List) obj2;
                k71.k.g(n1Var, "data");
                k71.k.g(list2, "nodes");
                o1 o1Var = n1Var.a;
                l1 l1Var = o1Var.a;
                return new n1(new o1(new l1(l1Var.a, new wx0.c(list2, l1Var.b.b)), o1Var.b, o1Var.c), n1Var.b, n1Var.c);
            case 17:
                e0.b bVar = (e0.b) obj;
                return bVar == null ? e0.c.a : bVar;
            case 18:
                ((Long) obj2).getClass();
                return 2000L;
            case 19:
                return Integer.valueOf(((z1) obj2).a.y());
            case 20:
                x3 x3Var = (x3) obj2;
                Long b = x3Var.b();
                Long valueOf = Long.valueOf(((c0) x3Var.e.getValue()).e);
                q71.g gVar = x3Var.a;
                return x61.l.r(new Object[]{b, valueOf, Integer.valueOf(((q71.e) gVar).r), Integer.valueOf(((q71.e) gVar).s), Integer.valueOf(x3Var.a())});
            case 21:
                return Integer.valueOf(((androidx.compose.ui.layout.u0) obj).e0(((Integer) obj2).intValue()));
            case 22:
                return Integer.valueOf(((androidx.compose.ui.layout.u0) obj).B(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((androidx.compose.ui.layout.u0) obj).d(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((androidx.compose.ui.layout.u0) obj).x(((Integer) obj2).intValue()));
            case 25:
                return ((z8) obj2).c();
            case 26:
                return (ta) ((androidx.compose.runtime.p1) ((sa) obj2).a.b).getValue();
            case 27:
                return Integer.valueOf(((androidx.compose.ui.layout.u0) obj).x(((Integer) obj2).intValue()));
            case 28:
                return Integer.valueOf(((androidx.compose.ui.layout.u0) obj).B(((Integer) obj2).intValue()));
            default:
                return Integer.valueOf(((androidx.compose.ui.layout.u0) obj).e0(((Integer) obj2).intValue()));
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0<T1,T2,T3,T4> {
        public q0() {
        }
    }
}
