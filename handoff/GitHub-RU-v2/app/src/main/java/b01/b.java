package b01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.type.CommentAuthorAssociation;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4Shadow;
import yz0.b8;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public f A;
    public String a;
    public String b;
    public com.github.service.models.response.a c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public e m;
    public ZonedDateTime n;
    public ZonedDateTime o;
    public boolean p;
    public ZonedDateTime q;
    public int r;
    public c s;
    public String t;
    public int u;
    public b8 v;
    public Object w;
    public k x;
    public CommentAuthorAssociation y;
    public boolean z;

    public b(String str, String str2, com.github.service.models.response.a aVar, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, e eVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, boolean z6, ZonedDateTime zonedDateTime3, int i, c cVar, String str7, int i2, b8 b8Var, List list, k kVar, CommentAuthorAssociation commentAuthorAssociation, boolean z7, f fVar) {
        k71.k.g(commentAuthorAssociation, "authorAssociation");
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = eVar;
        this.n = zonedDateTime;
        this.o = zonedDateTime2;
        this.p = z6;
        this.q = zonedDateTime3;
        this.r = i;
        this.s = cVar;
        this.t = str7;
        this.u = i2;
        this.v = b8Var;
        this.w = list;
        this.x = kVar;
        this.y = commentAuthorAssociation;
        this.z = z7;
        this.A = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f.equals(bVar.f) && this.g.equals(bVar.g) && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l && this.m.equals(bVar.m) && this.n.equals(bVar.n) && this.o.equals(bVar.o) && this.p == bVar.p && k71.k.b(this.q, bVar.q) && this.r == bVar.r && k71.k.b(this.s, bVar.s) && this.t.equals(bVar.t) && this.u == bVar.u && this.v.equals(bVar.v) && this.w.equals(bVar.w) && k71.k.b(this.x, bVar.x) && this.y == bVar.y && this.z == bVar.z && this.A.equals(bVar.A);
    }

    public final int hashCode() {
        int e = x.i.e(m0.a(this.o, m0.a(this.n, (this.m.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(h1.i(h1.i(h1.i(h1.i(f4Shadow.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31), 31), 31, this.p);
        ZonedDateTime zonedDateTime = this.q;
        int b = s0.b(this.r, (e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31);
        c cVar = this.s;
        int h = h1.h((this.v.hashCode() + s0.b(this.u, h1.i((b + (cVar == null ? 0 : cVar.hashCode())) * 31, this.t, 31), 31)) * 31, this.w, 31);
        k kVar = this.x;
        return this.A.hashCode() + x.i.e((this.y.hashCode() + ((h + (kVar != null ? kVar.hashCode() : 0)) * 31)) * 31, 31, this.z);
    }

    public final String toString() {
        StringBuilder o = s0.o("Discussion(id=", this.a, ", title=", this.b, ", author=");
        o.append(this.c);
        o.append(", repositoryId=");
        o.append(this.d);
        o.append(", repositoryName=");
        f1.e.x(o, this.e, ", repositoryOwnerId=", this.f, ", repositoryOwnerLogin=");
        m0.x(o, this.g, ", viewerDidAuthor=", this.h, ", viewerCanManage=");
        m0.A(o, this.i, ", viewerCanUpdate=", this.j, ", viewerCanCommentIfLocked=");
        m0.A(o, this.k, ", viewerCanReactIfLocked=", this.l, ", category=");
        o.append(this.m);
        o.append(", updatedAt=");
        o.append(this.n);
        o.append(", createdAt=");
        m0.v(", answered=", ", lastEditedAt=", o, this.o, this.p);
        o.append(this.q);
        o.append(", number=");
        o.append(this.r);
        o.append(", answer=");
        o.append(this.s);
        o.append(", url=");
        o.append(this.t);
        o.append(", commentCount=");
        o.append(this.u);
        o.append(", upvote=");
        o.append(this.v);
        o.append(", labels=");
        o.append(this.w);
        o.append(", poll=");
        o.append(this.x);
        o.append(", authorAssociation=");
        o.append(this.y);
        o.append(", isOrganizationDiscussion=");
        o.append(this.z);
        o.append(", discussionClosedState=");
        o.append(this.A);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
