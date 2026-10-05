package sg;

import androidx.compose.foundation.layout.d2;
import androidx.compose.runtime.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, boolean z, j71.a aVar, String str, String str2, com.github.rudroid.uitoolkit.text.o oVar, d2 d2Var, androidx.compose.runtime.s sVar, int i, int i2) {
        boolean z2;
        int i3;
        j71.a aVar2;
        String str3;
        String str4;
        int i4;
        d2 d2Var2;
        w1.r rVar2;
        j71.a aVar3;
        String str5;
        d2 d2Var3;
        b2 t;
        j71.a aVar4;
        w1.r rVar3;
        String str6;
        d2 d2Var4;
        boolean z3;
        int i5;
        sVar.e0(-1276754139);
        int i6 = i | 6;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 = i | 54;
        } else if ((i & 48) == 0) {
            z2 = z;
            i6 |= sVar.g(z2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i6 |= 384;
            } else if ((i & 384) == 0) {
                aVar2 = aVar;
                i6 |= sVar.h(aVar2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    str3 = str;
                    i6 |= sVar.f(str3) ? 2048 : 1024;
                } else {
                    str3 = str;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        str4 = str2;
                        if (sVar.f(str4)) {
                            i5 = 16384;
                            i6 |= i5;
                        }
                    } else {
                        str4 = str2;
                    }
                    i5 = 8192;
                    i6 |= i5;
                } else {
                    str4 = str2;
                }
                if ((196608 & i) == 0) {
                    i6 |= (262144 & i) == 0 ? sVar.f(oVar) : sVar.h(oVar) ? 131072 : 65536;
                }
                i4 = i2 & 64;
                if (i4 != 0) {
                    i6 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    d2Var2 = d2Var;
                    i6 |= sVar.f(d2Var2) ? 1048576 : 524288;
                    if (sVar.S(i6 & 1, (599187 & i6) == 599186)) {
                        sVar.V();
                        rVar2 = rVar;
                        aVar3 = aVar2;
                        str5 = str4;
                        d2Var3 = d2Var2;
                    } else {
                        sVar.X();
                        if ((i & 1) == 0 || sVar.A()) {
                            boolean z4 = i7 == 0 ? z2 : true;
                            if (i3 != 0) {
                                Object N = sVar.N();
                                if (N == androidx.compose.runtime.n.a) {
                                    N = new com.github.rudroid.widget.p(15);
                                    sVar.n0(N);
                                }
                                aVar4 = (j71.a) N;
                            } else {
                                aVar4 = aVar2;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                                str4 = str3;
                            }
                            w1.r rVar4 = w1.o.a;
                            if (i4 != 0) {
                                d2Var4 = androidx.compose.foundation.layout.b.f(ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                                rVar3 = rVar4;
                                str6 = str4;
                            } else {
                                rVar3 = rVar4;
                                str6 = str4;
                                d2Var4 = d2Var2;
                            }
                            z3 = z4;
                        } else {
                            sVar.V();
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                            }
                            d2 d2Var5 = d2Var2;
                            z3 = z2;
                            d2Var4 = d2Var5;
                            rVar3 = rVar;
                            aVar4 = aVar2;
                            str6 = str4;
                        }
                        int i8 = i6;
                        sVar.r();
                        d2 d2Var6 = d2Var4;
                        j71.a aVar5 = aVar4;
                        k0.a((i8 & 14) | 12582912 | (i8 & 112) | (i8 & 896), 120, null, sVar, null, null, null, aVar5, r1.i.d(-45155252, new bd.f(oVar, d2Var4, str, str6, 22), sVar), rVar3, z3);
                        aVar3 = aVar5;
                        rVar2 = rVar3;
                        z2 = z3;
                        str5 = str6;
                        d2Var3 = d2Var6;
                    }
                    t = sVar.t();
                    if (t == null) {
                        t.d = new ab.k(rVar2, z2, aVar3, str, str5, oVar, d2Var3, i, i2);
                        return;
                    }
                    return;
                }
                d2Var2 = d2Var;
                if (sVar.S(i6 & 1, (599187 & i6) == 599186)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
            aVar2 = aVar;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i4 = i2 & 64;
            if (i4 != 0) {
            }
            d2Var2 = d2Var;
            if (sVar.S(i6 & 1, (599187 & i6) == 599186)) {
            }
            t = sVar.t();
            if (t == null) {
            }
        }
        z2 = z;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        aVar2 = aVar;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        d2Var2 = d2Var;
        if (sVar.S(i6 & 1, (599187 & i6) == 599186)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
