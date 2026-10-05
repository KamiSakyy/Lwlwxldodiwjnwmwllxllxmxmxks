package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class s6 extends c71.j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ float f23715v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j71.c f23716w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(j71.c cVar, a71.c cVar2) {
        super(3, cVar2);
        this.f23716w = cVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        s6 s6Var = new s6(this.f23716w, (a71.c) obj3);
        s6Var.f23715v = floatValue;
        w61.a0 a0Var = w61.a0.a;
        s6Var.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.f23716w.k(new Float(this.f23715v));
        return w61.a0.a;
    }
}
