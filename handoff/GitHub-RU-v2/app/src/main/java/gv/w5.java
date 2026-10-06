package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w5 {
    public final boolean a;

    public w5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5) && this.a == ((w5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("RefUpdateRule1(viewerCanPush=", ")", this.a);
    }
}
