package nl;

import c00.r;
import sy.y;
import w61.a0;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ j71.c I;
    public int v;
    public /* synthetic */ y71.j w;
    public /* synthetic */ Object x;
    public final /* synthetic */ c y;
    public final /* synthetic */ oa.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a71.c cVar, c cVar2, oa.j jVar, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, j71.c cVar3) {
        super(3, cVar);
        this.y = cVar2;
        this.z = jVar;
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = str4;
        this.E = str5;
        this.F = z;
        this.G = str6;
        this.H = str7;
        this.I = cVar3;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        a aVar = new a((a71.c) obj3, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
        aVar.w = (y71.j) obj;
        aVar.x = obj2;
        return aVar.v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        a0 a0Var = a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
            return a0Var;
        }
        y.j(obj);
        y71.j jVar = this.w;
        yz0.j jVar2 = (yz0.j) this.x;
        y71.y a = this.y.b.a(this.z, this.A, this.B, jVar2.d, this.C, this.D, jVar2.c, this.E, this.F, this.G, this.H, this.I);
        this.w = null;
        this.x = null;
        this.v = 1;
        n1.s(jVar);
        Object b = a.b(new r(27, jVar, jVar2), this);
        if (b != aVar) {
            b = a0Var;
        }
        if (b != aVar) {
            b = a0Var;
        }
        return b == aVar ? aVar : a0Var;
    }
}
