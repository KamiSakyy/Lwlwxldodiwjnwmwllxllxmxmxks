package zg;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    /* JADX WARN: Removed duplicated region for block: B:104:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final w1.r rVar, final int i, long j, w1.r rVar2, String str, boolean z, final j71.e eVar, final j71.e eVar2, j71.e eVar3, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        int i4;
        w1.r rVar3;
        int i5;
        String str2;
        int i6;
        boolean z2;
        int i7;
        int i8;
        final long j2;
        final w1.r rVar4;
        final String str3;
        final boolean z3;
        final j71.e eVar4;
        b2 t;
        long j3;
        j71.e eVar5;
        final long j4;
        int i9;
        k71.k.g(eVar2, "titleContent");
        sVar.e0(-1225537753);
        if ((i2 & 6) == 0) {
            i4 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0 && sVar.e(j)) {
                i9 = 256;
                i4 |= i9;
            }
            i9 = 128;
            i4 |= i9;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            rVar3 = rVar2;
            i4 |= sVar.f(rVar3) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                str2 = str;
                i4 |= sVar.f(str2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    z2 = z;
                    i4 |= sVar.g(z2) ? 131072 : 65536;
                    if ((i2 & 1572864) == 0) {
                        i4 |= sVar.h(eVar) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i4 |= sVar.h(eVar2) ? 8388608 : 4194304;
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i8 = i7;
                        i4 |= sVar.h(eVar3) ? 67108864 : 33554432;
                        if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
                            sVar.X();
                            if ((i2 & 1) == 0 || sVar.A()) {
                                if ((i3 & 4) != 0) {
                                    j3 = ih.d.b(sVar).z;
                                    i4 &= -897;
                                } else {
                                    j3 = j;
                                }
                                if (i11 != 0) {
                                    rVar3 = w1.o.a;
                                }
                                if (i5 != 0) {
                                    str2 = null;
                                }
                                if (i6 != 0) {
                                    z2 = false;
                                }
                                eVar5 = i8 != 0 ? null : eVar3;
                                j4 = j3;
                            } else {
                                sVar.V();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                j4 = j;
                                eVar5 = eVar3;
                            }
                            final w1.r rVar5 = rVar3;
                            final boolean z4 = z2;
                            final String str4 = str2;
                            sVar.r();
                            com.github.rudroid.uitoolkit.listitems.y.a(rVar, r1.i.d(-967383821, new j71.f() { // from class: zg.x
                                public final Object f(Object obj, Object obj2, Object obj3) {
                                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    k71.k.g((androidx.compose.foundation.layout.x) obj, "$this$ListItemScaffold");
                                    if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                                        w1.o oVar = w1.o.a;
                                        w1.r u = p2.u(oVar);
                                        androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.E, sVar2, 48);
                                        int hashCode = Long.hashCode(sVar2.T);
                                        v1 l = sVar2.l();
                                        w1.r c = w1.a.c(sVar2, u);
                                        v2.h.o.getClass();
                                        v2.f fVar = v2.g.b;
                                        sVar2.g0();
                                        if (sVar2.S) {
                                            sVar2.k(fVar);
                                        } else {
                                            sVar2.q0();
                                        }
                                        androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
                                        androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                                        androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                                        androidx.compose.runtime.t.E(sVar2, v2.g.h);
                                        androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                                        p5.a(z3.C(i, 0, sVar2), str4, rVar5, j4, sVar2, 8, 0);
                                        if (z4) {
                                            sVar2.c0(-1989985685);
                                            p5.a(z3.C(2131231238, 0, sVar2), (String) null, androidx.compose.foundation.layout.b.B(oVar, 0.0f, ih.a.k, 0.0f, 0.0f, 13), ih.d.b(sVar2).F, sVar2, 440, 0);
                                        } else {
                                            sVar2.c0(-1992544859);
                                        }
                                        sVar2.q(false);
                                        sVar2.q(true);
                                    } else {
                                        sVar2.V();
                                    }
                                    return w61.a0.a;
                                }
                            }, sVar), r1.i.d(-1968439692, new com.github.rudroid.settings.codeoptions.g(26, eVar5, eVar2), sVar), r1.i.d(1325471733, new com.github.rudroid.actions.checkdetail.ui.d(3, eVar), sVar), sVar, (i4 & 14) | 3504, 0);
                            eVar4 = eVar5;
                            str3 = str4;
                            rVar4 = rVar5;
                            j2 = j4;
                            z3 = z4;
                        } else {
                            sVar.V();
                            j2 = j;
                            rVar4 = rVar3;
                            str3 = str2;
                            z3 = z2;
                            eVar4 = eVar3;
                        }
                        t = sVar.t();
                        if (t != null) {
                            t.d = new j71.e() { // from class: zg.y
                                public final Object s(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    z.a(rVar, i, j2, rVar4, str3, z3, eVar, eVar2, eVar4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i2 | 1), i3);
                                    return w61.a0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                z2 = z;
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            str2 = str;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            z2 = z;
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        rVar3 = rVar2;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        z2 = z;
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if (sVar.S(i4 & 1, (i4 & 38347923) != 38347922)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    public static Object a;
}
