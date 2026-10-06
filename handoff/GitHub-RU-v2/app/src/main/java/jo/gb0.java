package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gb0 {
    public eb0 a;
    public String b;
    public String c;
    public String d;

    public gb0(eb0 eb0Var, String str, String str2, String str3) {
        this.a = eb0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb0)) {
            return false;
        }
        gb0 gb0Var = (gb0) obj;
        return k71.k.b(this.a, gb0Var.a) && k71.k.b(this.b, gb0Var.b) && k71.k.b(this.c, gb0Var.c) && k71.k.b(this.d, gb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(owner=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
