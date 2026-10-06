package z71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class y implements a71.c, c71.d {
    public a71.c r;
    public a71.h s;

    public y(a71.c cVar, a71.h hVar) {
        this.r = cVar;
        this.s = hVar;
    }

    public final c71.d g() {
        c71.d dVar = this.r;
        if (dVar instanceof c71.d) {
            return dVar;
        }
        return null;
    }

    public final void i(Object obj) {
        this.r.i(obj);
    }

    public final a71.h q() {
        return this.s;
    }
}
