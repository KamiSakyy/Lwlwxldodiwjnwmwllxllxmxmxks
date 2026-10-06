package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b5 {
    public boolean a;

    public b5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5) && this.a == ((b5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("RefUpdateRule1(viewerCanPush=", ")", this.a);
    }
}
