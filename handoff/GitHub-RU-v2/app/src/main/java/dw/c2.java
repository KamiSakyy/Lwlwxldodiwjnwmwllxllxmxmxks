package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c2 {
    public int a;

    public c2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2) && this.a == ((c2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("ProjectsV2(totalCount=", this.a, ")");
    }
}
