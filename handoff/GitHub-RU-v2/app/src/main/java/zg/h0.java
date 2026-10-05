package zg;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.uitoolkit.m0;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public static final void a(w1.r rVar, int i, int i2, e0 e0Var, androidx.compose.runtime.s sVar, int i3) {
        w1.r rVar2;
        k3.s sVar2;
        i2.b bVar;
        int i4;
        sVar.e0(1509666609);
        int i5 = i3 | 6;
        if ((i3 & 48) == 0) {
            i5 |= sVar.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= sVar.d(i2) ? 256 : 128;
        }
        if (sVar.S(i5 & 1, (i5 & 1171) != 1170)) {
            int i6 = i5 & 112;
            String n0 = i4.n0(2131820632, i, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, sVar);
            boolean f = sVar.f(n0);
            Object N = sVar.N();
            if (f || N == androidx.compose.runtime.n.a) {
                N = new tj.b(n0, 23);
                sVar.n0(N);
            }
            w1.r rVar3 = w1.o.a;
            w1.r a = d3.q.a(rVar3, (j71.c) N);
            long j = ih.d.b(sVar).v;
            k3.s sVar3 = k3.s.x;
            if (i == i2) {
                sVar.c0(1876183549);
                bVar = z3.C(2131231161, 0, sVar);
                sVar.q(false);
                sVar2 = sVar3;
            } else {
                sVar.c0(1876283090);
                sVar2 = sVar3;
                m0 m0Var = new m0(i / i2, ih.d.a(sVar).k, ih.d.a(sVar).T, ih.d.a(sVar).Q, (float) 1.5d, 32);
                sVar.q(false);
                bVar = m0Var;
            }
            int ordinal = e0Var.ordinal();
            if (ordinal == 0) {
                i4 = 12;
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = 14;
            }
            d0.a(a, i, i2, j, e0Var, sVar2, com.github.rudroid.uitoolkit.text.m.a(bVar, p2.o(rVar3, i4), 10), sVar, (i5 & 896) | 196608 | i6 | 24576, 0);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new yg.h(rVar2, i, i2, e0Var, i3);
        }
    }
}
