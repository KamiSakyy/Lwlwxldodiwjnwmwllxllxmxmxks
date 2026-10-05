package qd0;

import a30.c;
import c71.j;
import gn0.na;
import j71.e;
import jy.d;
import kc0.ph;
import kc0.qh;
import kc0.s40;
import kc0.sh;
import kc0.u40;
import kc0.w40;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends j implements e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ c y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, String str, a71.c cVar2, int i) {
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
                return ((a) r((a71.c) obj2, (ph) obj)).v(a0.a);
            default:
                return ((a) r((a71.c) obj2, (s40) obj)).v(a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        sh shVar;
        sh shVar2;
        sh shVar3;
        u40 u40Var;
        u40 u40Var2;
        u40 u40Var3;
        switch (this.v) {
            case 0:
                ph phVar = (ph) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                a0 a0Var = a0.a;
                if (i == 0) {
                    y.j(obj);
                    qh qhVar = phVar.a;
                    String str = (qhVar == null || (shVar3 = qhVar.b) == null) ? null : shVar3.b.a.b;
                    String str2 = (qhVar == null || (shVar2 = qhVar.b) == null) ? null : shVar2.b.b;
                    Integer num = (qhVar == null || (shVar = qhVar.b) == null) ? null : new Integer(shVar.a);
                    if (str != null && str2 != null && num != null) {
                        d dVar = this.y.v;
                        rd0.a aVar2 = new rd0.a(str, num.intValue(), str2);
                        this.x = null;
                        this.w = 1;
                        dVar.getClass();
                        Object c = dVar.c(aVar2, new fg.d(26, this.z, na.u), this);
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
                s40 s40Var = (s40) this.x;
                b71.a aVar3 = b71.a.r;
                int i2 = this.w;
                a0 a0Var2 = a0.a;
                if (i2 == 0) {
                    y.j(obj);
                    w40 w40Var = s40Var.a;
                    String str3 = (w40Var == null || (u40Var3 = w40Var.b) == null) ? null : u40Var3.b.a.b;
                    String str4 = (w40Var == null || (u40Var2 = w40Var.b) == null) ? null : u40Var2.b.b;
                    Integer num2 = (w40Var == null || (u40Var = w40Var.b) == null) ? null : new Integer(u40Var.a);
                    if (str3 != null && str4 != null && num2 != null) {
                        d dVar2 = this.y.v;
                        rd0.a aVar4 = new rd0.a(str3, num2.intValue(), str4);
                        this.x = null;
                        this.w = 1;
                        dVar2.getClass();
                        Object c2 = dVar2.c(aVar4, new fg.d(26, this.z, na.t), this);
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
