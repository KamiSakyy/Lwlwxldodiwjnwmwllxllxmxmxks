package fw0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 {
    public int a;

    public y0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && this.a == ((y0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Items(totalCount=", this.a, ")");
    }
}
