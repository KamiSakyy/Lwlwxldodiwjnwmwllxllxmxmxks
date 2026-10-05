package kq0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final String a;
    public final int b;
    public final String c;
    public final gu d;
    public final f e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public c(String str, int i, String str2, gu guVar, f fVar, boolean z, boolean z2, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = guVar;
        this.e = fVar;
        this.f = z;
        this.g = z2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && this.b == cVar.b && k71.k.b(this.c, cVar.c) && this.d == cVar.d && k71.k.b(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g && k71.k.b(this.h, cVar.h);
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
