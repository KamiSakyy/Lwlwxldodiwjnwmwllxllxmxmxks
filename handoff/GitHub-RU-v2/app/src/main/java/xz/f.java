package xz;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.h0 {
    public String a;
    public String b;
    public a c;
    public e d;
    public String e;

    public f(String str, String str2, a aVar, e eVar, String str3) {
        k71.k.g(str3, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = eVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && k71.k.b(this.c, fVar.c) && k71.k.b(this.d, fVar.d) && k71.k.b(this.e, fVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.d;
        return this.e.hashCode() + ((hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ProjectV2GroupDataFragment(viewGroupId=", this.a, ", title=", this.b, ", field=");
        o.append(this.c);
        o.append(", value=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}
