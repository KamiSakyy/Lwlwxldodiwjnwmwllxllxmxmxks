package xn;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d2 extends sy.s {
    public final String a;
    public final g1 b;
    public final Map c;

    public d2(String str, g1 g1Var, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = g1Var;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return k71.k.b(this.a, d2Var.a) && this.b == d2Var.b && k71.k.b(this.c, d2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g1 g1Var = this.b;
        int hashCode2 = (hashCode + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Override // sy.s
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return "ElicitationCompletion(requestId=" + this.a + ", action=" + this.b + ", content=" + this.c + ")";
    }
}
