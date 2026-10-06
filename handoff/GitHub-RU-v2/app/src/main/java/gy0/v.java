package gy0;

import a0.s0;
import ap0.e2;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public String a;
    public String b;
    public t c;
    public e2 d;

    public v(String str, String str2, t tVar, e2 e2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = tVar;
        this.d = e2Var;
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
        e2 e2Var = this.d;
        return hashCode + (e2Var != null ? e2Var.hashCode() : 0);
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
