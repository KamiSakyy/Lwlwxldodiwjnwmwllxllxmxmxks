package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t3 {
    public final int a;

    public t3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3) && this.a == ((t3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Repositories(totalCount=", this.a, ")");
    }
}
