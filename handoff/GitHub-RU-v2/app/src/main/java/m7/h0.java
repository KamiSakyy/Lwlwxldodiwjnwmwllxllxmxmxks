package m7;

import android.database.SQLException;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f28988v;

    /* renamed from: w, reason: collision with root package name */
    public int f28989w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f28990x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m0 f28991y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(m0 m0Var, a71.c cVar, int i) {
        super(2, cVar);
        this.f28988v = i;
        this.f28991y = m0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f28988v) {
            case k5.f.J:
                h0 h0Var = new h0(this.f28991y, cVar, 0);
                h0Var.f28990x = obj;
                return h0Var;
            default:
                h0 h0Var2 = new h0(this.f28991y, cVar, 1);
                h0Var2.f28990x = obj;
                return h0Var2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.f28988v) {
            case k5.f.J:
                return r((a71.c) obj2, (o7.i) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (d0) obj).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        d0 d0Var;
        switch (this.f28988v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f28989w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                o7.i iVar = (o7.i) this.f28990x;
                this.f28989w = 1;
                Object a10 = m0.a(this.f28991y, iVar, this);
                return a10 == aVar ? aVar : a10;
            default:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f28989w;
                try {
                    if (i10 == 0) {
                        sy.y.j(obj);
                        d0Var = (d0) this.f28990x;
                        this.f28990x = d0Var;
                        this.f28989w = 1;
                        obj = d0Var.d(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj);
                            return (Set) obj;
                        }
                        d0Var = (d0) this.f28990x;
                        sy.y.j(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        c0 c0Var = c0.f28962s;
                        h0 h0Var = new h0(this.f28991y, null, 0);
                        this.f28990x = null;
                        this.f28989w = 2;
                        obj = d0Var.b(c0Var, h0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return x61.t.r;
        }
    }
}
