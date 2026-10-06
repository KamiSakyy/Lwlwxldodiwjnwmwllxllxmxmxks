package ow0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public l0 a;
    public u b;
    public String c;
    public String d;

    public v(l0 l0Var, u uVar, String str, String str2) {
        this.a = l0Var;
        this.b = uVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c) && k71.k.b(this.d, vVar.d);
    }

    public final int hashCode() {
        l0 l0Var = this.a;
        int hashCode = (l0Var == null ? 0 : l0Var.hashCode()) * 31;
        u uVar = this.b;
        return this.d.hashCode() + h1.i((hashCode + (uVar != null ? uVar.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSuite(workflowRun=");
        sb.append(this.a);
        sb.append(", app=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
