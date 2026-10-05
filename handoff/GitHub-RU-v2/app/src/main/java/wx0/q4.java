package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q4 {
    public final String a;
    public final i5 b;

    public q4(String str, i5 i5Var) {
        this.a = str;
        this.b = i5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return k71.k.b(this.a, q4Var.a) && k71.k.b(this.b, q4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Option(__typename=" + this.a + ", singleSelectOptionFragment=" + this.b + ")";
    }
}
