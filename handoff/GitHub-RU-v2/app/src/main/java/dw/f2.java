package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f2 {
    public int a;

    public f2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2) && this.a == ((f2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Refs(totalCount=", this.a, ")");
    }
}
