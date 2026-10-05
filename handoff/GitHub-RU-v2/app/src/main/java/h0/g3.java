package h0;

/* loaded from: /home/user/work/p/classes.dex */
public final class g3 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f25007v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e2 f25008w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(e2 e2Var, a71.c cVar, int i) {
        super(2, cVar);
        this.f25007v = i;
        this.f25008w = e2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f25007v) {
            case k5.f.J:
                return new g3(this.f25008w, cVar, 0);
            case 1:
                return new g3(this.f25008w, cVar, 1);
            case 2:
                return new g3(this.f25008w, cVar, 2);
            case 3:
                return new g3(this.f25008w, cVar, 3);
            case 4:
                return new g3(this.f25008w, cVar, 4);
            case 5:
                return new g3(this.f25008w, cVar, 5);
            case 6:
                return new g3(this.f25008w, cVar, 6);
            default:
                return new g3(this.f25008w, cVar, 7);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f25007v) {
            case k5.f.J:
                g3 r10 = r(cVar, zVar);
                w61.a0 a0Var = w61.a0.a;
                r10.v(a0Var);
                return a0Var;
            case 1:
                g3 r11 = r(cVar, zVar);
                w61.a0 a0Var2 = w61.a0.a;
                r11.v(a0Var2);
                return a0Var2;
            case 2:
                g3 r12 = r(cVar, zVar);
                w61.a0 a0Var3 = w61.a0.a;
                r12.v(a0Var3);
                return a0Var3;
            case 3:
                g3 r13 = r(cVar, zVar);
                w61.a0 a0Var4 = w61.a0.a;
                r13.v(a0Var4);
                return a0Var4;
            case 4:
                g3 r14 = r(cVar, zVar);
                w61.a0 a0Var5 = w61.a0.a;
                r14.v(a0Var5);
                return a0Var5;
            case 5:
                g3 r15 = r(cVar, zVar);
                w61.a0 a0Var6 = w61.a0.a;
                r15.v(a0Var6);
                return a0Var6;
            case 6:
                g3 r16 = r(cVar, zVar);
                w61.a0 a0Var7 = w61.a0.a;
                r16.v(a0Var7);
                return a0Var7;
            default:
                g3 r17 = r(cVar, zVar);
                w61.a0 a0Var8 = w61.a0.a;
                r17.v(a0Var8);
                return a0Var8;
        }
    }

    public final Object v(Object obj) {
        int i = this.f25007v;
        w61.a0 a0Var = w61.a0.a;
        e2 e2Var = this.f25008w;
        switch (i) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                e2Var.c();
                break;
            case 1:
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                e2Var.d();
                break;
            case 2:
                b71.a aVar3 = b71.a.r;
                sy.y.j(obj);
                e2Var.d();
                break;
            case 3:
                b71.a aVar4 = b71.a.r;
                sy.y.j(obj);
                e2Var.c();
                break;
            case 4:
                b71.a aVar5 = b71.a.r;
                sy.y.j(obj);
                e2Var.d();
                break;
            case 5:
                b71.a aVar6 = b71.a.r;
                sy.y.j(obj);
                e2Var.d();
                break;
            case 6:
                b71.a aVar7 = b71.a.r;
                sy.y.j(obj);
                e2Var.c();
                break;
            default:
                b71.a aVar8 = b71.a.r;
                sy.y.j(obj);
                e2Var.d();
                break;
        }
        return a0Var;
    }
}
