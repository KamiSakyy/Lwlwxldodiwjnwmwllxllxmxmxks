package rm0;

import jn0.yf0;
import jo.mi0;
import kc0.yb0;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class waShadow implements z01.g0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final v71.v s;
    public final y01.a t;

    public wa(int i, String str, q81.u uVar, v71.v vVar) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = vVar;
                w51.r rVar = new w51.r(11);
                rVar.l(xb.b.a(str));
                q81.t a = uVar.a();
                a.i = false;
                rVar.s = new q81.u(a);
                this.t = (y01.a) rVar.m().l(y01.a.class);
                break;
            case 2:
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = vVar;
                w51.r rVar2 = new w51.r(11);
                rVar2.l(xb.b.a(str));
                q81.t a2 = uVar.a();
                a2.i = false;
                rVar2.s = new q81.u(a2);
                this.t = (y01.a) rVar2.m().l(y01.a.class);
                break;
            case 3:
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = vVar;
                w51.r rVar3 = new w51.r(11);
                rVar3.l(xb.b.a(str));
                q81.t a3 = uVar.a();
                a3.i = false;
                rVar3.s = new q81.u(a3);
                this.t = (y01.a) rVar3.m().l(y01.a.class);
                break;
            default:
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = vVar;
                w51.r rVar4 = new w51.r(11);
                rVar4.l(xb.b.a(str));
                q81.t a4 = uVar.a();
                a4.i = false;
                rVar4.s = new q81.u(a4);
                this.t = (y01.a) rVar4.m().l(y01.a.class);
                break;
        }
    }

    @Override // z01.g0
    public final y71.i a(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new nm.g(d11.b.b(d11.a.t, new h11.j(this, str, str2, i, null, 1)), 1), this.s);
            case 1:
                return y71.n1.y(new nm.g(d11.b.b(d11.a.t, new h11.j(this, str, str2, i, null, 2)), 3), this.s);
            case 2:
                return y71.n1.y(new nm.g(d11.b.b(d11.a.t, new h11.j(this, str, str2, i, null, 3)), 14), this.s);
            default:
                return y71.n1.y(new nm.g(d11.b.b(d11.a.t, new h11.j(this, str, str2, i, null, 4)), 17), this.s);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
