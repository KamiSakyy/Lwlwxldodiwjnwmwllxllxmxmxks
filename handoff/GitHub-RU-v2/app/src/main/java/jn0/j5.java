package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j5 {
    public String a;
    public String b;

    public j5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return k71.k.b(this.a, j5Var.a) && k71.k.b(this.b, j5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Language(color=", this.a, ", name=", this.b, ")");
    }
}
