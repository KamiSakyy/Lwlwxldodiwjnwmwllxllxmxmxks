package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    public final aa f24190a;

    /* renamed from: b, reason: collision with root package name */
    public final v71.l f24191b;

    public z9(aa aaVar, v71.l lVar) {
        this.f24190a = aaVar;
        this.f24191b = lVar;
    }

    public final void a() {
        v71.l lVar = this.f24191b;
        if (lVar.z()) {
            lVar.i(la.f23253r);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z9.class != obj.getClass()) {
            return false;
        }
        z9 z9Var = (z9) obj;
        return k71.k.b(this.f24190a, z9Var.f24190a) && this.f24191b.equals(z9Var.f24191b);
    }

    public final int hashCode() {
        return this.f24191b.hashCode() + (this.f24190a.hashCode() * 31);
    }
}
