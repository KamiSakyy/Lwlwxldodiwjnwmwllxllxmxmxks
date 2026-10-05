package uw;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnCheckRun(id=", this.a, ")");
    }
}
