package up;

import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public boolean b;

    public c(String str, boolean z) {
        this.a = str;
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
        return k.b(this.a, cVar.a) && this.b == cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h1.n("FeatureFlag(name=", this.a, ", enabled=", ")", this.b);
    }
    public static final Object a = null;
}
