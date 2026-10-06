package ow0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0Shadow implements aa.v0 {
    public e0 a;
    public String b;
    public String c;

    public Object a0(e0 e0Var, String str, String str2) {
        this.a = e0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0Shadow)) {
            return false;
        }
        a0Shadow a0Var = (a0Shadow) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b) && k71.k.b(this.c, a0Var.c);
    }

    public final int hashCode() {
        e0 e0Var = this.a;
        return this.c.hashCode() + h1.i((e0Var == null ? 0 : e0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
