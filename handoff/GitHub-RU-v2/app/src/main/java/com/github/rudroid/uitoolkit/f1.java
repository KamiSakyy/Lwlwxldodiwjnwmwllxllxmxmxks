package com.github.rudroid.uitoolkit;

import f1.u7;
import f1.z7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, s3.h hVar, float f, long j, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        s3.h hVar2;
        float f2;
        long j2;
        int i4;
        int i5;
        s3.h hVar3;
        float f3;
        long j3;
        androidx.compose.runtime.b2 t;
        s3.h hVar4;
        w1.r rVar3;
        int i6;
        long j4;
        int i7;
        sVar.e0(1000191502);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            hVar2 = hVar;
            i3 |= sVar.f(hVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    f2 = f;
                    if (sVar.c(f2)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    f2 = f;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                j2 = j;
                if (sVar.e(j2)) {
                    i4 = 2048;
                    i5 = i3 | i4;
                    if (sVar.S(i5 & 1, (i5 & 1171) != 1170)) {
                        sVar.X();
                        int i11 = i & 1;
                        w1.r rVar4 = w1.o.a;
                        if (i11 == 0 || sVar.A()) {
                            if (i8 != 0) {
                                rVar2 = rVar4;
                            }
                            s3.h hVar5 = i9 != 0 ? null : hVar2;
                            if ((i2 & 4) != 0) {
                                f3 = u7.a;
                                i5 &= -897;
                            } else {
                                f3 = f2;
                            }
                            if ((i2 & 8) != 0) {
                                hVar4 = hVar5;
                                rVar3 = rVar2;
                                i6 = i5 & (-7169);
                                j4 = ih.d.b(sVar).F;
                                sVar.r();
                                androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(w1.c.v, false);
                                int hashCode = Long.hashCode(sVar.T);
                                androidx.compose.runtime.v1 l = sVar.l();
                                w1.r c = w1.a.c(sVar, rVar3);
                                v2.h.o.getClass();
                                v2.f fVar = v2.g.b;
                                sVar.g0();
                                if (sVar.S) {
                                    sVar.q0();
                                } else {
                                    sVar.k(fVar);
                                }
                                androidx.compose.runtime.t.I(sVar, v2.g.f, d);
                                androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                                androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                                androidx.compose.runtime.t.E(sVar, v2.g.h);
                                androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                                if (hVar4 != null) {
                                    long j5 = hVar4.a;
                                    androidx.compose.foundation.layout.o0 o0Var = androidx.compose.foundation.layout.p2.a;
                                    w1.r p = androidx.compose.foundation.layout.p2.p(rVar4, s3.h.b(j5), s3.h.a(j5));
                                    if (p != null) {
                                        rVar4 = p;
                                    }
                                }
                                z7.a(rVar4, j4, f3, 0L, 0, 0.0f, sVar, ((i6 >> 6) & 112) | (i6 & 896), 56);
                                sVar.q(true);
                                j3 = j4;
                                rVar2 = rVar3;
                                hVar3 = hVar4;
                            } else {
                                hVar4 = hVar5;
                                rVar3 = rVar2;
                                i6 = i5;
                            }
                        } else {
                            sVar.V();
                            if ((i2 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i5 &= -7169;
                            }
                            rVar3 = rVar2;
                            i6 = i5;
                            hVar4 = hVar2;
                            f3 = f2;
                        }
                        j4 = j2;
                        sVar.r();
                        androidx.compose.ui.layout.v0 d2 = androidx.compose.foundation.layout.t.d(w1.c.v, false);
                        int hashCode2 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.v1 l2 = sVar.l();
                        w1.r c2 = w1.a.c(sVar, rVar3);
                        v2.h.o.getClass();
                        v2.f fVar2 = v2.g.b;
                        sVar.g0();
                        if (sVar.S) {
                        }
                        androidx.compose.runtime.t.I(sVar, v2.g.f, d2);
                        androidx.compose.runtime.t.I(sVar, v2.g.e, l2);
                        androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode2), v2.g.g);
                        androidx.compose.runtime.t.E(sVar, v2.g.h);
                        androidx.compose.runtime.t.I(sVar, v2.g.d, c2);
                        if (hVar4 != null) {
                        }
                        z7.a(rVar4, j4, f3, 0L, 0, 0.0f, sVar, ((i6 >> 6) & 112) | (i6 & 896), 56);
                        sVar.q(true);
                        j3 = j4;
                        rVar2 = rVar3;
                        hVar3 = hVar4;
                    } else {
                        sVar.V();
                        hVar3 = hVar2;
                        f3 = f2;
                        j3 = j2;
                    }
                    t = sVar.t();
                    if (t != null) {
                        t.d = new e1(rVar2, hVar3, f3, j3, i, i2);
                        return;
                    }
                    return;
                }
            } else {
                j2 = j;
            }
            i4 = 1024;
            i5 = i3 | i4;
            if (sVar.S(i5 & 1, (i5 & 1171) != 1170)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        hVar2 = hVar;
        if ((i & 384) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        i4 = 1024;
        i5 = i3 | i4;
        if (sVar.S(i5 & 1, (i5 & 1171) != 1170)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c1<T1,T2,T3,T4> {
        public c1() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class n0<T1,T2,T3,T4> {
        public n0() {
        }
    }
}
