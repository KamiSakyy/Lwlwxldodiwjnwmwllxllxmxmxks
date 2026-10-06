package uk;

import com.github.rudroid.fileschanged.v3;
import in.rShadow;
import java.util.List;
import k71.k;
import oa.g;
import oa.j;
import sy.y;
import y71.i;
import z01.x0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public g a;

    public b(g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, String str3, String str4, String str5, List list, v3 v3Var, c71.c cVar) {
        a aVar;
        int i;
        v3 v3Var2;
        Object c;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i2 = aVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.y = i2 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                b71.a aVar2 = b71.a.r;
                i = aVar.y;
                if (i != 0) {
                    y.j(obj);
                    x0 x0Var = (x0) this.a.a(jVar);
                    aVar.u = jVar;
                    v3Var2 = v3Var;
                    aVar.v = v3Var2;
                    aVar.y = 1;
                    c = x0Var.c(str, str2, str3, str4, str5, list);
                    if (c == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v3 v3Var3 = aVar.v;
                    j jVar2 = aVar.u;
                    y.j(obj);
                    v3Var2 = v3Var3;
                    jVar = jVar2;
                    c = obj;
                }
                return b31.b.J(rShadow.l((i) c), jVar, v3Var2);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.w;
        b71.a aVar22 = b71.a.r;
        i = aVar.y;
        if (i != 0) {
        }
        return b31.b.J(rShadow.l((i) c), jVar, v3Var2);
    }

}
