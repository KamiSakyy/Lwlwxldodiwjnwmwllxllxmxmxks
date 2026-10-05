package com.github.rudroid.uitoolkit.codesearch;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import d2.a0;
import java.util.ArrayList;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r8 == androidx.compose.runtime.n.a) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, long j, final ArrayList arrayList, final j71.c cVar, boolean z, s sVar, final int i, final int i2) {
        final boolean z2;
        final r rVar2;
        final long j2;
        b2 t;
        long j3;
        boolean z3;
        int i3;
        Object obj;
        k71.k.g(cVar, "onQualifierSelect");
        sVar.e0(-194113363);
        int i4 = i | 22 | (sVar.h(arrayList) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= sVar.h(cVar) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i4 |= sVar.g(z2) ? 16384 : 8192;
            boolean z4 = true;
            if (sVar.S(i4 & 1, (i4 & 9363) == 9362)) {
                sVar.V();
                rVar2 = rVar;
                j2 = j;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    long j4 = ih.d.b(sVar).k0;
                    int i6 = i4 & (-113);
                    r rVar3 = o.a;
                    if (i5 != 0) {
                        i3 = i6;
                        j3 = j4;
                        z3 = true;
                    } else {
                        z4 = z2;
                        j3 = j4;
                        z3 = true;
                        i3 = i6;
                    }
                    rVar2 = rVar3;
                } else {
                    sVar.V();
                    i3 = i4 & (-113);
                    z3 = true;
                    rVar2 = rVar;
                    z4 = z2;
                    j3 = j;
                }
                sVar.r();
                r y = androidx.compose.foundation.layout.b.y(f0.o.f(p2.e(rVar2, 1.0f), j3, a0.b), ih.a.m, ih.a.k);
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
                androidx.compose.foundation.layout.j g = androidx.compose.foundation.layout.l.g(ih.a.n);
                boolean h = sVar.h(arrayList) | ((i3 & 7168) == 2048 ? z3 : false);
                Object N = sVar.N();
                if (!h) {
                    obj = N;
                }
                com.github.rudroid.repositories.repositoryownerrepositories.d dVar = new com.github.rudroid.repositories.repositoryownerrepositories.d(11, arrayList, cVar);
                sVar.n0(dVar);
                obj = dVar;
                int i7 = ((i3 >> 3) & 7168) | 24576;
                j2 = j3;
                ah.h.a(y, 0L, 0.0f, z4, g, null, (j71.c) obj, sVar, i7, 38);
                z2 = z4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.codesearch.f
                    public final Object s(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        n.a(rVar2, j2, arrayList, cVar, z2, (s) obj2, t.L(i | 1), i2);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        boolean z42 = true;
        if (sVar.S(i4 & 1, (i4 & 9363) == 9362)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
