package g01;

import com.github.service.models.response.home.NavLinkIdentifier;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final NavLinkIdentifier a;
    public final boolean b;

    public d(NavLinkIdentifier navLinkIdentifier, boolean z) {
        k.g(navLinkIdentifier, "identifier");
        this.a = navLinkIdentifier;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavLink(identifier=" + this.a + ", isHidden=" + this.b + ")";
    }
}
