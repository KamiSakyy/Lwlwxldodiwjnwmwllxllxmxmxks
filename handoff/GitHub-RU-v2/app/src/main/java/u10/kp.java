package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kp {
    public boolean a;

    public kp(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp) && this.a == ((kp) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("Signature(isValid=", ")", this.a);
    }
}
