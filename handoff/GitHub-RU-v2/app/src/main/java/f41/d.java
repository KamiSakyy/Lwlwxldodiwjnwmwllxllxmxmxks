package f41;

import fa1.q0;
import fa1.t;
import k71.k;
import kotlin.KotlinNullPointerException;
import retrofit2.HttpException;
import sy.y;
import v71.l;
import w21.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements w21.e, w21.d, w21.c, fa1.h {
    public final /* synthetic */ int r;
    public final /* synthetic */ l s;

    public /* synthetic */ d(l lVar, int i) {
        this.r = i;
        this.s = lVar;
    }

    @Override // w21.e
    public void e(Object obj) {
        this.s.i(obj);
    }

    @Override // w21.d
    public void h(Exception exc) {
        this.s.i(y.d(exc));
    }

    public void i(fa1.e eVar, q0 q0Var) {
        switch (this.r) {
            case 3:
                boolean z = q0Var.a.H;
                l lVar = this.s;
                if (!z) {
                    lVar.i(y.d(new HttpException(q0Var)));
                    break;
                } else {
                    Object obj = q0Var.b;
                    if (obj != null) {
                        lVar.i(obj);
                        break;
                    } else {
                        Object C = eVar.t().C(t.class);
                        k.d(C);
                        t tVar = (t) C;
                        lVar.i(y.d(new KotlinNullPointerException("Response from " + tVar.a.getName() + '.' + tVar.c.getName() + " was null but response body type was declared as non-null")));
                        break;
                    }
                }
            case 4:
                boolean z2 = q0Var.a.H;
                l lVar2 = this.s;
                if (!z2) {
                    lVar2.i(y.d(new HttpException(q0Var)));
                    break;
                } else {
                    lVar2.i(q0Var.b);
                    break;
                }
            default:
                this.s.i(q0Var);
                break;
        }
    }

    public void s(fa1.e eVar, Throwable th) {
        switch (this.r) {
            case 3:
                this.s.i(y.d(th));
                break;
            case 4:
                this.s.i(y.d(th));
                break;
            default:
                this.s.i(y.d(th));
                break;
        }
    }

    @Override // w21.c
    public void x(o oVar) {
        Exception g = oVar.g();
        if (g != null) {
            this.s.i(y.d(g));
        } else if (oVar.d) {
            this.s.x((Throwable) null);
        } else {
            this.s.i(oVar.h());
        }
    }
}
