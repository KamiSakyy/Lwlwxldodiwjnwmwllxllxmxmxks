package g3;

/* loaded from: /home/user/work/p/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long f24713a;

    /* renamed from: b, reason: collision with root package name */
    public long f24714b;

    public w(long j10, long j11) {
        this.f24713a = j10;
        this.f24714b = j11;
        s3.p[] pVarArr = s3.o.f31708b;
        if ((j10 & 1095216660480L) == 0) {
            m3.a.a("width cannot be TextUnit.Unspecified");
        }
        if ((j11 & 1095216660480L) == 0) {
            m3.a.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return s3.o.a(this.f24713a, wVar.f24713a) && s3.o.a(this.f24714b, wVar.f24714b);
    }

    public final int hashCode() {
        s3.p[] pVarArr = s3.o.f31708b;
        return Integer.hashCode(4) + x.i.c(Long.hashCode(this.f24713a) * 31, 31, this.f24714b);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) s3.o.d(this.f24713a)) + ", height=" + ((Object) s3.o.d(this.f24714b)) + ", placeholderVerticalAlign=" + ((Object) "Center") + ')';
    }
}
