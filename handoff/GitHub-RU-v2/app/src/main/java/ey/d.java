package ey;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public String b;
    public e c;

    public d(String str, String str2, e eVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        e eVar = this.c;
        return i + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
