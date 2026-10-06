package q2;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f30842a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f30842a == ((h) obj).f30842a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30842a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f30842a + ')';
    }
}
