package a71;

import a0.s0;
import java.io.Serializable;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements h, Serializable {
    public h r;
    public f s;

    public b(f fVar, h hVar) {
        k.g(hVar, "left");
        k.g(fVar, "element");
        this.r = hVar;
        this.s = fVar;
    }

    @Override // a71.h
    public final h A(h hVar) {
        k.g(hVar, "context");
        return hVar == i.r ? this : (h) hVar.x0(new a00.a(3, (byte) 0), this);
    }

    @Override // a71.h
    public final h b0(g gVar) {
        k.g(gVar, "key");
        f fVar = this.s;
        f w0 = fVar.w0(gVar);
        h hVar = this.r;
        if (w0 != null) {
            return hVar;
        }
        h b0 = hVar.b0(gVar);
        return b0 == hVar ? this : b0 == i.r ? fVar : new b(fVar, b0);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i = 2;
            b bVar2 = bVar;
            int i2 = 2;
            while (true) {
                h hVar = bVar2.r;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i2++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.r;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.s;
                    if (!k.b(bVar.w0(fVar.getKey()), fVar)) {
                        z = false;
                        break;
                    }
                    h hVar3 = bVar4.r;
                    if (!(hVar3 instanceof b)) {
                        k.e(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        z = k.b(bVar.w0(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.s.hashCode() + this.r.hashCode();
    }

    public final String toString() {
        return s0.m(new StringBuilder("["), (String) x0(new a00.a(2, (byte) 0), ""), ']');
    }

    @Override // a71.h
    public final f w0(g gVar) {
        k.g(gVar, "key");
        b bVar = this;
        while (true) {
            f w0 = bVar.s.w0(gVar);
            if (w0 != null) {
                return w0;
            }
            h hVar = bVar.r;
            if (!(hVar instanceof b)) {
                return hVar.w0(gVar);
            }
            bVar = (b) hVar;
        }
    }

    @Override // a71.h
    public final Object x0(j71.e eVar, Object obj) {
        return eVar.s(this.r.x0(eVar, obj), this.s);
    }
}
