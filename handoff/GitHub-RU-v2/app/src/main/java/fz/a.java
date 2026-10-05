package fz;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.MergeCheckStatus;
import com.google.android.gms.internal.measurement.b4;
import gv.e6;
import gv.f6;
import gv.t5;
import gv.u4;
import gv.u5;
import gv.y4;
import m10.t3;

/* loaded from: /home/user/work/p/classes3.dex */
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
    public a(u5 u5Var) {
        this(r2, r3, null, r5, r6, r7, r0 == null ? "" : r0, Boolean.valueOf(u5Var.g), null);
        k71.k.g(u5Var, "mergeBoxStatusContext");
        String str = u5Var.a;
        String str2 = u5Var.b;
        MergeCheckStatus d = b31.b.d(b4.o0(u5Var.c));
        String str3 = u5Var.f;
        String str4 = str3 == null ? "" : str3;
        String str5 = u5Var.d;
        String str6 = str5 == null ? "" : str5;
        String str7 = u5Var.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(t5 t5Var) {
        this(r2, r3, r4, r5, r6, r7, r0 == null ? "" : r0, Boolean.valueOf(t5Var.h), Integer.valueOf(t5Var.d));
        String str;
        e6 e6Var;
        k71.k.g(t5Var, "mergeBoxCheckRun");
        String str2 = t5Var.a;
        String str3 = t5Var.c;
        y4 y4Var = t5Var.g;
        f6 f6Var = y4Var.a;
        String str4 = (f6Var == null || (e6Var = f6Var.a) == null) ? null : e6Var.a;
        t3 t3Var = t5Var.b;
        MergeCheckStatus e = b31.b.e(t3Var == null ? t3.t : t3Var);
        String str5 = t5Var.f;
        u4 u4Var = y4Var.b;
        String str6 = (u4Var == null || (str = u4Var.a) == null) ? "" : str;
        String str7 = t5Var.e;
    }
}
