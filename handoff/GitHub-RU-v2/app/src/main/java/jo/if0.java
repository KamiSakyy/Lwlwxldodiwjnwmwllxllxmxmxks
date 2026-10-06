package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class if0 {
    public String a;
    public gf0 b;
    public String c;

    public if0(String str, gf0 gf0Var, String str2) {
        this.a = str;
        this.b = gf0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if0)) {
            return false;
        }
        if0 if0Var = (if0) obj;
        return k71.k.b(this.a, if0Var.a) && k71.k.b(this.b, if0Var.b) && k71.k.b(this.c, if0Var.c);
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
