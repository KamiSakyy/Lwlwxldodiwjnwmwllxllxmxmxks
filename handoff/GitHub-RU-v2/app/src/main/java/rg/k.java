package rg;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.github.rudroid.feed.ui.x;
import com.github.rudroid.widget.p;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, long j, float f, boolean z, r1.d dVar, j71.a aVar, j71.a aVar2, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        long j2;
        float f2;
        int i4;
        boolean z2;
        r1.d dVar2;
        int i5;
        j71.a aVar3;
        long j3;
        float f3;
        boolean z3;
        j71.a aVar4;
        b2 t;
        r rVar3;
        j71.a aVar5;
        float f4;
        int i6;
        sVar.e0(1097622760);
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
            if ((i2 & 2) == 0) {
                j2 = j;
                if (sVar.e(j2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                j2 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            j2 = j;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f2 = f;
            i3 |= sVar.c(f2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= sVar.g(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    dVar2 = dVar;
                    i3 |= sVar.h(dVar2) ? 16384 : 8192;
                } else {
                    dVar2 = dVar;
                }
                if ((196608 & i) == 0) {
                    i3 |= sVar.h(aVar) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    aVar3 = aVar2;
                    i3 |= sVar.h(aVar3) ? 1048576 : 524288;
                    if (sVar.S(i3 & 1, (599187 & i3) == 599186)) {
                        sVar.V();
                        j3 = j2;
                        f3 = f2;
                        z3 = z2;
                        aVar4 = aVar3;
                    } else {
                        sVar.X();
                        if ((i & 1) == 0 || sVar.A()) {
                            rVar3 = i7 != 0 ? o.a : rVar2;
                            if ((i2 & 2) != 0) {
                                j2 = ih.d.b(sVar).c;
                                i3 &= -113;
                            }
                            if (i8 != 0) {
                                f2 = ih.a.f;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 != 0) {
                                Object N = sVar.N();
                                if (N == n.a) {
                                    N = new p(15);
                                    sVar.n0(N);
                                }
                                aVar5 = (j71.a) N;
                                f4 = f2;
                                int i9 = i3;
                                j3 = j2;
                                boolean z4 = z2;
                                sVar.r();
                                int i11 = i9 << 3;
                                int i12 = (i9 & 14) | 100663296 | ((i9 >> 3) & 112) | (i11 & 896) | (i11 & 3670016) | ((i9 << 9) & 29360128);
                                j71.a aVar6 = aVar5;
                                j.a(rVar3, f4, j3, 0L, 0, 0, aVar, dVar2, r1.i.d(-181739185, new x(z4, aVar5, 3), sVar), false, sVar, i12, 568);
                                f3 = f4;
                                z3 = z4;
                                aVar4 = aVar6;
                                rVar2 = rVar3;
                            }
                        } else {
                            sVar.V();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            rVar3 = rVar2;
                        }
                        f4 = f2;
                        aVar5 = aVar3;
                        int i92 = i3;
                        j3 = j2;
                        boolean z42 = z2;
                        sVar.r();
                        int i112 = i92 << 3;
                        int i122 = (i92 & 14) | 100663296 | ((i92 >> 3) & 112) | (i112 & 896) | (i112 & 3670016) | ((i92 << 9) & 29360128);
                        j71.a aVar62 = aVar5;
                        j.a(rVar3, f4, j3, 0L, 0, 0, aVar, dVar2, r1.i.d(-181739185, new x(z42, aVar5, 3), sVar), false, sVar, i122, 568);
                        f3 = f4;
                        z3 = z42;
                        aVar4 = aVar62;
                        rVar2 = rVar3;
                    }
                    t = sVar.t();
                    if (t == null) {
                        t.d = new ah.e(rVar2, j3, f3, z3, dVar, aVar, aVar4, i, i2, 1);
                        return;
                    }
                    return;
                }
                aVar3 = aVar2;
                if (sVar.S(i3 & 1, (599187 & i3) == 599186)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            aVar3 = aVar2;
            if (sVar.S(i3 & 1, (599187 & i3) == 599186)) {
            }
            t = sVar.t();
            if (t == null) {
            }
        }
        f2 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        aVar3 = aVar2;
        if (sVar.S(i3 & 1, (599187 & i3) == 599186)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
