package an;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends c71.j implements j71.e {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, String str, int i, boolean z, a71.c cVar, int i2) {
        super(2, cVar);
        this.v = i2;
        this.B = obj;
        this.y = str;
        this.z = i;
        this.A = z;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                a aVar = new a((c) this.B, this.y, this.z, this.A, cVar, 0);
                aVar.x = obj;
                return aVar;
            case 1:
                a aVar2 = new a((eShadow) this.B, this.y, this.z, this.A, cVar, 1);
                aVar2.x = obj;
                return aVar2;
            case 2:
                a aVar3 = new a((f) this.B, this.y, this.z, this.A, cVar, 2);
                aVar3.x = obj;
                return aVar3;
            case 3:
                a aVar4 = new a((j) this.B, this.y, this.z, this.A, cVar, 3);
                aVar4.x = obj;
                return aVar4;
            default:
                a aVar5 = new a((kShadow) this.B, this.y, this.z, this.A, cVar, 4);
                aVar5.x = obj;
                return aVar5;
        }
    }

    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, jVar).v(a0.a);
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                y71.j jVar = (y71.j) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    ((c) this.B).b.getClass();
                    String a = m.a(this.z, this.y, this.A);
                    this.x = null;
                    this.w = 1;
                    if (jVar.c(a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 1:
                y71.j jVar2 = (y71.j) this.x;
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    ((eShadow) this.B).b.getClass();
                    String a2 = m.a(this.z, this.y, this.A);
                    this.x = null;
                    this.w = 1;
                    if (jVar2.c(a2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 2:
                y71.j jVar3 = (y71.j) this.x;
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    ((f) this.B).b.getClass();
                    String a3 = m.a(this.z, this.y, this.A);
                    this.x = null;
                    this.w = 1;
                    if (jVar3.c(a3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 3:
                y71.j jVar4 = (y71.j) this.x;
                b71.a aVar4 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    y.j(obj);
                    ((j) this.B).b.getClass();
                    String a4 = m.a(this.z, this.y, this.A);
                    this.x = null;
                    this.w = 1;
                    if (jVar4.c(a4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            default:
                y71.j jVar5 = (y71.j) this.x;
                b71.a aVar5 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    ((kShadow) this.B).b.getClass();
                    String a5 = m.a(this.z, this.y, this.A);
                    this.x = null;
                    this.w = 1;
                    if (jVar5.c(a5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
        }
    }
}
