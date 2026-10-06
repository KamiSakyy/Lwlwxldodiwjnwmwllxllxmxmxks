package ac0;

import a7.i;
import a71.c;
import com.github.service.repositorycreation.CreateRepositoryInput;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import d9.l;
import jn0.yf0;
import k71.k;
import kc0.yb0;
import l81.n;
import q81.q;
import q81.u;
import u10.y90;
import v71.v;
import w51.r;
import wa.g;
import y71.n1Shadow;
import z01.e1;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements e1, y90, yf0, yb0 {
    public final /* synthetic */ int r;
    public v s;
    public Object t;

    public b(int i, String str, u uVar, v vVar) {
        this.r = i;
        k.g(uVar, "okHttpClient");
        k.g(vVar, "ioDispatcher");
        switch (i) {
            case 1:
                this.s = vVar;
                n q = d5.q(new l(25));
                r rVar = new r(11);
                rVar.l(xb.b.a(str));
                t71.n nVar = q.d;
                rVar.e(a.a.g(q, i4.V("application/json")));
                rVar.s = uVar;
                this.t = (vy0.a) rVar.m().l(vy0.a.class);
                break;
            case 2:
                this.s = vVar;
                n q2 = d5.q(new g(9));
                r rVar2 = new r(11);
                rVar2.l(xb.b.a(str));
                t71.n nVar2 = q.d;
                rVar2.e(a.a.g(q2, i4.V("application/json")));
                rVar2.s = uVar;
                this.t = (qm0.a) rVar2.m().l(qm0.a.class);
                break;
            default:
                this.s = vVar;
                n q3 = d5.q(new i(3));
                r rVar3 = new r(11);
                rVar3.l(xb.b.a(str));
                t71.n nVar3 = q.d;
                rVar3.e(a.a.g(q3, i4.V("application/json")));
                rVar3.s = uVar;
                this.t = (ub0.a) rVar3.m().l(ub0.a.class);
                break;
        }
    }

    @Override // z01.e1
    public final y71.i a() {
        switch (this.r) {
            case 0:
                return n1Shadow.y(d11.b.b(d11.a.t, new a(this, null, 0)), this.s);
            case 1:
                return n1Shadow.y(d11.b.b(d11.a.t, new dz0.a(this, null, 0)), this.s);
            default:
                return n1Shadow.y(d11.b.b(d11.a.t, new wm0.a(this, null, 0)), this.s);
        }
    }

    @Override // z01.e1
    public final y71.i b(CreateRepositoryInput createRepositoryInput) {
        switch (this.r) {
            case 0:
                return n1Shadow.y(d11.b.b(d11.b.a, new a10.b(this, createRepositoryInput, (c) null, 1)), this.s);
            case 1:
                return n1Shadow.y(d11.b.b(d11.b.a, new a10.b(this, createRepositoryInput, (c) null, 4)), this.s);
            default:
                return n1Shadow.y(d11.b.b(d11.b.a, new a10.b(this, createRepositoryInput, (c) null, 13)), this.s);
        }
    }

    @Override // z01.e1
    public final y71.i c() {
        switch (this.r) {
            case 0:
                return n1Shadow.y(d11.b.b(d11.a.t, new a(this, null, 1)), this.s);
            case 1:
                return n1Shadow.y(d11.b.b(d11.a.t, new dz0.a(this, null, 1)), this.s);
            default:
                return n1Shadow.y(d11.b.b(d11.a.t, new wm0.a(this, null, 1)), this.s);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
