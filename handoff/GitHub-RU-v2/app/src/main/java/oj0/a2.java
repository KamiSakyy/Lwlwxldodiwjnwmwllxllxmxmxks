package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a2 {
    public final String a;
    public final String b;

    public a2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return k71.k.b(this.a, a2Var.a) && k71.k.b(this.b, a2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner1(id=", this.a, ", login=", this.b, ")");
    }
}
