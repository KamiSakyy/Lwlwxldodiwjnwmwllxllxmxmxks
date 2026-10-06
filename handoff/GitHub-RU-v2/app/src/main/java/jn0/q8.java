package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q8 {
    public final String a;
    public final String b;

    public q8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return k71.k.b(this.a, q8Var.a) && k71.k.b(this.b, q8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo1(id=", this.a, ", __typename=", this.b, ")");
    }
}
