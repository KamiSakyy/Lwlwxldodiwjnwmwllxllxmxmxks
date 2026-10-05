package i50;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import e50.d1;
import java.time.ZonedDateTime;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements h0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ZonedDateTime h;
    public final g i;
    public final c40.c j;
    public final g70.a k;
    public final y60.a l;
    public final d1 m;
    public final i80.c n;

    public h(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, ZonedDateTime zonedDateTime, g gVar, c40.c cVar, g70.a aVar, y60.a aVar2, d1 d1Var, i80.c cVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = zonedDateTime;
        this.i = gVar;
        this.j = cVar;
        this.k = aVar;
        this.l = aVar2;
        this.m = d1Var;
        this.n = cVar2;
    }

    public static h a(h hVar, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, c40.c cVar, g70.a aVar, y60.a aVar2, d1 d1Var, int i) {
        String str = hVar.a;
        String str2 = hVar.b;
        String str3 = hVar.c;
        boolean z4 = (i & 8) != 0 ? hVar.d : false;
        boolean z5 = (i & 16) != 0 ? hVar.e : z;
        boolean z6 = (i & 32) != 0 ? hVar.f : z2;
        boolean z7 = (i & 64) != 0 ? hVar.g : z3;
        ZonedDateTime zonedDateTime2 = (i & 128) != 0 ? hVar.h : zonedDateTime;
        g gVar = hVar.i;
        c40.c cVar2 = (i & 512) != 0 ? hVar.j : cVar;
        g70.a aVar3 = (i & 1024) != 0 ? hVar.k : aVar;
        y60.a aVar4 = (i & 2048) != 0 ? hVar.l : aVar2;
        d1 d1Var2 = (i & 4096) != 0 ? hVar.m : d1Var;
        i80.c cVar3 = hVar.n;
        hVar.getClass();
        k71.k.g(aVar4, "minimizableCommentFragment");
        return new h(str, str2, str3, z4, z5, z6, z7, zonedDateTime2, gVar, cVar2, aVar3, aVar4, d1Var2, cVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.g == hVar.g && k71.k.b(this.h, hVar.h) && k71.k.b(this.i, hVar.i) && k71.k.b(this.j, hVar.j) && k71.k.b(this.k, hVar.k) && k71.k.b(this.l, hVar.l) && k71.k.b(this.m, hVar.m) && k71.k.b(this.n, hVar.n);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(x.i.e(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        ZonedDateTime zonedDateTime = this.h;
        int hashCode = (e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        g gVar = this.i;
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
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
}
