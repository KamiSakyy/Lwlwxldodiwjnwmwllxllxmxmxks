package qx;

import java.time.ZonedDateTime;
import jo.f4Shadow;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public String a;
    public String b;
    public String c;
    public int d;
    public Integer e;
    public b00 f;
    public v g;
    public Boolean h;
    public boolean i;
    public ZonedDateTime j;
    public y k;
    public boolean l;

    public s(String str, String str2, String str3, int i, Integer num, b00 b00Var, v vVar, Boolean bool, boolean z, ZonedDateTime zonedDateTime, y yVar, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = num;
        this.f = b00Var;
        this.g = vVar;
        this.h = bool;
        this.i = z;
        this.j = zonedDateTime;
        this.k = yVar;
        this.l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c) && this.d == sVar.d && k71.k.b(this.e, sVar.e) && this.f == sVar.f && k71.k.b(this.g, sVar.g) && k71.k.b(this.h, sVar.h) && this.i == sVar.i && k71.k.b(this.j, sVar.j) && k71.k.b(this.k, sVar.k) && this.l == sVar.l;
    }

    public final int hashCode() {
        int b = a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
        Integer num = this.e;
        int b2 = a0.s0.b(this.g.a, (this.f.hashCode() + ((b + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31);
        Boolean bool = this.h;
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + com.github.rudroid.m0.a(this.j, x.i.e((b2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.i), 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(id=", this.a, ", url=", this.b, ", title=");
        a0.s0.w(this.d, this.c, ", number=", ", totalCommentsCount=", o);
        o.append(this.e);
        o.append(", pullRequestState=");
        o.append(this.f);
        o.append(", pullComments=");
        o.append(this.g);
        o.append(", isReadByViewer=");
        o.append(this.h);
        o.append(", isDraft=");
        f4.B(", createdAt=", ", repository=", o, this.j, this.i);
        o.append(this.k);
        o.append(", isInMergeQueue=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
