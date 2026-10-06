package t10;

import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final x01.i a;
    public final Object b;
    public final Object c;

    public d(List list, List list2, x01.i iVar) {
        this.a = iVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.h(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "Feed(page=" + this.a + ", feedItems=" + this.b + ", feedFiltersEnabled=" + this.c + ")";
    }
}
