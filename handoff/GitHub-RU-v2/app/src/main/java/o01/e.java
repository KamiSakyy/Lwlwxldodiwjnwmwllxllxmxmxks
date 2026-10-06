package o01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import jo.f4;
import k71.k;
import yz0.x2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;
    public final String b;
    public final com.github.service.models.response.a c;
    public final ZonedDateTime d;
    public final x2 e;

    public e(String str, String str2, com.github.service.models.response.a aVar, ZonedDateTime zonedDateTime, x2 x2Var) {
        k.g(zonedDateTime, "modifiedAt");
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = zonedDateTime;
        this.e = x2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && k.b(this.c, eVar.c) && k.b(this.d, eVar.d) && k.b(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + m0.a(this.d, f4.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ReleaseDiscussionComment(id=", this.a, ", bodyText=", this.b, ", author=");
        o.append(this.c);
        o.append(", modifiedAt=");
        o.append(this.d);
        o.append(", minimizedState=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
    public Object c(Object p1, Object p2, Object p3) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
