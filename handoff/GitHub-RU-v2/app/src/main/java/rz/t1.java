package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 {
    public s1 a;
    public String b;
    public String c;

    public t1(s1 s1Var, String str, String str2) {
        this.a = s1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return k71.k.b(this.a, t1Var.a) && k71.k.b(this.b, t1Var.b) && k71.k.b(this.c, t1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(recentProjects=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
