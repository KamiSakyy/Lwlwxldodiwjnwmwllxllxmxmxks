package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c20 {
    public final String a;
    public final String b;

    public c20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c20)) {
            return false;
        }
        c20 c20Var = (c20) obj;
        return k71.k.b(this.a, c20Var.a) && k71.k.b(this.b, c20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Repository(id=", this.a, ", __typename=", this.b, ")");
    }
}
