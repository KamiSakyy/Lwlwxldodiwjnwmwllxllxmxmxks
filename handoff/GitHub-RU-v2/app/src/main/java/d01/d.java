package d01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import f1.e;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements b {
    public String a;
    public com.github.service.models.response.a b;
    public String c;
    public int d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public String i;
    public int j;
    public String k;
    public Object l;
    public int m;

    public d(String str, com.github.service.models.response.a aVar, String str2, int i, String str3, String str4, boolean z, int i2, String str5, int i3, String str6, List list, int i4) {
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
        this.m = i4;
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c) && this.d == dVar.d && k.b(this.e, dVar.e) && this.f.equals(dVar.f) && this.g == dVar.g && this.h == dVar.h && k.b(this.i, dVar.i) && this.j == dVar.j && this.k.equals(dVar.k) && this.l.equals(dVar.l) && this.m == dVar.m;
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
        int b = s0.b(this.d, h1.i(f4Shadow.b(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31);
        String str = this.e;
        int b2 = s0.b(this.h, i.e(h1.i((b + (str == null ? 0 : str.hashCode())) * 31, this.f, 31), 31, this.g), 31);
        String str2 = this.i;
        return Integer.hashCode(this.m) + h1.h(h1.i(s0.b(this.j, (b2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), this.k, 31), this.l, 31);
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
        StringBuilder sb = new StringBuilder("ExploreRepositoryTrendingItem(id=");
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
        sb.append(", starsSinceCount=");
        return s0.l(sb, this.m, ")");
    }
}
