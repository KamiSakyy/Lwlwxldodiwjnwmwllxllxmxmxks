package z;

/* loaded from: /home/user/work/p/classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public float f34480a;

    /* renamed from: b, reason: collision with root package name */
    public a0.d0 f34481b;

    public u0(float f6, a0.d0 d0Var) {
        this.f34480a = f6;
        this.f34481b = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Float.compare(this.f34480a, u0Var.f34480a) == 0 && k71.k.b(this.f34481b, u0Var.f34481b);
    }

    public final int hashCode() {
        return this.f34481b.hashCode() + (Float.hashCode(this.f34480a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f34480a + ", animationSpec=" + this.f34481b + ')';
    }
}
