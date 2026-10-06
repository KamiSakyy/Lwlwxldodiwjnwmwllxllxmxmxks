package yz0;

import com.github.service.models.response.type.StatusState;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 {
    public String a;
    public String b;
    public ZonedDateTime c;
    public String d;
    public String e;
    public String f;
    public com.github.service.models.response.a g;
    public com.github.service.models.response.a h;
    public int i;
    public int j;
    public int k;
    public ArrayList l;
    public StatusState m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public String q;
    public String r;

    public u0(String str, String str2, ZonedDateTime zonedDateTime, String str3, String str4, String str5, com.github.service.models.response.a aVar, com.github.service.models.response.a aVar2, int i, int i2, int i3, ArrayList arrayList, StatusState statusState, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str6, String str7) {
        k71.k.g(statusState, "checksState");
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = aVar;
        this.h = aVar2;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = arrayList;
        this.m = statusState;
        this.n = arrayList2;
        this.o = arrayList3;
        this.p = arrayList4;
        this.q = str6;
        this.r = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a.equals(u0Var.a) && this.b.equals(u0Var.b) && this.c.equals(u0Var.c) && this.d.equals(u0Var.d) && this.e.equals(u0Var.e) && this.f.equals(u0Var.f) && this.g.equals(u0Var.g) && k71.k.b(this.h, u0Var.h) && this.i == u0Var.i && this.j == u0Var.j && this.k == u0Var.k && this.l.equals(u0Var.l) && this.m == u0Var.m && this.n.equals(u0Var.n) && this.o.equals(u0Var.o) && this.p.equals(u0Var.p) && this.q.equals(u0Var.q) && this.r.equals(u0Var.r);
    }

    public final int hashCode() {
        int b = jo.f4.b(this.g, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.m0.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31), this.f, 31), 31);
        com.github.service.models.response.a aVar = this.h;
        return this.r.hashCode() + com.github.rudroid.copilot.h1.i(no.a.b(this.p, no.a.b(this.o, no.a.b(this.n, (this.m.hashCode() + no.a.b(this.l, a0.s0.b(this.k, a0.s0.b(this.j, a0.s0.b(this.i, (b + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31), 31), 31)) * 31, 31), 31), 31), this.q, 31);
    }

    public final String toString() {
        String a = qb.b.a(this.d);
        String a2 = qb.a.a(this.e);
        StringBuilder o = a0.s0.o("Commit(messageHeader=", this.a, ", messageBody=", this.b, ", committedAt=");
        jo.f4.A(", abbreviatedOid=", a, ", oid=", o, this.c);
        f1.e.x(o, a2, ", url=", this.f, ", author=");
        o.append(this.g);
        o.append(", committer=");
        o.append(this.h);
        o.append(", linesAdded=");
        a0.s0.z(o, this.i, ", linesDeleted=", this.j, ", filesChanged=");
        o.append(this.k);
        o.append(", files=");
        o.append(this.l);
        o.append(", checksState=");
        o.append(this.m);
        o.append(", authors=");
        o.append(this.n);
        o.append(", parentCommits=");
        o.append(this.o);
        o.append(", pullRequests=");
        o.append(this.p);
        o.append(", repositoryOwner=");
        return x.i.k(o, this.q, ", repositoryName=", this.r, ")");
    }
}
