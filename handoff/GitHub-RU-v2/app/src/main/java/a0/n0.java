package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class n0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ float f166v;

    public final a71.c r(a71.c cVar, Object obj) {
        n0 n0Var = new n0(2, cVar);
        n0Var.f166v = ((Number) obj).floatValue();
        return n0Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, Float.valueOf(((Number) obj).floatValue())).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return Boolean.valueOf(this.f166v > 0.0f);
    }

    public n0(Object... a) {
    }
}
