package d9;

import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class s implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21748r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f21749s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v7.a f21750t;

    public /* synthetic */ s(t tVar, v7.a aVar, int i) {
        this.f21748r = i;
        this.f21749s = tVar;
        this.f21750t = aVar;
    }

    public final Object k(Object obj) {
        x.e eVar = (x.e) obj;
        switch (this.f21748r) {
            case k5.f.J:
                k71.k.g(eVar, "_tmpMap");
                this.f21749s.a(this.f21750t, eVar);
                break;
            default:
                k71.k.g(eVar, "_tmpMap");
                this.f21749s.b(this.f21750t, eVar);
                break;
        }
        return a0.a;
    }

}
