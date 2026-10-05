package vz;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final String a;
    public final String b;
    public final f c;

    public e(String str, String str2, f fVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public static e a(e eVar, f fVar) {
        String str = eVar.a;
        String str2 = eVar.b;
        eVar.getClass();
        k71.k.g(str, "__typename");
        return new e(str, str2, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        f fVar = this.c;
        return i + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onProjectV2View=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
