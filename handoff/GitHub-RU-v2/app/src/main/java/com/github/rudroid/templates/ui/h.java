package com.github.rudroid.templates.ui;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.x;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.m0;
import com.github.rudroid.settings.copilot.debug.q;
import com.github.rudroid.uitoolkit.listitems.y;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;
import g3.q0;
import k71.k;
import r1.i;
import w1.o;
import w1.r;
import w61.a0;
import yz0.f5;
import yz0.g5;
import yz0.h5;
import yz0.i5;
import yz0.j5;
import yz0.k5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final void a(r rVar, final k5 k5Var, s sVar, int i) {
        r rVar2;
        s sVar2;
        k.g(k5Var, "template");
        sVar.e0(137196551);
        int i2 = (sVar.f(rVar) ? 4 : 2) | i | (sVar.h(k5Var) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            final int i3 = 0;
            r1.d d = i.d(-1635447398, new j71.f() { // from class: com.github.rudroid.templates.ui.g
                public final Object f(Object obj, Object obj2, Object obj3) {
                    int i4;
                    int i5;
                    String str;
                    int i6;
                    int i7;
                    String str2;
                    switch (i3) {
                        case 0:
                            s sVar3 = (s) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            k.g((x) obj, "$this$ListItemScaffold");
                            if (sVar3.S(intValue & 1, (intValue & 17) != 16)) {
                                j5 j5Var = k5Var;
                                boolean z = j5Var instanceof j5;
                                if (z) {
                                    sVar3.c0(293083518);
                                    sVar3.q(false);
                                    str = j5Var.s;
                                } else {
                                    if (j5Var instanceof i5) {
                                        i4 = 293084965;
                                        i5 = 2131952361;
                                    } else if (j5Var instanceof g5) {
                                        sVar3.c0(293089694);
                                        sVar3.q(false);
                                        str = ((g5) j5Var).s;
                                    } else if (j5Var instanceof h5) {
                                        sVar3.c0(293091294);
                                        sVar3.q(false);
                                        str = ((h5) j5Var).s;
                                    } else {
                                        if (!k.b(j5Var, f5.s)) {
                                            throw f1.e.r(293082090, sVar3, false);
                                        }
                                        i4 = 293092337;
                                        i5 = 2131952358;
                                    }
                                    str = m0.d(sVar3, i4, i5, sVar3, false);
                                }
                                if (z) {
                                    sVar3.c0(293098143);
                                    sVar3.q(false);
                                    str2 = j5Var.t;
                                } else {
                                    if (j5Var instanceof i5) {
                                        i6 = 293099626;
                                        i7 = 2131952362;
                                    } else if (j5Var instanceof g5) {
                                        sVar3.c0(293104511);
                                        sVar3.q(false);
                                        str2 = ((g5) j5Var).t;
                                    } else if (j5Var instanceof h5) {
                                        sVar3.c0(293106143);
                                        sVar3.q(false);
                                        str2 = ((h5) j5Var).t;
                                    } else {
                                        if (!k.b(j5Var, f5.s)) {
                                            throw f1.e.r(293096727, sVar3, false);
                                        }
                                        i6 = 293107222;
                                        i7 = 2131952359;
                                    }
                                    str2 = m0.d(sVar3, i6, i7, sVar3, false);
                                }
                                e0 a = c0.a(l.c, w1.c.D, sVar3, 0);
                                int hashCode = Long.hashCode(sVar3.T);
                                v1 l = sVar3.l();
                                o oVar = o.a;
                                r c = w1.a.c(sVar3, oVar);
                                v2.h.o.getClass();
                                v2.f fVar = v2.g.b;
                                sVar3.g0();
                                if (sVar3.S) {
                                    sVar3.k(fVar);
                                } else {
                                    sVar3.q0();
                                }
                                t.I(sVar3, v2.g.f, a);
                                t.I(sVar3, v2.g.e, l);
                                t.w(sVar3, Integer.valueOf(hashCode), v2.g.g);
                                t.E(sVar3, v2.g.h);
                                t.I(sVar3, v2.g.d, c);
                                ub.b(str, androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, 0.0f, ih.a.j, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar3, 0, 0, 262140);
                                s sVar4 = sVar3;
                                if (str2 == null) {
                                    sVar4.c0(1440763495);
                                } else {
                                    sVar4.c0(1440763496);
                                    ub.b(str2, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).u, sVar4, 0, 0, 131070);
                                    sVar4 = sVar4;
                                }
                                sVar4.q(false);
                                sVar4.q(true);
                            } else {
                                sVar3.V();
                            }
                            return a0.a;
                        default:
                            s sVar5 = (s) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            k.g((x) obj, "$this$ListItemScaffold");
                            if (sVar5.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                                k5 k5Var2 = k5Var;
                                if ((k5Var2 instanceof j5) || (k5Var2 instanceof f5)) {
                                    sVar5.c0(924005833);
                                } else {
                                    sVar5.c0(926547337);
                                    p5.a(z3.C(2131231347, 0, sVar5), (String) null, (r) null, ih.d.b(sVar5).A, sVar5, 56, 4);
                                }
                                sVar5.q(false);
                            } else {
                                sVar5.V();
                            }
                            return a0.a;
                    }
                }
            }, sVar);
            final int i4 = 1;
            rVar2 = rVar;
            sVar2 = sVar;
            y.a(rVar2, null, d, i.d(-34281351, new j71.f() { // from class: com.github.rudroid.templates.ui.g
                public final Object f(Object obj, Object obj2, Object obj3) {
                    int i42;
                    int i5;
                    String str;
                    int i6;
                    int i7;
                    String str2;
                    switch (i4) {
                        case 0:
                            s sVar3 = (s) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            k.g((x) obj, "$this$ListItemScaffold");
                            if (sVar3.S(intValue & 1, (intValue & 17) != 16)) {
                                j5 j5Var = k5Var;
                                boolean z = j5Var instanceof j5;
                                if (z) {
                                    sVar3.c0(293083518);
                                    sVar3.q(false);
                                    str = j5Var.s;
                                } else {
                                    if (j5Var instanceof i5) {
                                        i42 = 293084965;
                                        i5 = 2131952361;
                                    } else if (j5Var instanceof g5) {
                                        sVar3.c0(293089694);
                                        sVar3.q(false);
                                        str = ((g5) j5Var).s;
                                    } else if (j5Var instanceof h5) {
                                        sVar3.c0(293091294);
                                        sVar3.q(false);
                                        str = ((h5) j5Var).s;
                                    } else {
                                        if (!k.b(j5Var, f5.s)) {
                                            throw f1.e.r(293082090, sVar3, false);
                                        }
                                        i42 = 293092337;
                                        i5 = 2131952358;
                                    }
                                    str = m0.d(sVar3, i42, i5, sVar3, false);
                                }
                                if (z) {
                                    sVar3.c0(293098143);
                                    sVar3.q(false);
                                    str2 = j5Var.t;
                                } else {
                                    if (j5Var instanceof i5) {
                                        i6 = 293099626;
                                        i7 = 2131952362;
                                    } else if (j5Var instanceof g5) {
                                        sVar3.c0(293104511);
                                        sVar3.q(false);
                                        str2 = ((g5) j5Var).t;
                                    } else if (j5Var instanceof h5) {
                                        sVar3.c0(293106143);
                                        sVar3.q(false);
                                        str2 = ((h5) j5Var).t;
                                    } else {
                                        if (!k.b(j5Var, f5.s)) {
                                            throw f1.e.r(293096727, sVar3, false);
                                        }
                                        i6 = 293107222;
                                        i7 = 2131952359;
                                    }
                                    str2 = m0.d(sVar3, i6, i7, sVar3, false);
                                }
                                e0 a = c0.a(l.c, w1.c.D, sVar3, 0);
                                int hashCode = Long.hashCode(sVar3.T);
                                v1 l = sVar3.l();
                                o oVar = o.a;
                                r c = w1.a.c(sVar3, oVar);
                                v2.h.o.getClass();
                                v2.f fVar = v2.g.b;
                                sVar3.g0();
                                if (sVar3.S) {
                                    sVar3.k(fVar);
                                } else {
                                    sVar3.q0();
                                }
                                t.I(sVar3, v2.g.f, a);
                                t.I(sVar3, v2.g.e, l);
                                t.w(sVar3, Integer.valueOf(hashCode), v2.g.g);
                                t.E(sVar3, v2.g.h);
                                t.I(sVar3, v2.g.d, c);
                                ub.b(str, androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, 0.0f, ih.a.j, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar3, 0, 0, 262140);
                                s sVar4 = sVar3;
                                if (str2 == null) {
                                    sVar4.c0(1440763495);
                                } else {
                                    sVar4.c0(1440763496);
                                    ub.b(str2, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).u, sVar4, 0, 0, 131070);
                                    sVar4 = sVar4;
                                }
                                sVar4.q(false);
                                sVar4.q(true);
                            } else {
                                sVar3.V();
                            }
                            return a0.a;
                        default:
                            s sVar5 = (s) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            k.g((x) obj, "$this$ListItemScaffold");
                            if (sVar5.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                                k5 k5Var2 = k5Var;
                                if ((k5Var2 instanceof j5) || (k5Var2 instanceof f5)) {
                                    sVar5.c0(924005833);
                                } else {
                                    sVar5.c0(926547337);
                                    p5.a(z3.C(2131231347, 0, sVar5), (String) null, (r) null, ih.d.b(sVar5).A, sVar5, 56, 4);
                                }
                                sVar5.q(false);
                            } else {
                                sVar5.V();
                            }
                            return a0.a;
                    }
                }
            }, sVar), sVar2, (i2 & 14) | 3456, 2);
        } else {
            rVar2 = rVar;
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new q(rVar2, k5Var, i, 6);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
