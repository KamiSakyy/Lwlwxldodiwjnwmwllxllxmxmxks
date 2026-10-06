package lm0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public l(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c) && k71.k.b(this.d, lVar.d) && k71.k.b(this.e, lVar.e);
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
