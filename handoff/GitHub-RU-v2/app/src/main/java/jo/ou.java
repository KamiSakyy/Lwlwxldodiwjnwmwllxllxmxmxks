package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ou {
    public final boolean a;

    public ou(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou) && this.a == ((ou) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("Signature(isValid=", ")", this.a);
    }
}
