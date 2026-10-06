package jk;

import a0.s0;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import yz0.b8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final ZonedDateTime f;
    public final ZonedDateTime g;
    public final ZonedDateTime h;
    public final DiscussionCategoryData i;
    public final lj.a j;
    public final Integer k;
    public final b l;
    public final String m;
    public final b8 n;
    public final Object o;
    public final boolean p;
    public final b01.f q;

    public f(String str, int i, String str2, String str3, String str4, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, DiscussionCategoryData discussionCategoryData, lj.a aVar, Integer num, b bVar, String str5, b8 b8Var, List list, boolean z, b01.f fVar) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = zonedDateTime;
        this.g = zonedDateTime2;
        this.h = zonedDateTime3;
        this.i = discussionCategoryData;
        this.j = aVar;
        this.k = num;
        this.l = bVar;
        this.m = str5;
        this.n = b8Var;
        this.o = list;
        this.p = z;
        this.q = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b == fVar.b && this.c.equals(fVar.c) && this.d.equals(fVar.d) && this.e.equals(fVar.e) && this.f.equals(fVar.f) && this.g.equals(fVar.g) && k.b(this.h, fVar.h) && this.i.equals(fVar.i) && this.j.equals(fVar.j) && this.k.equals(fVar.k) && k.b(this.l, fVar.l) && this.m.equals(fVar.m) && this.n.equals(fVar.n) && this.o.equals(fVar.o) && this.p == fVar.p && this.q.equals(fVar.q);
    }

    public final int hashCode() {
        int a = m0.a(this.g, m0.a(this.f, h1.i(h1.i(h1.i(s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31), this.e, 31), 31), 31);
        ZonedDateTime zonedDateTime = this.h;
        int hashCode = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((a + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31)) * 31)) * 31;
        b bVar = this.l;
        return this.q.hashCode() + x.i.e(h1.h((this.n.hashCode() + h1.i((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31, this.m, 31)) * 31, this.o, 31), 31, this.p);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "DiscussionData(id=", this.a, ", number=", ", title=");
        f1.e.x(n, this.c, ", repositoryName=", this.d, ", repositoryOwnerLogin=");
        h1.A(this.e, ", updatedAt=", ", createdAt=", n, this.f);
        h1.B(n, this.g, ", lastEditedAt=", this.h, ", category=");
        n.append(this.i);
        n.append(", author=");
        n.append(this.j);
        n.append(", commentCount=");
        n.append(this.k);
        n.append(", answer=");
        n.append(this.l);
        n.append(", url=");
        n.append(this.m);
        n.append(", upvote=");
        n.append(this.n);
        n.append(", labels=");
        n.append(this.o);
        n.append(", isOrganizationDiscussion=");
        n.append(this.p);
        n.append(", discussionClosedState=");
        n.append(this.q);
        n.append(")");
        return n.toString();
    }
}
