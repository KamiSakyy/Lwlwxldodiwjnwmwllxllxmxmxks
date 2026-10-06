package b01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public final String a;
    public final int b;
    public final com.github.service.models.response.a c;
    public final String d;
    public final String e;
    public final n f;

    public p(String str, int i, com.github.service.models.response.a aVar, String str2, String str3, n nVar) {
        this.a = str;
        this.b = i;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && this.b == pVar.b && k71.k.b(this.c, pVar.c) && k71.k.b(this.d, pVar.d) && k71.k.b(this.e, pVar.e) && k71.k.b(this.f, pVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + h1.i(h1.i(f4.b(this.c, s0.b(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "PinnedDiscussion(id=", this.a, ", number=", ", author=");
        n.append(this.c);
        n.append(", title=");
        n.append(this.d);
        n.append(", categoryName=");
        n.append(this.e);
        n.append(", background=");
        n.append(this.f);
        n.append(")");
        return n.toString();
    }
}
