package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c6 {
    public final int a;

    public c6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6) && this.a == ((c6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Followers(totalCount=", this.a, ")");
    }
}
