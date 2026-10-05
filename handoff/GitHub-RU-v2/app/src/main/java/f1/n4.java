package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23372a;

    public final boolean equals(Object obj) {
        if (obj instanceof n4) {
            return this.f23372a == ((n4) obj).f23372a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23372a);
    }

    public final String toString() {
        int i = this.f23372a;
        return i == 0 ? "Picker" : i == 1 ? "Input" : "Unknown";
    }
}
