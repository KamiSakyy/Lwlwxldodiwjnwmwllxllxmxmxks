package v71;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public class e1 extends j1 {
    public boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(d1 d1Var) {
        super(true);
        boolean z = true;
        S(d1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j1.s;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar != null) {
            j1 j = pVar.j();
            while (!j.J()) {
                o oVar2 = (o) atomicReferenceFieldUpdater.get(j);
                p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
                if (pVar2 != null) {
                    j = pVar2.j();
                }
            }
            this.t = z;
        }
        z = false;
        this.t = z;
    }

    @Override // v71.j1
    public final boolean J() {
        return this.t;
    }

    @Override // v71.j1
    public final boolean L() {
        return true;
    }
}
