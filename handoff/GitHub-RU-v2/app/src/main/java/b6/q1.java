package b6;

/* loaded from: /home/user/work/p/classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public l1 f3677a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3678b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3679c;

    public q1(l1 l1Var, boolean z10, boolean z11) {
        this.f3677a = l1Var;
        this.f3678b = z10;
        this.f3679c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f3677a == q1Var.f3677a && this.f3678b == q1Var.f3678b && this.f3679c == q1Var.f3679c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3679c) + x.i.e(this.f3677a.hashCode() * 31, 31, this.f3678b);
    }

    public final String toString() {
        return "RowColumnChildSelector(type=" + this.f3677a + ", expandWidth=" + this.f3678b + ", expandHeight=" + this.f3679c + ')';
    }
}
