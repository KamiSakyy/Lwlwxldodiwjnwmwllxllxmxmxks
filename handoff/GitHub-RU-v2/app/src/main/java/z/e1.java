package z;

/* loaded from: /home/user/work/p/classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public k71.l f34364a;

    /* renamed from: b, reason: collision with root package name */
    public a0.d0 f34365b;

    public e1(j71.c cVar, a0.d0 d0Var) {
        this.f34364a = (k71.l) cVar;
        this.f34365b = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f34364a.equals(e1Var.f34364a) && this.f34365b.equals(e1Var.f34365b);
    }

    public final int hashCode() {
        return this.f34365b.hashCode() + (this.f34364a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f34364a + ", animationSpec=" + this.f34365b + ')';
    }
}
