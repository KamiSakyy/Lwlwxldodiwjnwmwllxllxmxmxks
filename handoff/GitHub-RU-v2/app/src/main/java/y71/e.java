package y71;

import java.util.Iterator;
import rm0.v4;

/* loaded from: /home/user/work/p/classes5.dex */
public class e extends z71.d {
    public final /* synthetic */ int u = 0;
    public Object v;

    public e(Iterable iterable, a71.h hVar, int i, x71.a aVar) {
        super(hVar, i, aVar);
        this.v = iterable;
    }

    @Override // z71.d
    public Object d(x71.t tVar, a71.c cVar) {
        switch (this.u) {
            case 0:
                Object s = ((c71.j) this.v).s(tVar, cVar);
                if (s != b71.a.r) {
                    break;
                }
                break;
            default:
                z71.x xVar = new z71.x(tVar);
                Iterator it = ((Iterable) this.v).iterator();
                while (it.hasNext()) {
                    v71.b0.z(tVar, null, null, new v4((i) it.next(), xVar, (a71.c) null, 27), 3);
                }
                break;
        }
        return w61.a0.a;
    }

    @Override // z71.d
    public z71.d e(a71.h hVar, int i, x71.a aVar) {
        switch (this.u) {
            case 0:
                return new e((j71.e) this.v, hVar, i, aVar);
            default:
                return new e((Iterable) this.v, hVar, i, aVar);
        }
    }

    @Override // z71.d
    public x71.v g(v71.z zVar) {
        switch (this.u) {
            case 1:
                j71.e v4Var = new v4(this, (a71.c) null, 25);
                x71.a aVar = x71.a.r;
                v71.a0 a0Var = v71.a0.r;
                x71.s sVar = new x71.s(v71.b0.A(zVar, this.r), t.e.a(this.s, 4, aVar));
                sVar.q0(a0Var, sVar, v4Var);
                return sVar;
            default:
                return super.g(zVar);
        }
    }

    @Override // z71.d
    public String toString() {
        switch (this.u) {
            case 0:
                return "block[" + ((c71.j) this.v) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    public e(j71.e eVar, a71.h hVar, int i, x71.a aVar) {
        super(hVar, i, aVar);
        this.v = (c71.j) eVar;
    }
}
