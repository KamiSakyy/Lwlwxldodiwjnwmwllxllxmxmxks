package ly;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public String a;
    public String b;
    public String c;
    public t d;
    public p e;
    public String f;

    public q(String str, String str2, String str3, t tVar, p pVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tVar;
        this.e = pVar;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c) && k71.k.b(this.d, qVar.d) && k71.k.b(this.e, qVar.e) && k71.k.b(this.f, qVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("List(id=", this.a, ", name=", this.b, ", description=");
        o.append(this.c);
        o.append(", user=");
        o.append(this.d);
        o.append(", items=");
        o.append(this.e);
        o.append(", __typename=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
