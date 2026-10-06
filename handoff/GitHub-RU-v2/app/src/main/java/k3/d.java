package k3;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27667a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return k71.k.b(this.f27667a, ((d) obj).f27667a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f27667a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f27667a + ')';
    }
    public Object a = null;
}
