package i01;

import com.github.rudroid.copilot.h1;
import java.util.List;
import x01.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public Object a;
    public Object b;
    public i c;

    public d(List list, List list2, i iVar) {
        this.a = list;
        this.b = list2;
        this.c = iVar;
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
        return "MergeQueueListResult(merging=" + this.a + ", queuedToMerge=" + this.b + ", page=" + this.c + ")";
    }
}
