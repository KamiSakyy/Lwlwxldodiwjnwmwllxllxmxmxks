package ag;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.m0;
import com.google.android.gms.internal.measurement.i4;
import eh.i;
import k71.k;
import v2.f;
import v2.g;
import v2.h;
import w1.o;
import w1.r;
import yf.d;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final void a(r rVar, boolean z, boolean z2, j71.c cVar, j71.a aVar, yf.c cVar2, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        yf.c cVar3;
        r rVar3;
        boolean z3;
        boolean z4;
        String n0;
        k.g(cVar, "onAppLockSwitchChange");
        k.g(aVar, "onAutomaticLockOptionSummaryClick");
        sVar.e0(-1715779352);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.d(cVar2.ordinal()) ? 131072 : 65536;
        }
        int i5 = i3;
        if (sVar.S(i5 & 1, (i5 & 74899) != 74898)) {
            r rVar4 = o.a;
            r rVar5 = i4 != 0 ? rVar4 : rVar2;
            e0 a = c0.a(l.c, w1.c.D, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, rVar5);
            h.o.getClass();
            f fVar = g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, g.f, a);
            t.I(sVar, g.e, l);
            t.w(sVar, Integer.valueOf(hashCode), g.g);
            t.E(sVar, g.h);
            t.I(sVar, g.d, c);
            r rVar6 = rVar5;
            i.b(null, i4.p0(z2 ? 2131951793 : 2131951794, sVar), null, z ? m0.d(sVar, -587362557, 2131953638, sVar, false) : m0.d(sVar, -587260412, 2131953639, sVar, false), null, null, null, z, cVar, null, 0L, sVar, (234881024 & (i5 << 15)) | ((i5 << 18) & 29360128), 0, 1653);
            if (z) {
                sVar.c0(-586732544);
                z4 = true;
                androidx.compose.foundation.layout.b.g(sVar, androidx.compose.foundation.layout.b.z(rVar4, 0.0f, ih.a.l, 1));
                r e = p2.e(rVar4, 1.0f);
                String p0 = i4.p0(2131951785, sVar);
                if (d.a.a[cVar2.ordinal()] == 1) {
                    n0 = m0.d(sVar, -1202669449, 2131951784, sVar, false);
                    cVar3 = cVar2;
                } else {
                    sVar.c0(-1202666935);
                    cVar3 = cVar2;
                    int i6 = cVar3.r;
                    n0 = i4.n0(2131820549, i6, new Object[]{Integer.valueOf(i6)}, sVar);
                    sVar.q(false);
                }
                eh.f.a(e, p0, null, n0, null, null, aVar, i4.p0(2131953648, sVar), sVar, (3670016 & (i5 << 6)) | 6, 52);
                z3 = false;
            } else {
                cVar3 = cVar2;
                z3 = false;
                z4 = true;
                sVar.c0(-588627388);
            }
            sVar.q(z3);
            sVar.q(z4);
            rVar3 = rVar6;
        } else {
            cVar3 = cVar2;
            sVar.V();
            rVar3 = rVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new a(rVar3, z, z2, cVar, aVar, cVar3, i, i2);
        }
    }

}
