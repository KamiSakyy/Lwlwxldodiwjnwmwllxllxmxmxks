package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t4 {
    public String a;
    public f4 b;
    public String c;

    public t4(String str, f4 f4Var, String str2) {
        this.a = str;
        this.b = f4Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return k71.k.b(this.a, t4Var.a) && k71.k.b(this.b, t4Var.b) && k71.k.b(this.c, t4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node5(id=");
        sb.append(this.a);
        sb.append(", commit=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
