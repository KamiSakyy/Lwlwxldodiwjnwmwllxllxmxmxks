package c01;

import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import f1.e;
import java.time.ZonedDateTime;
import jo.f4;
import k71.k;
import l01.e0;
import l01.p0;
import l01.t0;
import x61.s;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public static final a Companion = new a();
    public static final b h;
    public final String a;
    public final p0 b;
    public final t0 c;
    public final com.github.service.models.response.a d;
    public final String e;
    public final String f;
    public final ZonedDateTime g;

    static {
        com.github.service.models.response.a.Companion.getClass();
        com.github.service.models.response.a aVar = com.github.service.models.response.a.B;
        ZonedDateTime now = ZonedDateTime.now();
        k.f(now, "now(...)");
        p0 p0Var = new p0(new e0("", "", new Avatar("", ""), false));
        ZonedDateTime now2 = ZonedDateTime.now();
        k.f(now2, "now(...)");
        h = new b("", p0Var, new t0("", "", now2, "", false, s.r, false, 0, "", false), aVar, "", "", now);
    }

    public b(String str, p0 p0Var, t0 t0Var, com.github.service.models.response.a aVar, String str2, String str3, ZonedDateTime zonedDateTime) {
        k.g(aVar, "author");
        this.a = str;
        this.b = p0Var;
        this.c = t0Var;
        this.d = aVar;
        this.e = str2;
        this.f = str3;
        this.g = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e) && k.b(this.f, bVar.f) && k.b(this.g, bVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + h1.i(h1.i(f4.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftIssue(id=");
        sb.append(this.a);
        sb.append(", projectItem=");
        sb.append(this.b);
        sb.append(", projectWithFields=");
        sb.append(this.c);
        sb.append(", author=");
        sb.append(this.d);
        sb.append(", title=");
        e.x(sb, this.e, ", bodyHTML=", this.f, ", updatedAt=");
        return h1.q(sb, this.g, ")");
    }
}
