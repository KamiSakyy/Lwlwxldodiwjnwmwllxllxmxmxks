package on;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public j(int i, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Integer.hashCode(this.f) + x.i.e(h1.i(h1.i((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, this.c, 31), this.d, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder o = s0.o("RepositoryCodingAgent(avatarUrl=", this.a, ", botId=", this.b, ", slug=");
        f1.e.x(o, this.c, ", displayName=", this.d, ", isCopilot=");
        o.append(this.e);
        o.append(", integrationId=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
