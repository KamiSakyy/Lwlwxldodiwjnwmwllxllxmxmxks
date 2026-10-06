package t00;

import com.github.service.models.HideCommentReason;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l extends c71.j implements j71.e {
    public final /* synthetic */ HideCommentReason A;
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ rm0.o x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(rm0.o oVar, String str, String str2, HideCommentReason hideCommentReason, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = oVar;
        this.y = str;
        this.z = str2;
        this.A = hideCommentReason;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new l(this.x, this.y, this.z, this.A, cVar, 0);
            case 1:
                return new l(this.x, this.y, this.z, this.A, cVar, 1);
            default:
                return new l(this.x, this.y, this.z, this.A, cVar, 2);
        }
    }

    public final Object s(Object obj, Object obj2) {
        w61.a0Shadow a0Var = (w61.a0) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, a0Var).v(w61.a0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                String str = this.z;
                rm0.o oVar = this.x;
                if (i == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (rm0.o.i(oVar, this.y, str, true, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                this.w = 2;
                if (oVar.E(this.y, str, true, this.A, this) == aVar) {
                    return aVar;
                }
                return w61.a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                String str2 = this.z;
                String str3 = this.y;
                rm0.o oVar2 = this.x;
                if (i2 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (rm0.o.m(oVar2, str3, str2, true, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj);
                            return w61.a0.a;
                        }
                        sy.y.j(obj);
                        this.w = 3;
                        if (oVar2.I(this.y, str2, true, this.A, this) == aVar2) {
                            return aVar2;
                        }
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                this.w = 2;
                if (rm0.o.q(oVar2, str3, str2, true, this) == aVar2) {
                    return aVar2;
                }
                this.w = 3;
                if (oVar2.I(this.y, str2, true, this.A, this) == aVar2) {
                }
                return w61.a0.a;
            default:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (this.x.M(this.y, this.z, true, this.A, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}
