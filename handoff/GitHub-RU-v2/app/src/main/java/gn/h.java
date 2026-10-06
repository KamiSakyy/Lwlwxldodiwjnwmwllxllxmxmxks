package gn;

import com.github.service.models.response.type.ReactionContent;
import sy.y;
import z01.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hShadow {
    public oa.g a;

    public Object h(oa.g gVar) {
        k71.k.g(gVar, "reacteesService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, ReactionContent reactionContent, String str2, j71.c cVar, c71.c cVar2) {
        g gVar;
        int i;
        if (cVar2 instanceof g) {
            gVar = (g) cVar2;
            int i2 = gVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.y = i2 - Integer.MIN_VALUE;
                Object obj = gVar.w;
                b71.a aVar = b71.a.r;
                i = gVar.y;
                if (i != 0) {
                    y.j(obj);
                    v0 v0Var = (v0) this.a.a(jVar);
                    gVar.u = jVar;
                    gVar.v = cVar;
                    gVar.y = 1;
                    obj = v0Var.a(str, reactionContent, str2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = gVar.v;
                    jVar = gVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        gVar = new g(this, cVar2);
        Object obj2 = gVar.w;
        b71.a aVar2 = b71.a.r;
        i = gVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
