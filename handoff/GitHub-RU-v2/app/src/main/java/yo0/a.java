package yo0;

import c71.j;
import j71.e;
import jn0.gj;
import jn0.hj;
import jn0.jj;
import jn0.p80;
import jn0.r80;
import jn0.t80;
import pz0.jc;
import s0.z0;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends j implements e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ a30.c y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(a30.c cVar, String str, a71.c cVar2, int i) {
        super(2, cVar2);
        this.v = i;
        this.y = cVar;
        this.z = str;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                a aVar = new a(this.y, this.z, cVar, 0);
                aVar.x = obj;
                return aVar;
            default:
                a aVar2 = new a(this.y, this.z, cVar, 1);
                aVar2.x = obj;
                return aVar2;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return ((a) r((a71.c) obj2, (gj) obj)).v(a0.a);
            default:
                return ((a) r((a71.c) obj2, (p80) obj)).v(a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        jj jjVar;
        jj jjVar2;
        jj jjVar3;
        r80 r80Var;
        r80 r80Var2;
        r80 r80Var3;
        switch (this.v) {
            case 0:
                gj gjVar = (gj) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                a0 a0Var = a0.a;
                if (i == 0) {
                    y.j(obj);
                    hj hjVar = gjVar.a;
                    String str = (hjVar == null || (jjVar3 = hjVar.b) == null) ? null : jjVar3.b.a.b;
                    String str2 = (hjVar == null || (jjVar2 = hjVar.b) == null) ? null : jjVar2.b.b;
                    Integer num = (hjVar == null || (jjVar = hjVar.b) == null) ? null : new Integer(jjVar.a);
                    if (str != null && str2 != null && num != null) {
                        sw0.c cVar = (sw0.c) this.y.v;
                        zo0.a aVar2 = new zo0.a(str, num.intValue(), str2);
                        this.x = null;
                        this.w = 1;
                        cVar.getClass();
                        Object c = cVar.c(aVar2, new z0(18, this.z, jc.u), this);
                        if (c != aVar) {
                            c = a0Var;
                        }
                        if (c != aVar) {
                            c = a0Var;
                        }
                        if (c == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var;
            default:
                p80 p80Var = (p80) this.x;
                b71.a aVar3 = b71.a.r;
                int i2 = this.w;
                a0 a0Var2 = a0.a;
                if (i2 == 0) {
                    y.j(obj);
                    t80 t80Var = p80Var.a;
                    String str3 = (t80Var == null || (r80Var3 = t80Var.b) == null) ? null : r80Var3.b.a.b;
                    String str4 = (t80Var == null || (r80Var2 = t80Var.b) == null) ? null : r80Var2.b.b;
                    Integer num2 = (t80Var == null || (r80Var = t80Var.b) == null) ? null : new Integer(r80Var.a);
                    if (str3 != null && str4 != null && num2 != null) {
                        sw0.c cVar2 = (sw0.c) this.y.v;
                        zo0.a aVar4 = new zo0.a(str3, num2.intValue(), str4);
                        this.x = null;
                        this.w = 1;
                        cVar2.getClass();
                        Object c2 = cVar2.c(aVar4, new z0(18, this.z, jc.t), this);
                        if (c2 != aVar3) {
                            c2 = a0Var2;
                        }
                        if (c2 != aVar3) {
                            c2 = a0Var2;
                        }
                        if (c2 == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var2;
        }
    }
}
