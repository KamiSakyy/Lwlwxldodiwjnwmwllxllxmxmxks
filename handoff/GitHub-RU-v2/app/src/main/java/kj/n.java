package kj;

import java.util.List;
import z01.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public oa.g a;
    public mj.c b;

    public n(oa.g gVar, mj.c cVar) {
        k71.k.g(gVar, "service");
        k71.k.g(cVar, "queryMapper");
        this.a = gVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, com.github.rudroid.common.i0 i0Var, j71.c cVar, c71.c cVar2) {
        m mVar;
        int i;
        CharSequence charSequence;
        if (cVar2 instanceof m) {
            mVar = (m) cVar2;
            int i2 = mVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.y = i2 - Integer.MIN_VALUE;
                Object obj = mVar.w;
                b71.a aVar = b71.a.r;
                i = mVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    g1 g1Var = (g1) this.a.a(jVar);
                    this.b.getClass();
                    k71.k.g(str, "query");
                    if (t71.p.I(str, "/", false)) {
                        int length = str.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                charSequence = "";
                                break;
                            }
                            if (!sy.r.s(str.charAt(i3))) {
                                charSequence = str.subSequence(i3, str.length());
                                break;
                            }
                            i3++;
                        }
                        List g0 = t71.p.g0(charSequence.toString(), new String[]{"/"}, 2);
                        if (g0.size() == 2 && !t71.p.T((CharSequence) g0.get(0)) && !t71.p.I((CharSequence) g0.get(0), " ", false) && !t71.p.T((CharSequence) g0.get(1))) {
                            str = "org:" + g0.get(0) + " " + g0.get(1);
                        }
                    }
                    mVar.u = jVar;
                    mVar.v = cVar;
                    mVar.y = 1;
                    obj = g1Var.k(str, i0Var, str2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = mVar.v;
                    jVar = mVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        mVar = new m(this, cVar2);
        Object obj2 = mVar.w;
        b71.a aVar2 = b71.a.r;
        i = mVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
