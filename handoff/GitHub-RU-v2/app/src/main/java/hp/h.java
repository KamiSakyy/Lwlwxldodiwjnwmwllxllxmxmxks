package hp;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements h0 {
    public final String a;
    public final g b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;

    public h(String str, g gVar, String str2, int i, String str3, boolean z) {
        this.a = str;
        this.b = gVar;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && this.d == hVar.d && k71.k.b(this.e, hVar.e) && this.f == hVar.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        g gVar = this.b;
        return Boolean.hashCode(this.f) + h1.i(s0.b(this.d, h1.i((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31, this.c, 31), 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodingAgentFragment(avatarUrl=");
        sb.append(this.a);
        sb.append(", bot=");
        sb.append(this.b);
        sb.append(", displayName=");
        s0.w(this.d, this.c, ", integrationId=", ", slug=", sb);
        return m0.k(sb, this.e, ", isCopilot=", this.f, ")");
    }
}
