package wk0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p1 {
    public int a;

    public p1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && this.a == ((p1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("StarredRepositories(totalCount=", this.a, ")");
    }
}
