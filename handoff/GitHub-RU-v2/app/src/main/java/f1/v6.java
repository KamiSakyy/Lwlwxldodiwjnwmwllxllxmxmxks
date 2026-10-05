package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    public final w3.b0 f23917a = w3.b0.f33248r;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23918b = true;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23919c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return this.f23917a == v6Var.f23917a && this.f23919c == v6Var.f23919c && this.f23918b == v6Var.f23918b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23919c) + x.i.e(this.f23917a.hashCode() * 31, 29791, this.f23918b);
    }
}
