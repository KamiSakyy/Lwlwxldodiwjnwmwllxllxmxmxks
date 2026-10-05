package s9;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends k41.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f31765a;

    public a(int i) {
        this.f31765a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f31765a == ((a) obj).f31765a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31765a;
    }

    public final String toString() {
        return String.valueOf(this.f31765a);
    }
}
