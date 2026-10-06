package pt0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.List;
import pz0.rm;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements h0 {
    public String a;
    public int b;
    public int c;
    public e d;
    public d e;
    public List f;
    public boolean g;
    public boolean h;
    public boolean i;
    public rm j;
    public String k;

    public h(String str, int i, int i2, e eVar, d dVar, List list, boolean z, boolean z2, boolean z3, rm rmVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = eVar;
        this.e = dVar;
        this.f = list;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = rmVar;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && this.b == hVar.b && this.c == hVar.c && k71.k.b(this.d, hVar.d) && k71.k.b(this.e, hVar.e) && k71.k.b(this.f, hVar.f) && this.g == hVar.g && this.h == hVar.h && this.i == hVar.i && this.j == hVar.j && k71.k.b(this.k, hVar.k);
    }

    public final int hashCode() {
        int b = s0.b(this.c, s0.b(this.b, this.a.hashCode() * 31, 31), 31);
        e eVar = this.d;
        int hashCode = (b + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.e;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List list = this.f;
        return this.k.hashCode() + ((this.j.hashCode() + x.i.e(x.i.e(x.i.e((hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "PatchFileFragment(id=", this.a, ", linesAdded=", ", linesDeleted=");
        n.append(this.c);
        n.append(", oldTreeEntry=");
        n.append(this.d);
        n.append(", newTreeEntry=");
        n.append(this.e);
        n.append(", diffLines=");
        n.append(this.f);
        n.append(", isBinary=");
        m0.A(n, this.g, ", isLargeDiff=", this.h, ", isSubmodule=");
        n.append(this.i);
        n.append(", status=");
        n.append(this.j);
        n.append(", __typename=");
        return h1.p(n, this.k, ")");
    }
}
