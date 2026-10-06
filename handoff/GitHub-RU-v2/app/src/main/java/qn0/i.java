package qn0;

import java.time.ZonedDateTime;
import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public final String a;
    public final String b;
    public final String c;
    public final ZonedDateTime d;
    public final n30 e;

    public i(String str, String str2, String str3, ZonedDateTime zonedDateTime, n30 n30Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = n30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c) && k71.k.b(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.e.hashCode() + com.github.rudroid.m0.a(this.d, (i + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnRequiredStatusCheck(id=", this.a, ", context=", this.b, ", description=");
        com.github.rudroid.copilot.h1.A(this.c, ", createdAt=", ", state=", o, this.d);
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
