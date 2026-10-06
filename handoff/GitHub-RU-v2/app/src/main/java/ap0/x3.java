package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x3 {
    public String a;
    public String b;

    public x3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        return k71.k.b(this.a, x3Var.a) && k71.k.b(this.b, x3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Target(id=", this.a, ", oid=", this.b, ")");
    }
}
