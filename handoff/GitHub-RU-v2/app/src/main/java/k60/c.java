package k60;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final boolean b;

    public c(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public static c a(c cVar, boolean z) {
        String str = cVar.a;
        cVar.getClass();
        return new c(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && this.b == cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h1.n("OnPullRequest(id=", this.a, ", viewerCanReact=", ")", this.b);
    }
}
