package qb;

import f1.e;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f31028a;

    public static String a(String str) {
        return e.z("CommitOid(value=", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return k.b(this.f31028a, ((a) obj).f31028a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31028a.hashCode();
    }

    public final String toString() {
        return a(this.f31028a);
    }
}
