package ms;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import is.i1;
import java.time.ZonedDateTime;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ZonedDateTime h;
    public h i;
    public ar.c j;
    public pu.a k;
    public ju.a l;
    public i1 m;
    public pv.c n;

    public i(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, ZonedDateTime zonedDateTime, h hVar, ar.c cVar, pu.a aVar, ju.a aVar2, i1 i1Var, pv.c cVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = zonedDateTime;
        this.i = hVar;
        this.j = cVar;
        this.k = aVar;
        this.l = aVar2;
        this.m = i1Var;
        this.n = cVar2;
    }

    public static i a(i iVar, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ar.c cVar, pu.a aVar, ju.a aVar2, i1 i1Var, int i) {
        String str = iVar.a;
        String str2 = iVar.b;
        String str3 = iVar.c;
        boolean z4 = (i & 8) != 0 ? iVar.d : false;
        boolean z5 = (i & 16) != 0 ? iVar.e : z;
        boolean z6 = (i & 32) != 0 ? iVar.f : z2;
        boolean z7 = (i & 64) != 0 ? iVar.g : z3;
        ZonedDateTime zonedDateTime2 = (i & 128) != 0 ? iVar.h : zonedDateTime;
        h hVar = iVar.i;
        ar.c cVar2 = (i & 512) != 0 ? iVar.j : cVar;
        pu.a aVar3 = (i & 1024) != 0 ? iVar.k : aVar;
        ju.a aVar4 = (i & 2048) != 0 ? iVar.l : aVar2;
        i1 i1Var2 = (i & 4096) != 0 ? iVar.m : i1Var;
        pv.c cVar3 = iVar.n;
        iVar.getClass();
        k71.k.g(aVar4, "minimizableCommentFragment");
        return new i(str, str2, str3, z4, z5, z6, z7, zonedDateTime2, hVar, cVar2, aVar3, aVar4, i1Var2, cVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c) && this.d == iVar.d && this.e == iVar.e && this.f == iVar.f && this.g == iVar.g && k71.k.b(this.h, iVar.h) && k71.k.b(this.i, iVar.i) && k71.k.b(this.j, iVar.j) && k71.k.b(this.k, iVar.k) && k71.k.b(this.l, iVar.l) && k71.k.b(this.m, iVar.m) && k71.k.b(this.n, iVar.n);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(x.i.e(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        ZonedDateTime zonedDateTime = this.h;
        int hashCode = (e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        h hVar = this.i;
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionCommentFragment(__typename=", this.a, ", id=", this.b, ", url=");
        m0.x(o, this.c, ", viewerCanUpdate=", this.d, ", viewerCanMarkAsAnswer=");
        m0.A(o, this.e, ", viewerCanUnmarkAsAnswer=", this.f, ", isAnswer=");
        f4.B(", deletedAt=", ", discussion=", o, this.h, this.g);
        o.append(this.i);
        o.append(", commentFragment=");
        o.append(this.j);
        o.append(", orgBlockableFragment=");
        o.append(this.k);
        o.append(", minimizableCommentFragment=");
        o.append(this.l);
        o.append(", upvoteFragment=");
        o.append(this.m);
        o.append(", reactionFragment=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }
    public Object a = null;
}
