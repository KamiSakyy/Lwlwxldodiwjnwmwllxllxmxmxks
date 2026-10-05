package z;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final w1.e f34325a;

    /* renamed from: b, reason: collision with root package name */
    public final j71.c f34326b;

    /* renamed from: c, reason: collision with root package name */
    public final a0.d0 f34327c;

    public b0(a0.d0 d0Var, j71.c cVar, w1.e eVar) {
        this.f34325a = eVar;
        this.f34326b = cVar;
        this.f34327c = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.f34325a, b0Var.f34325a) && k71.k.b(this.f34326b, b0Var.f34326b) && k71.k.b(this.f34327c, b0Var.f34327c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f34327c.hashCode() + ((this.f34326b.hashCode() + (this.f34325a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f34325a + ", size=" + this.f34326b + ", animationSpec=" + this.f34327c + ", clip=true)";
    }
}
