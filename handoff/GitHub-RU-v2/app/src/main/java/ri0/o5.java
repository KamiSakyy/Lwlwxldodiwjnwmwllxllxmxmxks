package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o5 {
    public final boolean a;

    public o5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5) && this.a == ((o5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("RefUpdateRule1(viewerCanPush=", ")", this.a);
    }
}
