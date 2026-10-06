package yz0;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.InteractionType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c5 {
    public final InteractionType a;
    public final String b;
    public final Avatar c;
    public final String d;

    public c5(InteractionType interactionType, String str, Avatar avatar, String str2, int i) {
        interactionType = (i & 1) != 0 ? null : interactionType;
        str2 = (i & 8) != 0 ? "" : str2;
        k71.k.g(str, "login");
        k71.k.g(avatar, "avatar");
        this.a = interactionType;
        this.b = str;
        this.c = avatar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return this.a == c5Var.a && k71.k.b(this.b, c5Var.b) && k71.k.b(this.c, c5Var.c) && k71.k.b(this.d, c5Var.d);
    }

    public final int hashCode() {
        InteractionType interactionType = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.j(this.c, com.github.rudroid.copilot.h1.i((interactionType == null ? 0 : interactionType.hashCode()) * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "Summary(type=" + this.a + ", login=" + this.b + ", avatar=" + this.c + ", body=" + this.d + ")";
    }
}
