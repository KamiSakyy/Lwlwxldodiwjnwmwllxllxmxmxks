package s11;

import java.util.HashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final v11.a a;
    public final HashMap b;

    public b(v11.a aVar, HashMap hashMap) {
        this.a = aVar;
        this.b = hashMap;
    }

    public final long a(j11.d dVar, long j, int i) {
        long b = j - this.a.b();
        c cVar = (c) this.b.get(dVar);
        long j2 = cVar.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), b), cVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
