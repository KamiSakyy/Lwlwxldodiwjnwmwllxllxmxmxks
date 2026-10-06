package ca1;

/* loaded from: /home/user/work/p/classes5.dex */
public class q extends a5.s {
    public boolean x;

    public static boolean K(o oVar) {
        return (oVar instanceof u) && ba1.h.e(((u) oVar).F());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3, types: [ca1.j] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ca1.o] */
    /* JADX WARN: Type inference failed for: r6v5, types: [ca1.o] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public boolean L(o oVar) {
        j jVar;
        if (oVar != null && (oVar instanceof j)) {
            j jVar2 = (j) oVar;
            int i = jVar2.u.u;
            if ((i & 4) != 0) {
                return true;
            }
            if ((i & 1) == 0) {
                if (!(jVar2.r instanceof g)) {
                    int i2 = 0;
                    ca1.o r6 = (ca1.o) (jVar2.H());
                    while (i2 < 5 && r6 != 0) {
                        int i3 = r6.u.u;
                        if ((i3 & 4) == 0 && (i3 & 1) != 0) {
                            while (true) {
                                r6 = r6.q();
                                if (r6 == 0) {
                                    jVar = null;
                                    break;
                                }
                                if (r6 instanceof j) {
                                    jVar = (j) r6;
                                    break;
                                }
                            }
                            i2++;
                            r6 = jVar;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean M(o oVar) {
        if (oVar != null && oVar != ((o) ((a5.s) this).t) && !this.x && !K(oVar)) {
            if (L(oVar)) {
                return true;
            }
            o A = oVar.A();
            while (K(A)) {
                A = A.A();
            }
            if (L(A)) {
                return true;
            }
            j jVar = oVar.r;
            if (L(jVar) && !jVar.u.b(8)) {
                o l = jVar.l();
                int i = 0;
                while (true) {
                    if (i >= 5 || l == null) {
                        break;
                    }
                    if (!(l instanceof u)) {
                        if (A == null) {
                            return true;
                        }
                        if ((A instanceof u) || (!L(A) && (A instanceof j))) {
                            break;
                        }
                        return true;
                    }
                    l = l.q();
                    i++;
                }
            }
        }
        return false;
    }

    public final void a(int i, j jVar) {
        if (M(jVar)) {
            w(i);
        }
        jVar.w((ba1.a) ((a5.s) this).u, (f) ((a5.s) this).s);
        if (jVar.u.b(64)) {
            this.x = true;
        }
    }

    public final void i(n nVar, int i) {
        if (M(nVar)) {
            w(i);
        }
        nVar.w((ba1.a) ((a5.s) this).u, (f) ((a5.s) this).s);
    }

    public final void k(int i, j jVar) {
        o l = jVar.l();
        while (K(l)) {
            l = l.q();
        }
        if (M(l)) {
            w(i);
        }
        super.k(i, jVar);
        if (this.x && jVar.u.b(64)) {
            for (j jVar2 = jVar.r; jVar2 != null; jVar2 = jVar2.r) {
                if ((jVar2.u.u & 64) != 0) {
                    return;
                }
            }
            this.x = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (ba1.h.h(((ca1.n) r2).F().codePointAt(0)) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(u uVar, int i, int i2) {
        int i3 = 0;
        if (!this.x) {
            int i4 = 4;
            if (L(uVar.r)) {
                o A = uVar.A();
                o q = uVar.q();
                if ((!(A instanceof j) || L(A)) && (A == null || (!(A instanceof u) && M(A)))) {
                    i4 = 12;
                }
                if (q != null && ((q instanceof u) || !M(q))) {
                    while (K(q)) {
                        q = q.q();
                    }
                    if (q instanceof u) {
                    }
                }
                i3 = i4 | 16;
                if (!ba1.h.e(uVar.F()) && L(uVar.r) && M(uVar)) {
                    w(i2);
                }
            }
            i3 = i4;
            if (!ba1.h.e(uVar.F())) {
                w(i2);
            }
        }
        super.l(uVar, i3, i2);
    }

    public q(Object... a) {
    }
    public Object w(int) { return null; }
}
