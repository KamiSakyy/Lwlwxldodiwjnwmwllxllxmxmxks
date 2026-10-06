package ak0;

import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import gn0.dn;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements h0 {
    public boolean a;
    public d b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public dn g;
    public a h;
    public String i;

    public f(boolean z, d dVar, String str, String str2, boolean z2, boolean z3, dn dnVar, a aVar, String str3) {
        this.a = z;
        this.b = dVar;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = z3;
        this.g = dnVar;
        this.h = aVar;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && k71.k.b(this.b, fVar.b) && k71.k.b(this.c, fVar.c) && k71.k.b(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f && this.g == fVar.g && k71.k.b(this.h, fVar.h) && k71.k.b(this.i, fVar.i);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        d dVar = this.b;
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + x.i.e(x.i.e(h1.i(h1.i((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, this.c, 31), this.d, 31), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewThreadFragment(isResolved=");
        sb.append(this.a);
        sb.append(", resolvedBy=");
        sb.append(this.b);
        sb.append(", path=");
        f1.e.x(sb, this.c, ", id=", this.d, ", viewerCanResolve=");
        m0.A(sb, this.e, ", viewerCanUnresolve=", this.f, ", subjectType=");
        sb.append(this.g);
        sb.append(", comments=");
        sb.append(this.h);
        sb.append(", __typename=");
        return h1.p(sb, this.i, ")");
    }
}
