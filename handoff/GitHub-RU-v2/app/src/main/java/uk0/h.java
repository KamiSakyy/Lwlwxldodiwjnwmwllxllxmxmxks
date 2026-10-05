package uk0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final String a;
    public final g b;
    public final String c;

    public h(String str, g gVar, String str2) {
        this.a = str;
        this.b = gVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.a, hVar.a) && k.b(this.b, hVar.b) && k.b(this.c, hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + s0.b(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(id=");
        sb.append(this.a);
        sb.append(", starredRepositories=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
