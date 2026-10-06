package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w7 {
    public String a;
    public String b;

    public w7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return k71.k.b(this.a, w7Var.a) && k71.k.b(this.b, w7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo1(id=", this.a, ", __typename=", this.b, ")");
    }
}
