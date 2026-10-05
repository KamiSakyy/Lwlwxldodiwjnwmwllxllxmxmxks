package com.github.rudroid.uitoolkit.swipetodismiss;

import androidx.compose.runtime.p1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class m implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ n s;

    public /* synthetic */ m(n nVar, int i) {
        this.r = i;
        this.s = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r0 > 0.999999f) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        float f;
        switch (this.r) {
            case 0:
                n nVar = this.s;
                p1 p1Var = nVar.k;
                p1 p1Var2 = nVar.f;
                Object value = p1Var.getValue();
                if (value != null) {
                    return value;
                }
                float y = nVar.i.y();
                return !Float.isNaN(y) ? nVar.c(y, 0.0f, p1Var2.getValue()) : p1Var2.getValue();
            case 1:
                n nVar2 = this.s;
                p1 p1Var3 = nVar2.k;
                p1 p1Var4 = nVar2.f;
                Object value2 = p1Var3.getValue();
                if (value2 != null) {
                    return value2;
                }
                float y2 = nVar2.i.y();
                if (Float.isNaN(y2)) {
                    return p1Var4.getValue();
                }
                Object value3 = p1Var4.getValue();
                y d = nVar2.d();
                float d2 = d.d(value3);
                if (d2 != y2 && !Float.isNaN(d2)) {
                    if (d2 < y2) {
                        Object b = d.b(y2, true);
                        if (b != null) {
                            return b;
                        }
                    } else {
                        Object b2 = d.b(y2, false);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                return value3;
            case 2:
                n nVar3 = this.s;
                float d3 = nVar3.d().d(nVar3.f.getValue());
                float d4 = nVar3.d().d(nVar3.h.getValue()) - d3;
                float abs = Math.abs(d4);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    f = (nVar3.e() - d3) / d4;
                    if (f >= 1.0E-6f) {
                        break;
                    } else {
                        f = 0.0f;
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 3:
                return this.s.d();
            default:
                n nVar4 = this.s;
                return new w61.k(nVar4.d(), nVar4.g.getValue());
        }
    }
}
