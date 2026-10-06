package tz;

import m10.pt;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j4 implements aa.h0 {
    public final String a;
    public final Integer b;
    public final String c;
    public final pt d;
    public final h4 e;
    public final String f;

    public j4(String str, Integer num, String str2, pt ptVar, h4 h4Var, String str3) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = ptVar;
        this.e = h4Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return k71.k.b(this.a, j4Var.a) && k71.k.b(this.b, j4Var.b) && k71.k.b(this.c, j4Var.c) && this.d == j4Var.d && k71.k.b(this.e, j4Var.e) && k71.k.b(this.f, j4Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (num == null ? 0 : num.hashCode())) * 31, this.c, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = com.github.rudroid.copilot.h1.r(this.b, "ProjectV2IterationFieldFragment(id=", this.a, ", databaseId=", ", name=");
        r.append(this.c);
        r.append(", dataType=");
        r.append(this.d);
        r.append(", configuration=");
        r.append(this.e);
        r.append(", __typename=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
