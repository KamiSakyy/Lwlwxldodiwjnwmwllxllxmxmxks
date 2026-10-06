package e;

import b91.g;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21795a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21796b;

    public a(long j10, Object obj) {
        this.f21795a = obj;
        this.f21796b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f21795a, aVar.f21795a) && this.f21796b == aVar.f21796b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21796b) + (this.f21795a.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f21795a + ", compositeKey=" + this.f21796b + ')';
    }

    public static Object r;

    public static Object w;

    public static Object x;

    public static Object y;

    public static Object v;

    public static Object q;

    public static Object t;

    public static Object c;

    public static Object b;
}
