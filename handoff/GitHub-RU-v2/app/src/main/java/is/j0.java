package is;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 {
    public int a;

    public j0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.a == ((j0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Comments(totalCount=", this.a, ")");
    }
}
