package vn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w2 {
    public String a;
    public String b;

    public w2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return k71.k.b(this.a, w2Var.a) && k71.k.b(this.b, w2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner(id=", this.a, ", login=", this.b, ")");
    }
}
