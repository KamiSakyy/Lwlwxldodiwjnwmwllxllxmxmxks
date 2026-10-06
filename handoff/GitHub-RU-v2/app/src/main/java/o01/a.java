package o01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final com.github.service.models.response.a d;
    public final ZonedDateTime e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final d m;
    public final List n;
    public final boolean o;

    public a(String str, String str2, String str3, com.github.service.models.response.a aVar, ZonedDateTime zonedDateTime, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, String str7, d dVar, List list, boolean z4) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(str3, "tagName");
        k.g(zonedDateTime, "timestamp");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = zonedDateTime;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = dVar;
        this.n = list;
        this.o = z4;
    }

    public final boolean equals(Object obj) {
        boolean b;
        boolean b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!k.b(this.a, aVar.a) || !k.b(this.b, aVar.b) || !k.b(this.c, aVar.c) || !k.b(this.d, aVar.d) || !k.b(this.e, aVar.e) || this.f != aVar.f || this.g != aVar.g || this.h != aVar.h || !k.b(this.i, aVar.i)) {
            return false;
        }
        String str = aVar.j;
        String str2 = this.j;
        if (str2 == null) {
            if (str == null) {
                b = true;
            }
            b = false;
        } else {
            if (str != null) {
                b = k.b(str2, str);
            }
            b = false;
        }
        if (!b) {
            return false;
        }
        String str3 = aVar.k;
        String str4 = this.k;
        if (str4 == null) {
            if (str3 == null) {
                b2 = true;
            }
            b2 = false;
        } else {
            if (str3 != null) {
                b2 = k.b(str4, str3);
            }
            b2 = false;
        }
        return b2 && k.b(this.l, aVar.l) && k.b(this.m, aVar.m) && k.b(this.n, aVar.n) && this.o == aVar.o;
    }

    public final int hashCode() {
        int i = h1.i(i.e(i.e(i.e(m0.a(this.e, f4.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), this.i, 31);
        String str = this.j;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar = this.m;
        return Boolean.hashCode(this.o) + f1.e.c(this.n, (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String str = this.j;
        String a = str == null ? "null" : qb.a.a(str);
        String str2 = this.k;
        String a2 = str2 != null ? qb.b.a(str2) : "null";
        StringBuilder o = s0.o("Release(id=", this.a, ", name=", this.b, ", tagName=");
        o.append(this.c);
        o.append(", author=");
        o.append(this.d);
        o.append(", timestamp=");
        m0.v(", isDraft=", ", isPreRelease=", o, this.e, this.f);
        m0.A(o, this.g, ", isLatestRelease=", this.h, ", descriptionHtml=");
        f1.e.x(o, this.i, ", commitOid=", a, ", abbreviatedCommitOid=");
        f1.e.x(o, a2, ", url=", this.l, ", discussion=");
        o.append(this.m);
        o.append(", reactions=");
        o.append(this.n);
        o.append(", viewerCanReact=");
        return f4.s(o, this.o, ")");
    }
}
