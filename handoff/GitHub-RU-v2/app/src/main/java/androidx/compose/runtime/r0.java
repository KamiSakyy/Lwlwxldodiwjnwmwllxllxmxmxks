package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1767a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1768b;

    public r0(Integer num, Object obj) {
        this.f1767a = num;
        this.f1768b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f1767a.equals(r0Var.f1767a) && k71.k.b(this.f1768b, r0Var.f1768b);
    }

    public final int hashCode() {
        int hashCode = this.f1767a.hashCode() * 31;
        Object obj = this.f1768b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f1767a + ", right=" + this.f1768b + ')';
    }
}
