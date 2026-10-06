package z71;

import a0.s0;
import java.util.ArrayList;
import rm0.v4;
import v71.b0;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class d implements r {
    public a71.h r;
    public int s;
    public x71.a t;

    public d(a71.h hVar, int i, x71.a aVar) {
        this.r = hVar;
        this.s = i;
        this.t = aVar;
    }

    @Override // z71.r
    public final y71.i a(a71.h hVar, int i, x71.a aVar) {
        a71.h hVar2 = this.r;
        a71.h A = hVar.A(hVar2);
        x71.a aVar2 = x71.a.r;
        x71.a aVar3 = this.t;
        int i2 = this.s;
        if (aVar == aVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            aVar = aVar3;
        }
        return (k71.k.b(A, hVar2) && i == i2 && aVar == aVar3) ? this : e(A, i, aVar);
    }

    @Override // y71.i
    public Object b(y71.j jVar, a71.c cVar) {
        Object k = b0.k(new yl.b(jVar, this, (a71.c) null, 2), cVar);
        return k == b71.a.r ? k : a0.a;
    }

    public String c() {
        return null;
    }

    public abstract Object d(x71.t tVar, a71.c cVar);

    public abstract d e(a71.h hVar, int i, x71.a aVar);

    public y71.i f() {
        return null;
    }

    public x71.v g(v71.z zVar) {
        int i = this.s;
        if (i == -3) {
            i = -2;
        }
        v71.a0Shadow a0Var = v71.a0Shadow.t;
        j71.e v4Var = new v4(this, (a71.c) null, 25);
        x71.s sVar = new x71.s(b0.A(zVar, this.r), t.e.a(i, 4, this.t));
        sVar.q0(a0Var, sVar, v4Var);
        return sVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c = c();
        if (c != null) {
            arrayList.add(c);
        }
        a71.h hVar = a71.i.r;
        a71.h hVar2 = this.r;
        if (hVar2 != hVar) {
            arrayList.add("context=" + hVar2);
        }
        int i = this.s;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        x71.a aVar = x71.a.r;
        x71.a aVar2 = this.t;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return s0.m(sb, x61.m.c0(arrayList, ", ", (String) null, (String) null, 0, (j71.c) null, 62), ']');
    }
}
