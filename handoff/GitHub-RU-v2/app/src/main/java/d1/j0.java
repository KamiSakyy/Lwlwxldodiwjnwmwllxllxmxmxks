package d1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class j0 implements n, k71.g {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j71.a f21113r;

    public j0(j71.a aVar) {
        this.f21113r = aVar;
    }

    @Override // d1.n
    public final /* synthetic */ long a() {
        return ((c2.b) this.f21113r.a()).f4058a;
    }

    public final w61.e b() {
        return this.f21113r;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n) || !(obj instanceof k71.g)) {
            return false;
        }
        return k71.k.b(this.f21113r, ((k71.g) obj).b());
    }

    public final int hashCode() {
        return this.f21113r.hashCode();
    }
}
