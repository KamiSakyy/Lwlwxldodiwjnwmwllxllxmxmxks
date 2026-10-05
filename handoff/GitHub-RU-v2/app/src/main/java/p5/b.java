package p5;

import h91.e0;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public c f30362u;

    /* renamed from: v, reason: collision with root package name */
    public e0 f30363v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f30364w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f30365x;

    /* renamed from: y, reason: collision with root package name */
    public int f30366y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c71.c cVar2) {
        super(cVar2);
        this.f30365x = cVar;
    }

    public final Object v(Object obj) {
        this.f30364w = obj;
        this.f30366y |= Integer.MIN_VALUE;
        return c.f(this.f30365x, this);
    }
}
