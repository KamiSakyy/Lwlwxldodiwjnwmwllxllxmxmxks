package r3;

import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f31138c = new q(t1.C(0), t1.C(0));

    /* renamed from: a, reason: collision with root package name */
    public long f31139a;

    /* renamed from: b, reason: collision with root package name */
    public long f31140b;

    public q(long j10, long j11) {
        this.f31139a = j10;
        this.f31140b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s3.o.a(this.f31139a, qVar.f31139a) && s3.o.a(this.f31140b, qVar.f31140b);
    }

    public final int hashCode() {
        s3.p[] pVarArr = s3.o.f31708b;
        return Long.hashCode(this.f31140b) + (Long.hashCode(this.f31139a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) s3.o.d(this.f31139a)) + ", restLine=" + ((Object) s3.o.d(this.f31140b)) + ')';
    }
}
