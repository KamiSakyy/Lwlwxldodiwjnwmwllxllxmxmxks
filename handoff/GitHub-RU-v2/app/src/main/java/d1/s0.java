package d1;

/* loaded from: /home/user/work/p/classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0.c0 f21216a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21217b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f21218c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21219d;

    public s0(s0.c0 c0Var, long j10, r0 r0Var, boolean z10) {
        this.f21216a = c0Var;
        this.f21217b = j10;
        this.f21218c = r0Var;
        this.f21219d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f21216a == s0Var.f21216a && c2.b.c(this.f21217b, s0Var.f21217b) && this.f21218c == s0Var.f21218c && this.f21219d == s0Var.f21219d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21219d) + ((this.f21218c.hashCode() + x.i.c(this.f21216a.hashCode() * 31, 31, this.f21217b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f21216a + ", position=" + ((Object) c2.b.h(this.f21217b)) + ", anchor=" + this.f21218c + ", visible=" + this.f21219d + ')';
    }







}
