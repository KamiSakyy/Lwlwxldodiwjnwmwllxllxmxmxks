package com.github.rudroid.uitoolkit;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, String str, boolean z, a aVar, boolean z2, String str2, String str3, j71.a aVar2, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        String str4;
        int i7;
        String str5;
        int i8;
        int i9;
        int i11;
        w1.r rVar2;
        a aVar3;
        boolean z5;
        boolean z6;
        String str6;
        String str7;
        String str8;
        androidx.compose.runtime.b2 t;
        String str9;
        List n;
        sVar.e0(538142413);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(str) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i3 |= sVar.g(z3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= sVar.d(aVar == null ? -1 : aVar.ordinal()) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z2;
                i3 |= sVar.g(z4) ? 16384 : 8192;
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    str4 = str2;
                    i3 |= sVar.f(str4) ? 131072 : 65536;
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        str5 = str3;
                    } else {
                        str5 = str3;
                        if ((i & 1572864) == 0) {
                            i3 |= sVar.f(str5) ? 1048576 : 524288;
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i9 = i8;
                        i3 |= sVar.h(aVar2) ? 8388608 : 4194304;
                        i11 = i3;
                        if (sVar.S(i11 & 1, (i3 & 4793491) != 4793490)) {
                            w1.r rVar3 = i12 != 0 ? w1.o.a : rVar;
                            boolean z7 = i13 != 0 ? false : z3;
                            a aVar4 = i4 != 0 ? a.u : aVar;
                            boolean z8 = i5 != 0 ? false : z4;
                            String str10 = null;
                            if (i6 != 0) {
                                str9 = null;
                            } else {
                                str9 = null;
                                str10 = str4;
                            }
                            String str11 = i7 != 0 ? str9 : str5;
                            if (i9 == 0) {
                                str9 = aVar2;
                            }
                            int i14 = z7 ? 2131231386 : 2131231396;
                            if (z7) {
                                sVar.c0(-1311773265);
                                float a = com.github.rudroid.uitoolkit.utils.h.a(ih.a.E, sVar);
                                n = sy.d0Shadow.n(new u9.c(a, a, a, a));
                                sVar.q(false);
                            } else {
                                sVar.c0(-1311667741);
                                sVar.q(false);
                                n = sy.d0Shadow.n(new u9.a());
                            }
                            w1.r o = androidx.compose.foundation.layout.p2.o(rVar3, aVar4.r);
                            boolean z9 = (i11 & 3670016) == 1048576;
                            Object N = sVar.N();
                            if (z9 || N == androidx.compose.runtime.n.a) {
                                N = new bd.m(str11, 7);
                                sVar.n0(N);
                            }
                            String str12 = str11;
                            int i15 = i11 & 458864;
                            int i16 = (i11 >> 12) & 14;
                            String str13 = str9;
                            y1.a(com.github.rudroid.uitoolkit.extensions.d.b(o, str9, (j71.e) N), str, null, n, false, str10, Integer.valueOf(i14), null, Integer.valueOf(i14), z8, sVar, i15, i16, 404);
                            str6 = str10;
                            z6 = z8;
                            aVar3 = aVar4;
                            z5 = z7;
                            rVar2 = rVar3;
                            str7 = str12;
                            str8 = str13;
                        } else {
                            sVar.V();
                            rVar2 = rVar;
                            aVar3 = aVar;
                            z5 = z3;
                            z6 = z4;
                            str6 = str4;
                            str7 = str5;
                            str8 = aVar2;
                        }
                        t = sVar.t();
                        if (t != null) {
                            t.d = new com.github.rudroid.issueorpullrequest.mergebox.ui.s(rVar2, str, z5, aVar3, z6, str6, str7, str8, i, i2);
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i11 = i3;
                    if (sVar.S(i11 & 1, (i3 & 4793491) != 4793490)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                str4 = str2;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i11 = i3;
                if (sVar.S(i11 & 1, (i3 & 4793491) != 4793490)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            z4 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            str4 = str2;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i11 = i3;
            if (sVar.S(i11 & 1, (i3 & 4793491) != 4793490)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        str4 = str2;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i11 = i3;
        if (sVar.S(i11 & 1, (i3 & 4793491) != 4793490)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
