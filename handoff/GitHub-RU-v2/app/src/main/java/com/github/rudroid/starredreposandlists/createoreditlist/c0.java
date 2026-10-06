package com.github.rudroid.starredreposandlists.createoreditlist;

import androidx.compose.foundation.layout.m2;
import androidx.compose.runtime.b2;
import com.github.rudroid.agents.sessionevents.ui.u1;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[f1.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1 f1Var = f1.r;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1 f1Var2 = f1.r;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1 f1Var3 = f1.r;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1 f1Var4 = f1.r;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final void a(w1.r rVar, j71.e eVar, j71.a aVar, j71.c cVar, f1 f1Var, androidx.compose.runtime.s sVar, int i) {
        k71.k.g(eVar, "onSave");
        k71.k.g(aVar, "onNavigateUp");
        k71.k.g(cVar, "onTitleChange");
        k71.k.g(f1Var, "savingState");
        sVar.e0(1965211531);
        int i2 = i | (sVar.f(rVar) ? 4 : 2) | (sVar.h(eVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024) | (sVar.d(f1Var.ordinal()) ? 16384 : 8192);
        if (sVar.S(i2 & 1, (599187 & i2) != 599186)) {
            b(rVar, eVar, aVar, cVar, f1Var, true, "", "", sVar, (i2 & 57344) | (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | 14155776);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkdetail.j(rVar, eVar, aVar, cVar, f1Var, i, 15);
        }
    }

    public static final void b(w1.r rVar, j71.e eVar, j71.a aVar, j71.c cVar, f1 f1Var, boolean z, final String str, final String str2, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.e0(-1089482406);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.d(f1Var.ordinal()) ? 16384 : 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= sVar.f(str) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= sVar.f(str2) ? 8388608 : 4194304;
        }
        if (sVar.S(i2 & 1, (4793491 & i2) != 4793490)) {
            Object[] objArr = new Object[0];
            boolean z2 = (3670016 & i2) == 1048576;
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (z2 || N == iVar) {
                final int i3 = 0;
                N = new j71.a() { // from class: com.github.rudroid.starredreposandlists.createoreditlist.x
                    public final Object a() {
                        switch (i3) {
                        }
                        return androidx.compose.runtime.t.B(str);
                    }
                };
                sVar.n0(N);
            }
            androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) u1.j.c(objArr, (j71.a) N, sVar, 0);
            Object[] objArr2 = new Object[0];
            boolean z3 = (29360128 & i2) == 8388608;
            Object N2 = sVar.N();
            if (z3 || N2 == iVar) {
                final int i4 = 1;
                N2 = new j71.a() { // from class: com.github.rudroid.starredreposandlists.createoreditlist.x
                    public final Object a() {
                        switch (i4) {
                        }
                        return androidx.compose.runtime.t.B(str2);
                    }
                };
                sVar.n0(N2);
            }
            androidx.compose.runtime.f1 f1Var3 = (androidx.compose.runtime.f1) u1.j.c(objArr2, (j71.a) N2, sVar, 0);
            Object N3 = sVar.N();
            if (N3 == iVar) {
                N3 = no.a.f(sVar);
            }
            com.github.rudroid.uitoolkit.utils.z.a(rVar, r1.i.d(-1491349018, new u1(z, aVar, eVar, f1Var2, f1Var3, f1Var), sVar), null, null, null, 0, 0L, 0L, r1.i.d(1058699740, new bd.f((b2.a0) N3, cVar, f1Var2, f1Var3, 14), sVar), sVar, (i2 & 14) | 100663344, 252);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new y(rVar, eVar, aVar, cVar, f1Var, z, str, str2, i);
        }
    }

    public static final void c(boolean z, j71.a aVar, final j71.a aVar2, final f1 f1Var, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.e0(-1228175154);
        if ((i & 6) == 0) {
            i2 = (sVar.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (sVar.h(aVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.d(f1Var.ordinal()) ? 2048 : 1024;
        }
        if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            String p0 = i4.p0(z ? 2131953006 : 2131953015, sVar);
            final String p02 = i4.p0(z ? 2131953149 : 2131953182, sVar);
            qg.pShadow.c(null, p0, null, 0L, aVar, 0, 0, 0.0f, 0, 0, r1.i.d(1057581293, new j71.f() { // from class: com.github.rudroid.starredreposandlists.createoreditlist.b0
                public final Object f(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    k71.k.g((m2) obj, "$this$PrimaryTopAppBar");
                    if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                        int ordinal = f1.this.ordinal();
                        if (ordinal != 0) {
                            String str = p02;
                            if (ordinal == 1) {
                                sVar2.c0(-1571617423);
                                sg.k0Shadow.b(null, false, aVar2, null, str, null, sVar2, 0, 43);
                                sVar2.q(false);
                            } else if (ordinal == 2) {
                                sVar2.c0(-1571613426);
                                Object N = sVar2.N();
                                if (N == androidx.compose.runtime.n.a) {
                                    N = new com.github.rudroid.widget.p(15);
                                    sVar2.n0(N);
                                }
                                sg.k0Shadow.b(null, false, (j71.a) N, null, str, null, sVar2, 432, 41);
                                sVar2.q(false);
                            } else if (ordinal != 3) {
                                if (ordinal != 4) {
                                    throw f1.e.r(-1571625699, sVar2, false);
                                }
                                sVar2.c0(-1475230093);
                                sVar2.q(false);
                            }
                        }
                        sVar2.c0(-1571624273);
                        float f = 24;
                        com.github.rudroid.uitoolkit.f1.a(androidx.compose.foundation.layout.b.z(w1.o.a, ih.a.l, 0.0f, 2), new s3.h(m7.y.a(f, f)), 3, 0L, sVar2, 432, 8);
                        sVar2.q(false);
                    } else {
                        sVar2.V();
                    }
                    return w61.a0.a;
                }
            }, sVar), sVar, ((i3 << 9) & 57344) | 1572864, 6, 941);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new bd.k(z, aVar, aVar2, f1Var, i, 7);
        }
    }

    public static final void d(f1 f1Var, j71.a aVar, j71.a aVar2, androidx.compose.runtime.s sVar, int i) {
        f1 f1Var2;
        j71.a aVar3;
        j71.a aVar4;
        androidx.compose.runtime.s sVar2;
        k71.k.g(f1Var, "savingListState");
        k71.k.g(aVar, "onNavigateUp");
        k71.k.g(aVar2, "onSave");
        sVar.e0(615314705);
        int i2 = (sVar.d(f1Var.ordinal()) ? 4 : 2) | i | (sVar.h(aVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            f1Var2 = f1Var;
            aVar3 = aVar;
            aVar4 = aVar2;
            sVar2 = sVar;
            c(false, aVar3, aVar4, f1Var2, sVar2, (i2 & 112) | 390 | ((i2 << 9) & 7168));
        } else {
            f1Var2 = f1Var;
            aVar3 = aVar;
            aVar4 = aVar2;
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new f0(f1Var2, aVar3, aVar4, i);
        }
    }

    public static final void e(w1.r rVar, j71.e eVar, j71.a aVar, j71.c cVar, f1 f1Var, String str, String str2, androidx.compose.runtime.s sVar, int i) {
        k71.k.g(eVar, "onSave");
        k71.k.g(aVar, "onNavigateUp");
        k71.k.g(cVar, "onTitleChange");
        k71.k.g(f1Var, "savingState");
        sVar.e0(-489810243);
        int i2 = i | (sVar.f(rVar) ? 4 : 2) | (sVar.h(eVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024) | (sVar.d(f1Var.ordinal()) ? 16384 : 8192) | (sVar.f(str) ? 131072 : 65536) | (sVar.f(str2) ? 1048576 : 524288);
        if (sVar.S(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2);
            int i4 = i2 << 3;
            b(rVar, eVar, aVar, cVar, f1Var, false, str, str2, sVar, i3 | (3670016 & i4) | (i4 & 29360128));
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.achievements.ui.i0(rVar, eVar, aVar, cVar, f1Var, str, str2, i);
        }
    }
}
