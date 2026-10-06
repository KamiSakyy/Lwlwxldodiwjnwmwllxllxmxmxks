package k71;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l implements h, Serializable {
    public int r;

    public l(int i) {
        this.r = i;
    }

    @Override // k71.h
    public final int e() {
        return this.r;
    }

    public final String toString() {
        x.a.getClass();
        String a = y.a(this);
        k.f(a, "renderLambdaToString(...)");
        return a;
    }
}
