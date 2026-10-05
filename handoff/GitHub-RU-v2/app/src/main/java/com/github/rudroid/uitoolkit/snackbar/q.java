package com.github.rudroid.uitoolkit.snackbar;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.uitoolkit.listitems.z;
import com.google.android.gms.internal.measurement.i4;
import f1.e8;
import f1.q8;
import f1.r8;
import v8.l0;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public static final void a(r rVar, j71.a aVar, String str, String str2, String str3, s sVar, int i) {
        r rVar2;
        k71.k.g(aVar, "switchAccountsAction");
        k71.k.g(str2, "login");
        sVar.e0(140475186);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.f(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.f(str3) ? 16384 : 8192;
        }
        if (sVar.S(i2 & 1, (i2 & 9363) != 9362)) {
            StringBuilder p = f1.e.p(str2);
            if (str3 != null) {
                p.append(", ");
                p.append(str3);
            }
            String q0 = i4.q0(2131954194, new Object[]{p.toString()}, sVar);
            int i3 = l0.o(sVar).a.a;
            r rVar3 = w1.o.a;
            r t = i3 >= 600 ? p2.t(rVar3, 0.0f, 400, 1) : p2.e(rVar3, 1.0f);
            float f = ih.a.l;
            r B = androidx.compose.foundation.layout.b.B(t, f, 0.0f, f, 17, 2);
            String p0 = i4.p0(2131954195, sVar);
            boolean z = (i2 & 112) == 32;
            Object N = sVar.N();
            Object obj = androidx.compose.runtime.n.a;
            if (z || N == obj) {
                N = new com.github.rudroid.uitoolkit.markdown.components.c(1, aVar);
                sVar.n0(N);
            }
            r m = f0.o.m(B, false, p0, (d3.k) null, (j71.a) N, 13);
            boolean f2 = sVar.f(q0);
            Object N2 = sVar.N();
            if (f2 || N2 == obj) {
                N2 = new z(q0, 1);
                sVar.n0(N2);
            }
            e8.e(196608, 0, sVar, ((q8) sVar.j(r8.a)).b, f0.o.a(0.0f, ih.d.a(sVar).E0), e8.t(ih.d.b(sVar).i, 0L, 0L, 0L, sVar, 14), e8.u(62, 4), r1.i.d(827919232, new com.github.rudroid.actions.workflowruns.f(str, str2, str3, 27), sVar), d3.q.a(m, (j71.c) N2).f(rVar3));
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t2 = sVar.t();
        if (t2 != null) {
            t2.d = new e(rVar2, aVar, str, str2, str3, i);
        }
    }

}
