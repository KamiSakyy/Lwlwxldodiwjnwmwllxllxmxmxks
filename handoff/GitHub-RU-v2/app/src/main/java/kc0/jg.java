package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jg {
    public boolean a;

    public jg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg) && this.a == ((jg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("PageInfo(hasNextPage=", ")", this.a);
    }
}
