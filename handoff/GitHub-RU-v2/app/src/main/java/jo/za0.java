package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class za0 {
    public String a;
    public String b;

    public za0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za0)) {
            return false;
        }
        za0 za0Var = (za0) obj;
        return k71.k.b(this.a, za0Var.a) && k71.k.b(this.b, za0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo(id=", this.a, ", __typename=", this.b, ")");
    }
}
