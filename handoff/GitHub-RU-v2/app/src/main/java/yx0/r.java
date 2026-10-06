package yx0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r {
    public String a;
    public String b;
    public s c;

    public r(String str, String str2, s sVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        s sVar = this.c;
        return i + (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onProjectV2Item=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
