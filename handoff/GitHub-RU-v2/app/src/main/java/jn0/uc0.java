package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uc0 {
    public String a;
    public sc0 b;
    public String c;

    public uc0(String str, sc0 sc0Var, String str2) {
        this.a = str;
        this.b = sc0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        return k71.k.b(this.a, uc0Var.a) && k71.k.b(this.b, uc0Var.b) && k71.k.b(this.c, uc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
