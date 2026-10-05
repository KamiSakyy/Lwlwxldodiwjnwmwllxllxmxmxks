package h0;

/* loaded from: /home/user/work/p/classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25211a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25212b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25213c;

    public w1(long j10, long j11, boolean z10) {
        this.f25211a = j10;
        this.f25212b = j11;
        this.f25213c = z10;
    }

    public final w1 a(w1 w1Var) {
        return new w1(c2.b.f(this.f25211a, w1Var.f25211a), Math.max(this.f25212b, w1Var.f25212b), this.f25213c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return c2.b.c(this.f25211a, w1Var.f25211a) && this.f25212b == w1Var.f25212b && this.f25213c == w1Var.f25213c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25213c) + x.i.c(Long.hashCode(this.f25211a) * 31, 31, this.f25212b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) c2.b.h(this.f25211a)) + ", timeMillis=" + this.f25212b + ", shouldApplyImmediately=" + this.f25213c + ')';
    }


}
