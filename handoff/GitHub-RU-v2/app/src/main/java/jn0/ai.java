package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ai {
    public boolean a;

    public ai(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai) && this.a == ((ai) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("PageInfo(hasNextPage=", ")", this.a);
    }
}
