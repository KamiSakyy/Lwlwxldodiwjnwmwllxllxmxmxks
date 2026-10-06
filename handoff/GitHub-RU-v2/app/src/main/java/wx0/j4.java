package wx0;

import pz0.ko;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j4 implements aa.h0 {
    public String a;
    public Integer b;
    public String c;
    public ko d;
    public h4 e;
    public String f;

    public j4(String str, Integer num, String str2, ko koVar, h4 h4Var, String str3) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = koVar;
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
