package dn;

import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public class b extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new b(2, cVar, 0);
            case 1:
                return new b(2, cVar, 1);
            case 2:
                return new b(2, cVar, 2);
            default:
                b bVar = new b(2, cVar, 3);
                bVar.w = ((Number) obj).intValue();
                return bVar;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (Throwable) obj).v(w61.a0.a);
            case 1:
                return r((a71.c) obj2, (Throwable) obj).v(w61.a0.a);
            case 2:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, Integer.valueOf(((Number) obj).intValue())).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (v71.b0.l(200L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return Boolean.TRUE;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (v71.b0.l(200L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return Boolean.TRUE;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (i4.Z(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar4 = b71.a.r;
                sy.y.j(obj);
                return Boolean.valueOf(this.w > 0);
        }
    }
}
