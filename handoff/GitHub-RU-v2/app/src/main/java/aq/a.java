package aq;

import a0.q0;
import c71.j;
import j71.e;
import jo.db0;
import jo.fb0;
import jo.hb0;
import jo.lk;
import jo.mk;
import jo.ok;
import m10.qf;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
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

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (lk) obj).v(a0.a);
            default:
                return r((a71.c) obj2, (db0) obj).v(a0.a);
        }
    }

    public final Object v(Object obj) {
        ok okVar;
        ok okVar2;
        ok okVar3;
        fb0 fb0Var;
        fb0 fb0Var2;
        fb0 fb0Var3;
        switch (this.v) {
            case 0:
                lk lkVar = (lk) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                a0 a0Var = a0.a;
                if (i == 0) {
                    y.j(obj);
                    mk mkVar = lkVar.a;
                    String str = (mkVar == null || (okVar3 = mkVar.b) == null) ? null : okVar3.b.a.b;
                    String str2 = (mkVar == null || (okVar2 = mkVar.b) == null) ? null : okVar2.b.b;
                    Integer num = (mkVar == null || (okVar = mkVar.b) == null) ? null : new Integer(okVar.a);
                    if (str != null && str2 != null && num != null) {
                        a00.b bVar = (a00.b) this.y.v;
                        bq.b bVar2 = new bq.b(str, num.intValue(), str2);
                        this.x = null;
                        this.w = 1;
                        bVar.getClass();
                        Object c = bVar.c(bVar2, new q0(19, this.z, qf.u), this);
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
                db0 db0Var = (db0) this.x;
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                a0 a0Var2 = a0.a;
                if (i2 == 0) {
                    y.j(obj);
                    hb0 hb0Var = db0Var.a;
                    String str3 = (hb0Var == null || (fb0Var3 = hb0Var.b) == null) ? null : fb0Var3.b.a.b;
                    String str4 = (hb0Var == null || (fb0Var2 = hb0Var.b) == null) ? null : fb0Var2.b.b;
                    Integer num2 = (hb0Var == null || (fb0Var = hb0Var.b) == null) ? null : new Integer(fb0Var.a);
                    if (str3 != null && str4 != null && num2 != null) {
                        a00.b bVar3 = (a00.b) this.y.v;
                        bq.b bVar4 = new bq.b(str3, num2.intValue(), str4);
                        this.x = null;
                        this.w = 1;
                        bVar3.getClass();
                        Object c2 = bVar3.c(bVar4, new q0(19, this.z, qf.t), this);
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
