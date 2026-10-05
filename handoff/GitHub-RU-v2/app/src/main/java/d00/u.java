package d00;

import com.github.rudroid.copilot.h1;
import tz.u4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public final String a;
    public final r b;
    public final w c;
    public final String d;
    public final u4 e;

    public u(String str, r rVar, w wVar, String str2, u4 u4Var) {
        this.a = str;
        this.b = rVar;
        this.c = wVar;
        this.d = str2;
        this.e = u4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c) && k71.k.b(this.d, uVar.d) && k71.k.b(this.e, uVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r rVar = this.b;
        return this.e.hashCode() + h1.i((this.c.hashCode() + ((hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        return "ProjectV2(__typename=" + this.a + ", defaultView=" + this.b + ", views=" + this.c + ", id=" + this.d + ", projectWithFieldsFragment=" + this.e + ")";
    }
}
