package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o40 {
    public String a;
    public String b;

    public o40(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return k71.k.b(this.a, o40Var.a) && k71.k.b(this.b, o40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo(id=", this.a, ", __typename=", this.b, ")");
    }
}
