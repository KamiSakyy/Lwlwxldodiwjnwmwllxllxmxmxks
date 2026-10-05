package r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f31108a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f31108a, ((a) obj).f31108a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31108a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f31108a + ')';
    }
}
