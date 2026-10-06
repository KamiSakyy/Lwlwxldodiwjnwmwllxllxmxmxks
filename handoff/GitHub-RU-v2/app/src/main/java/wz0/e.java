package wz0;

import com.github.rudroid.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public String a;
    public int b;

    public e(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && this.b == eVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return m0.b(this.b, "SyntaxHighlightedLine(html=", this.a, ", contentLength=", ")");
    }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
