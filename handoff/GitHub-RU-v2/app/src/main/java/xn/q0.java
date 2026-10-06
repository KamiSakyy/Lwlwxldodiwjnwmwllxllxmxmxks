package xn;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 {
    public e1 a;
    public String b;
    public ArrayList c;

    public q0(e1 e1Var, String str, ArrayList arrayList) {
        this.a = e1Var;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.a == q0Var.a && this.b.equals(q0Var.b) && this.c.equals(q0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatModelPlan(copilotLicenseType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", models=");
        return com.github.rudroid.m0.j(")", sb, this.c);
    }
}
