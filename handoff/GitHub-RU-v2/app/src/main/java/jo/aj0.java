package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aj0 {
    public final m10.m8 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final xi0 f;
    public final yi0 g;
    public final wi0 h;
    public final m10.q8 i;
    public final List j;
    public final String k;
    public final String l;

    public aj0(m10.m8 m8Var, boolean z, boolean z2, boolean z3, boolean z4, xi0 xi0Var, yi0 yi0Var, wi0 wi0Var, m10.q8 q8Var, List list, String str, String str2) {
        this.a = m8Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = xi0Var;
        this.g = yi0Var;
        this.h = wi0Var;
        this.i = q8Var;
        this.j = list;
        this.k = str;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj0)) {
            return false;
        }
        aj0 aj0Var = (aj0) obj;
        return this.a == aj0Var.a && this.b == aj0Var.b && this.c == aj0Var.c && this.d == aj0Var.d && this.e == aj0Var.e && k71.k.b(this.f, aj0Var.f) && k71.k.b(this.g, aj0Var.g) && k71.k.b(this.h, aj0Var.h) && this.i == aj0Var.i && k71.k.b(this.j, aj0Var.j) && k71.k.b(this.k, aj0Var.k) && k71.k.b(this.l, aj0Var.l);
    }

    public final int hashCode() {
        m10.m8 m8Var = this.a;
        int e = x.i.e(x.i.e(x.i.e(x.i.e((m8Var == null ? 0 : m8Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        xi0 xi0Var = this.f;
        int hashCode = (e + (xi0Var == null ? 0 : xi0Var.a.hashCode())) * 31;
        yi0 yi0Var = this.g;
        int hashCode2 = (hashCode + (yi0Var == null ? 0 : yi0Var.hashCode())) * 31;
        wi0 wi0Var = this.h;
        int hashCode3 = (hashCode2 + (wi0Var == null ? 0 : wi0Var.hashCode())) * 31;
        m10.q8 q8Var = this.i;
        int hashCode4 = (hashCode3 + (q8Var == null ? 0 : q8Var.hashCode())) * 31;
        List list = this.j;
        return this.l.hashCode() + com.github.rudroid.copilot.h1.i((hashCode4 + (list != null ? list.hashCode() : 0)) * 31, this.k, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(copilotLicenseType=");
        sb.append(this.a);
        sb.append(", isCopilotMobileChatEnabled=");
        sb.append(this.b);
        sb.append(", viewerIsCopilotCodingAgentEnabled=");
        com.github.rudroid.m0.A(sb, this.c, ", viewerCanSubscribeToCopilotIndividual=", this.d, ", viewerCanSubscribeToCopilotLimited=");
        sb.append(this.e);
        sb.append(", copilotEndpoints=");
        sb.append(this.f);
        sb.append(", copilotLimitedUser=");
        sb.append(this.g);
        sb.append(", copilotConsumptiveUser=");
        sb.append(this.h);
        sb.append(", copilotSubscriptionPlatform=");
        sb.append(this.i);
        sb.append(", availableCopilotUpgradeSkus=");
        sb.append(this.j);
        sb.append(", id=");
        return x.i.k(sb, this.k, ", __typename=", this.l, ")");
    }















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a {
        public a() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c {
        public c() {
        }
    }
}
