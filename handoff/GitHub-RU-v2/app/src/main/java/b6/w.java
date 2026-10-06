package b6;

/* loaded from: /home/user/work/p/classes.dex */
public final class w implements z5.m {

    /* renamed from: a, reason: collision with root package name */
    public n6.g f3721a;

    public w(n6.g gVar) {
        this.f3721a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && k71.k.b(this.f3721a, ((w) obj).f3721a);
    }

    public final int hashCode() {
        return this.f3721a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.f3721a + ')';
    }
}
