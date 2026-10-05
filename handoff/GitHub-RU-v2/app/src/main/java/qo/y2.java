package qo;

import m10.ih0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y2 {
    public final String a;
    public final String b;
    public final String c;
    public final ih0 d;
    public final boolean e;
    public final z2 f;

    public y2(String str, String str2, String str3, ih0 ih0Var, boolean z, z2 z2Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ih0Var;
        this.e = z;
        this.f = z2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return k71.k.b(this.a, y2Var.a) && k71.k.b(this.b, y2Var.b) && k71.k.b(this.c, y2Var.c) && this.d == y2Var.d && this.e == y2Var.e && k71.k.b(this.f, y2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + x.i.e((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnWorkflow(id=", this.a, ", name=", this.b, ", url=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(", hasWorkflowDispatchTriggerForBranch=");
        o.append(this.e);
        o.append(", runs=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
