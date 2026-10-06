package c71;

import k71.k;
import k71.xShadow;
import k71.y;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i extends h implements k71.h {
    public int s;

    public i(int i, a71.c cVar) {
        super(cVar);
        this.s = i;
    }

    @Override // k71.h
    public final int e() {
        return this.s;
    }

    @Override // c71.a
    public final String toString() {
        if (this.r != null) {
            return super.toString();
        }
        xShadow.a.getClass();
        String a = y.a(this);
        k.f(a, "renderLambdaToString(...)");
        return a;
    }
}
