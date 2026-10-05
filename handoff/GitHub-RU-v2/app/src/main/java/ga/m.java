package ga;

import com.apollographql.apollo.exception.ApolloException;
import k71.w;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class m extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f24833v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24834w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f24835x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(w wVar, a71.c cVar, int i) {
        super(2, cVar);
        this.f24833v = i;
        this.f24835x = wVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f24833v) {
            case k5.f.J:
                m mVar = new m(this.f24835x, cVar, 0);
                mVar.f24834w = obj;
                return mVar;
            default:
                m mVar2 = new m(this.f24835x, cVar, 1);
                mVar2.f24834w = obj;
                return mVar2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        aa.f fVar = (aa.f) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f24833v) {
            case k5.f.J:
                m r10 = r(cVar, fVar);
                a0 a0Var = a0.a;
                r10.v(a0Var);
                return a0Var;
            default:
                m r11 = r(cVar, fVar);
                a0 a0Var2 = a0.a;
                r11.v(a0Var2);
                return a0Var2;
        }
    }

    public final Object v(Object obj) {
        int i = this.f24833v;
        a0 a0Var = a0.a;
        w wVar = this.f24835x;
        switch (i) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                y.j(obj);
                ApolloException apolloException = ((aa.f) this.f24834w).f647e;
                if (apolloException != null && wVar.r == null) {
                    wVar.r = apolloException;
                    break;
                }
                break;
            default:
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                wVar.r = ((aa.f) this.f24834w).f647e;
                break;
        }
        return a0Var;
    }
}
