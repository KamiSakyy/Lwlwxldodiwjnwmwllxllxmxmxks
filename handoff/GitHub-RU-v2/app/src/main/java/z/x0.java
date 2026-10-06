package z;

import a0.g2;

/* loaded from: /home/user/work/p/classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public float f34496a;

    /* renamed from: b, reason: collision with root package name */
    public long f34497b;

    /* renamed from: c, reason: collision with root package name */
    public g2 f34498c;

    public x0(float f6, long j10, g2 g2Var) {
        this.f34496a = f6;
        this.f34497b = j10;
        this.f34498c = g2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Float.compare(this.f34496a, x0Var.f34496a) == 0 && d2.v0.a(this.f34497b, x0Var.f34497b) && this.f34498c.equals(x0Var.f34498c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f34496a) * 31;
        int i = d2.v0.f21395c;
        return this.f34498c.hashCode() + x.i.c(hashCode, 31, this.f34497b);
    }

    public final String toString() {
        return "Scale(scale=" + this.f34496a + ", transformOrigin=" + ((Object) d2.v0.d(this.f34497b)) + ", animationSpec=" + this.f34498c + ')';
    }
}
