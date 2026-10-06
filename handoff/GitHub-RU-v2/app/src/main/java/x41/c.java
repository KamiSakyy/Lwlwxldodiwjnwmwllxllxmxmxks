package x41;

import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final String a;
    public final long b;
    public final Map c;

    public c(String str, long j, Map map) {
        k71.k.g(map, "additionalCustomKeys");
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && this.b == cVar.b && k71.k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}
