package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tj {
    public final String a;
    public final m10.m8 b;
    public final String c;

    public tj(String str, String str2, m10.m8 m8Var) {
        this.a = str;
        this.b = m8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return k71.k.b(this.a, tjVar.a) && this.b == tjVar.b && k71.k.b(this.c, tjVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m10.m8 m8Var = this.b;
        return this.c.hashCode() + ((hashCode + (m8Var == null ? 0 : m8Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(id=");
        sb.append(this.a);
        sb.append(", copilotLicenseType=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
