package xg;

import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public static final void a(w1.r rVar, String str, j71.a aVar, j71.c cVar, j71.a aVar2, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        j71.a aVar3;
        int i4;
        j71.a aVar4;
        j71.a aVar5;
        sVar.e0(56900091);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i3 | 384;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            i4 = i3 | (sVar.h(aVar3) ? 256 : 128);
        }
        if ((i & 3072) == 0) {
            i4 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= sVar.h(aVar2) ? 16384 : 8192;
        }
        if (sVar.S(i4 & 1, (i4 & 9363) != 9362)) {
            if (i5 != 0) {
                rVar2 = w1.o.a;
            }
            Object obj = androidx.compose.runtime.n.a;
            if (i6 != 0) {
                Object N = sVar.N();
                if (N == obj) {
                    N = new com.github.rudroid.widget.p(15);
                    sVar.n0(N);
                }
                aVar5 = (j71.a) N;
            } else {
                aVar5 = aVar3;
            }
            Object[] objArr = new Object[0];
            boolean z = (i4 & 112) == 32;
            Object N2 = sVar.N();
            if (z || N2 == obj) {
                N2 = new a7.l(str, 4);
                sVar.n0(N2);
            }
            f1 f1Var = (f1) u1.j.c(objArr, (j71.a) N2, sVar, 0);
            String str2 = (String) f1Var.getValue();
            boolean z2 = !t71.p.T((CharSequence) f1Var.getValue());
            r1.d d = r1.i.d(-187595808, new com.github.rudroid.actions.workflowruns.ui.g(f1Var, 7), sVar);
            boolean f = sVar.f(f1Var);
            Object N3 = sVar.N();
            if (f || N3 == obj) {
                N3 = new ab.e(f1Var, 28);
                sVar.n0(N3);
            }
            j71.c cVar2 = (j71.c) N3;
            boolean f2 = sVar.f(f1Var) | ((i4 & 7168) == 2048);
            Object N4 = sVar.N();
            if (f2 || N4 == obj) {
                N4 = new com.github.rudroid.actions.workflowsummary.ui.k(cVar, f1Var, 6);
                sVar.n0(N4);
            }
            int i7 = i4 << 6;
            p.a(rVar2, str2, false, z2, false, null, null, 0, 0, g.a, null, null, d, cVar2, aVar5, (j71.a) N4, aVar2, null, sVar, (i4 & 14) | 805306368, (57344 & i7) | 384 | (i7 & 3670016), 134644);
            aVar4 = aVar5;
        } else {
            sVar.V();
            aVar4 = aVar3;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new x0(rVar2, str, aVar4, cVar, aVar2, i, i2, 8);
        }
    }
}
