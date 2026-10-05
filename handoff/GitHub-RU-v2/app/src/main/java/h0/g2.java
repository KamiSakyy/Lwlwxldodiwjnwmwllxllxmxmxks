package h0;

/* loaded from: /home/user/work/p/classes.dex */
public final class g2 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25004v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k71.t f25005w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f25006x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(k71.t tVar, float f6, a71.c cVar) {
        super(2, cVar);
        this.f25005w = tVar;
        this.f25006x = f6;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        g2 g2Var = new g2(this.f25005w, this.f25006x, cVar);
        g2Var.f25004v = obj;
        return g2Var;
    }

    public final Object s(Object obj, Object obj2) {
        g2 r10 = r((a71.c) obj2, (h2) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.f25005w.r = ((h2) this.f25004v).a(this.f25006x);
        return w61.a0.a;
    }
}
