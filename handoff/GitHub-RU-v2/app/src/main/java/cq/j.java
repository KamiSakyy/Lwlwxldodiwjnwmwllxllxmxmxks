package cq;

import java.util.ArrayList;
import m10.m8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.h0 {
    public m8 a;
    public String b;
    public ArrayList c;

    public j(m8 m8Var, String str, ArrayList arrayList) {
        this.a = m8Var;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b.equals(jVar.b) && this.c.equals(jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatModelPlanFragment(copilotLicenseType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", models=");
        return com.github.rudroid.m0.j(")", sb, this.c);
    }
}
