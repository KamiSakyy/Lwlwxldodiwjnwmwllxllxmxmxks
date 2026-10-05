package com.github.rudroid.uitoolkit.codesearch;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import d2.p0;
import d2.t;
import f0.v;
import f1.g1;
import f1.i1;
import f1.ma;
import f1.r8;
import f1.v1;
import f1.y1;
import f1.z1;
import j1.z0;
import w1.o;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, final j71.a aVar, final r1.d dVar, boolean z, p0 p0Var, long j, i1 i1Var, v vVar, s sVar, final int i, final int i2) {
        r rVar2;
        int i3;
        long j2;
        int i4;
        int i5;
        v vVar2;
        final i1 i1Var2;
        final v vVar3;
        final long j3;
        final boolean z2;
        final p0 p0Var2;
        b2 t;
        long j4;
        v vVar4;
        i1 i1Var3;
        p0 p0Var3;
        int i6;
        boolean z3;
        long j5;
        long j6;
        int i7;
        long j7;
        int i8;
        k71.k.g(aVar, "onClick");
        sVar.e0(43773724);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i | (sVar.f(rVar2) ? 4 : 2);
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        int i11 = i3 | 93184;
        if ((i2 & 64) == 0) {
            j2 = j;
            if (sVar.e(j2)) {
                i4 = 1048576;
                i5 = i11 | i4 | 4194304;
                if ((i & 100663296) != 0) {
                    if ((i2 & 256) == 0) {
                        vVar2 = vVar;
                        if (sVar.f(vVar2)) {
                            i8 = 67108864;
                            i5 |= i8;
                        }
                    } else {
                        vVar2 = vVar;
                    }
                    i8 = 33554432;
                    i5 |= i8;
                } else {
                    vVar2 = vVar;
                }
                if (sVar.S(i5 & 1, (38347923 & i5) == 38347922)) {
                    sVar.V();
                    i1Var2 = i1Var;
                    vVar3 = vVar2;
                    j3 = j2;
                    z2 = z;
                    p0Var2 = p0Var;
                } else {
                    sVar.X();
                    if ((i & 1) == 0 || sVar.A()) {
                        r rVar3 = i9 != 0 ? o.a : rVar2;
                        float f = ma.a;
                        p0 b = r8.b(z0.b, sVar);
                        int i12 = i5 & (-458753);
                        if ((i2 & 64) != 0) {
                            j2 = ih.d.b(sVar).h;
                            i12 = i5 & (-4128769);
                        }
                        float f2 = z0.f;
                        i1 i1Var4 = new i1(f2, f2, f2, f2, z0.e, f2);
                        int i13 = i12 & (-29360129);
                        if ((i2 & 256) != 0) {
                            long d = z1.d(z0.i, sVar);
                            t.b(z0.h, z1.d(z0.g, sVar));
                            int i14 = i12 & (-264241153);
                            vVar4 = f0.o.a(z0.j, d);
                            j4 = j2;
                            z3 = true;
                            p0Var3 = b;
                            rVar2 = rVar3;
                            i6 = i14;
                            i1Var3 = i1Var4;
                        } else {
                            j4 = j2;
                            vVar4 = vVar2;
                            i1Var3 = i1Var4;
                            p0Var3 = b;
                            rVar2 = rVar3;
                            i6 = i13;
                            z3 = true;
                        }
                    } else {
                        sVar.V();
                        int i15 = i5 & (-458753);
                        if ((i2 & 64) != 0) {
                            i15 = i5 & (-4128769);
                        }
                        int i16 = i15 & (-29360129);
                        if ((i2 & 256) != 0) {
                            i16 = i15 & (-264241153);
                        }
                        i6 = i16;
                        j4 = j2;
                        vVar4 = vVar2;
                        z3 = z;
                        p0Var3 = p0Var;
                        i1Var3 = i1Var;
                    }
                    sVar.r();
                    float f3 = ma.a;
                    long j8 = t.k;
                    g1 i17 = v1.i((y1) sVar.j(z1.a));
                    if (j4 != 16) {
                        j6 = j4;
                        j5 = 16;
                    } else {
                        j5 = 16;
                        j6 = i17.a;
                    }
                    if (j8 != j5) {
                        i7 = i6;
                        j7 = j8;
                    } else {
                        i7 = i6;
                        j7 = i17.b;
                    }
                    long j9 = j8 != j5 ? j8 : i17.c;
                    long j11 = j8 != j5 ? j8 : i17.d;
                    long j12 = j8 != j5 ? j8 : i17.e;
                    long j13 = j8 != j5 ? j8 : i17.f;
                    long j14 = j8 != j5 ? j8 : i17.g;
                    if (j8 == j5) {
                        j8 = i17.h;
                    }
                    v1.f(aVar, dVar, rVar2, z3, p0Var3, new g1(j6, j7, j9, j11, j12, j13, j14, j8), i1Var3, vVar4, sVar, ((i7 >> 3) & 126) | ((i7 << 6) & 896) | 27648 | (i7 & 234881024));
                    p0Var2 = p0Var3;
                    i1Var2 = i1Var3;
                    vVar3 = vVar4;
                    j3 = j4;
                    z2 = z3;
                }
                final r rVar4 = rVar2;
                t = sVar.t();
                if (t == null) {
                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.codesearch.c
                        public final Object s(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d.a(rVar4, aVar, dVar, z2, p0Var2, j3, i1Var2, vVar3, (s) obj, androidx.compose.runtime.t.L(i | 1), i2);
                            return a0.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            j2 = j;
        }
        i4 = 524288;
        i5 = i11 | i4 | 4194304;
        if ((i & 100663296) != 0) {
        }
        if (sVar.S(i5 & 1, (38347923 & i5) == 38347922)) {
        }
        final r rVar42 = rVar2;
        t = sVar.t();
        if (t == null) {
        }
    }

}
