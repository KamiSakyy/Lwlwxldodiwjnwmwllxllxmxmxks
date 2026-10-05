package b61;

import a0.s0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;

    public e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k.b(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return s0.m(new StringBuilder("SessionDetails(sessionId="), this.a, ')');
    }
}
