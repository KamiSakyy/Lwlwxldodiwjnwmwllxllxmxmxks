package am0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 {
    public final String a;
    public final String b;
    public final int c;
    public final p0 d;
    public final b e;

    public a0(String str, String str2, int i, p0 p0Var, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = p0Var;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b) && this.c == a0Var.c && k71.k.b(this.d, a0Var.d) && k71.k.b(this.e, a0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + a0.s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnWorkflowRun(id=", this.a, ", url=", this.b, ", runNumber=");
        o.append(this.c);
        o.append(", workflow=");
        o.append(this.d);
        o.append(", checkSuite=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
