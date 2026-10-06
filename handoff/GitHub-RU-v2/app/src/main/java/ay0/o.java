package ay0;

import com.github.rudroid.copilot.h1;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public final boolean a;
    public final String b;
    public final boolean c;

    public o(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public static o a(o oVar, int i) {
        boolean z = (i & 1) != 0 ? oVar.a : true;
        boolean z2 = oVar.c;
        oVar.getClass();
        return new o(null, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && k71.k.b(this.b, oVar.b) && this.c == oVar.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return f4.s(h1.t("PageInfo(hasNextPage=", ", endCursor=", this.b, ", hasPreviousPage=", this.a), this.c, ")");
    }
}
