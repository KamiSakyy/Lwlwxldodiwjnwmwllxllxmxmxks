package wl0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.MergeCheckStatus;
import gn0.l2;
import ri0.j5;
import ri0.k4;
import ri0.k5;
import ri0.o4;
import ri0.w5;
import ri0.x5;
import sy.q;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements yz0.l {
    public final String a;
    public final String b;
    public final String c;
    public final MergeCheckStatus d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Integer i;

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

    @Override // yz0.l
    public final String a() {
        return this.e;
    }

    @Override // yz0.l
    public final Boolean b() {
        return this.h;
    }

    @Override // yz0.l
    public final String c() {
        return this.f;
    }

    @Override // yz0.l
    public final String d() {
        return this.c;
    }

    @Override // yz0.l
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

    @Override // yz0.l
    public final Integer getDuration() {
        return this.i;
    }

    @Override // yz0.l
    public final String getId() {
        return this.a;
    }

    @Override // yz0.l
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
    public a(k5 k5Var) {
        this(r2, r3, null, r5, r6, r7, r0 == null ? "" : r0, Boolean.valueOf(k5Var.g), null);
        k71.k.g(k5Var, "mergeBoxStatusContext");
        String str = k5Var.a;
        String str2 = k5Var.b;
        MergeCheckStatus e = k21.f.e(q.o(k5Var.c));
        String str3 = k5Var.f;
        String str4 = str3 == null ? "" : str3;
        String str5 = k5Var.d;
        String str6 = str5 == null ? "" : str5;
        String str7 = k5Var.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(j5 j5Var) {
        this(r2, r3, r4, r5, r6, r7, r0 == null ? "" : r0, Boolean.valueOf(j5Var.h), Integer.valueOf(j5Var.d));
        String str;
        w5 w5Var;
        k71.k.g(j5Var, "mergeBoxCheckRun");
        String str2 = j5Var.a;
        String str3 = j5Var.c;
        o4 o4Var = j5Var.g;
        x5 x5Var = o4Var.a;
        String str4 = (x5Var == null || (w5Var = x5Var.a) == null) ? null : w5Var.a;
        l2 l2Var = j5Var.b;
        MergeCheckStatus f = k21.f.f(l2Var == null ? l2.t : l2Var);
        String str5 = j5Var.f;
        k4 k4Var = o4Var.b;
        String str6 = (k4Var == null || (str = k4Var.a) == null) ? "" : str;
        String str7 = j5Var.e;
    }
    public Object G(Object p1) { return null; }
}
