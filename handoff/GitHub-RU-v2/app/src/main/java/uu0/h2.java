package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h2 {
    public int a;

    public h2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2) && this.a == ((h2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Watchers(totalCount=", this.a, ")");
    }
}
