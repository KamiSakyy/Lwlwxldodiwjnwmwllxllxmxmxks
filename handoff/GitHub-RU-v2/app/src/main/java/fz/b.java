package fz;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.type.CommentAuthorAssociation;
import java.time.ZonedDateTime;
import jo.f4Shadow;
import v8.l0;
import yz0.q0;
import yz0.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements s {
    public String a;
    public String b;
    public com.github.service.models.response.a c;
    public com.github.service.models.response.a d;
    public ZonedDateTime e;
    public boolean f;
    public ZonedDateTime g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public String l;
    public q0 m;
    public CommentAuthorAssociation n;

    public b(ar.c cVar, String str, q0 q0Var) {
        vx.a aVar;
        k71.k.g(cVar, "commentFragment");
        k71.k.g(str, "url");
        String str2 = cVar.b;
        ar.a aVar2 = cVar.c;
        String str3 = (aVar2 == null || (aVar = aVar2.b.g) == null) ? "" : aVar.a;
        com.github.service.models.response.a e = l0.e(aVar2 != null ? aVar2.b : null);
        ar.b bVar = cVar.d;
        com.github.service.models.response.a e2 = l0.e(bVar != null ? bVar.b : null);
        ZonedDateTime zonedDateTime = cVar.i;
        boolean z = cVar.f;
        ZonedDateTime zonedDateTime2 = cVar.e;
        String str4 = cVar.g;
        String str5 = cVar.h;
        boolean z2 = cVar.j;
        mx.a aVar3 = cVar.l;
        boolean z3 = aVar3 != null ? aVar3.b : false;
        r01.a aVar4 = CommentAuthorAssociation.Companion;
        String str6 = cVar.k.r;
        aVar4.getClass();
        CommentAuthorAssociation a = r01.a.a(str6);
        k71.k.g(a, "authorAssociation");
        this.a = str2;
        this.b = str3;
        this.c = e;
        this.d = e2;
        this.e = zonedDateTime;
        this.f = z;
        this.g = zonedDateTime2;
        this.h = str4;
        this.i = str5;
        this.j = z2;
        this.k = z3;
        this.l = str;
        this.m = q0Var;
        this.n = a;
    }

    public final boolean a() {
        return this.j;
    }

    public final String b() {
        return this.b;
    }

    public final com.github.service.models.response.a c() {
        return this.d;
    }

    public final String d() {
        return this.h;
    }

    public final com.github.service.models.response.a e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d) && k71.k.b(this.e, bVar.e) && this.f == bVar.f && k71.k.b(this.g, bVar.g) && k71.k.b(this.h, bVar.h) && k71.k.b(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k && k71.k.b(this.l, bVar.l) && k71.k.b(this.m, bVar.m) && this.n == bVar.n;
    }

    public final CommentAuthorAssociation f() {
        return this.n;
    }

    public final ZonedDateTime g() {
        return this.e;
    }

    public final String getId() {
        return this.a;
    }

    public final q0 getType() {
        return this.m;
    }

    public final String getUrl() {
        return this.l;
    }

    public final ZonedDateTime h() {
        return this.g;
    }

    public final int hashCode() {
        int e = x.i.e(m0.a(this.e, f4.b(this.d, f4.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31), 31), 31, this.f);
        ZonedDateTime zonedDateTime = this.g;
        return this.n.hashCode() + ((this.m.hashCode() + h1.i(x.i.e(x.i.e(h1.i(h1.i((e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, this.h, 31), this.i, 31), 31, this.j), 31, this.k), this.l, 31)) * 31);
    }

    public final String i() {
        return this.i;
    }

    public final boolean j() {
        return this.f;
    }

    public final boolean k() {
        return this.k;
    }

    public final String toString() {
        StringBuilder o = s0.o("ApolloComment(id=", this.a, ", authorId=", this.b, ", author=");
        o.append(this.c);
        o.append(", editor=");
        o.append(this.d);
        o.append(", createdAt=");
        m0.v(", wasEdited=", ", lastEditedAt=", o, this.e, this.f);
        f4.A(", bodyHtml=", this.h, ", bodyText=", o, this.g);
        m0.x(o, this.i, ", viewerDidAuthor=", this.j, ", canManage=");
        m0.z(o, this.k, ", url=", this.l, ", type=");
        o.append(this.m);
        o.append(", authorAssociation=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }
}
