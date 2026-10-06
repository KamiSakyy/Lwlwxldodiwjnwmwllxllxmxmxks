package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y00 {
    public String a;
    public String b;

    public y00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return k71.k.b(this.a, y00Var.a) && k71.k.b(this.b, y00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("MergeQueue(id=", this.a, ", __typename=", this.b, ")");
    }
}
