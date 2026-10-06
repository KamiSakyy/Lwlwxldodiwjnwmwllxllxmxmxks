package fw0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 {
    public int a;

    public k1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && this.a == ((k1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Organizations(totalCount=", this.a, ")");
    }
}
