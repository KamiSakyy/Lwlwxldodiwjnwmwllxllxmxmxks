package com.github.rudroid.uitoolkit.markdown.components;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import c21.h0;
import g3.q0;
import w2.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public static final void a(w1.r rVar, String str, k91.a aVar, long j, androidx.compose.runtime.s sVar, int i) {
        int i2;
        long j2;
        final long j3;
        q0 q0Var;
        w1.r rVar2;
        h0 h0Var = j91.a.x;
        k71.k.g(str, "content");
        k71.k.g(aVar, "node");
        h0 h0Var2 = aVar.a;
        sVar.e0(-863411381);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                j3 = ih.d.b(sVar).p;
            } else {
                sVar.V();
                j3 = j;
            }
            sVar.r();
            h0 h0Var3 = j91.a.w;
            h0 h0Var4 = (k71.k.b(h0Var2, h0Var3) || k71.k.b(h0Var2, h0Var)) ? j91.a.Z : j91.a.W;
            if (k71.k.b(h0Var2, h0Var3) || k71.k.b(h0Var2, j91.a.y)) {
                sVar.c0(671216707);
                q0Var = ih.d.c(sVar).c;
                sVar.q(false);
            } else if (k71.k.b(h0Var2, h0Var) || k71.k.b(h0Var2, j91.a.z)) {
                sVar.c0(671345667);
                q0Var = ih.d.c(sVar).d;
                sVar.q(false);
            } else if (k71.k.b(h0Var2, j91.a.A)) {
                sVar.c0(671435939);
                q0Var = ih.d.c(sVar).e;
                sVar.q(false);
            } else if (k71.k.b(h0Var2, j91.a.B)) {
                sVar.c0(671526211);
                q0Var = ih.d.c(sVar).f;
                sVar.q(false);
            } else if (k71.k.b(h0Var2, j91.a.C)) {
                sVar.c0(671616483);
                q0Var = ih.d.c(sVar).g;
                sVar.q(false);
            } else if (k71.k.b(h0Var2, j91.a.D)) {
                sVar.c0(671706755);
                q0Var = ih.d.c(sVar).h;
                sVar.q(false);
            } else {
                sVar.c0(671775203);
                q0Var = ih.d.c(sVar).c;
                sVar.q(false);
            }
            if (k71.k.b(h0Var2, h0Var3) || k71.k.b(h0Var2, h0Var)) {
                sVar.c0(672010617);
                final float W = ((s3.c) sVar.j(g1.h)).W(ih.a.k);
                w1.r e = p2.e(rVar, 1.0f);
                boolean c = sVar.c(W) | sVar.e(j3);
                Object N = sVar.N();
                if (c || N == androidx.compose.runtime.n.a) {
                    final int i3 = 0;
                    N = new j71.c() { // from class: com.github.rudroid.uitoolkit.markdown.components.e
                        public final Object k(Object obj) {
                            switch (i3) {
                                case 0:
                                    f2.d dVar = (f2.d) obj;
                                    k71.k.g(dVar, "$this$drawBehind");
                                    float W2 = dVar.W(1);
                                    float intBitsToFloat = Float.intBitsToFloat((int) (dVar.a() & 4294967295L)) + W;
                                    dVar.w(j3, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.a() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)), W2);
                                    break;
                                default:
                                    f2.d dVar2 = (f2.d) obj;
                                    float f = W;
                                    float W3 = dVar2.W(f);
                                    float f2 = 2;
                                    float W4 = dVar2.W(f) / f2;
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.a() >> 32));
                                    float W5 = dVar2.W(f) / f2;
                                    dVar2.w(j3, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(W4) & 4294967295L), (Float.floatToRawIntBits(W5) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32), W3);
                                    break;
                            }
                            return w61.a0.a;
                        }
                    };
                    sVar.n0(N);
                }
                w1.r d = a2.i.d(e, (j71.c) N);
                sVar.q(false);
                rVar2 = d;
            } else {
                sVar.c0(-809587885);
                sVar.q(false);
                rVar2 = rVar;
            }
            k91.a n = k21.f.n(aVar, h0Var4);
            if (n == null) {
                sVar.c0(672715742);
            } else {
                sVar.c0(672715743);
                sVar.c0(-809582108);
                g3.d dVar = new g3.d();
                g.b(ih.d.d(sVar), dVar, str, x61.s.r, n);
                g3.g k = dVar.k();
                sVar.q(false);
                a0.b(rVar2, k, q0Var, sVar, 0, 0);
            }
            sVar.q(false);
            j2 = j3;
        } else {
            sVar.V();
            j2 = j;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.fragments.ui.g1(rVar, str, aVar, j2, i);
        }
    }
}
