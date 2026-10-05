package h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class n1 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final w1.f f25386a;

    public n1(w1.f fVar) {
        this.f25386a = fVar;
    }

    @Override // h1.w0
    public final int a(s3.k kVar, long j10, int i, s3.m mVar) {
        int i10 = (int) (j10 >> 32);
        if (i >= i10) {
            return Math.round((1 + (mVar != s3.m.f31704r ? 0.0f * (-1) : 0.0f)) * ((i10 - i) / 2.0f));
        }
        return aa1.b.v(this.f25386a.a(i, i10, mVar), 0, i10 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1) && this.f25386a.equals(((n1) obj).f25386a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f25386a.f32935a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f25386a + ", margin=0)";
    }
}
