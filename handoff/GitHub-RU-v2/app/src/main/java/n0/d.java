package n0;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f29242a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f29242a == ((d) obj).f29242a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29242a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f29242a + ')';
    }
}
