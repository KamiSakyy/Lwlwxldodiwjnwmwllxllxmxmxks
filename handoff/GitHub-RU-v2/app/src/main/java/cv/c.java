package cv;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public c(String str, String str2, List list, String str3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && k71.k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int i = h1.i((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
        List list = this.c;
        return this.d.hashCode() + ((i + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnGist(description=", this.a, ", url=", this.b, ", files=");
        o.append(this.c);
        o.append(", id=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}
