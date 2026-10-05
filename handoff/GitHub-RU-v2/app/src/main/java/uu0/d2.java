package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d2 {
    public final int a;

    public d2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && this.a == ((d2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Refs(totalCount=", this.a, ")");
    }
}
