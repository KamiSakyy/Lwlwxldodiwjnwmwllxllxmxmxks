package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g2 {
    public int a;

    public g2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2) && this.a == ((g2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Releases(totalCount=", this.a, ")");
    }
}
