package com.github.rudroid.uitoolkit;

import android.content.Context;
import androidx.compose.runtime.j3;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 {
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final String str, androidx.compose.ui.layout.i iVar, List list, boolean z, String str2, Integer num, d2.t tVar, Integer num2, boolean z2, androidx.compose.runtime.s sVar, final int i, final int i2, final int i3) {
        w1.r rVar2;
        int i4;
        androidx.compose.ui.layout.i iVar2;
        int i5;
        List list2;
        int i6;
        final String str3;
        int i7;
        int i8;
        int i9;
        Integer num3;
        int i11;
        int i12;
        int i13;
        final Integer num4;
        final boolean z3;
        final w1.r rVar3;
        final androidx.compose.ui.layout.i iVar3;
        final List list3;
        final Integer num5;
        final boolean z4;
        final d2.t tVar2;
        androidx.compose.runtime.b2 t;
        boolean z5;
        Integer num6;
        String str4;
        d2.t tVar3;
        androidx.compose.ui.layout.i iVar4;
        List list4;
        Integer num7;
        int i14;
        boolean z6;
        androidx.compose.ui.layout.i iVar5;
        h9.i a;
        sVar.e0(949003679);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= sVar.f(str) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            iVar2 = iVar;
            i4 |= sVar.f(iVar2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                list2 = list;
                i4 |= sVar.h(list2) ? 2048 : 1024;
                int i17 = i4 | 24576;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i17 = 221184 | i4;
                } else if ((196608 & i) == 0) {
                    str3 = str2;
                    i17 |= sVar.f(str3) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i17 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i17 |= sVar.f(num) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i17 |= 4194304;
                    }
                    i8 = i17 | 100663296;
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i8 = i17 | 905969664;
                    } else if ((805306368 & i) == 0) {
                        num3 = num2;
                        i8 |= sVar.f(num3) ? 536870912 : 268435456;
                        i11 = i3 & 1024;
                        if (i11 != 0) {
                            i13 = i2 | 6;
                            i12 = i11;
                        } else if ((i2 & 6) == 0) {
                            i12 = i11;
                            i13 = i2 | (sVar.g(z2) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i2;
                        }
                        if (sVar.S(i8 & 1, (i8 & 306783379) == 306783378 || (i13 & 3) != 2)) {
                            sVar.X();
                            if ((i & 1) == 0 || sVar.A()) {
                                if (i15 != 0) {
                                    rVar2 = w1.o.a;
                                }
                                if (i16 != 0) {
                                    iVar2 = androidx.compose.ui.layout.h.a;
                                }
                                if (i5 != 0) {
                                    list2 = x61.rShadow.r;
                                }
                                if (i6 != 0) {
                                    str3 = null;
                                }
                                Integer num8 = i7 != 0 ? null : num;
                                d2.t tVar4 = new d2.t(ih.d.b(sVar).z);
                                int i18 = i8 & (-29360129);
                                if (i9 != 0) {
                                    num3 = null;
                                }
                                if (i12 != 0) {
                                    num6 = num8;
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                    num6 = num8;
                                }
                                str4 = str3;
                                tVar3 = tVar4;
                                iVar4 = iVar2;
                                list4 = list2;
                                num7 = num3;
                                i14 = i18;
                                z6 = true;
                            } else {
                                sVar.V();
                                int i19 = i8 & (-29360129);
                                z6 = z;
                                num6 = num;
                                tVar3 = tVar;
                                z5 = z2;
                                str4 = str3;
                                iVar4 = iVar2;
                                num7 = num3;
                                i14 = i19;
                                list4 = list2;
                            }
                            sVar.r();
                            j3 j3Var = w2.j0.b;
                            r9.i iVar6 = new r9.i((Context) sVar.j(j3Var));
                            iVar6.c = str;
                            iVar6.b(z6);
                            if (num6 != null) {
                                iVar6.q = Integer.valueOf(num6.intValue());
                            }
                            if (num7 != null) {
                                iVar6.s = Integer.valueOf(num7.intValue());
                            }
                            iVar6.h = sy.f0.u(list4);
                            r9.k a2 = iVar6.a();
                            g9.h a3 = g9.a.a((Context) sVar.j(j3Var));
                            if (z5) {
                                sVar.c0(1688302566);
                                sVar.d0(236159766);
                                g9.h hVar = (g9.h) sVar.j(h9.m.a);
                                if (hVar == null) {
                                    hVar = g9.a.a((Context) sVar.j(j3Var));
                                }
                                androidx.compose.ui.layout.i iVar7 = iVar4;
                                a = h9.k.a(a2, hVar, h9.i.L, iVar7, sVar, 0);
                                iVar5 = iVar7;
                                sVar.q(false);
                                sVar.q(false);
                            } else {
                                iVar5 = iVar4;
                                sVar.c0(1688446003);
                                a = h9.k.a(a2, a3, (j71.c) null, iVar5, sVar, 108);
                                sVar.q(false);
                            }
                            h9.i iVar8 = a;
                            h9.e eVar = (h9.e) iVar8.I.getValue();
                            d2.l lVar = (((eVar instanceof h9.c) || (eVar instanceof h9.b) || (eVar instanceof h9.a)) && tVar3 != null) ? new d2.l(5, tVar3.a) : null;
                            int i21 = (i14 >> 12) & 112;
                            int i22 = i14 << 6;
                            int i23 = i21 | (i22 & 896) | (i22 & 57344);
                            androidx.compose.ui.layout.i iVar9 = iVar5;
                            f0.o.c(iVar8, str4, rVar2, (w1.e) null, iVar9, 0.0f, lVar, sVar, i23, 40);
                            w1.r rVar4 = rVar2;
                            z4 = z6;
                            rVar3 = rVar4;
                            str3 = str4;
                            iVar3 = iVar9;
                            num4 = num6;
                            tVar2 = tVar3;
                            num5 = num7;
                            z3 = z5;
                            list3 = list4;
                        } else {
                            sVar.V();
                            num4 = num;
                            z3 = z2;
                            rVar3 = rVar2;
                            iVar3 = iVar2;
                            list3 = list2;
                            num5 = num3;
                            z4 = z;
                            tVar2 = tVar;
                        }
                        t = sVar.t();
                        if (t != null) {
                            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.x1
                                public final Object s(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    y1.a(rVar3, str, iVar3, list3, z4, str3, num4, tVar2, num5, z3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i | 1), androidx.compose.runtime.t.L(i2), i3);
                                    return w61.a0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    num3 = num2;
                    i11 = i3 & 1024;
                    if (i11 != 0) {
                    }
                    if (sVar.S(i8 & 1, (i8 & 306783379) == 306783378 || (i13 & 3) != 2)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                str3 = str2;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i17 | 100663296;
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                num3 = num2;
                i11 = i3 & 1024;
                if (i11 != 0) {
                }
                if (sVar.S(i8 & 1, (i8 & 306783379) == 306783378 || (i13 & 3) != 2)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            list2 = list;
            int i172 = i4 | 24576;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            str3 = str2;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i172 | 100663296;
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            num3 = num2;
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            if (sVar.S(i8 & 1, (i8 & 306783379) == 306783378 || (i13 & 3) != 2)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        iVar2 = iVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        list2 = list;
        int i1722 = i4 | 24576;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        str3 = str2;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i1722 | 100663296;
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        num3 = num2;
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        if (sVar.S(i8 & 1, (i8 & 306783379) == 306783378 || (i13 & 3) != 2)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
