package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c00 {
    public String a;
    public String b;

    public c00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) obj;
        return k71.k.b(this.a, c00Var.a) && k71.k.b(this.b, c00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Repository(id=", this.a, ", __typename=", this.b, ")");
    }
}
