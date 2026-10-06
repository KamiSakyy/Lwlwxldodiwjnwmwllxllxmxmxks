package eg;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.rudroid.utilities.ui.g1;
import f1.e;
import java.util.List;
import k71.k;
import x.i;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final g1 a;
    public final e1 b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final sz0.b h;
    public final a i;
    public final boolean j;

    public c(g1 g1Var, e1 e1Var, List list, boolean z, boolean z2, boolean z3, String str, sz0.b bVar, a aVar, boolean z4) {
        k.g(g1Var, "isSubscribingToCopilotFree");
        k.g(e1Var, "viewerLicenseType");
        k.g(list, "availableCopilotUpgradeSkus");
        k.g(str, "currentUserHandle");
        k.g(aVar, "copilotChatMonthlyLicenseDetails");
        this.a = g1Var;
        this.b = e1Var;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
        this.h = bVar;
        this.i = aVar;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && this.b == cVar.b && k.b(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && k.b(this.g, cVar.g) && this.h == cVar.h && k.b(this.i, cVar.i) && this.j == cVar.j;
    }

    public final int hashCode() {
        int i = h1.i(i.e(i.e(i.e(e.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), this.g, 31);
        sz0.b bVar = this.h;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + ((i + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CopilotChatSettingsUiModel(isSubscribingToCopilotFree=");
        sb.append(this.a);
        sb.append(", viewerLicenseType=");
        sb.append(this.b);
        sb.append(", availableCopilotUpgradeSkus=");
        h1.C(sb, this.c, ", viewerCanSubscribeToLimited=", this.d, ", isMobileChatPolicyDisabledByOrg=");
        m0.A(sb, this.e, ", isCopilotEnabledByUser=", this.f, ", currentUserHandle=");
        sb.append(this.g);
        sb.append(", copilotSubscriptionPlatform=");
        sb.append(this.h);
        sb.append(", copilotChatMonthlyLicenseDetails=");
        sb.append(this.i);
        sb.append(", canUserBuyUpgrade=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
