package uj;

import com.github.service.models.response.home.NavLinkIdentifier;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final NavLinkIdentifier a;
    public final boolean b;

    public c(NavLinkIdentifier navLinkIdentifier, boolean z) {
        k.g(navLinkIdentifier, "identifier");
        this.a = navLinkIdentifier;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DashboardNavLinksDataEntry(identifier=" + this.a + ", hidden=" + this.b + ")";
    }
}
