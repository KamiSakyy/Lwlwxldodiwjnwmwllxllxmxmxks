package ch;

import ch.a;
import d2.t;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final q0 a;
    public final long b;
    public final a.b c;

    public d(q0 q0Var, long j, a.b bVar) {
        this.a = q0Var;
        this.b = j;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && t.c(this.b, dVar.b) && this.c.equals(dVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = t.l;
        return this.c.hashCode() + x.i.c(hashCode, 31, this.b);
    }

    public final String toString() {
        return "MarkdownBacktickStyle(textStyle=" + this.a + ", backgroundColor=" + t.i(this.b) + ", background=" + this.c + ")";
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0<T1,T2,T3,T4> {
        public q0() {
        }
    }
}
