package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ki0 {
    public ji0 a;
    public String b;
    public String c;

    public ki0(ji0 ji0Var, String str, String str2) {
        this.a = ji0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki0)) {
            return false;
        }
        ki0 ki0Var = (ki0) obj;
        return k71.k.b(this.a, ki0Var.a) && k71.k.b(this.b, ki0Var.b) && k71.k.b(this.c, ki0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(Integer.hashCode(this.a.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(notificationThreads=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
