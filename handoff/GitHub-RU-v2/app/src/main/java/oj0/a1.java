package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 {
    public int a;

    public a1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && this.a == ((a1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Refs(totalCount=", this.a, ")");
    }
}
