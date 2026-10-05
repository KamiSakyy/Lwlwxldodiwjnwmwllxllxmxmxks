package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ti0 {
    public final m10.m8 a;
    public final String b;
    public final String c;

    public ti0(String str, String str2, m10.m8 m8Var) {
        this.a = m8Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti0)) {
            return false;
        }
        ti0 ti0Var = (ti0) obj;
        return this.a == ti0Var.a && k71.k.b(this.b, ti0Var.b) && k71.k.b(this.c, ti0Var.c);
    }

    public final int hashCode() {
        m10.m8 m8Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((m8Var == null ? 0 : m8Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(copilotLicenseType=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
