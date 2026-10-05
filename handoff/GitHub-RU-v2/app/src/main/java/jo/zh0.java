package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zh0 implements aa.v0 {
    public final bi0 a;
    public final ai0 b;
    public final String c;
    public final String d;

    public zh0(bi0 bi0Var, ai0 ai0Var, String str, String str2) {
        this.a = bi0Var;
        this.b = ai0Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh0)) {
            return false;
        }
        zh0 zh0Var = (zh0) obj;
        return k71.k.b(this.a, zh0Var.a) && k71.k.b(this.b, zh0Var.b) && k71.k.b(this.c, zh0Var.c) && k71.k.b(this.d, zh0Var.d);
    }

    public final int hashCode() {
        bi0 bi0Var = this.a;
        int hashCode = (bi0Var == null ? 0 : bi0Var.hashCode()) * 31;
        ai0 ai0Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (ai0Var != null ? ai0Var.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(user=");
        sb.append(this.a);
        sb.append(", organization=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
