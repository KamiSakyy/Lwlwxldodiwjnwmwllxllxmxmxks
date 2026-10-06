package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d5 {
    public String a;
    public String b;

    public d5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return k71.k.b(this.a, d5Var.a) && k71.k.b(this.b, d5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Language(color=", this.a, ", name=", this.b, ")");
    }
}
