package v2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class k extends w1.q {
    public final int F = e1.e(this);
    public w1.q G;

    @Override // w1.q
    public final void E0() {
        super.E0();
        for (w1.q qVar = this.G; qVar != null; qVar = qVar.f32952w) {
            qVar.N0(this.f32954y);
            if (!qVar.E) {
                qVar.E0();
            }
        }
    }

    @Override // w1.q
    public final void F0() {
        for (w1.q qVar = this.G; qVar != null; qVar = qVar.f32952w) {
            qVar.F0();
        }
        super.F0();
    }

    @Override // w1.q
    public final void J0() {
        super.J0();
        for (w1.q qVar = this.G; qVar != null; qVar = qVar.f32952w) {
            qVar.J0();
        }
    }

    @Override // w1.q
    public final void K0() {
        for (w1.q qVar = this.G; qVar != null; qVar = qVar.f32952w) {
            qVar.K0();
        }
        super.K0();
    }

    @Override // w1.q
    public final void L0() {
        super.L0();
        for (w1.q qVar = this.G; qVar != null; qVar = qVar.f32952w) {
            qVar.L0();
        }
    }

    @Override // w1.q
    public final void M0(w1.q qVar) {
        this.f32947r = qVar;
        for (w1.q qVar2 = this.G; qVar2 != null; qVar2 = qVar2.f32952w) {
            qVar2.M0(qVar);
        }
    }

    @Override // w1.q
    public final void N0(d1 d1Var) {
        this.f32954y = d1Var;
        for (w1.q qVar = this.G; qVar != null; qVar = qVar.f32952w) {
            qVar.N0(d1Var);
        }
    }

    public final j O0(j jVar) {
        w1.q qVar = ((w1.q) jVar).f32947r;
        if (qVar != jVar) {
            w1.q qVar2 = jVar instanceof w1.q ? (w1.q) jVar : null;
            w1.q qVar3 = qVar2 != null ? qVar2.f32951v : null;
            if (qVar != this.f32947r || !k71.k.b(qVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (qVar.E) {
                t2.a.b("Cannot delegate to an already attached node");
            }
            qVar.M0(this.f32947r);
            int i = this.f32949t;
            int f6 = e1.f(qVar);
            qVar.f32949t = f6;
            int i10 = this.f32949t;
            int i11 = f6 & 2;
            if (i11 != 0 && (i10 & 2) != 0 && !(this instanceof x)) {
                t2.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + qVar);
            }
            qVar.f32952w = this.G;
            this.G = qVar;
            qVar.f32951v = this;
            Q0(f6 | this.f32949t, false);
            if (this.E) {
                if (i11 == 0 || (i & 2) != 0) {
                    N0(this.f32954y);
                } else {
                    m11.h hVar = l.v(this).X;
                    this.f32947r.N0(null);
                    hVar.i();
                }
                qVar.E0();
                qVar.K0();
                if (!qVar.E) {
                    t2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                e1.a(qVar, -1, 1);
            }
        }
        return jVar;
    }

    public final void P0(j jVar) {
        w1.q qVar = null;
        for (w1.q qVar2 = this.G; qVar2 != null; qVar2 = qVar2.f32952w) {
            if (qVar2 == jVar) {
                boolean z10 = qVar2.E;
                if (z10) {
                    x.c0 c0Var = e1.f32476a;
                    if (!z10) {
                        t2.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    e1.a(qVar2, -1, 2);
                    qVar2.L0();
                    qVar2.F0();
                }
                qVar2.M0(qVar2);
                qVar2.f32950u = 0;
                if (qVar == null) {
                    this.G = qVar2.f32952w;
                } else {
                    qVar.f32952w = qVar2.f32952w;
                }
                qVar2.f32952w = null;
                qVar2.f32951v = null;
                int i = this.f32949t;
                int f6 = e1.f(this);
                Q0(f6, true);
                if (this.E && (i & 2) != 0 && (f6 & 2) == 0) {
                    m11.h hVar = l.v(this).X;
                    this.f32947r.N0(null);
                    hVar.i();
                    return;
                }
                return;
            }
            qVar = qVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + jVar).toString());
    }

    public final void Q0(int i, boolean z10) {
        w1.q qVar;
        int i10 = this.f32949t;
        this.f32949t = i;
        if (i10 != i) {
            w1.q qVar2 = this.f32947r;
            if (qVar2 == this) {
                this.f32950u = i;
            }
            if (this.E) {
                w1.q qVar3 = this;
                while (qVar3 != null) {
                    i |= qVar3.f32949t;
                    qVar3.f32949t = i;
                    if (qVar3 == qVar2) {
                        break;
                    } else {
                        qVar3 = qVar3.f32951v;
                    }
                }
                if (z10 && qVar3 == qVar2) {
                    i = e1.f(qVar2);
                    qVar2.f32949t = i;
                }
                int i11 = i | ((qVar3 == null || (qVar = qVar3.f32952w) == null) ? 0 : qVar.f32950u);
                while (qVar3 != null) {
                    i11 |= qVar3.f32949t;
                    qVar3.f32950u = i11;
                    qVar3 = qVar3.f32951v;
                }
            }
        }
    }

}
