package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y20 {
    public String a;
    public String b;

    public y20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y20)) {
            return false;
        }
        y20 y20Var = (y20) obj;
        return k71.k.b(this.a, y20Var.a) && k71.k.b(this.b, y20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("MergeQueue(id=", this.a, ", __typename=", this.b, ")");
    }
}
