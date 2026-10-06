package d01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.type.RepositoryRecommendationReason;
import f1.e;
import java.util.List;
import jo.f4;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements b {
    public final String a;
    public final com.github.service.models.response.a b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final int h;
    public final String i;
    public final int j;
    public final String k;
    public final Object l;
    public final RepositoryRecommendationReason m;

    public c(String str, com.github.service.models.response.a aVar, String str2, int i, String str3, String str4, boolean z, int i2, String str5, int i3, String str6, List list, RepositoryRecommendationReason repositoryRecommendationReason) {
        k.g(repositoryRecommendationReason, "reason");
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = i2;
        this.i = str5;
        this.j = i3;
        this.k = str6;
        this.l = list;
        this.m = repositoryRecommendationReason;
    }

    @Override // d01.b
    public final com.github.service.models.response.a a() {
        return this.b;
    }

    @Override // d01.b
    public final String b() {
        return this.e;
    }

    @Override // d01.b
    public final int c() {
        return this.d;
    }

    @Override // d01.b
    public final int e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.d == cVar.d && k.b(this.e, cVar.e) && this.f.equals(cVar.f) && this.g == cVar.g && this.h == cVar.h && k.b(this.i, cVar.i) && this.j == cVar.j && this.k.equals(cVar.k) && this.l.equals(cVar.l) && this.m == cVar.m;
    }

    @Override // d01.b
    public final boolean f() {
        return this.g;
    }

    @Override // d01.b
    public final String g() {
        return this.i;
    }

    @Override // d01.b
    public final String getId() {
        return this.a;
    }

    @Override // d01.b
    public final String getName() {
        return this.c;
    }

    @Override // d01.b
    public final String getUrl() {
        return this.k;
    }

    @Override // d01.b
    public final int h() {
        return this.j;
    }

    public final int hashCode() {
        int b = s0.b(this.d, h1.i(f4.b(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31);
        String str = this.e;
        int b2 = s0.b(this.h, i.e(h1.i((b + (str == null ? 0 : str.hashCode())) * 31, this.f, 31), 31, this.g), 31);
        String str2 = this.i;
        return this.m.hashCode() + h1.h(h1.i(s0.b(this.j, (b2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), this.k, 31), this.l, 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // d01.b
    public final List i() {
        return this.l;
    }

    @Override // d01.b
    public final String j() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreRepositoryForYouItem(id=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", name=");
        s0.w(this.d, this.c, ", languageColor=", ", languageName=", sb);
        e.x(sb, this.e, ", shortDescriptionHtml=", this.f, ", isStarred=");
        m0.y(sb, this.g, ", starCount=", this.h, ", coverImageUrl=");
        s0.w(this.j, this.i, ", contributorsCount=", ", url=", sb);
        sb.append(this.k);
        sb.append(", listNames=");
        sb.append(this.l);
        sb.append(", reason=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
