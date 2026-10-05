package v1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class l implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f32386r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.c f32387s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j71.c f32388t;

    public /* synthetic */ l(j71.c cVar, j71.c cVar2, int i) {
        this.f32386r = i;
        this.f32387s = cVar;
        this.f32388t = cVar2;
    }

    public final Object k(Object obj) {
        switch (this.f32386r) {
            case k5.f.J /* 0 */:
                this.f32387s.k(obj);
                this.f32388t.k(obj);
                break;
            default:
                this.f32387s.k(obj);
                this.f32388t.k(obj);
                break;
        }
        return w61.a0.a;
    }
}
