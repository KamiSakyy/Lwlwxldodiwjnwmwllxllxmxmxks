package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 {
    public final int a;

    public f1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.a == ((f1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Comments(totalCount=", this.a, ")");
    }
}
