package k60;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public d a;
    public String b;
    public boolean c;
    public boolean d;

    public a(d dVar, String str, boolean z, boolean z2) {
        this.a = dVar;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public static a a(a aVar, boolean z, boolean z2) {
        d dVar = aVar.a;
        String str = aVar.b;
        aVar.getClass();
        return new a(dVar, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDiscussion(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", viewerCanReact=");
        return m0.m(sb, this.c, ", viewerCanUpvote=", this.d, ")");
    }
    public Object O(Object p1) { return null; }
    public static final Object b = null;
}
