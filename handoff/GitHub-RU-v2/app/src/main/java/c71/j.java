package c71;

import k71.k;
import k71.xShadow;
import k71.y;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j extends c implements k71.h {
    public int u;

    public j(int i, a71.c cVar) {
        super(cVar);
        this.u = i;
    }

    @Override // k71.h
    public final int e() {
        return this.u;
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
    public Object c() { return null; }
    public static Object g(Object p1, Object p2, Object p3) { return null; }
    public Object k(Object p1) { return null; }
}
