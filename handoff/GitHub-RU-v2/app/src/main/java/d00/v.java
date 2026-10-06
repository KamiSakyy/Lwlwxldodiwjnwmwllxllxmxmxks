package d00;

import a0.s0;
import com.github.rudroid.copilot.h1;
import cq.u2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public String a;
    public String b;
    public t c;
    public u2 d;

    public v(String str, String str2, t tVar, u2 u2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = tVar;
        this.d = u2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c) && k71.k.b(this.d, vVar.d);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        t tVar = this.c;
        int hashCode = (i + (tVar == null ? 0 : tVar.hashCode())) * 31;
        u2 u2Var = this.d;
        return hashCode + (u2Var != null ? u2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("RepositoryOwner(__typename=", this.a, ", id=", this.b, ", onProjectV2Owner=");
        o.append(this.c);
        o.append(", organizationNameAndAvatar=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
