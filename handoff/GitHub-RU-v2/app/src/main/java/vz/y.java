package vz;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y {
    public String a;
    public String b;
    public z c;

    public y(String str, String str2, z zVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && k71.k.b(this.b, yVar.b) && k71.k.b(this.c, yVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        z zVar = this.c;
        return i + (zVar == null ? 0 : zVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onProjectV2View=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
