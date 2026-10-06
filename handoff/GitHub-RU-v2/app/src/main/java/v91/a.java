package v91;

import b21.v;
import c21.h0;
import h0.q1;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a extends u91.b {
    public h0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t91.d dVar, q1 q1Var, q71.g gVar, int i, int i2) {
        super(dVar, new v(q1Var));
        h0 h0Var = j91.a.D;
        k.g(dVar, "myConstraints");
        int i3 = q1Var.a;
        y61.b i4 = d0.i();
        int i5 = ((q71.e) gVar).r;
        int i6 = i3 + i5;
        int i7 = ((q71.e) gVar).s;
        int i8 = i3 + i7 + 1;
        q71.g gVar2 = new q71.g(i6, i8, 1);
        h0 h0Var2 = j91.a.V;
        i4.add(new x91.e(gVar2, h0Var2));
        if (i8 != i) {
            i4.add(new x91.e(new q71.g(i8, i, 1), j91.a.W));
        }
        if (i != i2) {
            i4.add(new x91.e(new q71.g(i, i2, 1), h0Var2));
        }
        q1Var.a(d0.h(i4));
        switch ((i7 - i5) + 1) {
            case 1:
                h0Var = j91.a.y;
                break;
            case 2:
                h0Var = j91.a.z;
                break;
            case 3:
                h0Var = j91.a.A;
                break;
            case 4:
                h0Var = j91.a.B;
                break;
            case 5:
                h0Var = j91.a.C;
                break;
        }
        this.e = h0Var;
    }

    @Override // u91.b
    public final boolean b() {
        return false;
    }

    @Override // u91.b
    public final int c(s91.c cVar) {
        return cVar.d();
    }

    @Override // u91.b
    public final u91.a d(s91.c cVar, t91.d dVar) {
        k.g(dVar, "currentConstraints");
        return cVar.b == -1 ? new u91.a(2, 1, 1) : u91.a.e;
    }

    @Override // u91.b
    public final h0 e() {
        return this.e;
    }

    @Override // u91.b
    public final boolean f(s91.c cVar) {
        return true;
    }
}
