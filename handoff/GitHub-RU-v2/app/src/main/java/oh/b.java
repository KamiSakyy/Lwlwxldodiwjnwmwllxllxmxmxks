package oh;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.uitoolkit.f3;
import com.github.rudroid.viewmodels.za;
import com.github.service.models.response.Avatar;
import com.google.android.gms.internal.measurement.i4;
import d2.a0Shadow;
import f1.ub;
import java.util.Map;
import k3.i;
import k71.k;
import nf.j;
import t71.n;
import w1.o;
import w1.r;
import yz0.l4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final n a = new n("@\\w+");

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r6 == androidx.compose.runtime.n.a) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, j71.c cVar, za.b bVar, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        r rVar3;
        Object obj;
        j71.e eVar;
        boolean z;
        s sVar2 = sVar;
        k.g(cVar, "onUserClick");
        k.g(bVar, "userListItem");
        CharSequence charSequence = bVar.s;
        l4 l4Var = bVar.r;
        String str = l4Var.b;
        sVar2.e0(206692259);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i | (sVar2.f(rVar2) ? 4 : 2);
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.h(cVar) ? 32 : 16;
        }
        int i5 = i3 | (sVar2.h(bVar) ? 256 : 128);
        if (sVar2.S(i5 & 1, (i5 & 147) != 146)) {
            r rVar4 = o.a;
            r rVar5 = i4 != 0 ? rVar4 : rVar2;
            String p0 = i4.p0(2131954137, sVar2);
            d3.k kVar = new d3.k(0);
            boolean h = ((i5 & 112) == 32) | sVar2.h(bVar);
            Object N = sVar2.N();
            if (!h) {
                obj = N;
            }
            j jVar = new j(5, cVar, bVar);
            sVar2.n0(jVar);
            obj = jVar;
            r rVar6 = rVar5;
            r f = f0.o.f(p2.e(f0.o.m(rVar5, false, p0, kVar, (j71.a) obj, 9), 1.0f), ih.d.b(sVar2).b, a0Shadow.b);
            float f2 = ih.a.n;
            r x = androidx.compose.foundation.layout.b.x(f, f2);
            l2 a2 = j2.a(l.a, w1.c.A, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r c = w1.a.c(sVar2, x);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            v2.eShadow eVar2 = v2.g.f;
            t.I(sVar2, eVar2, a2);
            j71.e eVar3 = v2.g.e;
            t.I(sVar2, eVar3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.eShadow eVar4 = v2.g.g;
            t.w(sVar2, valueOf, eVar4);
            v2.d dVar = v2.g.h;
            t.E(sVar2, dVar);
            v2.eShadow eVar5 = v2.g.d;
            t.I(sVar2, eVar5, c);
            r B = androidx.compose.foundation.layout.b.B(rVar4, 0.0f, 0.0f, f2, 0.0f, 11);
            Avatar avatar = l4Var.e;
            String str2 = avatar.r;
            if (avatar.s == Avatar.Type.Organization) {
                eVar = eVar3;
                z = true;
            } else {
                eVar = eVar3;
                z = false;
            }
            j71.e eVar6 = eVar;
            f3.a(B, str2, z, com.github.rudroid.uitoolkit.a.y, true, null, null, null, sVar2, 27648, 224);
            e0 a3 = c0.a(l.c, w1.c.D, sVar2, 0);
            int hashCode2 = Long.hashCode(sVar2.T);
            v1 l2 = sVar2.l();
            r c2 = w1.a.c(sVar2, rVar4);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, eVar2, a3);
            t.I(sVar2, eVar6, l2);
            f1.e.t(hashCode2, sVar2, eVar4, sVar2, dVar);
            t.I(sVar2, eVar5, c2);
            if (str == null || str.length() == 0) {
                sVar2.c0(510965817);
            } else {
                sVar2.c0(513154417);
                ub.b(str == null ? "" : str, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, ih.d.f(sVar2).b, sVar, 0, 24960, 110590);
                sVar2 = sVar;
            }
            sVar2.q(false);
            ub.b(l4Var.c, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, ih.d.f(sVar2).v, sVar, 0, 24960, 110590);
            sVar2 = sVar;
            if (charSequence.length() > 0) {
                sVar2.c0(513681014);
                sVar2.c0(847855204);
                g3.d dVar2 = new g3.d();
                dVar2.f(charSequence);
                sVar2.c0(847859557);
                p1.c cVar2 = new p1.c(n.b(a, charSequence));
                while (cVar2.hasNext()) {
                    com.github.rudroid.uitoolkit.utils.a.a(dVar2, charSequence.toString(), ((t71.l) cVar2.next()).c(), ih.d.b(sVar2).s, null, null, 24);
                }
                sVar2.q(false);
                g3.g k = dVar2.k();
                sVar2.q(false);
                ub.c(k, androidx.compose.foundation.layout.b.B(rVar4, 0.0f, ih.a.k, 0.0f, 0.0f, 13), 0L, 0L, (i) null, 0L, (r3.k) null, 0L, 2, false, 3, 0, (Map) null, (j71.c) null, ih.d.f(sVar2).l, sVar, 0, 24960, 241660);
                sVar2 = sVar;
            } else {
                sVar2.c0(510965817);
            }
            sVar2.q(false);
            sVar2.q(true);
            sVar2.q(true);
            rVar3 = rVar6;
        } else {
            sVar2.V();
            rVar3 = rVar2;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new w0(rVar3, cVar, bVar, i, i2, 20);
        }
    }
}
