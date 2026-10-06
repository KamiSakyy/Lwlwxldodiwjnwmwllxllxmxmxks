package iw0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import k71.k;
import pz0.y80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements h0 {
    public String a;
    public String b;
    public a c;
    public b d;
    public y80 e;
    public ZonedDateTime f;

    public c(String str, String str2, a aVar, b bVar, y80 y80Var, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = bVar;
        this.e = y80Var;
        this.f = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && this.e == cVar.e && k.b(this.f, cVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        int hashCode = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("UserBlockedEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", userSubject=");
        o.append(this.d);
        o.append(", blockDuration=");
        o.append(this.e);
        o.append(", createdAt=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
