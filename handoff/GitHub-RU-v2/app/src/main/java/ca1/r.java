package ca1;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r {
    public static final /* synthetic */ int c = 0;
    public t a;
    public t b;

    public r(t tVar, t tVar2) {
        this.a = tVar;
        this.b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.a.equals(rVar.a)) {
            return this.b.equals(rVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        StringBuilder a = ba1.h.a();
        a.append(this.a);
        a.append('=');
        a.append(this.b);
        return ba1.h.k(a);
    }
}
