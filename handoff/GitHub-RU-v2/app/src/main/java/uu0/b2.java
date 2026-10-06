package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 {
    public int a;

    public b2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2) && this.a == ((b2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("PullRequests(totalCount=", this.a, ")");
    }
}
