package ca1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p implements Iterator {
    public o r;
    public o s;
    public o t;
    public o u;
    public o v;
    public Class w;

    public p(o oVar, Class cls) {
        this.w = cls;
        if (cls.isInstance(oVar)) {
            this.s = oVar;
        }
        this.t = oVar;
        this.u = oVar;
        this.r = oVar;
        this.v = oVar.z();
    }

    public final void a() {
        o oVar;
        if (this.s != null) {
            return;
        }
        if (this.v != null && this.t.r == null) {
            this.t = this.u;
        }
        o oVar2 = this.t;
        loop0: while (true) {
            oVar = null;
            if (oVar2.g() > 0) {
                oVar2 = (o) oVar2.k().get(0);
            } else {
                o oVar3 = this.r;
                oVar3.getClass();
                if (oVar3 == oVar2) {
                    oVar2 = null;
                } else if (oVar2.q() != null) {
                    oVar2 = oVar2.q();
                } else {
                    do {
                        oVar2 = oVar2.z();
                        if (oVar2 == null) {
                            break loop0;
                        }
                        o oVar4 = this.r;
                        oVar4.getClass();
                        if (oVar4 == oVar2) {
                            break loop0;
                        }
                    } while (oVar2.q() == null);
                    oVar2 = oVar2.q();
                }
            }
            if (oVar2 == null) {
                break;
            } else if (this.w.isInstance(oVar2)) {
                oVar = oVar2;
                break;
            }
        }
        this.s = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.s != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        o oVar = this.s;
        if (oVar == null) {
            throw new NoSuchElementException();
        }
        this.u = this.t;
        this.t = oVar;
        this.v = oVar.z();
        this.s = null;
        return oVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        o oVar = this.t;
        j jVar = oVar.r;
        if (jVar != null) {
            jVar.B(oVar);
        }
    }
}
