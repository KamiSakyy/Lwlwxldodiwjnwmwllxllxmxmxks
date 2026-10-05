package m6;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f28931a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f28931a == ((b) obj).f28931a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28931a);
    }

    public final String toString() {
        return no.a.l("FontWeight(value=", this.f28931a, ')');
    }
}
