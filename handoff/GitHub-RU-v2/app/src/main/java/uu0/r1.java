package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 {
    public final int a;

    public r1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && this.a == ((r1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Issues(totalCount=", this.a, ")");
    }
}
