package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h9 {
    public f9 a;
    public String b;
    public String c;
    public String d;

    public h9(f9 f9Var, String str, String str2, String str3) {
        this.a = f9Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj;
        return k71.k.b(this.a, h9Var.a) && k71.k.b(this.b, h9Var.b) && k71.k.b(this.c, h9Var.c) && k71.k.b(this.d, h9Var.d);
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
