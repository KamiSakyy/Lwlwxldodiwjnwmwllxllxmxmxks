package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public int a;

    public a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Followers(totalCount=", this.a, ")");
    }
    public Object O(Object p1) { return null; }
}
