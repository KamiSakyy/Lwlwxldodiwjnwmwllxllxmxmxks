package com.github.rudroid.uitoolkit.text;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.starredreposandlists.u0;
import d2.r0;
import f1.gb;
import f1.jb;
import f1.q5;
import f1.r8;
import g3.q0;
import w2.g1;
import w2.i2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public static final void a(final l3.v vVar, final j71.c cVar, final w1.r rVar, final boolean z, final q0 q0Var, final j71.e eVar, final j71.e eVar2, final j71.e eVar3, final j71.e eVar4, final l3.e0 e0Var, final s0.m0 m0Var, final s0.l0 l0Var, final boolean z2, final int i, final int i2, j0.j jVar, final d2.p0 p0Var, final gb gbVar, final s3.f fVar, final j71.c cVar2, final float f, final d2 d2Var, androidx.compose.runtime.s sVar, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        final j0.j jVar2;
        j0.j jVar3;
        v71.z zVar;
        long j;
        sVar.e0(-1101373115);
        if ((i3 & 6) == 0) {
            i6 = (sVar.f(vVar) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= sVar.f(rVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= sVar.g(z) ? 2048 : 1024;
        }
        int i9 = i6 | 24576;
        if ((i3 & 196608) == 0) {
            i9 |= sVar.f(q0Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i9 |= sVar.h(eVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i9 |= sVar.h(eVar2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i9 |= sVar.h(eVar3) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i9 |= sVar.h(eVar4) ? 536870912 : 268435456;
        }
        int i11 = i9;
        if ((i4 & 6) == 0) {
            i7 = i4 | (sVar.f(e0Var) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= sVar.f(m0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= sVar.f(l0Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= sVar.g(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= sVar.d(i) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i7 |= sVar.d(i2) ? 131072 : 65536;
        }
        int i12 = i7 | 1572864;
        if ((i4 & 12582912) == 0) {
            i12 |= sVar.f(p0Var) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i12 |= sVar.f(gbVar) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i12 |= sVar.f(fVar) ? 536870912 : 268435456;
        }
        int i13 = i12;
        if ((i5 & 6) == 0) {
            i8 = i5 | (sVar.h(cVar2) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= sVar.c(f) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i8 |= sVar.f(d2Var) ? 256 : 128;
        }
        int i14 = i8;
        if (sVar.S(i11 & 1, ((i11 & 306783379) == 306783378 && (i13 & 306783379) == 306783378 && (i14 & 147) == 146) ? false : true)) {
            sVar.X();
            int i15 = i3 & 1;
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (i15 == 0 || sVar.A()) {
                Object N = sVar.N();
                if (N == iVar) {
                    N = h1.k(sVar);
                }
                jVar3 = (j0.j) N;
            } else {
                sVar.V();
                jVar3 = jVar;
            }
            sVar.r();
            Object N2 = sVar.N();
            if (N2 == iVar) {
                N2 = new p0.c();
                sVar.n0(N2);
            }
            final p0.c cVar3 = (p0.c) N2;
            Object N3 = sVar.N();
            if (N3 == iVar) {
                N3 = androidx.compose.runtime.t.p(sVar);
                sVar.n0(N3);
            }
            v71.z zVar2 = (v71.z) N3;
            final float W = ((s3.c) sVar.j(g1.h)).W(f);
            long b = q0Var.b();
            if (b != 16) {
                zVar = zVar2;
                j = b;
            } else {
                zVar = zVar2;
                j = gbVar.a;
            }
            q0 d = q0Var.d(new q0(j, 0L, (k3.s) null, (k3.o) null, (k3.l) null, 0L, 0, 0L, (g3.z) null, 16777214));
            long j2 = gbVar.i;
            jb jbVar = jb.a;
            final v71.z zVar3 = zVar;
            final j0.j jVar4 = jVar3;
            w1.r a = p0.d.a(p2.a(rVar.f(new q5(z, false, jVar4, gbVar, (d2.p0) null, jb.e, jb.d)), jb.c, fVar != null ? fVar.r : jb.b), cVar3);
            r0 r0Var = new r0(j2);
            boolean h = ((i11 & 14) == 4) | sVar.h(zVar3) | sVar.h(cVar3) | sVar.c(W) | ((i14 & 14) == 4);
            Object N4 = sVar.N();
            if (h || N4 == iVar) {
                N4 = new j71.c() { // from class: com.github.rudroid.uitoolkit.text.b0
                    public final Object k(Object obj) {
                        g3.m0 m0Var2 = (g3.m0) obj;
                        k71.k.g(m0Var2, "it");
                        long j3 = vVar.b;
                        int i16 = g3.p0.c;
                        v71.b0.z(zVar3, (a71.h) null, (v71.a0) null, new e0(cVar3, m0Var2.c((int) (j3 >> 32)), W, null), 3);
                        cVar2.k(m0Var2);
                        return w61.a0.a;
                    }
                };
                sVar.n0(N4);
            }
            int i16 = i13 << 15;
            s0.g.b(vVar, cVar, a, z, false, d, m0Var, l0Var, z2, i2, i, e0Var, (j71.c) N4, jVar4, r0Var, r1.i.d(-1576700248, new j71.f() { // from class: com.github.rudroid.uitoolkit.text.c0
                public final Object f(Object obj, Object obj2, Object obj3) {
                    j71.e eVar5 = (j71.e) obj;
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    k71.k.g(eVar5, "innerTextField");
                    if ((intValue & 6) == 0) {
                        intValue |= sVar2.h(eVar5) ? 4 : 2;
                    }
                    if (sVar2.S(intValue & 1, (intValue & 19) != 18)) {
                        jb.a.b(vVar.a.s, eVar5, z, z2, e0Var, jVar4, eVar, eVar2, eVar3, eVar4, (j71.e) null, p0Var, gbVar, d2Var, (j71.e) null, sVar2, (intValue << 3) & 112, 145472);
                    } else {
                        sVar2.V();
                    }
                    return w61.a0.a;
                }
            }, sVar), sVar, (i11 & 64638) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024) | ((i13 << 12) & 1879048192), ((i13 >> 12) & 14) | 196608 | ((i13 << 3) & 112) | ((i13 >> 9) & 7168), 0);
            jVar2 = jVar4;
        } else {
            sVar.V();
            jVar2 = jVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.d0
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = androidx.compose.runtime.t.L(i3 | 1);
                    int L2 = androidx.compose.runtime.t.L(i4);
                    int L3 = androidx.compose.runtime.t.L(i5);
                    g0.a(vVar, cVar, rVar, z, q0Var, eVar, eVar2, eVar3, eVar4, e0Var, m0Var, l0Var, z2, i, i2, jVar2, p0Var, gbVar, fVar, cVar2, f, d2Var, (androidx.compose.runtime.s) obj, L, L2, L3);
                    return w61.a0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final w1.r rVar, final l3.v vVar, final s0.m0 m0Var, final j71.c cVar, j71.c cVar2, final String str, j71.e eVar, j71.e eVar2, j71.e eVar3, final gb gbVar, int i, int i2, boolean z, final boolean z2, boolean z3, q0 q0Var, s0.l0 l0Var, final d2 d2Var, d2.p0 p0Var, s3.f fVar, l3.e0 e0Var, float f, androidx.compose.runtime.s sVar, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        j71.c cVar3;
        int i8;
        j71.e eVar4;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final j71.e eVar5;
        final j71.e eVar6;
        final int i27;
        final boolean z4;
        final boolean z5;
        final q0 q0Var2;
        final s0.l0 l0Var2;
        final d2.p0 p0Var2;
        final s3.f fVar2;
        l3.e0 e0Var2;
        final float f2;
        j71.c cVar4;
        final j71.e eVar7;
        final int i28;
        b2 t;
        int i29;
        boolean z6;
        q0 q0Var3;
        q0 q0Var4;
        s3.f fVar3;
        s0.l0 l0Var3;
        d2.p0 p0Var3;
        d2.p0 p0Var4;
        int i31;
        l3.e0 e0Var3;
        int i32;
        j71.e eVar8;
        q0 q0Var5;
        s0.l0 l0Var4;
        boolean z7;
        int i33;
        boolean z8;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(vVar, "textFieldValue");
        k71.k.g(cVar, "onValueChange");
        sVar2.e0(-854855546);
        if ((i3 & 6) == 0) {
            i7 = (sVar2.f(rVar) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= sVar2.f(vVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= sVar2.f(m0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= sVar2.h(cVar) ? 2048 : 1024;
        }
        int i34 = i6 & 16;
        if (i34 != 0) {
            i7 |= 24576;
        } else if ((i3 & 24576) == 0) {
            cVar3 = cVar2;
            i7 |= sVar2.h(cVar3) ? 16384 : 8192;
            if ((i3 & 196608) == 0) {
                i7 |= sVar2.f(str) ? 131072 : 65536;
            }
            i8 = i6 & 64;
            if (i8 == 0) {
                i7 |= 1572864;
                eVar4 = eVar;
            } else {
                eVar4 = eVar;
                if ((i3 & 1572864) == 0) {
                    i7 |= sVar2.h(eVar4) ? 1048576 : 524288;
                }
            }
            i9 = i6 & 128;
            if (i9 == 0) {
                i7 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                i7 |= sVar2.h(eVar2) ? 8388608 : 4194304;
            }
            i11 = i6 & 256;
            int i35 = 33554432;
            if (i11 == 0) {
                i7 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                i12 = i11;
                i7 |= sVar2.h(eVar3) ? 67108864 : 33554432;
                if ((i3 & 805306368) == 0) {
                    i7 |= sVar2.f(gbVar) ? 536870912 : 268435456;
                }
                i13 = i6 & 1024;
                if (i13 != 0) {
                    i15 = i4 | 6;
                    i14 = i13;
                } else if ((i4 & 6) == 0) {
                    i14 = i13;
                    i15 = i4 | (sVar2.d(i) ? 4 : 2);
                } else {
                    i14 = i13;
                    i15 = i4;
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                    i17 = i16;
                } else if ((i4 & 48) == 0) {
                    i17 = i16;
                    i15 |= sVar2.d(i2) ? 32 : 16;
                } else {
                    i17 = i16;
                }
                int i36 = i15;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i19 = i36 | 384;
                } else {
                    i19 = i36;
                    if ((i4 & 384) == 0) {
                        i19 |= sVar2.g(z) ? 256 : 128;
                        if ((i4 & 3072) == 0) {
                            i19 |= sVar2.g(z2) ? 2048 : 1024;
                        }
                        int i37 = i19;
                        i21 = i6 & 16384;
                        if (i21 == 0) {
                            i22 = i37 | 24576;
                        } else {
                            i22 = i37;
                            if ((i4 & 24576) == 0) {
                                i22 |= sVar2.g(z3) ? 16384 : 8192;
                                if ((i4 & 196608) == 0) {
                                    i22 |= ((i6 & 32768) == 0 && sVar2.f(q0Var)) ? 131072 : 65536;
                                }
                                if ((i4 & 1572864) == 0) {
                                    i22 |= ((i6 & 65536) == 0 && sVar2.f(l0Var)) ? 1048576 : 524288;
                                }
                                if ((i4 & 12582912) == 0) {
                                    i22 |= sVar2.f(d2Var) ? 8388608 : 4194304;
                                }
                                if ((i4 & 100663296) == 0) {
                                    if ((i6 & 262144) == 0 && sVar2.f(p0Var)) {
                                        i35 = 67108864;
                                    }
                                    i22 |= i35;
                                }
                                i23 = i6 & 524288;
                                if (i23 != 0) {
                                    i22 |= 805306368;
                                } else if ((i4 & 805306368) == 0) {
                                    i22 |= sVar2.f(fVar) ? 536870912 : 268435456;
                                }
                                i24 = i6 & 1048576;
                                if (i24 != 0) {
                                    i25 = i5 | 6;
                                } else if ((i5 & 6) == 0) {
                                    i25 = i5 | (sVar2.f(e0Var) ? 4 : 2);
                                } else {
                                    i25 = i5;
                                }
                                i26 = i6 & 2097152;
                                if (i26 != 0) {
                                    i25 |= 48;
                                } else if ((i5 & 48) == 0) {
                                    i25 |= sVar2.c(f) ? 32 : 16;
                                }
                                if (sVar2.S(i7 & 1, ((i7 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i25 & 19) == 18) ? false : true)) {
                                    sVar2.X();
                                    int i38 = i3 & 1;
                                    Object obj = androidx.compose.runtime.n.a;
                                    if (i38 == 0 || sVar2.A()) {
                                        if (i34 != 0) {
                                            Object N = sVar2.N();
                                            if (N == obj) {
                                                N = new u0(19);
                                                sVar2.n0(N);
                                            }
                                            cVar3 = (j71.c) N;
                                        }
                                        if (i8 != 0) {
                                            eVar4 = null;
                                        }
                                        j71.e eVar9 = i9 != 0 ? null : eVar2;
                                        j71.e eVar10 = i12 != 0 ? null : eVar3;
                                        i29 = i14 != 0 ? 1 : i;
                                        int i39 = i17 != 0 ? Integer.MAX_VALUE : i2;
                                        boolean z9 = i18 != 0 ? false : z;
                                        z6 = i21 == 0 ? z3 : true;
                                        if ((i6 & 32768) != 0) {
                                            q0Var3 = ih.d.f(sVar2).D;
                                            i22 &= -458753;
                                        } else {
                                            q0Var3 = q0Var;
                                        }
                                        j71.e eVar11 = eVar9;
                                        if ((i6 & 65536) != 0) {
                                            q0Var4 = q0Var3;
                                            fVar3 = null;
                                            l0Var3 = new s0.l0((j71.c) null, (j71.c) null, (j71.c) null, 63);
                                            i22 &= -3670017;
                                        } else {
                                            q0Var4 = q0Var3;
                                            fVar3 = null;
                                            l0Var3 = l0Var;
                                        }
                                        if ((i6 & 262144) != 0) {
                                            jb jbVar = jb.a;
                                            p0Var3 = r8.b(j1.a0.d, sVar2);
                                            i22 &= -234881025;
                                        } else {
                                            p0Var3 = p0Var;
                                        }
                                        s3.f fVar4 = i23 != 0 ? fVar3 : fVar;
                                        l3.e0 e0Var4 = i24 != 0 ? l3.d0.r : e0Var;
                                        s0.l0 l0Var5 = l0Var3;
                                        if (i26 != 0) {
                                            int i41 = i25;
                                            p0Var4 = p0Var3;
                                            i31 = i7;
                                            eVar6 = eVar10;
                                            e0Var3 = e0Var4;
                                            fVar2 = fVar4;
                                            i32 = i41;
                                            l0Var4 = l0Var5;
                                            f2 = 0;
                                            eVar7 = eVar4;
                                            z7 = z9;
                                            i33 = i39;
                                            eVar8 = eVar11;
                                            q0Var5 = q0Var4;
                                        } else {
                                            int i42 = i25;
                                            p0Var4 = p0Var3;
                                            i31 = i7;
                                            eVar6 = eVar10;
                                            e0Var3 = e0Var4;
                                            fVar2 = fVar4;
                                            i32 = i42;
                                            eVar8 = eVar11;
                                            q0Var5 = q0Var4;
                                            l0Var4 = l0Var5;
                                            f2 = f;
                                            eVar7 = eVar4;
                                            z7 = z9;
                                            i33 = i39;
                                        }
                                    } else {
                                        sVar2.V();
                                        if ((i6 & 32768) != 0) {
                                            i22 &= -458753;
                                        }
                                        if ((i6 & 65536) != 0) {
                                            i22 &= -3670017;
                                        }
                                        if ((i6 & 262144) != 0) {
                                            i22 &= -234881025;
                                        }
                                        eVar8 = eVar2;
                                        i29 = i;
                                        i33 = i2;
                                        z6 = z3;
                                        q0Var5 = q0Var;
                                        l0Var4 = l0Var;
                                        fVar2 = fVar;
                                        e0Var3 = e0Var;
                                        f2 = f;
                                        i31 = i7;
                                        eVar7 = eVar4;
                                        i32 = i25;
                                        eVar6 = eVar3;
                                        z7 = z;
                                        p0Var4 = p0Var;
                                    }
                                    sVar2.r();
                                    j71.e eVar12 = eVar8;
                                    Object N2 = sVar2.N();
                                    if (N2 == obj) {
                                        N2 = no.a.f(sVar2);
                                    }
                                    b2.a0 a0Var = (b2.a0) N2;
                                    i2 i2Var = (i2) sVar2.j(g1.p);
                                    int i43 = i31;
                                    int i44 = i43 >> 3;
                                    int i45 = i22 >> 3;
                                    int i46 = i22 << 12;
                                    cVar4 = cVar3;
                                    a(vVar, cVar, b2.d.k(rVar, a0Var), z6, q0Var5, eVar7, r1.i.d(1837008279, new com.github.rudroid.profile.status.ui.x(str, q0Var5, gbVar, 15), sVar2), eVar6, eVar12, e0Var3, m0Var, l0Var4, z7, i29, i33, null, p0Var4, gbVar, fVar2, cVar4, f2, d2Var, sVar2, (i44 & 14) | 12582912 | ((i43 >> 6) & 112) | (i45 & 7168) | (i22 & 458752) | (i43 & 3670016) | (i43 & 234881024) | ((i43 << 6) & 1879048192), (i32 & 14) | (i44 & 112) | ((i22 >> 12) & 896) | ((i22 << 3) & 7168) | (i46 & 57344) | (i46 & 458752) | (i45 & 29360128) | (i44 & 234881024) | (i22 & 1879048192), ((i43 >> 12) & 14) | (i32 & 112) | ((i22 >> 15) & 896));
                                    sVar2 = sVar2;
                                    if (z2 && z6) {
                                        sVar2.c0(-2138263685);
                                        boolean f3 = sVar2.f(i2Var);
                                        Object N3 = sVar2.N();
                                        if (f3 || N3 == obj) {
                                            N3 = new f0(a0Var, i2Var, null);
                                            sVar2.n0(N3);
                                        }
                                        androidx.compose.runtime.t.f(sVar2, (j71.e) N3, w61.a0.a);
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                        sVar2.c0(-2145091652);
                                    }
                                    sVar2.q(z8);
                                    eVar5 = eVar12;
                                    e0Var2 = e0Var3;
                                    l0Var2 = l0Var4;
                                    z4 = z7;
                                    i27 = i29;
                                    i28 = i33;
                                    p0Var2 = p0Var4;
                                    z5 = z6;
                                    q0Var2 = q0Var5;
                                } else {
                                    sVar2.V();
                                    eVar5 = eVar2;
                                    eVar6 = eVar3;
                                    i27 = i;
                                    z4 = z;
                                    z5 = z3;
                                    q0Var2 = q0Var;
                                    l0Var2 = l0Var;
                                    p0Var2 = p0Var;
                                    fVar2 = fVar;
                                    e0Var2 = e0Var;
                                    f2 = f;
                                    cVar4 = cVar3;
                                    eVar7 = eVar4;
                                    i28 = i2;
                                }
                                t = sVar2.t();
                                if (t != null) {
                                    final j71.c cVar5 = cVar4;
                                    final l3.e0 e0Var5 = e0Var2;
                                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.z
                                        public final Object s(Object obj2, Object obj3) {
                                            ((Integer) obj3).getClass();
                                            int L = androidx.compose.runtime.t.L(i3 | 1);
                                            int L2 = androidx.compose.runtime.t.L(i4);
                                            int L3 = androidx.compose.runtime.t.L(i5);
                                            g0.b(rVar, vVar, m0Var, cVar, cVar5, str, eVar7, eVar5, eVar6, gbVar, i27, i28, z4, z2, z5, q0Var2, l0Var2, d2Var, p0Var2, fVar2, e0Var5, f2, (androidx.compose.runtime.s) obj2, L, L2, L3, i6);
                                            return w61.a0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i4 & 196608) == 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        if ((i4 & 12582912) == 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i23 = i6 & 524288;
                        if (i23 != 0) {
                        }
                        i24 = i6 & 1048576;
                        if (i24 != 0) {
                        }
                        i26 = i6 & 2097152;
                        if (i26 != 0) {
                        }
                        if (sVar2.S(i7 & 1, ((i7 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i25 & 19) == 18) ? false : true)) {
                        }
                        t = sVar2.t();
                        if (t != null) {
                        }
                    }
                }
                if ((i4 & 3072) == 0) {
                }
                int i372 = i19;
                i21 = i6 & 16384;
                if (i21 == 0) {
                }
                if ((i4 & 196608) == 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                if ((i4 & 12582912) == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i23 = i6 & 524288;
                if (i23 != 0) {
                }
                i24 = i6 & 1048576;
                if (i24 != 0) {
                }
                i26 = i6 & 2097152;
                if (i26 != 0) {
                }
                if (sVar2.S(i7 & 1, ((i7 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i25 & 19) == 18) ? false : true)) {
                }
                t = sVar2.t();
                if (t != null) {
                }
            }
            i12 = i11;
            if ((i3 & 805306368) == 0) {
            }
            i13 = i6 & 1024;
            if (i13 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i362 = i15;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            if ((i4 & 3072) == 0) {
            }
            int i3722 = i19;
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            if ((i4 & 196608) == 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if ((i4 & 12582912) == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i23 = i6 & 524288;
            if (i23 != 0) {
            }
            i24 = i6 & 1048576;
            if (i24 != 0) {
            }
            i26 = i6 & 2097152;
            if (i26 != 0) {
            }
            if (sVar2.S(i7 & 1, ((i7 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i25 & 19) == 18) ? false : true)) {
            }
            t = sVar2.t();
            if (t != null) {
            }
        }
        cVar3 = cVar2;
        if ((i3 & 196608) == 0) {
        }
        i8 = i6 & 64;
        if (i8 == 0) {
        }
        i9 = i6 & 128;
        if (i9 == 0) {
        }
        i11 = i6 & 256;
        int i352 = 33554432;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i3 & 805306368) == 0) {
        }
        i13 = i6 & 1024;
        if (i13 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i3622 = i15;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        int i37222 = i19;
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        if ((i4 & 196608) == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i23 = i6 & 524288;
        if (i23 != 0) {
        }
        i24 = i6 & 1048576;
        if (i24 != 0) {
        }
        i26 = i6 & 2097152;
        if (i26 != 0) {
        }
        if (sVar2.S(i7 & 1, ((i7 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i25 & 19) == 18) ? false : true)) {
        }
        t = sVar2.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0195, code lost:
    
        if (r62.f(r56) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final w1.r rVar, final String str, s0.m0 m0Var, final j71.c cVar, String str2, j71.e eVar, gb gbVar, int i, int i2, boolean z, boolean z2, boolean z3, q0 q0Var, boolean z4, s0.l0 l0Var, d2 d2Var, d2.p0 p0Var, s3.f fVar, l3.e0 e0Var, float f, androidx.compose.runtime.s sVar, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        s0.m0 m0Var2;
        int i8;
        int i9;
        final j71.e eVar2;
        gb gbVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        q0 q0Var2;
        int i21;
        boolean z5;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final String str3;
        final int i27;
        final int i28;
        boolean z6;
        final boolean z7;
        final q0 q0Var3;
        final boolean z8;
        final s0.l0 l0Var2;
        final d2 d2Var2;
        d2.p0 p0Var2;
        final s3.f fVar2;
        final l3.e0 e0Var2;
        final float f2;
        s0.m0 m0Var3;
        final boolean z9;
        b2 t;
        s0.m0 m0Var4;
        int i29;
        s3.f fVar3;
        int i31;
        int i32;
        q0 q0Var4;
        int i33;
        s0.l0 l0Var3;
        d2 d2Var3;
        s3.f fVar4;
        boolean z11;
        float f3;
        int i34;
        boolean z12;
        q0 q0Var5;
        s0.l0 l0Var4;
        int i35;
        d2 d2Var4;
        j71.e eVar3;
        int i36;
        int i37;
        int i38;
        boolean z13;
        l3.e0 e0Var3;
        gb gbVar3;
        String str4;
        gb gbVar4;
        int i39;
        int i41;
        k71.k.g(str, "value");
        k71.k.g(cVar, "onValueChange");
        sVar.e0(1019688553);
        if ((i3 & 6) == 0) {
            i7 = (sVar.f(rVar) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= sVar.f(str) ? 32 : 16;
        }
        int i42 = i6 & 4;
        if (i42 != 0) {
            i7 |= 384;
        } else if ((i3 & 384) == 0) {
            m0Var2 = m0Var;
            i7 |= sVar.f(m0Var2) ? 256 : 128;
            if ((i3 & 3072) == 0) {
                i7 |= sVar.h(cVar) ? 2048 : 1024;
            }
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i7 |= sVar.f(str2) ? 16384 : 8192;
                i9 = i6 & 32;
                int i43 = 131072;
                if (i9 != 0) {
                    i7 |= 196608;
                    eVar2 = eVar;
                } else {
                    eVar2 = eVar;
                    if ((i3 & 196608) == 0) {
                        i7 |= sVar.h(eVar2) ? 131072 : 65536;
                    }
                }
                int i44 = i7 | 1572864;
                if ((i3 & 12582912) == 0) {
                    if ((i6 & 128) == 0) {
                        gbVar2 = gbVar;
                        if (sVar.f(gbVar2)) {
                            i41 = 8388608;
                            i44 |= i41;
                        }
                    } else {
                        gbVar2 = gbVar;
                    }
                    i41 = 4194304;
                    i44 |= i41;
                } else {
                    gbVar2 = gbVar;
                }
                i11 = i44 | 100663296;
                i12 = i6 & 512;
                if (i12 != 0) {
                    i11 = i44 | 905969664;
                } else if ((i3 & 805306368) == 0) {
                    i13 = i2;
                    i11 |= sVar.d(i13) ? 536870912 : 268435456;
                    i14 = i6 & 1024;
                    if (i14 == 0) {
                        i16 = i4 | 6;
                        i15 = i14;
                    } else if ((i4 & 6) == 0) {
                        i15 = i14;
                        i16 = i4 | (sVar.g(z) ? 4 : 2);
                    } else {
                        i15 = i14;
                        i16 = i4;
                    }
                    i17 = i6 & 2048;
                    if (i17 == 0) {
                        i18 = i17;
                        i19 = i16 | 48;
                    } else {
                        if ((i4 & 48) == 0) {
                            i18 = i17;
                            i16 |= sVar.g(z2) ? 32 : 16;
                        } else {
                            i18 = i17;
                        }
                        i19 = i16;
                    }
                    int i45 = i19 | 384;
                    if ((i4 & 3072) != 0) {
                        if ((i6 & 8192) == 0) {
                            q0Var2 = q0Var;
                            if (sVar.f(q0Var2)) {
                                i39 = 2048;
                                i45 |= i39;
                            }
                        } else {
                            q0Var2 = q0Var;
                        }
                        i39 = 1024;
                        i45 |= i39;
                    } else {
                        q0Var2 = q0Var;
                    }
                    i21 = i6 & 16384;
                    if (i21 == 0) {
                        i45 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        z5 = z4;
                        i45 |= sVar.g(z5) ? 16384 : 8192;
                        if ((i4 & 196608) == 0) {
                            if ((i6 & 32768) == 0) {
                                i22 = i21;
                            } else {
                                i22 = i21;
                            }
                            i43 = 65536;
                            i45 |= i43;
                        } else {
                            i22 = i21;
                        }
                        if ((i4 & 1572864) == 0) {
                            i45 |= ((i6 & 65536) == 0 && sVar.f(d2Var)) ? 1048576 : 524288;
                        }
                        if ((i4 & 12582912) == 0) {
                            i45 |= 4194304;
                        }
                        i23 = i6 & 262144;
                        if (i23 != 0) {
                            i45 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            i45 |= sVar.f(fVar) ? 67108864 : 33554432;
                        }
                        i24 = i45 | 805306368;
                        i25 = i6 & 1048576;
                        if (i25 != 0) {
                            i26 = 6;
                        } else if ((i5 & 6) == 0) {
                            i26 = i5 | (sVar.c(f) ? 4 : 2);
                        } else {
                            i26 = i5;
                        }
                        if (sVar.S(i11 & 1, ((i11 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i26 & 3) == 2) ? false : true)) {
                            sVar.X();
                            if ((i3 & 1) == 0 || sVar.A()) {
                                s0.m0 m0Var5 = i42 != 0 ? s0.m0.e : m0Var2;
                                String str5 = i8 != 0 ? null : str2;
                                j71.e eVar4 = i9 != 0 ? null : eVar2;
                                if ((i6 & 128) != 0) {
                                    i32 = i22;
                                    m0Var4 = m0Var5;
                                    i29 = -3670017;
                                    fVar3 = null;
                                    i31 = i24;
                                    i11 &= -29360129;
                                    gbVar2 = q.a(0L, 0L, 0L, 0L, 0L, sVar, 100663296, 255);
                                } else {
                                    m0Var4 = m0Var5;
                                    i29 = -3670017;
                                    fVar3 = null;
                                    i31 = i24;
                                    i32 = i22;
                                }
                                int i46 = i12 != 0 ? Integer.MAX_VALUE : i2;
                                boolean z14 = i15 != 0 ? false : z;
                                boolean z15 = i18 != 0 ? true : z2;
                                if ((i6 & 8192) != 0) {
                                    q0Var4 = ih.d.f(sVar).D;
                                    i33 = i31 & (-7169);
                                } else {
                                    q0Var4 = q0Var;
                                    i33 = i31;
                                }
                                boolean z16 = i32 != 0 ? false : z4;
                                if ((i6 & 32768) != 0) {
                                    l0Var3 = new s0.l0(fVar3, fVar3, fVar3, 63);
                                    i33 &= -458753;
                                } else {
                                    l0Var3 = l0Var;
                                }
                                if ((i6 & 65536) != 0) {
                                    d2Var3 = jb.e(jb.a, 0.0f, 0.0f, 15);
                                    i33 &= i29;
                                } else {
                                    d2Var3 = d2Var;
                                }
                                jb jbVar = jb.a;
                                d2.p0 b = r8.b(j1.a0.d, sVar);
                                int i47 = i33 & (-29360129);
                                if (i23 == 0) {
                                    fVar3 = fVar;
                                }
                                l3.e0 e0Var4 = l3.d0.r;
                                s3.f fVar5 = fVar3;
                                boolean z17 = z16;
                                if (i25 != 0) {
                                    fVar4 = fVar5;
                                    z11 = z17;
                                    f3 = 0;
                                } else {
                                    fVar4 = fVar5;
                                    z11 = z17;
                                    f3 = f;
                                }
                                i34 = i46;
                                z6 = z14;
                                z12 = z15;
                                q0Var5 = q0Var4;
                                l0Var4 = l0Var3;
                                i35 = i47;
                                d2Var4 = d2Var3;
                                p0Var2 = b;
                                eVar3 = eVar4;
                                i36 = i26;
                                i37 = i11;
                                i38 = 1;
                                z13 = true;
                                m0Var3 = m0Var4;
                                e0Var3 = e0Var4;
                                gbVar3 = gbVar2;
                                str4 = str5;
                            } else {
                                sVar.V();
                                if ((i6 & 128) != 0) {
                                    i11 &= -29360129;
                                }
                                if ((i6 & 8192) != 0) {
                                    i24 &= -7169;
                                }
                                if ((i6 & 32768) != 0) {
                                    i24 &= -458753;
                                }
                                if ((i6 & 65536) != 0) {
                                    i24 &= -3670017;
                                }
                                i38 = i;
                                z6 = z;
                                z12 = z2;
                                z13 = z3;
                                l0Var4 = l0Var;
                                d2Var4 = d2Var;
                                p0Var2 = p0Var;
                                fVar4 = fVar;
                                f3 = f;
                                i35 = i24 & (-29360129);
                                eVar3 = eVar2;
                                z11 = z5;
                                i34 = i13;
                                m0Var3 = m0Var2;
                                q0Var5 = q0Var2;
                                i36 = i26;
                                i37 = i11;
                                e0Var3 = e0Var;
                                gbVar3 = gbVar2;
                                str4 = str2;
                            }
                            sVar.r();
                            Object N = sVar.N();
                            Object obj = androidx.compose.runtime.n.a;
                            if (N == obj) {
                                int length = z11 ? 0 : str.length();
                                gbVar4 = gbVar3;
                                N = androidx.compose.runtime.t.B(new l3.v(4, g3.g0.b(length, length), str));
                                sVar.n0(N);
                            } else {
                                gbVar4 = gbVar3;
                            }
                            f1 f1Var = (f1) N;
                            int i48 = i38;
                            l3.v b2 = l3.v.b((l3.v) f1Var.getValue(), str, 0L, 6);
                            boolean z18 = ((i37 & 112) == 32) | ((i37 & 7168) == 2048);
                            Object N2 = sVar.N();
                            if (z18 || N2 == obj) {
                                N2 = new v(str, cVar, f1Var, 1);
                                sVar.n0(N2);
                            }
                            int i49 = i37 << 3;
                            int i51 = (i37 & 910) | (i49 & 458752) | (i49 & 3670016) | (i49 & 29360128) | ((i37 << 6) & 1879048192);
                            int i52 = i35 << 6;
                            int i53 = ((i37 >> 24) & 126) | (i52 & 896) | (i52 & 7168) | (57344 & i52) | (i52 & 458752);
                            int i54 = i35 << 3;
                            gb gbVar5 = gbVar4;
                            b(rVar, b2, m0Var3, (j71.c) N2, null, str4, eVar3, null, null, gbVar5, i48, i34, z6, z12, z13, q0Var5, l0Var4, d2Var4, p0Var2, fVar4, e0Var3, f3, sVar, i51, i53 | (i54 & 3670016) | (i54 & 29360128) | (i54 & 1879048192), ((i35 >> 27) & 14) | ((i36 << 3) & 112), 272);
                            str3 = str4;
                            eVar2 = eVar3;
                            gbVar2 = gbVar5;
                            i27 = i48;
                            i28 = i34;
                            z7 = z12;
                            z9 = z13;
                            q0Var3 = q0Var5;
                            l0Var2 = l0Var4;
                            d2Var2 = d2Var4;
                            fVar2 = fVar4;
                            e0Var2 = e0Var3;
                            f2 = f3;
                            z8 = z11;
                        } else {
                            sVar.V();
                            str3 = str2;
                            i27 = i;
                            i28 = i2;
                            z6 = z;
                            z7 = z2;
                            q0Var3 = q0Var;
                            z8 = z4;
                            l0Var2 = l0Var;
                            d2Var2 = d2Var;
                            p0Var2 = p0Var;
                            fVar2 = fVar;
                            e0Var2 = e0Var;
                            f2 = f;
                            m0Var3 = m0Var2;
                            z9 = z3;
                        }
                        t = sVar.t();
                        if (t != null) {
                            final s0.m0 m0Var6 = m0Var3;
                            final gb gbVar6 = gbVar2;
                            final boolean z19 = z6;
                            final d2.p0 p0Var3 = p0Var2;
                            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.a0
                                public final Object s(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    int L = androidx.compose.runtime.t.L(i3 | 1);
                                    int L2 = androidx.compose.runtime.t.L(i4);
                                    int L3 = androidx.compose.runtime.t.L(i5);
                                    g0.c(rVar, str, m0Var6, cVar, str3, eVar2, gbVar6, i27, i28, z19, z7, z9, q0Var3, z8, l0Var2, d2Var2, p0Var3, fVar2, e0Var2, f2, (androidx.compose.runtime.s) obj2, L, L2, L3, i6);
                                    return w61.a0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    z5 = z4;
                    if ((i4 & 196608) == 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    if ((i4 & 12582912) == 0) {
                    }
                    i23 = i6 & 262144;
                    if (i23 != 0) {
                    }
                    i24 = i45 | 805306368;
                    i25 = i6 & 1048576;
                    if (i25 != 0) {
                    }
                    if (sVar.S(i11 & 1, ((i11 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i26 & 3) == 2) ? false : true)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                i13 = i2;
                i14 = i6 & 1024;
                if (i14 == 0) {
                }
                i17 = i6 & 2048;
                if (i17 == 0) {
                }
                int i452 = i19 | 384;
                if ((i4 & 3072) != 0) {
                }
                i21 = i6 & 16384;
                if (i21 == 0) {
                }
                z5 = z4;
                if ((i4 & 196608) == 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                if ((i4 & 12582912) == 0) {
                }
                i23 = i6 & 262144;
                if (i23 != 0) {
                }
                i24 = i452 | 805306368;
                i25 = i6 & 1048576;
                if (i25 != 0) {
                }
                if (sVar.S(i11 & 1, ((i11 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i26 & 3) == 2) ? false : true)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            i9 = i6 & 32;
            int i432 = 131072;
            if (i9 != 0) {
            }
            int i442 = i7 | 1572864;
            if ((i3 & 12582912) == 0) {
            }
            i11 = i442 | 100663296;
            i12 = i6 & 512;
            if (i12 != 0) {
            }
            i13 = i2;
            i14 = i6 & 1024;
            if (i14 == 0) {
            }
            i17 = i6 & 2048;
            if (i17 == 0) {
            }
            int i4522 = i19 | 384;
            if ((i4 & 3072) != 0) {
            }
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            z5 = z4;
            if ((i4 & 196608) == 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if ((i4 & 12582912) == 0) {
            }
            i23 = i6 & 262144;
            if (i23 != 0) {
            }
            i24 = i4522 | 805306368;
            i25 = i6 & 1048576;
            if (i25 != 0) {
            }
            if (sVar.S(i11 & 1, ((i11 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i26 & 3) == 2) ? false : true)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        m0Var2 = m0Var;
        if ((i3 & 3072) == 0) {
        }
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        i9 = i6 & 32;
        int i4322 = 131072;
        if (i9 != 0) {
        }
        int i4422 = i7 | 1572864;
        if ((i3 & 12582912) == 0) {
        }
        i11 = i4422 | 100663296;
        i12 = i6 & 512;
        if (i12 != 0) {
        }
        i13 = i2;
        i14 = i6 & 1024;
        if (i14 == 0) {
        }
        i17 = i6 & 2048;
        if (i17 == 0) {
        }
        int i45222 = i19 | 384;
        if ((i4 & 3072) != 0) {
        }
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        z5 = z4;
        if ((i4 & 196608) == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        i23 = i6 & 262144;
        if (i23 != 0) {
        }
        i24 = i45222 | 805306368;
        i25 = i6 & 1048576;
        if (i25 != 0) {
        }
        if (sVar.S(i11 & 1, ((i11 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i26 & 3) == 2) ? false : true)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }


}
