package dl0;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public String a;
    public ZonedDateTime b;
    public f0 c;
    public String d;

    public s(String str, ZonedDateTime zonedDateTime, f0 f0Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = f0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c) && k71.k.b(this.d, sVar.d);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31);
        f0 f0Var = this.c;
        return this.d.hashCode() + ((a + (f0Var == null ? 0 : f0Var.hashCode())) * 31);
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
