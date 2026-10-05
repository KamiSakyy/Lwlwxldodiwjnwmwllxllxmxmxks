package c3;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f4094u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f4095v;

    /* renamed from: w, reason: collision with root package name */
    public int f4096w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, c71.c cVar) {
        super(cVar);
        this.f4095v = gVar;
    }

    public final Object v(Object obj) {
        this.f4094u = obj;
        this.f4096w |= Integer.MIN_VALUE;
        return this.f4095v.b(0.0f, this);
    }
}
