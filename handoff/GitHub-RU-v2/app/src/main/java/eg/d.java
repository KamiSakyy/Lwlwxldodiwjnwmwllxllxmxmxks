package eg;

import com.github.rudroid.copilot.h1;
import java.util.List;
import k71.k;
import x.i;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public boolean a;
    public boolean b;
    public boolean c;
    public e1 d;
    public List e;

    public d(boolean z, boolean z2, boolean z3, e1 e1Var, List list) {
        k.g(e1Var, "licenseType");
        k.g(list, "availableCopilotUpgradeSkus");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = e1Var;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && k.b(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + i.e(i.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder u = h1.u("SettingsCopilotPermissionsUiModel(showCopilotSetting=", this.a, ", shouldNavigateToCopilotSettings=", this.b, ", shouldShowProPaywall=");
        u.append(this.c);
        u.append(", licenseType=");
        u.append(this.d);
        u.append(", availableCopilotUpgradeSkus=");
        return i.l(u, this.e, ")");
    }
}
