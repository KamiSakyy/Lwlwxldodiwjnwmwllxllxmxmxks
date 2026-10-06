package lj;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.HideCommentReason;
import com.github.service.models.response.type.CommentAuthorAssociation;
import f1.e;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import t.z;
import x.i;
import yz0.q0;
import yz0.x2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public String a;
    public a b;
    public a c;
    public String d;
    public ZonedDateTime e;
    public boolean f;
    public ZonedDateTime g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public String l;
    public q0 m;
    public List n;
    public boolean o;
    public x2 p;
    public boolean q;
    public boolean r;
    public CommentAuthorAssociation s;
    public boolean t;

    public b(String str, a aVar, a aVar2, String str2, ZonedDateTime zonedDateTime, boolean z, ZonedDateTime zonedDateTime2, String str3, String str4, boolean z2, boolean z3, String str5, q0 q0Var, List list, boolean z4, x2 x2Var, boolean z5, boolean z6, CommentAuthorAssociation commentAuthorAssociation, boolean z7) {
        k.g(str, "id");
        k.g(str2, "authorId");
        k.g(zonedDateTime, "createdAt");
        k.g(str3, "bodyHtml");
        k.g(str4, "bodyText");
        k.g(str5, "url");
        k.g(q0Var, "type");
        k.g(commentAuthorAssociation, "authorAssociation");
        this.a = str;
        this.b = aVar;
        this.c = aVar2;
        this.d = str2;
        this.e = zonedDateTime;
        this.f = z;
        this.g = zonedDateTime2;
        this.h = str3;
        this.i = str4;
        this.j = z2;
        this.k = z3;
        this.l = str5;
        this.m = q0Var;
        this.n = list;
        this.o = z4;
        this.p = x2Var;
        this.q = z5;
        this.r = z6;
        this.s = commentAuthorAssociation;
        this.t = z7;
    }

    public static b a(b bVar, x2 x2Var, boolean z, boolean z2, int i) {
        a aVar;
        boolean z3;
        String str = bVar.a;
        a aVar2 = bVar.b;
        a aVar3 = bVar.c;
        String str2 = bVar.d;
        ZonedDateTime zonedDateTime = bVar.e;
        boolean z4 = bVar.f;
        ZonedDateTime zonedDateTime2 = bVar.g;
        String str3 = bVar.h;
        String str4 = bVar.i;
        boolean z5 = bVar.j;
        boolean z6 = bVar.k;
        String str5 = bVar.l;
        q0 q0Var = bVar.m;
        List list = bVar.n;
        boolean z7 = bVar.o;
        if ((i & 65536) != 0) {
            aVar = aVar2;
            z3 = bVar.q;
        } else {
            aVar = aVar2;
            z3 = z;
        }
        boolean z8 = (i & 131072) != 0 ? bVar.r : z2;
        CommentAuthorAssociation commentAuthorAssociation = bVar.s;
        boolean z9 = bVar.t;
        k.g(str, "id");
        k.g(str2, "authorId");
        k.g(zonedDateTime, "createdAt");
        k.g(str3, "bodyHtml");
        k.g(str4, "bodyText");
        k.g(str5, "url");
        k.g(q0Var, "type");
        k.g(x2Var, "minimizedState");
        k.g(commentAuthorAssociation, "authorAssociation");
        return new b(str, aVar, aVar3, str2, zonedDateTime, z4, zonedDateTime2, str3, str4, z5, z6, str5, q0Var, list, z7, x2Var, z3, z8, commentAuthorAssociation, z9);
    }

    public final b b(HideCommentReason hideCommentReason, boolean z) {
        return a(this, hideCommentReason != null ? new x2(true, true, true, z.o(hideCommentReason)) : this.p, !z, z, 819199);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e) && this.f == bVar.f && k.b(this.g, bVar.g) && k.b(this.h, bVar.h) && k.b(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k && k.b(this.l, bVar.l) && k.b(this.m, bVar.m) && k.b(this.n, bVar.n) && this.o == bVar.o && k.b(this.p, bVar.p) && this.q == bVar.q && this.r == bVar.r && this.s == bVar.s && this.t == bVar.t;
    }

    public final int hashCode() {
        int e = i.e(m0.a(this.e, h1.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31), 31), 31, this.f);
        ZonedDateTime zonedDateTime = this.g;
        return Boolean.hashCode(this.t) + ((this.s.hashCode() + i.e(i.e((this.p.hashCode() + i.e(e.c(this.n, (this.m.hashCode() + h1.i(i.e(i.e(h1.i(h1.i((e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, this.h, 31), this.i, 31), 31, this.j), 31, this.k), this.l, 31)) * 31, 31), 31, this.o)) * 31, 31, this.q), 31, this.r)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentData(id=");
        sb.append(this.a);
        sb.append(", author=");
        sb.append(this.b);
        sb.append(", editor=");
        sb.append(this.c);
        sb.append(", authorId=");
        sb.append(this.d);
        sb.append(", createdAt=");
        m0.v(", wasEdited=", ", lastEditedAt=", sb, this.e, this.f);
        f4Shadow.A(", bodyHtml=", this.h, ", bodyText=", sb, this.g);
        m0.x(sb, this.i, ", viewerDidAuthor=", this.j, ", canManage=");
        m0.z(sb, this.k, ", url=", this.l, ", type=");
        sb.append(this.m);
        sb.append(", reactions=");
        sb.append(this.n);
        sb.append(", viewerCanReact=");
        sb.append(this.o);
        sb.append(", minimizedState=");
        sb.append(this.p);
        sb.append(", viewerCanBlockFromOrg=");
        m0.A(sb, this.q, ", viewerCanUnblockFromOrg=", this.r, ", authorAssociation=");
        sb.append(this.s);
        sb.append(", isAnswer=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }
}
