package n2;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f29398a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f29398a == ((a) obj).f29398a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29398a);
    }

    public final String toString() {
        return no.a.l("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.f29398a, ')');
    }
}
