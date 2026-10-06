package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xi {
    public boolean a;

    public xi(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi) && this.a == ((xi) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("PageInfo(hasNextPage=", ")", this.a);
    }
}
