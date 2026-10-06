package ch;

import a0.s0;
import com.github.rudroid.copilot.h1;
import d2.t;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public long a;
    public long b;
    public long c;

    public b(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.a, bVar.a) && t.c(this.b, bVar.b) && t.c(this.c, bVar.c);
    }

    public final int hashCode() {
        int i = t.l;
        return Long.hashCode(this.c) + x.i.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String i = t.i(this.a);
        String i2 = t.i(this.b);
        return h1.p(s0.o("CommentComposerBadgeColors(drawableTintColor=", i, ", textColor=", i2, ", backgroundColor="), t.i(this.c), ")");
    }
}
