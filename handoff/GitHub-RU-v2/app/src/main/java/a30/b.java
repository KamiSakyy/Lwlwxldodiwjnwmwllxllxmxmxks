package a30;

import a0.q0;
import c71.j;
import hc0.z9;
import j71.e;
import sy.y;
import u10.ng;
import u10.og;
import u10.qg;
import u10.u20;
import u10.w20;
import u10.y20;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public class b extends j implements e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ c y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, a71.c cVar2, int i) {
        super(2, cVar2);
        this.v = i;
        this.y = cVar;
        this.z = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                b bVar = new b(this.y, this.z, cVar, 0);
                bVar.x = obj;
                return bVar;
            default:
                b bVar2 = new b(this.y, this.z, cVar, 1);
                bVar2.x = obj;
                return bVar2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (ng) obj).v(a0.a);
            default:
                return r((a71.c) obj2, (u20) obj).v(a0.a);
        }
    }

    public final Object v(Object obj) {
        qg qgVar;
        qg qgVar2;
        qg qgVar3;
        w20 w20Var;
        w20 w20Var2;
        w20 w20Var3;
        switch (this.v) {
            case 0:
                ng ngVar = (ng) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                a0 a0Var = a0.a;
                if (i == 0) {
                    y.j(obj);
                    og ogVar = ngVar.a;
                    String str = (ogVar == null || (qgVar3 = ogVar.b) == null) ? null : qgVar3.b.a.b;
                    String str2 = (ogVar == null || (qgVar2 = ogVar.b) == null) ? null : qgVar2.b.b;
                    Integer num = (ogVar == null || (qgVar = ogVar.b) == null) ? null : new Integer(qgVar.a);
                    if (str != null && str2 != null && num != null) {
                        a00.b bVar = (a00.b) this.y.v;
                        b30.b bVar2 = new b30.b(str, num.intValue(), str2);
                        this.x = null;
                        this.w = 1;
                        bVar.getClass();
                        Object c = bVar.c(bVar2, new q0(16, this.z, z9.u), this);
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
                u20 u20Var = (u20) this.x;
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                a0 a0Var2 = a0.a;
                if (i2 == 0) {
                    y.j(obj);
                    y20 y20Var = u20Var.a;
                    String str3 = (y20Var == null || (w20Var3 = y20Var.b) == null) ? null : w20Var3.b.a.b;
                    String str4 = (y20Var == null || (w20Var2 = y20Var.b) == null) ? null : w20Var2.b.b;
                    Integer num2 = (y20Var == null || (w20Var = y20Var.b) == null) ? null : new Integer(w20Var.a);
                    if (str3 != null && str4 != null && num2 != null) {
                        a00.b bVar3 = (a00.b) this.y.v;
                        b30.b bVar4 = new b30.b(str3, num2.intValue(), str4);
                        this.x = null;
                        this.w = 1;
                        bVar3.getClass();
                        Object c2 = bVar3.c(bVar4, new q0(16, this.z, z9.t), this);
                        if (c2 != aVar2) {
                            c2 = a0Var2;
                        }
                        if (c2 != aVar2) {
                            c2 = a0Var2;
                        }
                        if (c2 == aVar2) {
                            return aVar2;
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
