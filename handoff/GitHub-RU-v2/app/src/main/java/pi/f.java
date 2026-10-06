package pi;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements p {
    public final String a;
    public final Object b;

    public f(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b.equals(fVar.b);
    }

    @Override // pi.p
    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ANSIEscapeSequence(text=" + this.a + ", codes=" + this.b + ")";
    }
}
