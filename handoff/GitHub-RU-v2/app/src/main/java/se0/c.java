package se0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import gn0.z3;
import java.time.ZonedDateTime;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements h0 {
    public final String a;
    public final String b;
    public final a c;
    public final b d;
    public final ZonedDateTime e;
    public final boolean f;
    public final String g;
    public final String h;
    public final ZonedDateTime i;
    public final boolean j;
    public final z3 k;
    public final sk0.a l;

    public c(String str, String str2, a aVar, b bVar, ZonedDateTime zonedDateTime, boolean z, String str3, String str4, ZonedDateTime zonedDateTime2, boolean z2, z3 z3Var, sk0.a aVar2) {
        k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = bVar;
        this.e = zonedDateTime;
        this.f = z;
        this.g = str3;
        this.h = str4;
        this.i = zonedDateTime2;
        this.j = z2;
        this.k = z3Var;
        this.l = aVar2;
    }

    public static c a(c cVar, String str, sk0.a aVar, int i) {
        String str2 = cVar.a;
        String str3 = cVar.b;
        a aVar2 = cVar.c;
        b bVar = cVar.d;
        ZonedDateTime zonedDateTime = cVar.e;
        boolean z = cVar.f;
        String str4 = (i & 128) != 0 ? cVar.h : "";
        ZonedDateTime zonedDateTime2 = cVar.i;
        boolean z2 = cVar.j;
        z3 z3Var = cVar.k;
        if ((i & 2048) != 0) {
            aVar = cVar.l;
        }
        k.g(str2, "__typename");
        return new c(str2, str3, aVar2, bVar, zonedDateTime, z, str, str4, zonedDateTime2, z2, z3Var, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e) && this.f == cVar.f && k.b(this.g, cVar.g) && k.b(this.h, cVar.h) && k.b(this.i, cVar.i) && this.j == cVar.j && this.k == cVar.k && k.b(this.l, cVar.l);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        int hashCode = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.d;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.e;
        int hashCode3 = (this.k.hashCode() + i.e(m0.a(this.i, h1.i(h1.i(i.e((hashCode2 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31, this.f), this.g, 31), this.h, 31), 31), 31, this.j)) * 31;
        sk0.a aVar2 = this.l;
        return hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("CommentFragment(__typename=", this.a, ", id=", this.b, ", author=");
        o.append(this.c);
        o.append(", editor=");
        o.append(this.d);
        o.append(", lastEditedAt=");
        m0.v(", includesCreatedEdit=", ", bodyHTML=", o, this.e, this.f);
        f1.e.x(o, this.g, ", body=", this.h, ", createdAt=");
        m0.v(", viewerDidAuthor=", ", authorAssociation=", o, this.i, this.j);
        o.append(this.k);
        o.append(", updatableFields=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }
}
