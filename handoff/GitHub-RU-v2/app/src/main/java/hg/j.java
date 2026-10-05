package hg;

import a7.l;
import android.content.Context;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.j3;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.uitoolkit.text.g0;
import com.github.rudroid.uitoolkit.text.h0;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import d3.q;
import f1.jb;
import f1.p3;
import g3.q0;
import s0.m0;
import w1.o;
import w1.r;
import w2.j0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public static final void a(r rVar, j71.c cVar, String str, ShortcutType shortcutType, ShortcutIcon shortcutIcon, ShortcutColor shortcutColor, s sVar, int i) {
        r rVar2;
        s sVar2 = sVar;
        k71.k.g(cVar, "onNameChange");
        k71.k.g(str, "title");
        k71.k.g(shortcutType, "type");
        k71.k.g(shortcutIcon, "icon");
        k71.k.g(shortcutColor, "color");
        sVar2.e0(1480347752);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= sVar2.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar2.d(shortcutType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar2.d(shortcutIcon.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar2.d(shortcutColor.ordinal()) ? 131072 : 65536;
        }
        if (sVar2.S(i2 & 1, (74899 & i2) != 74898)) {
            Object[] objArr = new Object[0];
            boolean z = (i2 & 896) == 256;
            Object N = sVar2.N();
            androidx.compose.runtime.i iVar = n.a;
            if (z || N == iVar) {
                N = new l(str, 3);
                sVar2.n0(N);
            }
            f1 f1Var = (f1) u1.j.c(objArr, (j71.a) N, sVar2, 0);
            String q0 = i4.q0(2131954129, new Object[]{i4.p0(com.github.rudroid.shortcuts.r.a(shortcutColor), sVar2), w8.s.m(shortcutIcon)}, sVar2);
            float f = ih.a.n;
            r rVar3 = o.a;
            r z2 = androidx.compose.foundation.layout.b.z(rVar3, 0.0f, f, 1);
            l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r c = w1.a.c(sVar2, z2);
            v2.h.o.getClass();
            int i3 = i2;
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            v2.e eVar = v2.g.f;
            t.I(sVar2, eVar, a);
            v2.e eVar2 = v2.g.e;
            t.I(sVar2, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            t.w(sVar2, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            t.E(sVar2, dVar);
            v2.e eVar4 = v2.g.d;
            t.I(sVar2, eVar4, c);
            r f2 = f0.o.f(p2.o(androidx.compose.foundation.layout.b.B(rVar3, f, 0.0f, 0.0f, 0.0f, 14), ih.a.O), b91.g.l(com.github.rudroid.shortcuts.r.d(shortcutColor), sVar2), ih.d.e(sVar2).b);
            v0 d = androidx.compose.foundation.layout.t.d(w1.c.v, false);
            int hashCode2 = Long.hashCode(sVar2.T);
            v1 l2 = sVar2.l();
            r c2 = w1.a.c(sVar2, f2);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, eVar, d);
            t.I(sVar2, eVar2, l2);
            f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
            t.I(sVar2, eVar4, c2);
            f0.o.c(z3.C(com.github.rudroid.shortcuts.r.e(shortcutIcon), 0, sVar2), q0, p2.o(rVar3, ih.a.M), (w1.e) null, (androidx.compose.ui.layout.i) null, 0.0f, new d2.l(5, b91.g.l(com.github.rudroid.shortcuts.r.f(shortcutColor), sVar2)), sVar2, 8, 56);
            sVar2.q(true);
            String p0 = i4.p0(2131954133, sVar2);
            r B = androidx.compose.foundation.layout.b.B(p2.e(rVar3, 1.0f), f, 0.0f, ih.a.l, 0.0f, 10);
            boolean f3 = sVar2.f(p0);
            Object N2 = sVar2.N();
            if (f3 || N2 == iVar) {
                N2 = new p3(p0, 10);
                sVar2.n0(N2);
            }
            r b = q.b(B, false, (j71.c) N2);
            String p02 = i4.p0(2131954635, sVar2);
            q0 q0Var = ih.d.f(sVar2).d;
            String str2 = (String) f1Var.getValue();
            m0 a2 = m0.a(0, 0, 126, (Boolean) null);
            jb jbVar = jb.a;
            float f4 = 0;
            f2 f2Var = new f2(f4, f4, f4, f4);
            boolean f5 = ((i3 & 112) == 32) | sVar2.f(f1Var);
            Object N3 = sVar2.N();
            if (f5 || N3 == iVar) {
                N3 = new com.github.rudroid.copilot.ui.f(cVar, f1Var, 15);
                sVar2.n0(N3);
            }
            g0.c(b, str2, a2, (j71.c) N3, p02, r1.i.d(-1569767607, new i(shortcutType), sVar2), null, 0, 0, true, false, false, q0Var, false, null, f2Var, null, new s3.f(f4), null, 0.0f, sVar, 196608, 100663350, 0, 1758144);
            sVar2 = sVar;
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkssummary.ui.a(rVar2, cVar, str, shortcutType, shortcutIcon, shortcutColor, i, 9);
        }
    }

    public static final void b(ShortcutType shortcutType, s sVar, int i) {
        s sVar2;
        sVar.e0(582147574);
        int i2 = (sVar.d(shortcutType.ordinal()) ? 4 : 2) | i;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            j3 j3Var = j0.b;
            String q0 = i4.q0(2131954134, new Object[]{com.github.rudroid.shortcuts.r.h(shortcutType, (Context) sVar.j(j3Var))}, sVar);
            boolean f = sVar.f(q0);
            Object N = sVar.N();
            if (f || N == n.a) {
                N = new p3(q0, 11);
                sVar.n0(N);
            }
            sVar2 = sVar;
            h0.a(q.b(o.a, false, (j71.c) N), com.github.rudroid.shortcuts.r.h(shortcutType, (Context) sVar.j(j3Var)), null, sVar2, 0, 4);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new i(shortcutType, i);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
