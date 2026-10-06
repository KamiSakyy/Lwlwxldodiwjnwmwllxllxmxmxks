package dl0;

import com.github.rudroid.copilot.h1;
import gn0.l2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 {
    public String a;
    public l2 b;
    public String c;
    public int d;
    public String e;
    public String f;
    public r g;
    public boolean h;

    public b0(String str, l2 l2Var, String str2, int i, String str3, String str4, r rVar, boolean z) {
        this.a = str;
        this.b = l2Var;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = rVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && this.b == b0Var.b && k71.k.b(this.c, b0Var.c) && this.d == b0Var.d && k71.k.b(this.e, b0Var.e) && k71.k.b(this.f, b0Var.f) && k71.k.b(this.g, b0Var.g) && this.h == b0Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l2 l2Var = this.b;
        int b = a0.s0.b(this.d, h1.i((hashCode + (l2Var == null ? 0 : l2Var.hashCode())) * 31, this.c, 31), 31);
        String str = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + h1.i((b + (str != null ? str.hashCode() : 0)) * 31, this.f, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCheckRun(id=");
        sb.append(this.a);
        sb.append(", conclusion=");
        sb.append(this.b);
        sb.append(", name=");
        a0.s0.w(this.d, this.c, ", duration=", ", summary=", sb);
        f1.e.x(sb, this.e, ", permalink=", this.f, ", checkSuite=");
        sb.append(this.g);
        sb.append(", isRequired=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
