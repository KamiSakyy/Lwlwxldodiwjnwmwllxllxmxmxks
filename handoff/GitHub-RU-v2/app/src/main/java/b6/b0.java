package b6;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final z5.n f3492a;

    /* renamed from: b, reason: collision with root package name */
    public final z5.n f3493b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b0(z5.n nVar, int i) {
        this(r0, r3 != 0 ? r0 : nVar);
        int i10 = i & 2;
        z5.l lVar = z5.l.f34585a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.f3492a, b0Var.f3492a) && k71.k.b(this.f3493b, b0Var.f3493b);
    }

    public final int hashCode() {
        return this.f3493b.hashCode() + (this.f3492a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.f3492a + ", nonSizeOrCornerModifiers=" + this.f3493b + ')';
    }

    public b0(z5.n nVar, z5.n nVar2) {
        this.f3492a = nVar;
        this.f3493b = nVar2;
    }
    public Object a = null;
    public Object b = null;
}
