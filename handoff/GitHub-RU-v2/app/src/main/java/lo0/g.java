package lo0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final String a;
    public final String b;
    public final String c;
    public final ZonedDateTime d;
    public final b e;
    public final i f;
    public final h g;

    public g(String str, String str2, String str3, ZonedDateTime zonedDateTime, b bVar, i iVar, h hVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = bVar;
        this.f = iVar;
        this.g = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d) && k71.k.b(this.e, gVar.e) && k71.k.b(this.f, gVar.f) && k71.k.b(this.g, gVar.g);
    }

    public final int hashCode() {
        int a = m0.a(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
        b bVar = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((a + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnDraftIssue(id=", this.a, ", bodyHTML=", this.b, ", title=");
        h1.A(this.c, ", updatedAt=", ", creator=", o, this.d);
        o.append(this.e);
        o.append(", projectsV2=");
        o.append(this.f);
        o.append(", projectV2Items=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
