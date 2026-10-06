package tm;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import sy.y;
import um.r;
import z01.j1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public r a;

    public m(r rVar) {
        k71.k.g(rVar, "repository");
        this.a = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, StoredShortcutModel storedShortcutModel, com.github.rudroid.repositories.repositoryownerrepositories.d dVar, c71.c cVar) {
        l lVar;
        int i;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i2 = lVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.y = i2 - Integer.MIN_VALUE;
                Object obj = lVar.w;
                um.f fVar = b71.a.r;
                i = lVar.y;
                if (i != 0) {
                    y.j(obj);
                    lVar.u = jVar;
                    lVar.v = dVar;
                    lVar.y = 1;
                    r rVar = this.a;
                    j1 j1Var = (j1) rVar.b.a(jVar);
                    String str = storedShortcutModel.r;
                    rVar.c.getClass();
                    um.f fVar2 = new um.f(j1Var.a(str, vm.b.a(storedShortcutModel)), rVar, jVar, 2);
                    if (fVar2 == fVar) {
                        return fVar;
                    }
                    obj = fVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = lVar.v;
                    jVar = lVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, dVar);
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.w;
        um.f fVar3 = b71.a.r;
        i = lVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, dVar);
    }
}
