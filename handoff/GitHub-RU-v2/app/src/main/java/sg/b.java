package sg;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.runtime.b2;
import com.github.rudroid.utilities.j1;
import d2.p0;
import f1.e8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final void a(w1.r rVar, j71.a aVar, d2 d2Var, f1.o0 o0Var, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        d2 d2Var2;
        f1.o0 o0Var2;
        d2 d2Var3;
        int i4;
        f1.o0 a;
        d2 d2Var4;
        k71.k.g(aVar, "onBoaInfoClick");
        sVar.e0(1165163301);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= sVar.f(d2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        int i7 = i3;
        if (sVar.S(i7 & 1, (i7 & 1171) != 1170)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                if (i5 != 0) {
                    rVar = w1.o.a;
                }
                if (i6 != 0) {
                    float f = ih.a.n;
                    d2Var3 = new f2(f, f, f, f);
                } else {
                    d2Var3 = d2Var;
                }
                i4 = i7 & (-7169);
                a = v.a(0L, 0L, 0L, sVar, 3072, 7);
                d2Var4 = d2Var3;
            } else {
                sVar.V();
                d2Var4 = d2Var;
                a = o0Var;
                i4 = i7 & (-7169);
            }
            w1.r rVar3 = rVar;
            sVar.r();
            e(rVar3, aVar, a, null, null, false, d2Var4, 0.0f, c.b, sVar, (i4 & 14) | 100663296 | (i4 & 112) | ((i4 << 12) & 3670016), 184);
            rVar2 = rVar3;
            o0Var2 = a;
            d2Var2 = d2Var4;
        } else {
            sVar.V();
            rVar2 = rVar;
            d2Var2 = d2Var;
            o0Var2 = o0Var;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.achievements.ui.b0(rVar2, aVar, d2Var2, o0Var2, i, i2, 24);
        }
    }

    public static final void b(w1.r rVar, j71.a aVar, f1.o0 o0Var, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        f1.o0 o0Var2;
        w1.r rVar3;
        f1.o0 a;
        int i4;
        k71.k.g(aVar, "onBoaInfoClick");
        sVar.e0(-412289960);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (sVar.f(rVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        int i6 = i3 | 128;
        if (sVar.S(i6 & 1, (i6 & 147) != 146)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                rVar3 = i5 != 0 ? w1.o.a : rVar;
                a = v.a(0L, 0L, 0L, sVar, 3072, 7);
                i4 = i6 & (-897);
            } else {
                sVar.V();
                a = o0Var;
                i4 = i6 & (-897);
                rVar3 = rVar;
            }
            sVar.r();
            float f = 18;
            float f2 = ih.a.n;
            e(rVar3, aVar, a, null, null, false, new f2(f, f2, f, f2), 0.0f, c.a, sVar, (i4 & 14) | 102236160 | (i4 & 112), 184);
            rVar2 = rVar3;
            o0Var2 = a;
        } else {
            sVar.V();
            rVar2 = rVar;
            o0Var2 = o0Var;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new w0(rVar2, aVar, o0Var2, i, i2, 22);
        }
    }

    public static final void c(w1.r rVar, d2 d2Var, f1.o0 o0Var, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        d2 d2Var2;
        f1.o0 o0Var2;
        sVar.e0(-1511724591);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= sVar.f(d2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        int i6 = i3;
        if (sVar.S(i6 & 1, (i6 & 147) != 146)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                if (i4 != 0) {
                    rVar = w1.o.a;
                }
                if (i5 != 0) {
                    float f = ih.a.n;
                    d2Var = new f2(f, f, f, f);
                }
                o0Var = v.a(0L, 0L, 0L, sVar, 3072, 7);
            } else {
                sVar.V();
            }
            int i7 = i6 & (-897);
            w1.r rVar3 = rVar;
            f1.o0 o0Var3 = o0Var;
            sVar.r();
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = new com.github.rudroid.widget.p(15);
                sVar.n0(N);
            }
            d2 d2Var3 = d2Var;
            e(rVar3, (j71.a) N, o0Var3, null, null, false, d2Var3, 0.0f, c.c, sVar, (i7 & 14) | 100859952 | ((i7 << 15) & 3670016), 152);
            rVar2 = rVar3;
            o0Var2 = o0Var3;
            d2Var2 = d2Var3;
        } else {
            sVar.V();
            rVar2 = rVar;
            d2Var2 = d2Var;
            o0Var2 = o0Var;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new w0(rVar2, d2Var2, o0Var2, i, i2, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(w1.r rVar, j71.a aVar, String str, f0.v vVar, f1.o0 o0Var, p0 p0Var, Integer num, boolean z, d2 d2Var, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        f0.v vVar2;
        f1.o0 o0Var2;
        boolean z2;
        d2 d2Var2;
        f1.o0 o0Var3;
        p0 p0Var2;
        d2 d2Var3;
        w1.r rVar3;
        boolean z3;
        b2 t;
        f0.v vVar3;
        int i4;
        f1.o0 o0Var4;
        f1.o0 o0Var5;
        f0.v vVar4;
        int i5;
        p0 p0Var3;
        int i6;
        int i7;
        k71.k.g(aVar, "onClick");
        k71.k.g(str, "text");
        sVar.e0(-2006122801);
        int i8 = i2 & 1;
        if (i8 != 0) {
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
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                vVar2 = vVar;
                if (sVar.f(vVar2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                vVar2 = vVar;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            vVar2 = vVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                o0Var2 = o0Var;
                if (sVar.f(o0Var2)) {
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                o0Var2 = o0Var;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            o0Var2 = o0Var;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= sVar.f(num) ? 1048576 : 524288;
        }
        int i9 = i2 & 128;
        if (i9 != 0) {
            i3 |= 12582912;
            z2 = z;
        } else {
            z2 = z;
            if ((12582912 & i) == 0) {
                i3 |= sVar.g(z2) ? 8388608 : 4194304;
            }
        }
        int i11 = i2 & 256;
        if (i11 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            d2Var2 = d2Var;
            i3 |= sVar.f(d2Var2) ? 67108864 : 33554432;
            if (sVar.S(i3 & 1, (38347923 & i3) == 38347922)) {
                sVar.V();
                o0Var3 = o0Var;
                p0Var2 = p0Var;
                d2Var3 = d2Var;
                rVar3 = rVar2;
                z3 = z2;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    w1.r rVar4 = i8 != 0 ? w1.o.a : rVar2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        vVar3 = f0.o.a((float) 0.5d, ih.d.b(sVar).I);
                    } else {
                        vVar3 = vVar2;
                    }
                    int i12 = i3;
                    if ((i2 & 16) != 0) {
                        i4 = i11;
                        o0Var4 = v.a(0L, 0L, 0L, sVar, 3072, 7);
                        i12 &= -57345;
                    } else {
                        i4 = i11;
                        o0Var4 = o0Var;
                    }
                    p0 p0Var4 = ih.d.e(sVar).b;
                    int i13 = i12 & (-458753);
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        float f = ih.a.m;
                        float f2 = 14;
                        d2 f2Var = new f2(f, f2, f, f2);
                        o0Var5 = o0Var4;
                        d2Var2 = f2Var;
                    } else {
                        d2Var2 = d2Var;
                        o0Var5 = o0Var4;
                    }
                    vVar4 = vVar3;
                    rVar3 = rVar4;
                    i5 = i13;
                    p0Var3 = p0Var4;
                } else {
                    sVar.V();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i5 = i3 & (-458753);
                    p0Var3 = p0Var;
                    rVar3 = rVar2;
                    vVar4 = vVar2;
                    o0Var5 = o0Var2;
                }
                boolean z4 = z2;
                sVar.r();
                int i14 = i5 >> 3;
                int i15 = i5;
                d2 d2Var4 = d2Var2;
                e8.l(aVar, rVar3, z4, p0Var3, o0Var5, f1.p0.b(31, 0.0f), vVar4, d2Var4, r1.i.d(552516545, new com.github.rudroid.agents.j(num, str, z4, o0Var5), sVar), sVar, (i14 & 29360128) | ((i15 >> 15) & 896) | (i14 & 14) | 805306368 | ((i5 << 3) & 112) | (i15 & 57344) | ((i15 << 9) & 3670016), 256);
                z3 = z4;
                o0Var3 = o0Var5;
                vVar2 = vVar4;
                d2Var3 = d2Var4;
                p0Var2 = p0Var3;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.fileeditor.commitbox.c(rVar3, aVar, str, vVar2, o0Var3, p0Var2, num, z3, d2Var3, i, i2);
                return;
            }
            return;
        }
        d2Var2 = d2Var;
        if (sVar.S(i3 & 1, (38347923 & i3) == 38347922)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(w1.r rVar, final j71.a aVar, f1.o0 o0Var, f0.v vVar, p0 p0Var, boolean z, d2 d2Var, float f, final j71.f fVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        w1.r rVar2;
        int i3;
        f1.o0 o0Var2;
        f0.v vVar2;
        p0 p0Var2;
        boolean z2;
        int i4;
        d2 d2Var2;
        int i5;
        float f2;
        final boolean z3;
        final d2 d2Var3;
        final float f3;
        final w1.r rVar3;
        final f1.o0 o0Var3;
        final p0 p0Var3;
        final f0.v vVar3;
        b2 t;
        w1.r rVar4;
        w1.r rVar5;
        int i6;
        f0.v vVar4;
        d2 d2Var4;
        w1.r rVar6;
        f0.v vVar5;
        int i7;
        p0 p0Var4;
        boolean z4;
        float f4;
        int i8;
        k71.k.g(aVar, "onClick");
        k71.k.g(fVar, "content");
        sVar.e0(564997863);
        int i9 = i2 & 1;
        if (i9 != 0) {
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
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                o0Var2 = o0Var;
                if (sVar.f(o0Var2)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                o0Var2 = o0Var;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            o0Var2 = o0Var;
        }
        if ((i & 3072) == 0) {
            vVar2 = vVar;
            i3 |= ((i2 & 8) == 0 && sVar.f(vVar2)) ? 2048 : 1024;
        } else {
            vVar2 = vVar;
        }
        if ((i & 24576) == 0) {
            p0Var2 = p0Var;
            i3 |= ((i2 & 16) == 0 && sVar.f(p0Var2)) ? 16384 : 8192;
        } else {
            p0Var2 = p0Var;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            z2 = z;
            i3 |= sVar.g(z2) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                d2Var2 = d2Var;
                i3 |= sVar.f(d2Var2) ? 1048576 : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    f2 = f;
                    i3 |= sVar.c(f2) ? 8388608 : 4194304;
                    if ((i & 100663296) == 0) {
                        i3 |= sVar.h(fVar) ? 67108864 : 33554432;
                    }
                    if (sVar.S(i3 & 1, (i3 & 38347923) == 38347922)) {
                        sVar.V();
                        z3 = z;
                        d2Var3 = d2Var;
                        f3 = f;
                        rVar3 = rVar2;
                        o0Var3 = o0Var2;
                        p0Var3 = p0Var2;
                        vVar3 = vVar;
                    } else {
                        sVar.X();
                        int i12 = i & 1;
                        w1.r rVar7 = w1.o.a;
                        if (i12 == 0 || sVar.A()) {
                            w1.r rVar8 = i9 != 0 ? rVar7 : rVar2;
                            if ((i2 & 4) != 0) {
                                i6 = i5;
                                rVar4 = rVar8;
                                rVar5 = rVar7;
                                i3 &= -897;
                                o0Var2 = v.a(0L, 0L, 0L, sVar, 3072, 7);
                            } else {
                                rVar4 = rVar8;
                                rVar5 = rVar7;
                                i6 = i5;
                            }
                            if ((i2 & 8) != 0) {
                                vVar4 = f0.o.a((float) 0.5d, ih.d.b(sVar).I);
                                i3 &= -7169;
                            } else {
                                vVar4 = vVar;
                            }
                            if ((i2 & 16) != 0) {
                                p0Var2 = ih.d.e(sVar).b;
                                i3 &= -57345;
                            }
                            boolean z5 = i11 == 0 ? z : true;
                            if (i4 != 0) {
                                float f5 = ih.a.m;
                                float f6 = 14;
                                d2Var4 = new f2(f5, f6, f5, f6);
                            } else {
                                d2Var4 = d2Var;
                            }
                            if (i6 != 0) {
                                rVar6 = rVar4;
                                vVar5 = vVar4;
                                f4 = ih.a.K;
                                i7 = i3;
                                p0Var4 = p0Var2;
                                z4 = z5;
                            } else {
                                rVar6 = rVar4;
                                vVar5 = vVar4;
                                i7 = i3;
                                p0Var4 = p0Var2;
                                z4 = z5;
                                f4 = f;
                            }
                        } else {
                            sVar.V();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            rVar6 = rVar2;
                            z4 = z2;
                            d2Var4 = d2Var2;
                            f4 = f2;
                            vVar5 = vVar2;
                            rVar5 = rVar7;
                            i7 = i3;
                            p0Var4 = p0Var2;
                        }
                        sVar.r();
                        int i13 = i7 >> 3;
                        d2Var3 = d2Var4;
                        e8.l(aVar, p2.a(rVar5, f4, f4).f(rVar6), z4, p0Var4, o0Var2, f1.p0.b(31, 0.0f), vVar5, d2Var3, r1.i.d(-1320087335, new j1(fVar, 4), sVar), sVar, (i13 & 14) | 805306368 | ((i7 >> 9) & 896) | (i13 & 7168) | ((i7 << 6) & 57344) | ((i7 << 9) & 3670016) | ((i7 << 3) & 29360128), 256);
                        p0Var3 = p0Var4;
                        o0Var3 = o0Var2;
                        vVar3 = vVar5;
                        rVar3 = rVar6;
                        f3 = f4;
                        z3 = z4;
                    }
                    t = sVar.t();
                    if (t == null) {
                        t.d = new j71.e() { // from class: sg.a
                            public final Object s(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                b.e(rVar3, aVar, o0Var3, vVar3, p0Var3, z3, d2Var3, f3, fVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i | 1), i2);
                                return w61.a0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                f2 = f;
                if ((i & 100663296) == 0) {
                }
                if (sVar.S(i3 & 1, (i3 & 38347923) == 38347922)) {
                }
                t = sVar.t();
                if (t == null) {
                }
            }
            d2Var2 = d2Var;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            f2 = f;
            if ((i & 100663296) == 0) {
            }
            if (sVar.S(i3 & 1, (i3 & 38347923) == 38347922)) {
            }
            t = sVar.t();
            if (t == null) {
            }
        }
        z2 = z;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        d2Var2 = d2Var;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i & 100663296) == 0) {
        }
        if (sVar.S(i3 & 1, (i3 & 38347923) == 38347922)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
    public static Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
