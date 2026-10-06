package ow0;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w {
    public String a;
    public ZonedDateTime b;
    public j0 c;
    public String d;

    public w(String str, ZonedDateTime zonedDateTime, j0 j0Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = j0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b) && k71.k.b(this.c, wVar.c) && k71.k.b(this.d, wVar.d);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31);
        j0 j0Var = this.c;
        return this.d.hashCode() + ((a + (j0Var == null ? 0 : j0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder s = h1.s("Commit(id=", this.a, ", committedDate=", ", statusCheckRollup=", this.b);
        s.append(this.c);
        s.append(", __typename=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
