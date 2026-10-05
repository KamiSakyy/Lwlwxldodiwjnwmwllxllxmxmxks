package h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public Object f25340u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25341v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0.f f25342w;

    /* renamed from: x, reason: collision with root package name */
    public int f25343x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h0.f fVar, a71.c cVar) {
        super(cVar);
        this.f25342w = fVar;
    }

    public final Object v(Object obj) {
        this.f25341v = obj;
        this.f25343x |= Integer.MIN_VALUE;
        return this.f25342w.c(null, this);
    }
}
