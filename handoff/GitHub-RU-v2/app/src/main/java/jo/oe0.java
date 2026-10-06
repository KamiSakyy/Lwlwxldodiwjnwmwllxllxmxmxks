package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oe0 {
    public boolean a;

    public oe0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oe0) && this.a == ((oe0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("RefUpdateRule(viewerCanPush=", ")", this.a);
    }
}
