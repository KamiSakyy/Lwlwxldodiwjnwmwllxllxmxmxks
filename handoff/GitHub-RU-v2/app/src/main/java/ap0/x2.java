package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x2 {
    public int a;

    public x2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2) && this.a == ((x2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Repositories(totalCount=", this.a, ")");
    }
}
