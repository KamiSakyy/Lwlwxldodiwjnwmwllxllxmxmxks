package b6;

import android.content.Context;

/* loaded from: /home/user/work/p/classes.dex */
public final class w0 extends c71.j implements j71.e {
    public final /* synthetic */ int[] A;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3722v;

    /* renamed from: w, reason: collision with root package name */
    public int f3723w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3724x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x0 f3725y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f3726z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(x0 x0Var, Context context, int[] iArr, a71.c cVar, int i) {
        super(2, cVar);
        this.f3722v = i;
        this.f3725y = x0Var;
        this.f3726z = context;
        this.A = iArr;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f3722v) {
            case k5.f.J /* 0 */:
                w0 w0Var = new w0(this.f3725y, this.f3726z, this.A, cVar, 0);
                w0Var.f3724x = obj;
                return w0Var;
            default:
                w0 w0Var2 = new w0(this.f3725y, this.f3726z, this.A, cVar, 1);
                w0Var2.f3724x = obj;
                return w0Var2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f3722v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f3722v) {
            case k5.f.J /* 0 */:
                b71.a aVar = b71.a.r;
                int i = this.f3723w;
                if (i == 0) {
                    sy.y.j(obj);
                    v71.z zVar = (v71.z) this.f3724x;
                    this.f3723w = 1;
                    if (this.f3725y.a(zVar, this.f3726z, this.A, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f3723w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    v71.z zVar2 = (v71.z) this.f3724x;
                    this.f3723w = 1;
                    if (this.f3725y.d(zVar2, this.f3726z, this.A, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }

}
