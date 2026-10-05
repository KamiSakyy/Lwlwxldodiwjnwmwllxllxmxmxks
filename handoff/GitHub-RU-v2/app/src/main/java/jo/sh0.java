package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sh0 implements aa.v0 {
    public final wh0 a;
    public final String b;
    public final String c;

    public sh0(wh0 wh0Var, String str, String str2) {
        this.a = wh0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh0)) {
            return false;
        }
        sh0 sh0Var = (sh0) obj;
        return k71.k.b(this.a, sh0Var.a) && k71.k.b(this.b, sh0Var.b) && k71.k.b(this.c, sh0Var.c);
    }

    public final int hashCode() {
        wh0 wh0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((wh0Var == null ? 0 : wh0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(user=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
