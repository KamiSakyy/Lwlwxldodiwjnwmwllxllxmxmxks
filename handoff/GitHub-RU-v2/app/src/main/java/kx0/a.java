package kx0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.MergeCheckStatus;
import com.google.android.gms.internal.measurement.b4;
import pz0.y2;
import xt0.h5;
import xt0.i5;
import xt0.k4;
import xt0.o4;
import xt0.s5;
import xt0.t5;

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
    public a(i5 i5Var) {
        this(r2, r3, null, r5, r6, r7, r0 == null ? "" : r0, Boolean.valueOf(i5Var.g), null);
        k71.k.g(i5Var, "mergeBoxStatusContext");
        String str = i5Var.a;
        String str2 = i5Var.b;
        MergeCheckStatus d = b4.d(com.google.common.util.concurrent.a.W(i5Var.c));
        String str3 = i5Var.f;
        String str4 = str3 == null ? "" : str3;
        String str5 = i5Var.d;
        String str6 = str5 == null ? "" : str5;
        String str7 = i5Var.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(h5 h5Var) {
        this(r2, r3, r4, r5, r6, r7, r0 == null ? "" : r0, Boolean.valueOf(h5Var.h), Integer.valueOf(h5Var.d));
        String str;
        s5 s5Var;
        k71.k.g(h5Var, "mergeBoxCheckRun");
        String str2 = h5Var.a;
        String str3 = h5Var.c;
        o4 o4Var = h5Var.g;
        t5 t5Var = o4Var.a;
        String str4 = (t5Var == null || (s5Var = t5Var.a) == null) ? null : s5Var.a;
        y2 y2Var = h5Var.b;
        MergeCheckStatus e = b4.e(y2Var == null ? y2.t : y2Var);
        String str5 = h5Var.f;
        k4 k4Var = o4Var.b;
        String str6 = (k4Var == null || (str = k4Var.a) == null) ? "" : str;
        String str7 = h5Var.e;
    }
    public Object f(Object p1) { return null; }
    public Object i0(Object p1) { return null; }
}
