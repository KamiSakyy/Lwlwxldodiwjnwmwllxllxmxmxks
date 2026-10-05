package com.github.rudroid.uitoolkit.tooltip;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.w0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.github.rudroid.agents.r6;
import com.github.rudroid.profile.status.ui.x;
import com.github.rudroid.widget.p;
import d2.p0;
import f1.c8;
import f1.ec;
import f1.ic;
import f1.ub;
import f1.y1;
import f1.z1;
import f1.zb;
import j1.q0;
import r3.k;
import w1.o;
import w1.r;
import w3.z;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final h hVar, r rVar, j71.a aVar, c8 c8Var, p0 p0Var, z zVar, r rVar2, i iVar, final r1.d dVar, s sVar, final int i, final int i2) {
        j71.a aVar2;
        int i3;
        z zVar2;
        int i4;
        int i5;
        int i6;
        final r rVar3;
        int i7;
        i iVar2;
        final c8 c8Var2;
        final j71.a aVar3;
        final z zVar3;
        final i iVar3;
        final r rVar4;
        final p0 p0Var2;
        b2 t;
        s sVar2;
        int i8;
        r rVar5;
        i iVar4;
        int i9;
        sVar.e0(-760430812);
        int i11 = i | (sVar.f(hVar) ? 4 : 2);
        int i12 = i11 | 48;
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 = i11 | 432;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i3 = i12 | (sVar.h(aVar2) ? 256 : 128);
        }
        int i14 = i3 | 9216;
        if ((i2 & 32) == 0) {
            zVar2 = zVar;
            if (sVar.f(zVar2)) {
                i4 = 131072;
                i5 = i14 | i4;
                i6 = i2 & 64;
                if (i6 == 0) {
                    i5 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    rVar3 = rVar2;
                    i5 |= sVar.f(rVar3) ? 1048576 : 524288;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                        i5 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        iVar2 = iVar;
                        i5 |= sVar.f(iVar2) ? 8388608 : 4194304;
                        if (sVar.S(i5 & 1, (38347923 & i5) == 38347922)) {
                            sVar.V();
                            c8Var2 = c8Var;
                            aVar3 = aVar2;
                            zVar3 = zVar2;
                            iVar3 = iVar2;
                            rVar4 = rVar;
                            p0Var2 = p0Var;
                        } else {
                            sVar.X();
                            if ((i & 1) == 0 || sVar.A()) {
                                if (i13 != 0) {
                                    Object N = sVar.N();
                                    if (N == n.a) {
                                        N = new p(15);
                                        sVar.n0(N);
                                    }
                                    aVar2 = (j71.a) N;
                                }
                                long j = ih.d.b(sVar).d;
                                long j2 = ih.d.b(sVar).t;
                                long j3 = ih.d.b(sVar).s;
                                j71.a aVar4 = aVar2;
                                int i15 = i5;
                                long j4 = ih.d.b(sVar).F;
                                float f = zb.a;
                                sVar2 = sVar;
                                y1 y1Var = (y1) sVar2.j(z1.a);
                                c8 c8Var3 = y1Var.m0;
                                if (c8Var3 == null) {
                                    c8Var3 = new c8(z1.c(y1Var, q0.c), z1.c(y1Var, q0.h), z1.c(y1Var, q0.f), z1.c(y1Var, q0.a));
                                    y1Var.m0 = c8Var3;
                                }
                                if (j == 16) {
                                    j = c8Var3.a;
                                }
                                long j5 = j;
                                if (j2 == 16) {
                                    j2 = c8Var3.b;
                                }
                                long j6 = j2;
                                if (j3 == 16) {
                                    j3 = c8Var3.c;
                                }
                                c8 c8Var4 = new c8(j5, j6, j3, j4 != 16 ? j4 : c8Var3.d);
                                p0 p0Var3 = zb.c;
                                int i16 = i15 & (-64513);
                                if ((i2 & 32) != 0) {
                                    i8 = i15 & (-523265);
                                    zVar2 = zb.a(1, ih.a.n, sVar2, 48, 0);
                                } else {
                                    i8 = i16;
                                }
                                r rVar6 = o.a;
                                if (i6 != 0) {
                                    rVar3 = rVar6;
                                }
                                if (i7 != 0) {
                                    androidx.compose.foundation.layout.f fVar = l.a;
                                    iVar4 = l.g(ih.a.n);
                                    rVar5 = rVar3;
                                    i9 = i8;
                                    zVar3 = zVar2;
                                    c8Var2 = c8Var4;
                                    p0Var2 = p0Var3;
                                    rVar4 = rVar6;
                                } else {
                                    zVar3 = zVar2;
                                    rVar5 = rVar3;
                                    iVar4 = iVar2;
                                    p0Var2 = p0Var3;
                                    rVar4 = rVar6;
                                    i9 = i8;
                                    c8Var2 = c8Var4;
                                }
                                aVar3 = aVar4;
                            } else {
                                sVar.V();
                                int i17 = i5 & (-64513);
                                if ((i2 & 32) != 0) {
                                    i17 = i5 & (-523265);
                                }
                                aVar3 = aVar2;
                                zVar3 = zVar2;
                                rVar5 = rVar3;
                                iVar4 = iVar2;
                                sVar2 = sVar;
                                rVar4 = rVar;
                                p0Var2 = p0Var;
                                i9 = i17;
                                c8Var2 = c8Var;
                            }
                            sVar2.r();
                            final int i18 = 0;
                            r1.d d = r1.i.d(1354983498, new j71.e() { // from class: com.github.rudroid.uitoolkit.tooltip.b
                                public final Object s(Object obj, Object obj2) {
                                    switch (i18) {
                                        case 0:
                                            s sVar3 = (s) obj;
                                            int intValue = ((Integer) obj2).intValue();
                                            if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                                ub.b(hVar.a, (r) null, 0L, 0L, (k3.s) null, 0L, (k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar3).n, sVar3, 0, 0, 131070);
                                            } else {
                                                sVar3.V();
                                            }
                                            break;
                                        default:
                                            s sVar4 = (s) obj;
                                            int intValue2 = ((Integer) obj2).intValue();
                                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                ub.b(hVar.b, (r) null, 0L, 0L, (k3.s) null, 0L, (k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).q, sVar4, 0, 0, 131070);
                                            } else {
                                                sVar4.V();
                                            }
                                            break;
                                    }
                                    return a0.a;
                                }
                            }, sVar2);
                            final int i19 = 1;
                            int i21 = i9 >> 3;
                            b(rVar4, aVar3, c8Var2, p0Var2, zVar3, d, r1.i.d(796999435, new j71.e() { // from class: com.github.rudroid.uitoolkit.tooltip.b
                                public final Object s(Object obj, Object obj2) {
                                    switch (i19) {
                                        case 0:
                                            s sVar3 = (s) obj;
                                            int intValue = ((Integer) obj2).intValue();
                                            if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                                ub.b(hVar.a, (r) null, 0L, 0L, (k3.s) null, 0L, (k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar3).n, sVar3, 0, 0, 131070);
                                            } else {
                                                sVar3.V();
                                            }
                                            break;
                                        default:
                                            s sVar4 = (s) obj;
                                            int intValue2 = ((Integer) obj2).intValue();
                                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                ub.b(hVar.b, (r) null, 0L, 0L, (k3.s) null, 0L, (k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).q, sVar4, 0, 0, 131070);
                                            } else {
                                                sVar4.V();
                                            }
                                            break;
                                    }
                                    return a0.a;
                                }
                            }, sVar2), r1.i.d(239015372, new x(rVar5, iVar4, hVar, 16), sVar2), dVar, sVar2, (i21 & 57344) | (i21 & 112) | 14352390 | 100663296);
                            rVar3 = rVar5;
                            iVar3 = iVar4;
                        }
                        t = sVar.t();
                        if (t == null) {
                            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.tooltip.c
                                public final Object s(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    e.a(h.this, rVar4, aVar3, c8Var2, p0Var2, zVar3, rVar3, iVar3, dVar, (s) obj, t.L(i | 1), i2);
                                    return a0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    iVar2 = iVar;
                    if (sVar.S(i5 & 1, (38347923 & i5) == 38347922)) {
                    }
                    t = sVar.t();
                    if (t == null) {
                    }
                }
                rVar3 = rVar2;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                iVar2 = iVar;
                if (sVar.S(i5 & 1, (38347923 & i5) == 38347922)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
        } else {
            zVar2 = zVar;
        }
        i4 = 65536;
        i5 = i14 | i4;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        rVar3 = rVar2;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        iVar2 = iVar;
        if (sVar.S(i5 & 1, (38347923 & i5) == 38347922)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void b(r rVar, j71.a aVar, c8 c8Var, p0 p0Var, z zVar, r1.d dVar, r1.d dVar2, j71.e eVar, r1.d dVar3, s sVar, int i) {
        int i2;
        c8 c8Var2;
        p0 p0Var2;
        z zVar2;
        r1.d dVar4;
        r1.d dVar5;
        j71.e eVar2;
        sVar.e0(1147573017);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            c8Var2 = c8Var;
            i2 |= sVar.f(c8Var2) ? 256 : 128;
        } else {
            c8Var2 = c8Var;
        }
        if ((i & 3072) == 0) {
            p0Var2 = p0Var;
            i2 |= sVar.f(p0Var2) ? 2048 : 1024;
        } else {
            p0Var2 = p0Var;
        }
        if ((i & 24576) == 0) {
            zVar2 = zVar;
            i2 |= sVar.f(zVar2) ? 16384 : 8192;
        } else {
            zVar2 = zVar;
        }
        if ((196608 & i) == 0) {
            dVar4 = dVar;
            i2 |= sVar.h(dVar4) ? 131072 : 65536;
        } else {
            dVar4 = dVar;
        }
        if ((1572864 & i) == 0) {
            dVar5 = dVar2;
            i2 |= sVar.h(dVar5) ? 1048576 : 524288;
        } else {
            dVar5 = dVar2;
        }
        if ((12582912 & i) == 0) {
            eVar2 = eVar;
            i2 |= sVar.h(eVar2) ? 8388608 : 4194304;
        } else {
            eVar2 = eVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= sVar.h(dVar3) ? 67108864 : 33554432;
        }
        if (sVar.S(i2 & 1, (38347923 & i2) != 38347922)) {
            sVar.X();
            if ((i & 1) != 0 && !sVar.A()) {
                sVar.V();
            }
            sVar.r();
            ic e = ec.e(48, 5, sVar);
            boolean h = sVar.h(e);
            Object N = sVar.N();
            if (h || N == n.a) {
                N = new d(e, null);
                sVar.n0(N);
            }
            t.f(sVar, (j71.e) N, a0.a);
            int i3 = ((i2 >> 12) & 14) | 100663344;
            int i4 = i2 << 9;
            z zVar3 = zVar2;
            ec.c(zVar3, r1.i.d(-2065951740, new com.github.rudroid.actions.workflowruns.ui.f(dVar4, eVar2, p0Var2, c8Var2, dVar5, 8), sVar), e, rVar, aVar, false, r1.i.d(-803786212, new w0(dVar3, 3), sVar), sVar, i3 | (i4 & 7168) | (i4 & 57344), 224);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new r6(rVar, aVar, c8Var, p0Var, zVar, dVar, dVar2, eVar, dVar3, i);
        }
    }
}
