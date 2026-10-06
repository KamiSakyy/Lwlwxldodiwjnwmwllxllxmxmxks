package ow0;

import com.github.rudroid.copilot.h1;
import pz0.y2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 {
    public final String a;
    public final y2 b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final v g;
    public final boolean h;

    public f0(String str, y2 y2Var, String str2, int i, String str3, String str4, v vVar, boolean z) {
        this.a = str;
        this.b = y2Var;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = vVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.a, f0Var.a) && this.b == f0Var.b && k71.k.b(this.c, f0Var.c) && this.d == f0Var.d && k71.k.b(this.e, f0Var.e) && k71.k.b(this.f, f0Var.f) && k71.k.b(this.g, f0Var.g) && this.h == f0Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y2 y2Var = this.b;
        int b = a0.s0.b(this.d, h1.i((hashCode + (y2Var == null ? 0 : y2Var.hashCode())) * 31, this.c, 31), 31);
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
