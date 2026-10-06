package wx0;

import java.util.ArrayList;
import pz0.ko;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r4 implements aa.h0 {
    public final String a;
    public final Integer b;
    public final String c;
    public final ko d;
    public final ArrayList e;
    public final String f;

    public r4(String str, Integer num, String str2, ko koVar, ArrayList arrayList, String str3) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = koVar;
        this.e = arrayList;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return this.a.equals(r4Var.a) && k71.k.b(this.b, r4Var.b) && this.c.equals(r4Var.c) && this.d == r4Var.d && this.e.equals(r4Var.e) && this.f.equals(r4Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.f.hashCode() + no.a.b(this.e, (this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (num == null ? 0 : num.hashCode())) * 31, this.c, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder r = com.github.rudroid.copilot.h1.r(this.b, "ProjectV2SingleSelectFieldFragment(id=", this.a, ", databaseId=", ", name=");
        r.append(this.c);
        r.append(", dataType=");
        r.append(this.d);
        r.append(", options=");
        r.append(this.e);
        r.append(", __typename=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
