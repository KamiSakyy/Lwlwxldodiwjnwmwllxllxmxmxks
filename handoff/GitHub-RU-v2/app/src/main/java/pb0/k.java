package pb0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public k(String str, String str2, String str3, String str4, String str5) {
        k71.k.g(str, "id");
        k71.k.g(str3, "descriptionHTML");
        k71.k.g(str4, "shortDescriptionHTML");
        k71.k.g(str5, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && k71.k.b(this.c, kVar.c) && k71.k.b(this.d, kVar.d) && k71.k.b(this.e, kVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + h1.i(h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Repository(id=", this.a, ", description=", this.b, ", descriptionHTML=");
        f1.e.x(o, this.c, ", shortDescriptionHTML=", this.d, ", __typename=");
        return h1.p(o, this.e, ")");
    }
}
