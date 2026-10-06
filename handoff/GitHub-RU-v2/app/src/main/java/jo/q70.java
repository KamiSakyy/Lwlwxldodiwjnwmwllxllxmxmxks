package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q70 implements aaShadow.v0 {
    public final u70 a;
    public final String b;
    public final String c;

    public q70(u70 u70Var, String str, String str2) {
        this.a = u70Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q70)) {
            return false;
        }
        q70 q70Var = (q70) obj;
        return k71.k.b(this.a, q70Var.a) && k71.k.b(this.b, q70Var.b) && k71.k.b(this.c, q70Var.c);
    }

    public final int hashCode() {
        u70 u70Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((u70Var == null ? 0 : u70Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repositoryOwner=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
