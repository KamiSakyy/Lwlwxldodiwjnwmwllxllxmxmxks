package aa;

/* loaded from: /home/user/work/p/classes.dex */
public final class u0 extends aa1.b {

    /* renamed from: d, reason: collision with root package name */
    public Object f683d;

    public u0(Object obj) {
        this.f683d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && k71.k.b(this.f683d, ((u0) obj).f683d);
    }

    public final int hashCode() {
        Object obj = this.f683d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Present(value=" + this.f683d + ')';
    }
    public Object d = null;
}
