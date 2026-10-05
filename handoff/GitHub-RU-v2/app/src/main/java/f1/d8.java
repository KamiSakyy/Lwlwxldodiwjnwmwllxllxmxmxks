package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class d8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f22678a = d2.t.f21389k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d8) {
            return d2.t.c(this.f22678a, ((d8) obj).f22678a);
        }
        return false;
    }

    public final int hashCode() {
        int i = d2.t.l;
        return Long.hashCode(this.f22678a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) d2.t.i(this.f22678a)) + ", rippleAlpha=null)";
    }
}
