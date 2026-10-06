package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x10 {
    public String a;
    public String b;

    public x10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x10)) {
            return false;
        }
        x10 x10Var = (x10) obj;
        return k71.k.b(this.a, x10Var.a) && k71.k.b(this.b, x10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Ref(__typename=", this.a, ", id=", this.b, ")");
    }
}
