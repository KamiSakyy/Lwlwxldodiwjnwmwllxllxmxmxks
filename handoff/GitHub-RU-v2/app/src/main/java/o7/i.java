package o7;

/* loaded from: /home/user/work/p/classes.dex */
public final class i implements z, m7.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30022b;

    public /* synthetic */ i(int i, Object obj) {
        this.f30021a = i;
        this.f30022b = obj;
    }

    @Override // m7.o
    public final Object a(String str, j71.c cVar, c71.c cVar2) {
        switch (this.f30021a) {
            case k5.f.J:
                return ((m) this.f30022b).a(str, cVar, cVar2);
            default:
                return ((y) this.f30022b).a(str, cVar, cVar2);
        }
    }

    @Override // o7.z
    public final v7.a c() {
        switch (this.f30021a) {
            case k5.f.J:
                return ((m) this.f30022b).f30036b;
            default:
                return ((y) this.f30022b).f30089b;
        }
    }
}
