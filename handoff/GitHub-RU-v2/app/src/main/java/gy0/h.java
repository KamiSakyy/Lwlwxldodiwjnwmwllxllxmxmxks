package gy0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final String a;
    public final String b;
    public final d c;
    public final c d;
    public final j e;
    public final wx0.l f;

    public h(String str, String str2, d dVar, c cVar, j jVar, wx0.l lVar) {
        this.a = str;
        this.b = str2;
        this.c = dVar;
        this.d = cVar;
        this.e = jVar;
        this.f = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d) && k71.k.b(this.e, hVar.e) && k71.k.b(this.f, hVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        c cVar = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ProjectV2(__typename=", this.a, ", id=", this.b, ", fields=");
        o.append(this.c);
        o.append(", defaultView=");
        o.append(this.d);
        o.append(", views=");
        o.append(this.e);
        o.append(", projectV2FieldConstraintsFragment=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
