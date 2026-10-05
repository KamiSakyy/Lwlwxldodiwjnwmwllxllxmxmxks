package sr;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final String a;
    public final int b;
    public final String c;
    public final b00 d;
    public final g e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public d(String str, int i, String str2, b00 b00Var, g gVar, boolean z, boolean z2, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = b00Var;
        this.e = gVar;
        this.f = z;
        this.g = z2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && this.b == dVar.b && k71.k.b(this.c, dVar.c) && this.d == dVar.d && k71.k.b(this.e, dVar.e) && this.f == dVar.f && this.g == dVar.g && k71.k.b(this.h, dVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + x.i.e(x.i.e((this.e.hashCode() + ((this.d.hashCode() + h1.i(s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31)) * 31)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "OnPullRequest(__typename=", this.a, ", number=", ", title=");
        n.append(this.c);
        n.append(", pullRequestState=");
        n.append(this.d);
        n.append(", repository=");
        n.append(this.e);
        n.append(", isInMergeQueue=");
        n.append(this.f);
        n.append(", isDraft=");
        return m0.l(n, this.g, ", id=", this.h, ")");
    }
}
