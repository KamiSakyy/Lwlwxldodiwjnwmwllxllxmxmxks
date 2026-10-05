package x01;

import com.github.rudroid.copilot.h1;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public static final h Companion = new h();
    public static final i d = new i(null, false, true);
    public final boolean a;
    public final String b;
    public final boolean c;

    public i(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean a() {
        if (this.a) {
            return this.b != null || this.c;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && k71.k.b(this.b, iVar.b) && this.c == iVar.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return f4.s(h1.t("Page(hasNextPageApiValue=", ", endCursor=", this.b, ", isHead=", this.a), this.c, ")");
    }
}
