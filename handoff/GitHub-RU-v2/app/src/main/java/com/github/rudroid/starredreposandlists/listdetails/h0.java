package com.github.rudroid.starredreposandlists.listdetails;

import androidx.compose.foundation.layout.m2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import com.github.rudroid.uitoolkit.menu.d;
import com.google.android.gms.internal.measurement.i4;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public static final void a(j71.a aVar, final j71.c cVar, m0.s sVar, w1.r rVar, androidx.compose.runtime.s sVar2, int i) {
        w1.r rVar2;
        k71.k.g(aVar, "finishAction");
        k71.k.g(sVar, "listState");
        sVar2.e0(-2095720432);
        int i2 = i | (sVar2.h(aVar) ? 4 : 2) | (sVar2.h(cVar) ? 32 : 16) | (sVar2.f(sVar) ? 256 : 128) | 3072;
        if (sVar2.S(i2 & 1, (i2 & 1171) != 1170)) {
            w1.r rVar3 = w1.o.a;
            qg.pShadow.c(rVar3, "", null, ih.d.b(sVar2).o, aVar, 0, com.github.rudroid.uitoolkit.utils.lists.t.e(sVar, false, sVar2, 1), 0.0f, 0, 0, r1.i.d(-941435567, new j71.f() { // from class: com.github.rudroid.starredreposandlists.listdetails.e0
                public final Object f(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    k71.k.g((m2) obj, "$this$PrimaryTopAppBar");
                    if (sVar3.S(intValue & 1, (intValue & 17) != 16)) {
                        j71.c cVar2 = cVar;
                        if (cVar2 == null) {
                            sVar3.c0(-170460487);
                            sVar3.q(false);
                        } else {
                            sVar3.c0(-170460486);
                            Object N = sVar3.N();
                            Object obj4 = androidx.compose.runtime.n.a;
                            if (N == obj4) {
                                N = androidx.compose.runtime.t.B(Boolean.FALSE);
                                sVar3.n0(N);
                            }
                            f1 f1Var = (f1) N;
                            boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
                            List r = x61.l.r(new d.C0009d[]{new d.C0009d("edit_list_menu_item", i4.p0(2131951850, sVar3), (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, 0L, 0L, 0L, false, false, 0, 4092), new d.C0009d("delete_list_menu_item", i4.p0(2131951846, sVar3), (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, 0L, 0L, 0L, false, false, 0, 4092)});
                            boolean f = sVar3.f(cVar2);
                            Object N2 = sVar3.N();
                            if (f || N2 == obj4) {
                                N2 = new f0(0, cVar2, f1Var);
                                sVar3.n0(N2);
                            }
                            j71.c cVar3 = (j71.c) N2;
                            Object N3 = sVar3.N();
                            if (N3 == obj4) {
                                N3 = new g0(f1Var, 0);
                                sVar3.n0(N3);
                            }
                            com.github.rudroid.uitoolkit.menu.l.a(null, booleanValue, r, null, cVar3, (j71.a) N3, 0L, 0L, false, r1.i.d(-1853570941, new j(1, f1Var), sVar3), sVar3, 805503488, 457);
                            sVar3.q(false);
                        }
                    } else {
                        sVar3.V();
                    }
                    return w61.a0.a;
                }
            }, sVar2), sVar2, 54 | ((i2 << 12) & 57344), 6, 932);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new bd.d(aVar, cVar, sVar, rVar2, i);
        }
    }
}
