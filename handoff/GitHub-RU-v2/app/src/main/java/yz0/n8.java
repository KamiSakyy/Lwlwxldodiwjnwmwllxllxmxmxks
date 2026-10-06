package yz0;

import com.github.service.models.response.type.SocialLinkService;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n8 {
    public final String a;
    public final SocialLinkService b;
    public final String c;

    public n8(String str, SocialLinkService socialLinkService, String str2) {
        k71.k.g(socialLinkService, "service");
        this.a = str;
        this.b = socialLinkService;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        return k71.k.b(this.a, n8Var.a) && this.b == n8Var.b && k71.k.b(this.c, n8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialLink(url=");
        sb.append(this.a);
        sb.append(", service=");
        sb.append(this.b);
        sb.append(", displayName=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
