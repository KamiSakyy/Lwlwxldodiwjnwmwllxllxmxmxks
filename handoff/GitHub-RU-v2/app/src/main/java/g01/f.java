package g01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public com.github.service.models.response.a a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public int h;
    public c i;
    public int j;
    public o.b k;

    public f(com.github.service.models.response.a aVar, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, c cVar, int i2, o.b bVar) {
        k.g(str, "id");
        k.g(str2, "url");
        k.g(str3, "title");
        k.g(str4, "repoName");
        k.g(str5, "repoOwner");
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = bool;
        this.h = i;
        this.i = cVar;
        this.j = i2;
        this.k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.a, fVar.a) && k.b(this.b, fVar.b) && k.b(this.c, fVar.c) && k.b(this.d, fVar.d) && k.b(this.e, fVar.e) && k.b(this.f, fVar.f) && k.b(this.g, fVar.g) && this.h == fVar.h && k.b(this.i, fVar.i) && this.j == fVar.j && k.b(this.k, fVar.k);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
        Boolean bool = this.g;
        return this.k.hashCode() + s0.b(this.j, (this.i.hashCode() + s0.b(this.h, (i + (bool == null ? 0 : bool.hashCode())) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentActivity(actor=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", url=");
        f1.e.x(sb, this.c, ", title=", this.d, ", repoName=");
        f1.e.x(sb, this.e, ", repoOwner=", this.f, ", isRead=");
        sb.append(this.g);
        sb.append(", number=");
        sb.append(this.h);
        sb.append(", interaction=");
        sb.append(this.i);
        sb.append(", commentCount=");
        sb.append(this.j);
        sb.append(", subject=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
