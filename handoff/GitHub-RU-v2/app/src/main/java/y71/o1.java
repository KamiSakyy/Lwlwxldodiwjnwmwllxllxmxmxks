package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o1 extends z71.c {
    public long a;
    public v71.l b;

    @Override // z71.c
    public final boolean a(z71.a aVar) {
        m1 m1Var = (m1) aVar;
        if (this.a >= 0) {
            return false;
        }
        long j = m1Var.z;
        if (j < m1Var.A) {
            m1Var.A = j;
        }
        this.a = j;
        return true;
    }

    @Override // z71.c
    public final a71.c[] b(z71.a aVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((m1) aVar).w(j);
    }
}
