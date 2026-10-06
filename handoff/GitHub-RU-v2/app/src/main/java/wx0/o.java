package wx0;

import pz0.ko;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements aa.h0 {
    public String a;
    public Integer b;
    public String c;
    public ko d;
    public String e;

    public o(String str, Integer num, String str2, ko koVar, String str3) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = koVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c) && this.d == oVar.d && k71.k.b(this.e, oVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (num == null ? 0 : num.hashCode())) * 31, this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = com.github.rudroid.copilot.h1.r(this.b, "ProjectV2FieldFragment(id=", this.a, ", databaseId=", ", name=");
        r.append(this.c);
        r.append(", dataType=");
        r.append(this.d);
        r.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(r, this.e, ")");
    }
}
