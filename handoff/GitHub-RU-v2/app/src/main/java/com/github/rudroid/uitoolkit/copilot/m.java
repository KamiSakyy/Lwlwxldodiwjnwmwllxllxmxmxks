package com.github.rudroid.uitoolkit.copilot;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.achievements.ui.b0;
import d2.t;
import f0.v;
import g3.q0;
import g3.z;
import w1.o;
import w1.r;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, r rVar2, String str, q0 q0Var, s sVar, int i, int i2) {
        r rVar3;
        int i3;
        r rVar4;
        q0 q0Var2;
        r rVar5;
        r rVar6;
        q0 q0Var3;
        b2 t;
        r rVar7;
        int i4;
        int i5;
        k71.k.g(str, "text");
        sVar.e0(-1310380702);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            rVar3 = rVar;
        } else if ((i & 6) == 0) {
            rVar3 = rVar;
            i3 = (sVar.f(rVar3) ? 4 : 2) | i;
        } else {
            rVar3 = rVar;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            rVar4 = rVar2;
            i3 |= sVar.f(rVar4) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= sVar.f(str) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    q0Var2 = q0Var;
                    if (sVar.f(q0Var2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    q0Var2 = q0Var;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                q0Var2 = q0Var;
            }
            if (sVar.S(i3 & 1, (i3 & 1171) == 1170)) {
                sVar.V();
                rVar5 = rVar3;
                rVar6 = rVar4;
                q0Var3 = q0Var2;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    r rVar8 = o.a;
                    if (i6 != 0) {
                        rVar3 = rVar8;
                    }
                    r y = i7 != 0 ? androidx.compose.foundation.layout.b.y(rVar8, ih.a.l, ih.a.j) : rVar4;
                    if ((i2 & 8) != 0) {
                        rVar7 = y;
                        rVar5 = rVar3;
                        i4 = i3 & (-7169);
                        q0Var3 = q0.a(ih.d.f(sVar).l, 0L, t1.C(13), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777213);
                        sVar.r();
                        int i8 = i4 << 3;
                        com.github.rudroid.uitoolkit.j.c(rVar7, rVar5, str, 0.0f, q0Var3, null, 0, t.j, new v(1, mh.a.a), null, 0L, null, sVar, (i4 & 896) | ((i4 >> 3) & 14) | 113246208 | (i8 & 112) | (57344 & i8), 48, 1640);
                        rVar6 = rVar7;
                    } else {
                        rVar7 = y;
                        rVar5 = rVar3;
                        i4 = i3;
                    }
                } else {
                    sVar.V();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    rVar5 = rVar3;
                    i4 = i3;
                    rVar7 = rVar4;
                }
                q0Var3 = q0Var2;
                sVar.r();
                int i82 = i4 << 3;
                com.github.rudroid.uitoolkit.j.c(rVar7, rVar5, str, 0.0f, q0Var3, null, 0, t.j, new v(1, mh.a.a), null, 0L, null, sVar, (i4 & 896) | ((i4 >> 3) & 14) | 113246208 | (i82 & 112) | (57344 & i82), 48, 1640);
                rVar6 = rVar7;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new b0(rVar5, rVar6, str, q0Var3, i, i2, 18);
                return;
            }
            return;
        }
        rVar4 = rVar2;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        if (sVar.S(i3 & 1, (i3 & 1171) == 1170)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0<T1,T2,T3,T4> {
        public q0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
