package ah0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final String a;
    public final boolean b;

    public b(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public static b a(b bVar, boolean z) {
        String str = bVar.a;
        bVar.getClass();
        return new b(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h1.n("OnIssue(id=", this.a, ", viewerCanReact=", ")", this.b);
    }
}
