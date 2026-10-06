package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v40 {
    public t40 a;
    public String b;
    public String c;
    public String d;

    public v40(t40 t40Var, String str, String str2, String str3) {
        this.a = t40Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v40)) {
            return false;
        }
        v40 v40Var = (v40) obj;
        return k71.k.b(this.a, v40Var.a) && k71.k.b(this.b, v40Var.b) && k71.k.b(this.c, v40Var.c) && k71.k.b(this.d, v40Var.d);
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
