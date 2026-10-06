package com.github.rudroid.utilities.ui;

import android.view.View;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.adapters.viewholders.d2;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public static final void a(w1.r rVar, j71.e eVar, String str, String str2, int i, j71.a aVar, androidx.compose.runtime.s sVar, int i2) {
        int i3;
        String str3;
        boolean z;
        boolean z2;
        w1.o oVar;
        int i4;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(544596810);
        if ((i2 & 6) == 0) {
            i3 = (sVar2.f(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar2.h(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar2.f(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= sVar2.d(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= sVar2.h(aVar) ? 131072 : 65536;
        }
        int i5 = i3;
        if (sVar2.S(i5 & 1, (i5 & 74899) != 74898)) {
            View view = (View) sVar2.j(w2.j0.f);
            if (str != null) {
                StringBuilder p = f1.e.p(str);
                if (str2 != null && str2.length() != 0) {
                    p.append(str2);
                }
                str3 = p.toString();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            boolean h = sVar2.h(view) | sVar2.f(str3);
            Object N = sVar2.N();
            if (h || N == androidx.compose.runtime.n.a) {
                N = new e(view, str3, null);
                sVar2.n0(N);
            }
            int i6 = (i5 >> 6) & 14;
            androidx.compose.runtime.t.f(sVar2, (j71.e) N, str);
            w1.r d = p2.d(rVar, 1.0f);
            androidx.compose.ui.layout.v0 d2 = androidx.compose.foundation.layout.t.d(w1.c.u, false);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, d);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            v2.eShadow eVar2 = v2.g.f;
            androidx.compose.runtime.t.I(sVar2, eVar2, d2);
            v2.eShadow eVar3 = v2.g.e;
            androidx.compose.runtime.t.I(sVar2, eVar3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.eShadow eVar4 = v2.g.g;
            androidx.compose.runtime.t.w(sVar2, valueOf, eVar4);
            v2.d dVar = v2.g.h;
            androidx.compose.runtime.t.E(sVar2, dVar);
            v2.eShadow eVar5 = v2.g.d;
            androidx.compose.runtime.t.I(sVar2, eVar5, c);
            w1.o oVar2 = w1.o.a;
            w1.r w = f0.o.w(p2.e(p2.u(oVar2), 1.0f), f0.o.v(sVar2), true);
            float f = ih.a.p;
            w1.r x = androidx.compose.foundation.layout.b.x(w, f);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.E, sVar2, 48);
            int hashCode2 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l2 = sVar2.l();
            w1.r c2 = w1.a.c(sVar2, x);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, eVar2, a);
            androidx.compose.runtime.t.I(sVar2, eVar3, l2);
            f1.e.t(hashCode2, sVar2, eVar4, sVar2, dVar);
            androidx.compose.runtime.t.I(sVar2, eVar5, c2);
            if (eVar == null) {
                sVar2.c0(1444609373);
                z = false;
            } else {
                z = false;
                sVar2.c0(1444609374);
                eVar.s(sVar2, Integer.valueOf((i5 >> 3) & 14));
                androidx.compose.foundation.layout.b.g(sVar2, p2.f(oVar2, f));
            }
            sVar2.q(z);
            if (str == null) {
                sVar2.c0(1444759816);
                sVar2.q(z);
                z2 = z;
                oVar = oVar2;
                i4 = i;
            } else {
                sVar2.c0(1444759817);
                z2 = z;
                oVar = oVar2;
                i4 = i;
                ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).a, sVar, i6, 0, 130046);
                sVar2 = sVar;
                com.github.rudroid.m0.C(oVar, ih.a.k, sVar2, z2);
            }
            if (str2 == null) {
                sVar2.c0(1445055587);
                sVar2.q(z2);
            } else {
                sVar2.c0(1445055588);
                ub.b(str2, (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).v, sVar, (i5 >> 9) & 14, 0, 130046);
                sVar2 = sVar;
                com.github.rudroid.m0.C(oVar, ih.a.n, sVar2, z2);
            }
            if (aVar == null) {
                sVar2.c0(1445353125);
            } else {
                sVar2.c0(1445353126);
                sg.yShadow.a(100663296 | ((i5 >> 9) & 896), 251, null, sVar2, null, null, null, null, aVar, r1.i.d(142111019, new d2(i4, 8), sVar2), null, false);
            }
            sVar2.q(z2);
            sVar2.q(true);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new b(rVar, eVar, str, str2, i, aVar, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, Integer num, d2.t tVar, Integer num2, Integer num3, int i, j71.a aVar, androidx.compose.runtime.s sVar, int i2, int i3) {
        int i4;
        Integer num4;
        int i5;
        d2.t tVar2;
        int i6;
        Integer num5;
        int i7;
        Integer num6;
        int i8;
        j71.a aVar2;
        w1.r rVar2;
        Integer num7;
        d2.t tVar3;
        Integer num8;
        b2 t;
        String p0;
        sVar.e0(260556715);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            num4 = num;
            i4 |= sVar.f(num4) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                tVar2 = tVar;
                i4 |= sVar.f(tVar2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    num5 = num2;
                    i4 |= sVar.f(num5) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        num6 = num3;
                        i4 |= sVar.f(num6) ? 16384 : 8192;
                        if ((196608 & i2) == 0) {
                            i8 = i;
                            i4 |= sVar.d(i8) ? 131072 : 65536;
                        } else {
                            i8 = i;
                        }
                        if ((1572864 & i2) == 0) {
                            aVar2 = aVar;
                            i4 |= sVar.h(aVar2) ? 1048576 : 524288;
                        } else {
                            aVar2 = aVar;
                        }
                        if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
                            w1.r rVar3 = i9 != 0 ? w1.o.a : rVar;
                            String str = null;
                            if (i11 != 0) {
                                num4 = null;
                            }
                            int i12 = i4;
                            d2.t tVar4 = i5 != 0 ? null : tVar2;
                            Integer num9 = i6 != 0 ? null : num5;
                            if (i7 != 0) {
                                num6 = null;
                            }
                            if (num9 == null) {
                                sVar.c0(1239603289);
                                sVar.q(false);
                                p0 = null;
                            } else {
                                sVar.c0(1239603290);
                                p0 = i4.p0(num9.intValue(), sVar);
                                sVar.q(false);
                            }
                            if (num6 == null) {
                                sVar.c0(1239662902);
                            } else {
                                sVar.c0(1239662903);
                                str = i4.p0(num6.intValue(), sVar);
                            }
                            sVar.q(false);
                            Integer num10 = num4;
                            c(rVar3, num10, tVar4, p0, str, i8, aVar2, sVar, i12 & 4129790, 0);
                            tVar3 = tVar4;
                            num8 = num9;
                            num7 = num10;
                            rVar2 = rVar3;
                        } else {
                            sVar.V();
                            rVar2 = rVar;
                            num7 = num4;
                            tVar3 = tVar2;
                            num8 = num5;
                        }
                        Integer num11 = num6;
                        t = sVar.t();
                        if (t != null) {
                            t.d = new d(rVar2, num7, tVar3, num8, num11, i, aVar, i2, i3, 0);
                            return;
                        }
                        return;
                    }
                    num6 = num3;
                    if ((196608 & i2) == 0) {
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
                    }
                    Integer num112 = num6;
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                num5 = num2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                num6 = num3;
                if ((196608 & i2) == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
                }
                Integer num1122 = num6;
                t = sVar.t();
                if (t != null) {
                }
            }
            tVar2 = tVar;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            num5 = num2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            num6 = num3;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
            }
            Integer num11222 = num6;
            t = sVar.t();
            if (t != null) {
            }
        }
        num4 = num;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        tVar2 = tVar;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        num5 = num2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        num6 = num3;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
        }
        Integer num112222 = num6;
        t = sVar.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w1.r rVar, Integer num, d2.t tVar, String str, String str2, int i, j71.a aVar, androidx.compose.runtime.s sVar, int i2, int i3) {
        w1.r rVar2;
        int i4;
        Integer num2;
        int i5;
        d2.t tVar2;
        String str3;
        int i6;
        String str4;
        int i7;
        j71.a aVar2;
        Integer num3;
        d2.t tVar3;
        String str5;
        b2 t;
        sVar.e0(-748431483);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            num2 = num;
            i4 |= sVar.f(num2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                tVar2 = tVar;
                i4 |= sVar.f(tVar2) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    str3 = str;
                    i4 |= sVar.f(str3) ? 2048 : 1024;
                } else {
                    str3 = str;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    str4 = str2;
                    i4 |= sVar.f(str4) ? 16384 : 8192;
                    if ((196608 & i2) != 0) {
                        i7 = i;
                        i4 |= sVar.d(i7) ? 131072 : 65536;
                    } else {
                        i7 = i;
                    }
                    if ((1572864 & i2) != 0) {
                        aVar2 = aVar;
                        i4 |= sVar.h(aVar2) ? 1048576 : 524288;
                    } else {
                        aVar2 = aVar;
                    }
                    if (sVar.S(i4 & 1, (599187 & i4) == 599186)) {
                        sVar.V();
                        num3 = num2;
                        tVar3 = tVar2;
                        str5 = str4;
                    } else {
                        if (i8 != 0) {
                            rVar2 = w1.o.a;
                        }
                        j71.e eVar = null;
                        Integer num4 = i9 != 0 ? null : num2;
                        d2.t tVar4 = i5 != 0 ? null : tVar2;
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (num4 == null) {
                            sVar.c0(-1346752535);
                        } else {
                            sVar.c0(-1346752534);
                            eVar = r1.i.d(1762680284, new com.github.rudroid.copilot.ui.v0(num4.intValue(), tVar4, 8), sVar);
                        }
                        sVar.q(false);
                        int i11 = i4 & 14;
                        int i12 = i4 >> 3;
                        int i13 = i11 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752);
                        w1.r rVar3 = rVar2;
                        j71.e eVar2 = eVar;
                        d2.t tVar5 = tVar4;
                        String str6 = str4;
                        a(rVar3, eVar2, str3, str6, i7, aVar2, sVar, i13);
                        rVar2 = rVar3;
                        str5 = str6;
                        tVar3 = tVar5;
                        num3 = num4;
                    }
                    t = sVar.t();
                    if (t == null) {
                        t.d = new d(rVar2, num3, tVar3, str, str5, i, aVar, i2, i3, 1);
                        return;
                    }
                    return;
                }
                str4 = str2;
                if ((196608 & i2) != 0) {
                }
                if ((1572864 & i2) != 0) {
                }
                if (sVar.S(i4 & 1, (599187 & i4) == 599186)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
            tVar2 = tVar;
            if ((i2 & 3072) == 0) {
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str4 = str2;
            if ((196608 & i2) != 0) {
            }
            if ((1572864 & i2) != 0) {
            }
            if (sVar.S(i4 & 1, (599187 & i4) == 599186)) {
            }
            t = sVar.t();
            if (t == null) {
            }
        }
        num2 = num;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        tVar2 = tVar;
        if ((i2 & 3072) == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str4 = str2;
        if ((196608 & i2) != 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        if (sVar.S(i4 & 1, (599187 & i4) == 599186)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
