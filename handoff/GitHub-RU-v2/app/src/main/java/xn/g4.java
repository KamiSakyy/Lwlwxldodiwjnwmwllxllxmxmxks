package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g4 {
    public e1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public sz0.b e;
    public List f;
    public String g;
    public f1 h;

    public g4(e1 e1Var, boolean z, boolean z2, boolean z3, sz0.b bVar, List list, String str, f1 f1Var) {
        k71.k.g(e1Var, "licenseType");
        k71.k.g(list, "availableCopilotUpgradeSkus");
        this.a = e1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = bVar;
        this.f = list;
        this.g = str;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return this.a == g4Var.a && this.b == g4Var.b && this.c == g4Var.c && this.d == g4Var.d && this.e == g4Var.e && k71.k.b(this.f, g4Var.f) && k71.k.b(this.g, g4Var.g) && k71.k.b(this.h, g4Var.h);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        sz0.b bVar = this.e;
        int c = f1.e.c(this.f, (e + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        String str = this.g;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        f1 f1Var = this.h;
        return hashCode + (f1Var != null ? f1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewerCopilotPermissions(licenseType=");
        sb.append(this.a);
        sb.append(", isCopilotMobileChatEnabled=");
        sb.append(this.b);
        sb.append(", viewerIsCopilotCodingAgentEnabled=");
        com.github.rudroid.m0.A(sb, this.c, ", viewerCanSubscribeToCopilotLimited=", this.d, ", copilotSubscriptionPlatform=");
        sb.append(this.e);
        sb.append(", availableCopilotUpgradeSkus=");
        sb.append(this.f);
        sb.append(", copilotApiUrl=");
        sb.append(this.g);
        sb.append(", copilotUserLimits=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ g4(int i, boolean z, boolean z2) {
        this((i & 1) != 0 ? e1.z : e1.x, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, false, null, x61.r.r, null, null);
    }
}
