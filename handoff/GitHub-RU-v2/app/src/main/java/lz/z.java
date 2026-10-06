package lz;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public String a;
    public String b;
    public int c;
    public p0 d;
    public b e;

    public z(String str, String str2, int i, p0 p0Var, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = p0Var;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b) && this.c == zVar.c && k71.k.b(this.d, zVar.d) && k71.k.b(this.e, zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + a0.s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnWorkflowRun(id=", this.a, ", url=", this.b, ", runNumber=");
        o.append(this.c);
        o.append(", workflow=");
        o.append(this.d);
        o.append(", checkSuite=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
