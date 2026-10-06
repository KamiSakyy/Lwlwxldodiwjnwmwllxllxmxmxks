package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l80 {
    public String a;
    public String b;

    public l80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l80)) {
            return false;
        }
        l80 l80Var = (l80) obj;
        return k71.k.b(this.a, l80Var.a) && k71.k.b(this.b, l80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo(id=", this.a, ", __typename=", this.b, ")");
    }
}
