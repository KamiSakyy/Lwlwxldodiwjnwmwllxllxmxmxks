package h1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class k1 implements o0, k71.g {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a81.i f25357r;

    public k1(a81.i iVar) {
        this.f25357r = iVar;
    }

    @Override // h1.o0
    public final float a() {
        return ((Number) this.f25357r.get()).floatValue();
    }

    public final w61.e b() {
        return this.f25357r;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0) || !(obj instanceof k71.g)) {
            return false;
        }
        return this.f25357r.equals(((k71.g) obj).b());
    }

    public final int hashCode() {
        return this.f25357r.hashCode();
    }
}
