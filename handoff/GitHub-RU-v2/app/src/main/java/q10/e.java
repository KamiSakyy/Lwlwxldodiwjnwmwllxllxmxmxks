package q10;

import androidx.lifecycle.l1;
import in.j0;
import java.util.LinkedHashSet;
import k71.k;
import n0.w;
import oa.j;
import oa.m;
import q81.a0;
import q81.o;
import q81.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements p {
    public final /* synthetic */ f a;
    public final /* synthetic */ j b;
    public final /* synthetic */ LinkedHashSet c;

    public e(f fVar, j jVar, LinkedHashSet linkedHashSet) {
        this.a = fVar;
        this.b = jVar;
        this.c = linkedHashSet;
    }

    public final a0 a(w wVar) {
        boolean z;
        j0 j0Var;
        l1 s;
        f fVar;
        m mVar;
        j jVar;
        androidx.lifecycle.b bVar = (androidx.lifecycle.b) wVar.i;
        o oVar = (o) bVar.b;
        if (k.b(oVar.a, "https")) {
            if (this.c.contains(oVar.d)) {
                z = true;
                j0Var = (j0) bVar.C(j0.class);
                s = bVar.s();
                if (j0Var != null || !j0Var.a) {
                    fVar = this.a;
                    mVar = fVar.c;
                    jVar = this.b;
                    if (mVar.h(jVar.a) != null && z) {
                        s.g("Authorization", "Bearer " + fVar.d.a(jVar));
                    }
                }
                return wVar.f(new androidx.lifecycle.b(s));
            }
        }
        z = false;
        j0Var = (j0) bVar.C(j0.class);
        s = bVar.s();
        if (j0Var != null) {
        }
        fVar = this.a;
        mVar = fVar.c;
        jVar = this.b;
        if (mVar.h(jVar.a) != null) {
            s.g("Authorization", "Bearer " + fVar.d.a(jVar));
        }
        return wVar.f(new androidx.lifecycle.b(s));
    }
}
