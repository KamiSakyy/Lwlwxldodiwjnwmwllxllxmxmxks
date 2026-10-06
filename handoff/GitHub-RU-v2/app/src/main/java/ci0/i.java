package ci0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public e g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public f l;
    public h m;
    public String n;
    public String o;
    public g p;
    public d q;
    public ud0.c r;

    public i(String str, String str2, String str3, String str4, String str5, boolean z, e eVar, String str6, String str7, String str8, boolean z2, f fVar, h hVar, String str9, String str10, g gVar, d dVar, ud0.c cVar) {
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
        this.n = str9;
        this.o = str10;
        this.p = gVar;
        this.q = dVar;
        this.r = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c) && k71.k.b(this.d, iVar.d) && k71.k.b(this.e, iVar.e) && this.f == iVar.f && k71.k.b(this.g, iVar.g) && k71.k.b(this.h, iVar.h) && k71.k.b(this.i, iVar.i) && k71.k.b(this.j, iVar.j) && this.k == iVar.k && k71.k.b(this.l, iVar.l) && k71.k.b(this.m, iVar.m) && k71.k.b(this.n, iVar.n) && k71.k.b(this.o, iVar.o) && k71.k.b(this.p, iVar.p) && k71.k.b(this.q, iVar.q) && k71.k.b(this.r, iVar.r);
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
        int hashCode3 = (b + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str5 = this.n;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int b2 = s0.b(this.p.a, (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        d dVar = this.q;
        return this.r.hashCode() + ((b2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
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
        o.append(", websiteUrl=");
        o.append(this.n);
        o.append(", twitterUsername=");
        o.append(this.o);
        o.append(", projectsV2=");
        o.append(this.p);
        o.append(", organizationDiscussionsRepository=");
        o.append(this.q);
        o.append(", avatarFragment=");
        o.append(this.r);
        o.append(")");
        return o.toString();
    }
}
