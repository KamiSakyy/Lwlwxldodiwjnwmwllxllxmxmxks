package com.github.rudroid.twofactor;

import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class y implements j71.c {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ h s;

    public final Object k(Object obj) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        h hVar = this.s;
        switch (i) {
            case 0:
                String str = (String) obj;
                int i2 = TwoFactorDialog.B;
                k71.k.g(str, "it");
                if (TwoFactorDialog.k(str) || str.length() == 0) {
                    y1 y1Var = hVar.x;
                    fl.f fVar = (fl.f) y1Var.getValue();
                    b bVar = (b) ((fl.f) y1Var.getValue()).b;
                    y1Var.k((Object) null, fl.f.a(fVar, bVar != null ? new b(bVar.a, bVar.b, str) : null));
                    break;
                }
                break;
            default:
                int i3 = TwoFactorDialog.B;
                k71.k.g((s0.k0) obj, "$this$KeyboardActions");
                hVar.P();
                break;
        }
        return a0Var;
    }
}
