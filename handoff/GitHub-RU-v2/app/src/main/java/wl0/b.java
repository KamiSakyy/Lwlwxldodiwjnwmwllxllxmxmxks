package wl0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.type.CommentAuthorAssociation;
import java.time.ZonedDateTime;
import jo.f4Shadow;
import yz0.q0;
import yz0.s;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements s {
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

    public b(se0.c cVar, String str, q0 q0Var) {
        bl0.a aVar;
        k71.k.g(cVar, "commentFragment");
        k71.k.g(str, "url");
        String str2 = cVar.b;
        se0.a aVar2 = cVar.c;
        String str3 = (aVar2 == null || (aVar = aVar2.b.e) == null) ? "" : aVar.a;
        com.github.service.models.response.a d = aa1.b.d(aVar2 != null ? aVar2.b : null);
        se0.b bVar = cVar.d;
        com.github.service.models.response.a d2 = aa1.b.d(bVar != null ? bVar.b : null);
        ZonedDateTime zonedDateTime = cVar.i;
        boolean z = cVar.f;
        ZonedDateTime zonedDateTime2 = cVar.e;
        String str4 = cVar.g;
        String str5 = cVar.h;
        boolean z2 = cVar.j;
        sk0.a aVar3 = cVar.l;
        boolean z3 = aVar3 != null ? aVar3.b : false;
        r01.a aVar4 = CommentAuthorAssociation.Companion;
        String str6 = cVar.k.r;
        aVar4.getClass();
        CommentAuthorAssociation a = r01.a.a(str6);
        k71.k.g(a, "authorAssociation");
        this.a = str2;
        this.b = str3;
        this.c = d;
        this.d = d2;
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

    @Override // yz0.s
    public final boolean a() {
        return this.j;
    }

    @Override // yz0.s
    public final String b() {
        return this.b;
    }

    @Override // yz0.s
    public final com.github.service.models.response.a c() {
        return this.d;
    }

    @Override // yz0.s
    public final String d() {
        return this.h;
    }

    @Override // yz0.s
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

    @Override // yz0.s
    public final CommentAuthorAssociation f() {
        return this.n;
    }

    @Override // yz0.s
    public final ZonedDateTime g() {
        return this.e;
    }

    @Override // yz0.s
    public final String getId() {
        return this.a;
    }

    @Override // yz0.s
    public final q0 getType() {
        return this.m;
    }

    @Override // yz0.s
    public final String getUrl() {
        return this.l;
    }

    @Override // yz0.s
    public final ZonedDateTime h() {
        return this.g;
    }

    public final int hashCode() {
        int e = x.i.e(m0.a(this.e, f4.b(this.d, f4.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31), 31), 31, this.f);
        ZonedDateTime zonedDateTime = this.g;
        return this.n.hashCode() + ((this.m.hashCode() + h1.i(x.i.e(x.i.e(h1.i(h1.i((e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, this.h, 31), this.i, 31), 31, this.j), 31, this.k), this.l, 31)) * 31);
    }

    @Override // yz0.s
    public final String i() {
        return this.i;
    }

    @Override // yz0.s
    public final boolean j() {
        return this.f;
    }

    @Override // yz0.s
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
