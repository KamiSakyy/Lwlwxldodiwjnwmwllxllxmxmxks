package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j7 {
    public final int a;

    public j7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7) && this.a == ((j7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Comments(totalCount=", this.a, ")");
    }
}
