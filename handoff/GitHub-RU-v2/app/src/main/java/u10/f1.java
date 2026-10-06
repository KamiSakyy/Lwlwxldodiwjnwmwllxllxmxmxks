package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1Shadow {
    public int a;

    public f1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1Shadow) && this.a == ((f1Shadow) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Comments(totalCount=", this.a, ")");
    }
}
