package ea0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 {
    public int a;

    public m1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && this.a == ((m1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("ProjectsV2(totalCount=", this.a, ")");
    }
}
