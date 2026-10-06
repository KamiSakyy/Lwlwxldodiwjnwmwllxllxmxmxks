package ca1;

import da1.e0;
import da1.f0;
import da1.g0;
import da1.i0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends j {
    public f A;
    public f0 B;
    public int C;

    public g(String str, String str2, f0 f0Var) {
        super(new g0("#root", ba1.a.d("#root"), str), str2, null);
        this.A = new f();
        this.C = 1;
        this.B = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ca1.j] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ca1.o] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [ca1.j] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [ca1.j, ca1.o] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ca1.o] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ca1.o] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [ca1.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ca1.j] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ca1.j, ca1.o] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ca1.o] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ca1.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final j K() {
        Object H = H();
        while (true) {
            if (H == 0) {
                String str = this.u.r;
                g x = x();
                f0 f0Var = x != null ? x.B : new f0(new da1.b());
                i0 a = f0Var.a();
                e0 e0Var = f0Var.t;
                a.getClass();
                j jVar = new j(a.d("html", null, str, e0Var.a), e(), null);
                D(jVar);
                H = jVar;
            } else if (!H.p("html")) {
                while (true) {
                    H = H.q();
                    if (H == 0) {
                        H = 0;
                        break;
                    }
                    if (H instanceof j) {
                        H = (j) H;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        Object H2 = H.H();
        while (H2 != 0) {
            if (!H2.p("body") && !H2.p("frameset")) {
                while (true) {
                    H2 = H2.q();
                    if (H2 == 0) {
                        H2 = 0;
                        break;
                    }
                    if (H2 instanceof j) {
                        H2 = (j) H2;
                        break;
                    }
                }
            } else {
                return H2;
            }
        }
        String str2 = H.u.r;
        g x2 = H.x();
        f0 f0Var2 = x2 != null ? x2.B : new f0(new da1.b());
        i0 a2 = f0Var2.a();
        e0 e0Var2 = f0Var2.t;
        a2.getClass();
        j jVar2 = new j(a2.d("body", null, str2, e0Var2.a), H.e(), null);
        H.D(jVar2);
        return jVar2;
    }

    @Override // ca1.j, ca1.o
    /* renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g i() {
        g gVar = (g) super.i();
        b bVar = this.w;
        if (bVar != null) {
            gVar.w = bVar.clone();
        }
        gVar.A = this.A.clone();
        return gVar;
    }

    @Override // ca1.j, ca1.o
    public final String s() {
        return "#document";
    }

    @Override // ca1.o
    public final String v() {
        return I();
    }

    public g() {
        this("http://www.w3.org/1999/xhtml", "", new f0(new da1.b()));
    }
    public Object f(Object p1, Object p2) { return null; }
}
