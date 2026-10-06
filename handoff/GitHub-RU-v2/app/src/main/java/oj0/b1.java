package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 {
    public int a;

    public b1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && this.a == ((b1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Releases(totalCount=", this.a, ")");
    }
}
