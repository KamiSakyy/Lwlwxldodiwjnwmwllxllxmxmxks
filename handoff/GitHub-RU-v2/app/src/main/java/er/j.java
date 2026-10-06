package er;

import java.util.List;
import m10.wr;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public int a;
    public int b;
    public n c;
    public i d;
    public List e;
    public boolean f;
    public boolean g;
    public boolean h;
    public wr i;
    public String j;
    public String k;

    public j(int i, int i2, n nVar, i iVar, List list, boolean z, boolean z2, boolean z3, wr wrVar, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = nVar;
        this.d = iVar;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = wrVar;
        this.j = str;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d) && k71.k.b(this.e, jVar.e) && this.f == jVar.f && this.g == jVar.g && this.h == jVar.h && this.i == jVar.i && k71.k.b(this.j, jVar.j) && k71.k.b(this.k, jVar.k);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31);
        n nVar = this.c;
        int hashCode = (b + (nVar == null ? 0 : nVar.hashCode())) * 31;
        i iVar = this.d;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        List list = this.e;
        return this.k.hashCode() + com.github.rudroid.copilot.h1.i((this.i.hashCode() + x.i.e(x.i.e(x.i.e((hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h)) * 31, this.j, 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "Node1(linesAdded=", ", linesDeleted=", ", oldTreeEntry=");
        m.append(this.c);
        m.append(", newTreeEntry=");
        m.append(this.d);
        m.append(", diffLines=");
        com.github.rudroid.copilot.h1.C(m, this.e, ", isBinary=", this.f, ", isLargeDiff=");
        com.github.rudroid.m0.A(m, this.g, ", isSubmodule=", this.h, ", status=");
        m.append(this.i);
        m.append(", id=");
        m.append(this.j);
        m.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(m, this.k, ")");
    }
}
