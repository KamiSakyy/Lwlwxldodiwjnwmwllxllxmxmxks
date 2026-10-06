package e80;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import hc0.vl;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements h0 {
    public String a;
    public String b;
    public boolean c;
    public g d;
    public vl e;
    public j f;
    public String g;
    public h h;

    public l(String str, String str2, boolean z, g gVar, vl vlVar, j jVar, String str3, h hVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = gVar;
        this.e = vlVar;
        this.f = jVar;
        this.g = str3;
        this.h = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && this.c == lVar.c && k71.k.b(this.d, lVar.d) && this.e == lVar.e && k71.k.b(this.f, lVar.f) && k71.k.b(this.g, lVar.g) && k71.k.b(this.h, lVar.h);
    }

    public final int hashCode() {
        int e = x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        g gVar = this.d;
        return Integer.hashCode(this.h.a) + h1.i((this.f.hashCode() + ((this.e.hashCode() + ((e + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31)) * 31, this.g, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ReviewFields(__typename=", this.a, ", id=", this.b, ", authorCanPushToRepository=");
        o.append(this.c);
        o.append(", author=");
        o.append(this.d);
        o.append(", state=");
        o.append(this.e);
        o.append(", onBehalfOf=");
        o.append(this.f);
        o.append(", body=");
        o.append(this.g);
        o.append(", comments=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
