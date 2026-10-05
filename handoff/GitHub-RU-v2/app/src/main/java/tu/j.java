package tu;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final e g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final f l;
    public final h m;
    public final i n;
    public final String o;
    public final String p;
    public final g q;
    public final d r;
    public final eq.g s;

    public j(String str, String str2, String str3, String str4, String str5, boolean z, e eVar, String str6, String str7, String str8, boolean z2, f fVar, h hVar, i iVar, String str9, String str10, g gVar, d dVar, eq.g gVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = eVar;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = z2;
        this.l = fVar;
        this.m = hVar;
        this.n = iVar;
        this.o = str9;
        this.p = str10;
        this.q = gVar;
        this.r = dVar;
        this.s = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d) && k71.k.b(this.e, jVar.e) && this.f == jVar.f && k71.k.b(this.g, jVar.g) && k71.k.b(this.h, jVar.h) && k71.k.b(this.i, jVar.i) && k71.k.b(this.j, jVar.j) && this.k == jVar.k && k71.k.b(this.l, jVar.l) && k71.k.b(this.m, jVar.m) && k71.k.b(this.n, jVar.n) && k71.k.b(this.o, jVar.o) && k71.k.b(this.p, jVar.p) && k71.k.b(this.q, jVar.q) && k71.k.b(this.r, jVar.r) && k71.k.b(this.s, jVar.s);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (this.g.hashCode() + x.i.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f)) * 31;
        String str3 = this.h;
        int i2 = h1.i((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.i, 31);
        String str4 = this.j;
        int b = s0.b(this.l.a, x.i.e((i2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.k), 31);
        h hVar = this.m;
        int b2 = s0.b(this.n.a, (b + (hVar == null ? 0 : hVar.hashCode())) * 31, 31);
        String str5 = this.o;
        int hashCode3 = (b2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.p;
        int b3 = s0.b(this.q.a, (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        d dVar = this.r;
        return this.s.hashCode() + ((b3 + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OrganizationFragment(__typename=", this.a, ", id=", this.b, ", url=");
        f1.e.x(o, this.c, ", descriptionHTML=", this.d, ", organizationEmail=");
        m0.x(o, this.e, ", isVerified=", this.f, ", organizationItemShowcase=");
        o.append(this.g);
        o.append(", location=");
        o.append(this.h);
        o.append(", login=");
        f1.e.x(o, this.i, ", name=", this.j, ", viewerIsFollowing=");
        o.append(this.k);
        o.append(", organizationRepositories=");
        o.append(this.l);
        o.append(", readme=");
        o.append(this.m);
        o.append(", sponsorshipsAsSponsor=");
        o.append(this.n);
        o.append(", websiteUrl=");
        f1.e.x(o, this.o, ", twitterUsername=", this.p, ", projectsV2=");
        o.append(this.q);
        o.append(", organizationDiscussionsRepository=");
        o.append(this.r);
        o.append(", avatarFragment=");
        o.append(this.s);
        o.append(")");
        return o.toString();
    }
}
