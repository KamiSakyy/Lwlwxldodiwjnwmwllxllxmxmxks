package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qa0 {
    public oa0 a;
    public String b;
    public String c;

    public qa0(oa0 oa0Var, String str, String str2) {
        this.a = oa0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0Var = (qa0) obj;
        return k71.k.b(this.a, qa0Var.a) && k71.k.b(this.b, qa0Var.b) && k71.k.b(this.c, qa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(organizations=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
