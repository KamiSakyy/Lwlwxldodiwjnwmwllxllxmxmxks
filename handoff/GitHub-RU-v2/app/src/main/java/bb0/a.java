package bb0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.MergeCheckStatus;
import hc0.j2;
import sy.rShadow;
import z70.d4;
import z70.j5;
import z70.k5;
import z70.w4;
import z70.x4;
import z70.z3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements yz0.l {
    public String a;
    public String b;
    public String c;
    public MergeCheckStatus d;
    public String e;
    public String f;
    public String g;
    public Boolean h;
    public Integer i;

    public a(String str, String str2, String str3, MergeCheckStatus mergeCheckStatus, String str4, String str5, String str6, Boolean bool, Integer num) {
        k71.k.g(mergeCheckStatus, "status");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = mergeCheckStatus;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = bool;
        this.i = num;
    }

    public final String a() {
        return this.e;
    }

    public final Boolean b() {
        return this.h;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.c;
    }

    public final MergeCheckStatus e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c) && this.d == aVar.d && k71.k.b(this.e, aVar.e) && k71.k.b(this.f, aVar.f) && k71.k.b(this.g, aVar.g) && k71.k.b(this.h, aVar.h) && k71.k.b(this.i, aVar.i);
    }

    public final Integer getDuration() {
        return this.i;
    }

    public final String getId() {
        return this.a;
    }

    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int i2 = h1.i(h1.i(h1.i((this.d.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31)) * 31, this.e, 31), this.f, 31), this.g, 31);
        Boolean bool = this.h;
        int hashCode = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.i;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("ApolloCheckRun(id=", this.a, ", name=", this.b, ", workflow=");
        o.append(this.c);
        o.append(", status=");
        o.append(this.d);
        o.append(", permalink=");
        f1.e.x(o, this.e, ", logoUrl=", this.f, ", summary=");
        o.append(this.g);
        o.append(", isRequired=");
        o.append(this.h);
        o.append(", duration=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(x4 x4Var) {
        this(r2, r3, null, r5, r6, r7, r0 == null ? "" : r0, Boolean.valueOf(x4Var.g), null);
        k71.k.g(x4Var, "mergeBoxStatusContext");
        String str = x4Var.a;
        String str2 = x4Var.b;
        MergeCheckStatus g = r.g(y9.a.K(x4Var.c));
        String str3 = x4Var.f;
        String str4 = str3 == null ? "" : str3;
        String str5 = x4Var.d;
        String str6 = str5 == null ? "" : str5;
        String str7 = x4Var.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(w4 w4Var) {
        this(r2, r3, r4, r5, r6, r7, r0 == null ? "" : r0, Boolean.valueOf(w4Var.h), Integer.valueOf(w4Var.d));
        String str;
        j5 j5Var;
        k71.k.g(w4Var, "mergeBoxCheckRun");
        String str2 = w4Var.a;
        String str3 = w4Var.c;
        d4 d4Var = w4Var.g;
        k5 k5Var = d4Var.a;
        String str4 = (k5Var == null || (j5Var = k5Var.a) == null) ? null : j5Var.a;
        j2 j2Var = w4Var.b;
        MergeCheckStatus h = r.h(j2Var == null ? j2.t : j2Var);
        String str5 = w4Var.f;
        z3 z3Var = d4Var.b;
        String str6 = (z3Var == null || (str = z3Var.a) == null) ? "" : str;
        String str7 = w4Var.e;
    }
}
