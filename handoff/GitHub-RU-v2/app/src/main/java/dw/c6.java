package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c6 {
    public final String a;
    public final String b;

    public c6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return k71.k.b(this.a, c6Var.a) && k71.k.b(this.b, c6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Parent(id=", this.a, ", __typename=", this.b, ")");
    }
}
