package t10;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final boolean a;
    public final g b;
    public final String c;

    public f(boolean z, g gVar, String str) {
        this.a = z;
        this.b = gVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && k71.k.b(this.c, fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedFilter(isEnabled=");
        sb.append(this.a);
        sb.append(", filterType=");
        sb.append(this.b);
        sb.append(", displayString=");
        return h1.p(sb, this.c, ")");
    }
}
