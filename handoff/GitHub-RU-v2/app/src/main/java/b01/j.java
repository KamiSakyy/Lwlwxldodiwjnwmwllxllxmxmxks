package b01;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public final com.github.service.models.response.a a;
    public final String b;
    public final b c;
    public final String d;
    public final String e;
    public final String f;
    public final ArrayList g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public j(com.github.service.models.response.a aVar, String str, b bVar, String str2, String str3, String str4, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = aVar;
        this.b = str;
        this.c = bVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = arrayList;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.a) && this.b.equals(jVar.b) && this.c.equals(jVar.c) && this.d.equals(jVar.d) && this.e.equals(jVar.e) && this.f.equals(jVar.f) && this.g.equals(jVar.g) && this.h == jVar.h && this.i == jVar.i && this.j == jVar.j && this.k == jVar.k && this.l == jVar.l && this.m == jVar.m && this.n == jVar.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(no.a.b(this.g, h1.i(h1.i(h1.i((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), this.e, 31), this.f, 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionDetail(owner=");
        sb.append(this.a);
        sb.append(", authorId=");
        sb.append(this.b);
        sb.append(", discussion=");
        sb.append(this.c);
        sb.append(", bodyHtml=");
        sb.append(this.d);
        sb.append(", bodyText=");
        f1.e.x(sb, this.e, ", url=", this.f, ", reactions=");
        sb.append(this.g);
        sb.append(", viewerCanReact=");
        sb.append(this.h);
        sb.append(", viewerCanUpvote=");
        m0.A(sb, this.i, ", isSubscribed=", this.j, ", isLocked=");
        m0.A(sb, this.k, ", viewerCanDelete=", this.l, ", viewerCanBlockFromOrg=");
        return m0.m(sb, this.m, ", viewerCanUnblockFromOrg=", this.n, ")");
    }
}
