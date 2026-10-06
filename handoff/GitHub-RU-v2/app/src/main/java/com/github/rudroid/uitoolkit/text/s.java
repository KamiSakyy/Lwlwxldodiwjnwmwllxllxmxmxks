package com.github.rudroid.uitoolkit.text;

import androidx.compose.runtime.b2;
import f1.ub;
import g3.q0;
import g3.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public class s {
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182 A[LOOP:0: B:58:0x0180->B:59:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, String str, String str2, String str3, long j, q0 q0Var, j71.c cVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        q0 q0Var2;
        long j2;
        q0 q0Var3;
        w1.r rVar3;
        int i4;
        long j3;
        q0 q0Var4;
        int size;
        int i5;
        boolean z;
        boolean f;
        int i6;
        k71.k.g(str, "text");
        k71.k.g(str2, "textToLink");
        k71.k.g(str3, "link");
        k71.k.g(cVar, "action");
        sVar.e0(-687195118);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
        if ((i & 384) == 0) {
            i3 |= sVar.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.f(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                q0Var2 = q0Var;
                if (sVar.f(q0Var2)) {
                    i6 = 131072;
                    i3 |= i6;
                }
            } else {
                q0Var2 = q0Var;
            }
            i6 = 65536;
            i3 |= i6;
        } else {
            q0Var2 = q0Var;
        }
        if ((1572864 & i) == 0) {
            i3 |= sVar.h(cVar) ? 1048576 : 524288;
        }
        if (sVar.S(i3 & 1, (599187 & i3) != 599186)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                w1.r rVar4 = i7 != 0 ? w1.o.a : rVar2;
                long j4 = ih.d.b(sVar).F;
                int i8 = i3 & (-57345);
                if ((i2 & 32) != 0) {
                    rVar3 = rVar4;
                    i4 = i3 & (-516097);
                    j3 = j4;
                    q0Var4 = (q0) sVar.j(ub.a);
                    sVar.r();
                    StringBuilder sb = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    int R = t71.p.R(str, str2, 0, false, 6);
                    int length = str2.length() + R;
                    sb.append(str);
                    j2 = j3;
                    arrayList.add(new g3.c(new g3.h0(j3, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, r3.l.c, (d2.o0) null, 61438), R, length, 8));
                    arrayList.add(new g3.c(new r0(str3), R, length, 8));
                    String sb2 = sb.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    size = arrayList.size();
                    for (i5 = 0; i5 < size; i5++) {
                        arrayList2.add(((g3.c) arrayList.get(i5)).a(sb.length()));
                    }
                    g3.g gVar = new g3.g(sb2, arrayList2);
                    int i9 = 3670016 & i4;
                    z = (i9 != 1048576) | ((i4 & 7168) != 2048);
                    Object N = sVar.N();
                    androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                    Object obj = N;
                    if (!z || N == iVar) {
                        bd.c cVar2 = new bd.c(12, cVar, str3);
                        sVar.n0(cVar2);
                        obj = cVar2;
                    }
                    w1.r m = f0.o.m(rVar3, false, (String) null, (d3.k) null, (j71.a) obj, 15);
                    w1.r rVar5 = rVar3;
                    f = sVar.f(gVar) | (i9 != 1048576);
                    Object N2 = sVar.N();
                    Object obj2 = N2;
                    if (!f || N2 == iVar) {
                        com.github.rudroid.repositories.repositoryownerrepositories.d dVar = new com.github.rudroid.repositories.repositoryownerrepositories.d(13, gVar, cVar);
                        sVar.n0(dVar);
                        obj2 = dVar;
                    }
                    s0.s.c(gVar, m, q0Var4, false, 0, 0, (j71.c) null, (j71.c) obj2, sVar, (i4 >> 9) & 896, 120);
                    q0Var3 = q0Var4;
                    rVar2 = rVar5;
                } else {
                    rVar3 = rVar4;
                    i4 = i8;
                    j3 = j4;
                }
            } else {
                sVar.V();
                i4 = i3 & (-57345);
                if ((i2 & 32) != 0) {
                    i4 = i3 & (-516097);
                }
                j3 = j;
                rVar3 = rVar2;
            }
            q0Var4 = q0Var2;
            sVar.r();
            StringBuilder sb3 = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            new ArrayList();
            int R2 = t71.p.R(str, str2, 0, false, 6);
            int length2 = str2.length() + R2;
            sb3.append(str);
            j2 = j3;
            arrayList3.add(new g3.c(new g3.h0(j3, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, r3.l.c, (d2.o0) null, 61438), R2, length2, 8));
            arrayList3.add(new g3.c(new r0(str3), R2, length2, 8));
            String sb22 = sb3.toString();
            ArrayList arrayList22 = new ArrayList(arrayList3.size());
            size = arrayList3.size();
            while (i5 < size) {
            }
            g3.g gVar2 = new g3.g(sb22, arrayList22);
            int i92 = 3670016 & i4;
            z = (i92 != 1048576) | ((i4 & 7168) != 2048);
            Object N3 = sVar.N();
            androidx.compose.runtime.i iVar2 = androidx.compose.runtime.n.a;
            Object obj3 = N3;
            if (!z) {
            }
            bd.c cVar22 = new bd.c(12, cVar, str3);
            sVar.n0(cVar22);
            obj3 = cVar22;
            w1.r m2 = f0.o.m(rVar3, false, (String) null, (d3.k) null, (j71.a) obj3, 15);
            w1.r rVar52 = rVar3;
            f = sVar.f(gVar2) | (i92 != 1048576);
            Object N22 = sVar.N();
            Object obj22 = N22;
            if (!f) {
            }
            com.github.rudroid.repositories.repositoryownerrepositories.d dVar2 = new com.github.rudroid.repositories.repositoryownerrepositories.d(13, gVar2, cVar);
            sVar.n0(dVar2);
            obj22 = dVar2;
            s0.s.c(gVar2, m2, q0Var4, false, 0, 0, (j71.c) null, (j71.c) obj22, sVar, (i4 >> 9) & 896, 120);
            q0Var3 = q0Var4;
            rVar2 = rVar52;
        } else {
            sVar.V();
            j2 = j;
            q0Var3 = q0Var2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new h(rVar2, str, str2, str3, j2, q0Var3, cVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fb A[LOOP:1: B:68:0x01f9->B:69:0x01fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ac  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, r3.k kVar, final String str, final List list, long j, final q0 q0Var, int i, int i2, androidx.compose.runtime.s sVar, final int i3, final int i4) {
        w1.r rVar2;
        int i5;
        r3.k kVar2;
        List<i0> list2;
        long j2;
        int i6;
        int i7;
        int i8;
        final w1.r rVar3;
        final r3.k kVar3;
        final long j3;
        final int i9;
        final int i11;
        b2 t;
        r3.k kVar4;
        int i12;
        int i13;
        long j4;
        int size;
        int i14;
        int i15;
        String str2 = str;
        k71.k.g(str2, "text");
        sVar.e0(-1910930295);
        int i16 = i4 & 1;
        if (i16 != 0) {
            i5 = i3 | 6;
            rVar2 = rVar;
        } else if ((i3 & 6) == 0) {
            rVar2 = rVar;
            i5 = (sVar.f(rVar2) ? 4 : 2) | i3;
        } else {
            rVar2 = rVar;
            i5 = i3;
        }
        int i17 = i4 & 2;
        if (i17 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            kVar2 = kVar;
            i5 |= sVar.f(kVar2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i5 |= sVar.f(str2) ? 256 : 128;
            }
            if ((i3 & 3072) != 0) {
                list2 = list;
                i5 |= sVar.h(list2) ? 2048 : 1024;
            } else {
                list2 = list;
            }
            if ((i3 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    j2 = j;
                    if (sVar.e(j2)) {
                        i15 = 16384;
                        i5 |= i15;
                    }
                } else {
                    j2 = j;
                }
                i15 = 8192;
                i5 |= i15;
            } else {
                j2 = j;
            }
            if ((196608 & i3) == 0) {
                i5 |= sVar.f(q0Var) ? 131072 : 65536;
            }
            i6 = i4 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
            } else if ((1572864 & i3) == 0) {
                i7 = i;
                i5 |= sVar.d(i7) ? 1048576 : 524288;
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i5 |= sVar.d(i2) ? 8388608 : 4194304;
                }
                boolean z = 0;
                if (sVar.S(i5 & 1, (i5 & 4793491) != 4793490)) {
                    sVar.X();
                    if ((i3 & 1) == 0 || sVar.A()) {
                        if (i16 != 0) {
                            rVar2 = w1.o.a;
                        }
                        if (i17 != 0) {
                            kVar2 = null;
                        }
                        if ((i4 & 16) != 0) {
                            j2 = ih.d.b(sVar).F;
                            i5 &= -57345;
                        }
                        if (i6 != 0) {
                            i7 = Integer.MAX_VALUE;
                        }
                        if (i8 != 0) {
                            kVar4 = kVar2;
                            i12 = 1;
                            i13 = 16;
                            j4 = j2;
                            sVar.r();
                            sVar.c0(1842002091);
                            StringBuilder sb = new StringBuilder(i13);
                            new ArrayList();
                            ArrayList arrayList = new ArrayList();
                            new ArrayList();
                            sb.append(str2);
                            sVar.c0(1842004530);
                            for (i0 i0Var : list2) {
                                String str3 = i0Var.a;
                                int R = t71.p.R(str2, str3, z, z, 6);
                                int length = str3.length() + R;
                                w1.r rVar4 = rVar2;
                                long j5 = j4;
                                g3.n0 n0Var = new g3.n0(new g3.h0(j4, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, r3.l.c, (d2.o0) null, 61438), (g3.h0) null, (g3.h0) null, 14);
                                boolean f = sVar.f(i0Var);
                                Object N = sVar.N();
                                if (f || N == androidx.compose.runtime.n.a) {
                                    N = new ab.d(2, i0Var);
                                    sVar.n0(N);
                                }
                                arrayList.add(new g3.c(new g3.l(str3, n0Var, (g3.o) N), R, length, 8));
                                rVar2 = rVar4;
                                str2 = str;
                                j4 = j5;
                                z = 0;
                            }
                            w1.r rVar5 = rVar2;
                            long j6 = j4;
                            sVar.q(z);
                            String sb2 = sb.toString();
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            for (i14 = 0; i14 < size; i14++) {
                                arrayList2.add(((g3.c) arrayList.get(i14)).a(sb.length()));
                            }
                            g3.g gVar = new g3.g(sb2, arrayList2);
                            sVar.q(false);
                            int i18 = i7;
                            ub.c(gVar, rVar5, 0L, 0L, (k3.i) null, 0L, kVar4, 0L, i12, false, i18, 0, (Map) null, (j71.c) null, q0Var, sVar, (i5 << 3) & 112, ((i5 >> 3) & 14) | ((i5 >> 15) & 896) | ((i5 >> 6) & 57344) | ((i5 << 9) & 234881024), 240636);
                            rVar3 = rVar5;
                            kVar3 = kVar4;
                            i11 = i12;
                            i9 = i18;
                            j3 = j6;
                        }
                    } else {
                        sVar.V();
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                        }
                    }
                    i12 = i2;
                    kVar4 = kVar2;
                    j4 = j2;
                    i13 = 16;
                    sVar.r();
                    sVar.c0(1842002091);
                    StringBuilder sb3 = new StringBuilder(i13);
                    new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    sb3.append(str2);
                    sVar.c0(1842004530);
                    while (r8.hasNext()) {
                    }
                    w1.r rVar52 = rVar2;
                    long j62 = j4;
                    sVar.q(z);
                    String sb22 = sb3.toString();
                    ArrayList arrayList22 = new ArrayList(arrayList3.size());
                    size = arrayList3.size();
                    while (i14 < size) {
                    }
                    g3.g gVar2 = new g3.g(sb22, arrayList22);
                    sVar.q(false);
                    int i182 = i7;
                    ub.c(gVar2, rVar52, 0L, 0L, (k3.i) null, 0L, kVar4, 0L, i12, false, i182, 0, (Map) null, (j71.c) null, q0Var, sVar, (i5 << 3) & 112, ((i5 >> 3) & 14) | ((i5 >> 15) & 896) | ((i5 >> 6) & 57344) | ((i5 << 9) & 234881024), 240636);
                    rVar3 = rVar52;
                    kVar3 = kVar4;
                    i11 = i12;
                    i9 = i182;
                    j3 = j62;
                } else {
                    sVar.V();
                    rVar3 = rVar2;
                    kVar3 = kVar2;
                    j3 = j2;
                    i9 = i7;
                    i11 = i2;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.text.r
                        public final Object s(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            s.b(rVar3, kVar3, str, list, j3, q0Var, i9, i11, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i3 | 1), i4);
                            return w61.a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i7 = i;
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            boolean z2 = 0;
            if (sVar.S(i5 & 1, (i5 & 4793491) != 4793490)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        kVar2 = kVar;
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        if ((i3 & 24576) != 0) {
        }
        if ((196608 & i3) == 0) {
        }
        i6 = i4 & 64;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        boolean z22 = 0;
        if (sVar.S(i5 & 1, (i5 & 4793491) != 4793490)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    public Object g(Object p1) { return null; }
    public Object g0() { return null; }
    public Object k(Object p1) { return null; }
    public Object l() { return null; }
    public Object q0() { return null; }
    public Object S = null;
    public Object T = null;
    public Object S(int p1, boolean p2) { return null; }
    public Object c(float p1) { return null; }
    public Object c0(int p1) { return null; }
    public Object d(int p1) { return null; }
    public Object e(long p1) { return null; }
    public Object e0(int p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object g(boolean p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object j(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(boolean p1) { return null; }
}
