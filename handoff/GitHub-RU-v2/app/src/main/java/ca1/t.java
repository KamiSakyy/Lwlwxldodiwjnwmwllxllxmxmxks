package ca1;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t {
    public static final t c;
    public final s a;
    public final s b;

    static {
        s sVar = new s(-1, -1, -1);
        c = new t(sVar, sVar);
    }

    public t(s sVar, s sVar2) {
        this.a = sVar;
        this.b = sVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.a.equals(tVar.a)) {
            return this.b.equals(tVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a + "-" + this.b;
    }
}
