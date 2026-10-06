package com.github.rudroid.settings.copilot.paywall.ui;

import androidx.compose.runtime.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.github.rudroid.copilot.inapppurchase.i0.values().length];
            try {
                com.github.rudroid.copilot.inapppurchase.i0 i0Var = com.github.rudroid.copilot.inapppurchase.i0.r;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                com.github.rudroid.copilot.inapppurchase.i0 i0Var2 = com.github.rudroid.copilot.inapppurchase.i0.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                com.github.rudroid.copilot.inapppurchase.i0 i0Var3 = com.github.rudroid.copilot.inapppurchase.i0.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                com.github.rudroid.copilot.inapppurchase.i0 i0Var4 = com.github.rudroid.copilot.inapppurchase.i0.r;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final void a(w1.r rVar, j71.a aVar, j71.a aVar2, com.github.rudroid.copilot.inapppurchase.i0 i0Var, androidx.compose.runtime.s sVar, int i) {
        b2 t;
        com.github.rudroid.profile.status.ui.x dVar;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(aVar, "onDismiss");
        k71.k.g(aVar2, "onRestorePurchase");
        sVar2.e0(1366963274);
        int i2 = i | 6 | (sVar2.h(aVar) ? 32 : 16) | (sVar2.h(aVar2) ? 256 : 128) | (sVar2.d(i0Var == null ? -1 : i0Var.ordinal()) ? 2048 : 1024);
        if (sVar2.S(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i0Var != null ? a.a[i0Var.ordinal()] : -1;
            rVar = w1.o.a;
            if (i3 == 1) {
                sVar2.c0(-1676730493);
                a1.a(rVar, aVar, 2131951988, 2131951987, sVar2, i2 & 126, 0);
                sVar2.q(false);
            } else if (i3 == 2) {
                sVar2.c0(-1676321789);
                a1.a(rVar, aVar, 2131951992, 2131951991, sVar2, i2 & 126, 0);
                sVar2.q(false);
            } else if (i3 == 3) {
                sVar2.c0(-1675847954);
                xg.c.b(rVar, c.a, c.b, 2131952184, 2131951840, aVar2, aVar, aVar, false, sVar, ((i2 << 9) & 458752) | 438 | ((i2 << 15) & 3670016) | ((i2 << 18) & 29360128), 256);
                sVar2 = sVar;
                sVar2.q(false);
            } else {
                if (i3 != 4) {
                    sVar2.c0(-1672313582);
                    sVar2.q(false);
                    t = sVar2.t();
                    if (t != null) {
                        dVar = new com.github.rudroid.profile.status.ui.x(aVar, aVar2, i0Var, i);
                        t.d = dVar;
                    }
                    return;
                }
                sVar2.c0(-1673902828);
                xg.t.b(rVar, c.c, c.d, r1.i.d(213143605, new com.github.rudroid.agents.copilothome.ui.f0(19, aVar), sVar2), null, sVar2, 3510, 16);
                sVar2 = sVar2;
                sVar2.q(false);
            }
        } else {
            sVar2.V();
        }
        w1.r rVar2 = rVar;
        t = sVar2.t();
        if (t != null) {
            dVar = new bd.d(rVar2, aVar, aVar2, i0Var, i, 21);
            t.d = dVar;
        }
    }
    public Object E(Object p1, Object p2) { return null; }
    public Object I(Object p1, Object p2, Object p3) { return null; }
    public Object L(Object p1) { return null; }
    public Object d(Object p1, Object p2) { return null; }
    public Object w(Object p1, Object p2, Object p3) { return null; }
}
