package e80;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import hc0.vl;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements h0 {
    public final String a;
    public final String b;
    public final ZonedDateTime c;
    public final boolean d;
    public final String e;
    public final vl f;
    public final a g;
    public final ZonedDateTime h;
    public final b i;
    public final c40.c j;
    public final i80.c k;
    public final g70.a l;

    public c(String str, String str2, ZonedDateTime zonedDateTime, boolean z, String str3, vl vlVar, a aVar, ZonedDateTime zonedDateTime2, b bVar, c40.c cVar, i80.c cVar2, g70.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = z;
        this.e = str3;
        this.f = vlVar;
        this.g = aVar;
        this.h = zonedDateTime2;
        this.i = bVar;
        this.j = cVar;
        this.k = cVar2;
        this.l = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && this.d == cVar.d && k71.k.b(this.e, cVar.e) && this.f == cVar.f && k71.k.b(this.g, cVar.g) && k71.k.b(this.h, cVar.h) && k71.k.b(this.i, cVar.i) && k71.k.b(this.j, cVar.j) && k71.k.b(this.k, cVar.k) && k71.k.b(this.l, cVar.l);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        ZonedDateTime zonedDateTime = this.c;
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + m0.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + h1.i(x.i.e((i + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31, this.d), this.e, 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("PullRequestReviewFields(__typename=", this.a, ", id=", this.b, ", submittedAt=");
        m0.v(", authorCanPushToRepository=", ", url=", o, this.c, this.d);
        o.append(this.e);
        o.append(", state=");
        o.append(this.f);
        o.append(", comments=");
        o.append(this.g);
        o.append(", createdAt=");
        o.append(this.h);
        o.append(", pullRequest=");
        o.append(this.i);
        o.append(", commentFragment=");
        o.append(this.j);
        o.append(", reactionFragment=");
        o.append(this.k);
        o.append(", orgBlockableFragment=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }
}
