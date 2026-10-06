package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x2 {
    public String a;
    public String b;

    public x2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return k71.k.b(this.a, x2Var.a) && k71.k.b(this.b, x2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Deployment(id=", this.a, ", __typename=", this.b, ")");
    }
}
